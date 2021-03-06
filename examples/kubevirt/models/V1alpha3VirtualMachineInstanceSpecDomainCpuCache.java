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

/**
 * Cache specifies the cache level and mode inside the VMI
 */
@ApiModel(description = "Cache specifies the cache level and mode inside the VMI")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDomainCpuCache {
  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;


  public V1alpha3VirtualMachineInstanceSpecDomainCpuCache level(String level) {
    
    this.level = level;
    return this;
  }

   /**
   * Name of the CPU feature
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the CPU feature")

  public String getLevel() {
    return level;
  }


  public void setLevel(String level) {
    this.level = level;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainCpuCache mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Mode is the cache mode and the following values are supported: passthrough- The real CPU cache data reported by the host CPU will be passed through to the virtual CPU. emulate - The hypervisor will provide a fake CPU cache data.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mode is the cache mode and the following values are supported: passthrough- The real CPU cache data reported by the host CPU will be passed through to the virtual CPU. emulate - The hypervisor will provide a fake CPU cache data.")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDomainCpuCache v1alpha3VirtualMachineInstanceSpecDomainCpuCache = (V1alpha3VirtualMachineInstanceSpecDomainCpuCache) o;
    return Objects.equals(this.level, v1alpha3VirtualMachineInstanceSpecDomainCpuCache.level) &&
        Objects.equals(this.mode, v1alpha3VirtualMachineInstanceSpecDomainCpuCache.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, mode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDomainCpuCache {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

