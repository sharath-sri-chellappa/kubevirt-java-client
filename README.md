# kubevirt-java-client

Java client for the [kubernetes](http://kubernetes.io/) API with the generated Kubevirt Classes for VirtualMachineInstance resources.

## How is this different from the Kubernetes Java Client Repository

The given repository contains the model classes used by VirtualMachineInstances created off the kubevirt repository. The classes given here will be able to interact with of the model classes as part of the Kubernetes Java Client. These classes can be used as is with any of the code examples given as part of the Kubernetes Java Client and also faces the same set of Issues given there.

## To start using Kubernetes Java Client

See the wiki page and documentation [here](https://github.com/kubernetes-client/java/wiki).

- [Installation](https://github.com/kubernetes-client/java/wiki/1.-Installation)
- [Client Versioning and Compatibility](https://github.com/kubernetes-client/java/wiki/2.-Versioning-and-Compatibility)
- [Code Examples](https://github.com/kubernetes-client/java/wiki/3.-Code-Examples)

## How to integrate the Kubevirt Model Classes along with the Kubernetes Java Client

1. Move the kubevirt.models folder to the io.kubernetes.client directory of the examples-release folder.
2. Add the following line to the [POM XML](https://github.com/kubernetes-client/java/blob/master/pom.xml#L23) on the main directory
   
   `<module>kubevirt</module>`
3. Move the VMIInformerExample.java code to the corresponding repository. You can run this code with the following -
   
   ` mvn exec:java -Dexec.mainClass="io.kubernetes.client.examples.VMIInformerExample" `
   
   From inside the examples directory
4. Add the kubeconfig file for your cluster to the HOME path and provide that as part of the Build Parameters while running the SharedIndexInformer Example for VMI.

## Development

- [Development and Contributing](https://github.com/kubernetes-client/java/wiki/4.-Development-and-Contributing)
- [Generate Java CRD Models](https://github.com/kubernetes-client/java/wiki/5.-Generate-Java-CRD-Model)
- [Known Issues](https://github.com/kubernetes-client/java/wiki/6.-Known-Issues)
- [Troubleshooting/FAQ](https://github.com/kubernetes-client/java/wiki/7.-FAQ)

## Support

If you need support, start with checking whether you're hitting known issues as part of the kubernetes client repository. If that doesn't work, please [open an issue](https://github.com/kubernetes-client/java/issues/new) to describe the cases. Additionally, before you file an issue, please search [existing issues](https://github.com/kubernetes-client/java/issues) to see if your issue is already covered.

You can also reach out to us via [#kubernetes-client](https://kubernetes.slack.com/messages/kubernetes-clients/) slack channel.
