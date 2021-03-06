/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.kubevirt.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * CPU allow specified the detailed CPU topology inside the vmi.
 */
@ApiModel(description = "CPU allow specified the detailed CPU topology inside the vmi.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDomainCpu {
  public static final String SERIALIZED_NAME_CACHE = "cache";
  @SerializedName(SERIALIZED_NAME_CACHE)
  private V1alpha3VirtualMachineInstanceSpecDomainCpuCache cache;

  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;

  public static final String SERIALIZED_NAME_CUSTOM_CPU_PLACEMENT = "customCpuPlacement";
  @SerializedName(SERIALIZED_NAME_CUSTOM_CPU_PLACEMENT)
  private Boolean customCpuPlacement;

  public static final String SERIALIZED_NAME_DEDICATED_CPU_PLACEMENT = "dedicatedCpuPlacement";
  @SerializedName(SERIALIZED_NAME_DEDICATED_CPU_PLACEMENT)
  private Boolean dedicatedCpuPlacement;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<V1alpha3VirtualMachineInstanceSpecDomainCpuFeatures> features = null;

  public static final String SERIALIZED_NAME_ISOLATE_EMULATOR_THREAD = "isolateEmulatorThread";
  @SerializedName(SERIALIZED_NAME_ISOLATE_EMULATOR_THREAD)
  private Boolean isolateEmulatorThread;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_SOCKETS = "sockets";
  @SerializedName(SERIALIZED_NAME_SOCKETS)
  private Integer sockets;

  public static final String SERIALIZED_NAME_THREADS = "threads";
  @SerializedName(SERIALIZED_NAME_THREADS)
  private Integer threads;


  public V1alpha3VirtualMachineInstanceSpecDomainCpu cache(V1alpha3VirtualMachineInstanceSpecDomainCpuCache cache) {
    
    this.cache = cache;
    return this;
  }

   /**
   * Get cache
   * @return cache
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha3VirtualMachineInstanceSpecDomainCpuCache getCache() {
    return cache;
  }


  public void setCache(V1alpha3VirtualMachineInstanceSpecDomainCpuCache cache) {
    this.cache = cache;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainCpu cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * Cores specifies the number of cores inside the vmi. Must be a value greater or equal 1.
   * @return cores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cores specifies the number of cores inside the vmi. Must be a value greater or equal 1.")

  public Integer getCores() {
    return cores;
  }


  public void setCores(Integer cores) {
    this.cores = cores;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainCpu customCpuPlacement(Boolean customCpuPlacement) {
    
    this.customCpuPlacement = customCpuPlacement;
    return this;
  }

   /**
   * CustomCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough custom pCPUs as advertised by a CPU device plugin, and pin the vCPUs to it.
   * @return customCpuPlacement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CustomCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough custom pCPUs as advertised by a CPU device plugin, and pin the vCPUs to it.")

  public Boolean getCustomCpuPlacement() {
    return customCpuPlacement;
  }


  public void setCustomCpuPlacement(Boolean customCpuPlacement) {
    this.customCpuPlacement = customCpuPlacement;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainCpu dedicatedCpuPlacement(Boolean dedicatedCpuPlacement) {
    
    this.dedicatedCpuPlacement = dedicatedCpuPlacement;
    return this;
  }

   /**
   * DedicatedCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough dedicated pCPUs and pin the vCPUs to it.
   * @return dedicatedCpuPlacement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DedicatedCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough dedicated pCPUs and pin the vCPUs to it.")

  public Boolean getDedicatedCpuPlacement() {
    return dedicatedCpuPlacement;
  }


  public void setDedicatedCpuPlacement(Boolean dedicatedCpuPlacement) {
    this.dedicatedCpuPlacement = dedicatedCpuPlacement;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainCpu features(List<V1alpha3VirtualMachineInstanceSpecDomainCpuFeatures> features) {
    
    this.features = features;
    return this;
  }

  public V1alpha3VirtualMachineInstanceSpecDomainCpu addFeaturesItem(V1alpha3VirtualMachineInstanceSpecDomainCpuFeatures featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Features specifies the CPU features list inside the VMI.
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Features specifies the CPU features list inside the VMI.")

  public List<V1alpha3VirtualMachineInstanceSpecDomainCpuFeatures> getFeatures() {
    return features;
  }


  public void setFeatures(List<V1alpha3VirtualMachineInstanceSpecDomainCpuFeatures> features) {
    this.features = features;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainCpu isolateEmulatorThread(Boolean isolateEmulatorThread) {
    
    this.isolateEmulatorThread = isolateEmulatorThread;
    return this;
  }

   /**
   * IsolateEmulatorThread requests one more dedicated pCPU to be allocated for the VMI to place the emulator thread on it.
   * @return isolateEmulatorThread
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IsolateEmulatorThread requests one more dedicated pCPU to be allocated for the VMI to place the emulator thread on it.")

  public Boolean getIsolateEmulatorThread() {
    return isolateEmulatorThread;
  }


  public void setIsolateEmulatorThread(Boolean isolateEmulatorThread) {
    this.isolateEmulatorThread = isolateEmulatorThread;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainCpu model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Model specifies the CPU model inside the VMI. List of available models https://github.com/libvirt/libvirt/tree/master/src/cpu_map. It is possible to specify special cases like \&quot;host-passthrough\&quot; to get the same CPU as the node and \&quot;host-model\&quot; to get CPU closest to the node one. Defaults to host-model.
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Model specifies the CPU model inside the VMI. List of available models https://github.com/libvirt/libvirt/tree/master/src/cpu_map. It is possible to specify special cases like \"host-passthrough\" to get the same CPU as the node and \"host-model\" to get CPU closest to the node one. Defaults to host-model.")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainCpu sockets(Integer sockets) {
    
    this.sockets = sockets;
    return this;
  }

   /**
   * Sockets specifies the number of sockets inside the vmi. Must be a value greater or equal 1.
   * @return sockets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sockets specifies the number of sockets inside the vmi. Must be a value greater or equal 1.")

  public Integer getSockets() {
    return sockets;
  }


  public void setSockets(Integer sockets) {
    this.sockets = sockets;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainCpu threads(Integer threads) {
    
    this.threads = threads;
    return this;
  }

   /**
   * Threads specifies the number of threads inside the vmi. Must be a value greater or equal 1.
   * @return threads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Threads specifies the number of threads inside the vmi. Must be a value greater or equal 1.")

  public Integer getThreads() {
    return threads;
  }


  public void setThreads(Integer threads) {
    this.threads = threads;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDomainCpu v1alpha3VirtualMachineInstanceSpecDomainCpu = (V1alpha3VirtualMachineInstanceSpecDomainCpu) o;
    return Objects.equals(this.cache, v1alpha3VirtualMachineInstanceSpecDomainCpu.cache) &&
        Objects.equals(this.cores, v1alpha3VirtualMachineInstanceSpecDomainCpu.cores) &&
        Objects.equals(this.customCpuPlacement, v1alpha3VirtualMachineInstanceSpecDomainCpu.customCpuPlacement) &&
        Objects.equals(this.dedicatedCpuPlacement, v1alpha3VirtualMachineInstanceSpecDomainCpu.dedicatedCpuPlacement) &&
        Objects.equals(this.features, v1alpha3VirtualMachineInstanceSpecDomainCpu.features) &&
        Objects.equals(this.isolateEmulatorThread, v1alpha3VirtualMachineInstanceSpecDomainCpu.isolateEmulatorThread) &&
        Objects.equals(this.model, v1alpha3VirtualMachineInstanceSpecDomainCpu.model) &&
        Objects.equals(this.sockets, v1alpha3VirtualMachineInstanceSpecDomainCpu.sockets) &&
        Objects.equals(this.threads, v1alpha3VirtualMachineInstanceSpecDomainCpu.threads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cache, cores, customCpuPlacement, dedicatedCpuPlacement, features, isolateEmulatorThread, model, sockets, threads);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDomainCpu {\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    customCpuPlacement: ").append(toIndentedString(customCpuPlacement)).append("\n");
    sb.append("    dedicatedCpuPlacement: ").append(toIndentedString(dedicatedCpuPlacement)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    isolateEmulatorThread: ").append(toIndentedString(isolateEmulatorThread)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
    sb.append("    threads: ").append(toIndentedString(threads)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

