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
 * HostDisk represents a disk created on the cluster level
 */
@ApiModel(description = "HostDisk represents a disk created on the cluster level")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecHostDisk {
  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Object capacity;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SHARED = "shared";
  @SerializedName(SERIALIZED_NAME_SHARED)
  private Boolean shared;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1alpha3VirtualMachineInstanceSpecHostDisk capacity(Object capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Capacity of the sparse disk
   * @return capacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Capacity of the sparse disk")

  public Object getCapacity() {
    return capacity;
  }


  public void setCapacity(Object capacity) {
    this.capacity = capacity;
  }


  public V1alpha3VirtualMachineInstanceSpecHostDisk path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The path to HostDisk image located on the cluster
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The path to HostDisk image located on the cluster")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public V1alpha3VirtualMachineInstanceSpecHostDisk shared(Boolean shared) {
    
    this.shared = shared;
    return this;
  }

   /**
   * Shared indicate whether the path is shared between nodes
   * @return shared
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shared indicate whether the path is shared between nodes")

  public Boolean getShared() {
    return shared;
  }


  public void setShared(Boolean shared) {
    this.shared = shared;
  }


  public V1alpha3VirtualMachineInstanceSpecHostDisk type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Contains information if disk.img exists or should be created allowed options are &#39;Disk&#39; and &#39;DiskOrCreate&#39;
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Contains information if disk.img exists or should be created allowed options are 'Disk' and 'DiskOrCreate'")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecHostDisk v1alpha3VirtualMachineInstanceSpecHostDisk = (V1alpha3VirtualMachineInstanceSpecHostDisk) o;
    return Objects.equals(this.capacity, v1alpha3VirtualMachineInstanceSpecHostDisk.capacity) &&
        Objects.equals(this.path, v1alpha3VirtualMachineInstanceSpecHostDisk.path) &&
        Objects.equals(this.shared, v1alpha3VirtualMachineInstanceSpecHostDisk.shared) &&
        Objects.equals(this.type, v1alpha3VirtualMachineInstanceSpecHostDisk.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, path, shared, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecHostDisk {\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
