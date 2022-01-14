/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.examples;

import io.cert.manager.models.V1alpha3Issuer;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.kubevirt.models.V1alpha3VirtualMachineInstanceList;
import io.kubernetes.client.openapi.*;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeList;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.KubeConfig;
import io.kubernetes.client.util.ModelMapper;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import org.apache.commons.lang3.StringUtils;
import io.kubernetes.client.kubevirt.models.V1alpha3VirtualMachineInstance;

import io.kubernetes.client.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.InformerExample"
 *
 * <p>From inside $REPO_DIR/examples
 */

public class InformerExample {

    private static Call listNamespacedVmiCall(ApiClient client, String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Integer timeoutSeconds, Boolean watch, ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/api/v1/namespaces/{namespace}/vmi".replaceAll("\\{namespace\\}", client.escapeString(namespace.toString()));
        List<Pair> localVarQueryParams = new ArrayList();
        List<Pair> localVarCollectionQueryParams = new ArrayList();
        if (pretty != null) {
            localVarQueryParams.addAll(client.parameterToPair("pretty", pretty));
        }

        if (allowWatchBookmarks != null) {
            localVarQueryParams.addAll(client.parameterToPair("allowWatchBookmarks", allowWatchBookmarks));
        }

        if (_continue != null) {
            localVarQueryParams.addAll(client.parameterToPair("continue", _continue));
        }

        if (fieldSelector != null) {
            localVarQueryParams.addAll(client.parameterToPair("fieldSelector", fieldSelector));
        }

        if (labelSelector != null) {
            localVarQueryParams.addAll(client.parameterToPair("labelSelector", labelSelector));
        }

        if (limit != null) {
            localVarQueryParams.addAll(client.parameterToPair("limit", limit));
        }

        if (resourceVersion != null) {
            localVarQueryParams.addAll(client.parameterToPair("resourceVersion", resourceVersion));
        }

        if (resourceVersionMatch != null) {
            localVarQueryParams.addAll(client.parameterToPair("resourceVersionMatch", resourceVersionMatch));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(client.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (watch != null) {
            localVarQueryParams.addAll(client.parameterToPair("watch", watch));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        String[] localVarAccepts = new String[]{"application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch"};
        String localVarAccept = client.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarContentTypes = new String[0];
        String localVarContentType = client.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        String[] localVarAuthNames = new String[]{"BearerToken"};

        return client.buildCall(
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    public static SharedIndexInformer<V1Node> createNodeInformer(SharedInformerFactory factory, CoreV1Api coreV1Api) {
        // Node informer
        SharedIndexInformer<V1Node> nodeInformer =
                factory.sharedIndexInformerFor(
                        (CallGeneratorParams params) -> {
                            return coreV1Api.listNodeCall(
                                    null,
                                    null,
                                    null,
                                    null,
                                    "ngn2.nvidia.com/img_BaseUbuntu18-ngntest-15ba111-20200402-112450.qcow2",
                                    null,
                                    params.resourceVersion,
                                    null,
                                    params.timeoutSeconds,
                                    params.watch,
                                    null);
                        },
                        V1Node.class,
                        V1NodeList.class);

        nodeInformer.addEventHandler(
                new ResourceEventHandler<V1Node>() {

                    @Override
                    public void onAdd(V1Node node) {
                        System.out.printf("%s node added!\n", node.getMetadata().getName());
                    }

                    @Override
                    public void onUpdate(V1Node oldNode, V1Node newNode) {
                        if (newNode.getMetadata().getName().contains(".nvmetal.net")) {
                            if (newNode.getMetadata().getLabels().containsValue("initiated")) {
                                for (Map.Entry<String, String> entry : newNode.getMetadata().getLabels().entrySet()) {
                                    if (entry.getValue().equals("initiated")) {
                                        System.out.printf(
                                                "%s => %s node is in initiated state for label %s!\n",
                                                oldNode.getMetadata().getName(), newNode.getMetadata().getName(), entry.getKey());
                                    }
                                }
                            } else if (newNode.getMetadata().getLabels().containsValue("deleted")) {
                                for (Map.Entry<String, String> entry : newNode.getMetadata().getLabels().entrySet()) {
                                    if (entry.getValue().equals("deleted")) {
                                        System.out.printf(
                                                "%s => %s node is in deleted state for label %s!\n",
                                                oldNode.getMetadata().getName(), newNode.getMetadata().getName(), entry.getKey());
                                    }
                                }
                            }
                        }
                    }

                    @Override
                    public void onDelete(V1Node node, boolean deletedFinalStateUnknown) {
                        System.out.printf("%s node deleted!\n", node.getMetadata().getName());
                    }
                });

        return nodeInformer;
    }

    public static SharedIndexInformer<V1Pod> createPodInformer(String namespace, SharedInformerFactory factory, CoreV1Api coreV1Api) {
        SharedIndexInformer<V1Pod> podInformer =
                factory.sharedIndexInformerFor(
                        (CallGeneratorParams params) -> {
                            return coreV1Api.listNamespacedPodCall(
                                    namespace,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    params.resourceVersion,
                                    null,
                                    params.timeoutSeconds,
                                    params.watch,
                                    null);
                        },
                        V1Pod.class,
                        V1PodList.class);

        podInformer.addEventHandler(
                new ResourceEventHandler<V1Pod>() {
                    @Override
                    public void onAdd(V1Pod pod) {
                        System.out.printf("%s pod added! Timestamp %s\n", pod.getMetadata().getName(),
                                pod.getMetadata().getCreationTimestamp());
                    }

                    @Override
                    public void onUpdate(V1Pod oldPod, V1Pod newPod) {
                        System.out.printf(
                                "%s => %s pod updated!\n",
                                oldPod.getMetadata().getName(), newPod.getMetadata().getName());
                        System.out.printf("Data Updated - \nDifferences between the 2 strings - %s\n",
                                StringUtils.difference(oldPod.getMetadata().toString(), newPod.getMetadata().toString()));
                    }

                    @Override
                    public void onDelete(V1Pod pod, boolean deletedFinalStateUnknown) {
                        System.out.printf("%s pod deleted!\n", pod.getMetadata().getName());
                    }
                });

        return podInformer;
    }

    public static SharedIndexInformer<V1alpha3VirtualMachineInstance> createVmiInformer(String namespace, SharedInformerFactory factory, CoreV1Api coreV1Api) {
        ApiClient apiClient = coreV1Api.getApiClient();
        SharedIndexInformer<V1alpha3VirtualMachineInstance> vmiInformer =
                factory.sharedIndexInformerFor(
                (CallGeneratorParams params) -> {
                    return listNamespacedVmiCall(
                            apiClient,
                            namespace,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            params.resourceVersion,
                            null,
                            params.timeoutSeconds,
                            params.watch,
                            null);
                },
                V1alpha3VirtualMachineInstance.class,
                V1alpha3VirtualMachineInstanceList.class);
//        GenericKubernetesApi<V1alpha3VirtualMachineInstance, V1alpha3VirtualMachineInstanceList> vmiClient =
//                new GenericKubernetesApi<>(V1alpha3VirtualMachineInstance.class, V1alpha3VirtualMachineInstanceList.class, "", "v1alpha3", "vmis", apiClient);
//        SharedIndexInformer<V1alpha3VirtualMachineInstance> vmiInformer =
//                factory.sharedIndexInformerFor(vmiClient, V1alpha3VirtualMachineInstance.class, 10 * 60 * 60, namespace);

        vmiInformer.addEventHandler(
                new ResourceEventHandler<V1alpha3VirtualMachineInstance>() {
                    @Override
                    public void onAdd(V1alpha3VirtualMachineInstance vmi) {
                        System.out.printf("%s VMI added! Timestamp %s\n", vmi.getMetadata().getName(),
                                vmi.getMetadata().getCreationTimestamp());
                    }

                    @Override
                    public void onUpdate(V1alpha3VirtualMachineInstance oldVmi, V1alpha3VirtualMachineInstance newVmi) {
                        System.out.printf(
                                "%s => %s VMI updated!\n",
                                oldVmi.getMetadata().getName(), newVmi.getMetadata().getName());
                        System.out.printf("Data Updated - \nDifferences between the 2 strings - %s\n",
                                StringUtils.difference(oldVmi.getMetadata().toString(), newVmi.getMetadata().toString()));
                    }

                    @Override
                    public void onDelete(V1alpha3VirtualMachineInstance vmi, boolean deletedFinalStateUnknown) {
                        System.out.printf("%s VMI deleted!\n", vmi.getMetadata().getName());
                    }
                });

        return vmiInformer;
    }

    public static void main(String[] args) throws Exception {
        String kubeConfigPath = System.getenv("HOME") + "/config";
        System.out.println("Kubeconfig Path - " + kubeConfigPath);
        // loading the out-of-cluster config, a kubeconfig from file-system
        ApiClient client =
                ClientBuilder.kubeconfig(KubeConfig.loadKubeConfig(new FileReader(kubeConfigPath))).build();

        // set the global default api-client to the in-cluster one from above
        Configuration.setDefaultApiClient(client);
        CoreV1Api coreV1Api = new CoreV1Api();
        ApiClient apiClient = coreV1Api.getApiClient();
        OkHttpClient httpClient =
                apiClient.getHttpClient().newBuilder().readTimeout(0, TimeUnit.SECONDS).build();
        apiClient.setHttpClient(httpClient);

        SharedInformerFactory factory = new SharedInformerFactory();

//        SharedIndexInformer<V1Pod> podInformer = createPodInformer("nd-sjc6w-01", factory, coreV1Api);
//        SharedIndexInformer<V1Node> nodeInformer = createNodeInformer(factory, coreV1Api);
        SharedIndexInformer<V1alpha3VirtualMachineInstance> vmiInformer = createVmiInformer("nd-sjc6w-01", factory, coreV1Api);
        factory.startAllRegisteredInformers();
//    V1Pod podtoCreate = new V1Pod();
//    V1ObjectMeta metadata = new V1ObjectMeta();
//    metadata.setName("samplepod");
//    podtoCreate.setMetadata(metadata);
//    V1Pod createPod = coreV1Api.createNamespacedPod("nd-zrsjc6s-01", podtoCreate, null, null, null);

        Thread.sleep(50000);
        Lister<V1alpha3VirtualMachineInstance> vmiLister = new Lister<V1alpha3VirtualMachineInstance>(vmiInformer.getIndexer());
//        Lister<V1Pod> podLister = new Lister<V1Pod>(podInformer.getIndexer());
//        V1Pod pod = podLister.get("virt-launcher-sharath-dpu-reboot-a11a5b-1");
//        System.out.printf("Pod created! %s\n", pod.getMetadata().getCreationTimestamp());
        factory.stopAllRegisteredInformers();
        Thread.sleep(70000);
        System.out.println("informer stopped..");
    }
}
