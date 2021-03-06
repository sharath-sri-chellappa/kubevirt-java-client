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
import io.swagger.annotations.ApiModelProperty;

/**
 * V1alpha3VirtualMachineInstanceSpecDomainDevicesFilesystems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDomainDevicesFilesystems {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VIRTIOFS = "virtiofs";
  @SerializedName(SERIALIZED_NAME_VIRTIOFS)
  private Object virtiofs;


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesFilesystems name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the device name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the device name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesFilesystems virtiofs(Object virtiofs) {
    
    this.virtiofs = virtiofs;
    return this;
  }

   /**
   * Virtiofs is supported
   * @return virtiofs
  **/
  @ApiModelProperty(required = true, value = "Virtiofs is supported")

  public Object getVirtiofs() {
    return virtiofs;
  }


  public void setVirtiofs(Object virtiofs) {
    this.virtiofs = virtiofs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDomainDevicesFilesystems v1alpha3VirtualMachineInstanceSpecDomainDevicesFilesystems = (V1alpha3VirtualMachineInstanceSpecDomainDevicesFilesystems) o;
    return Objects.equals(this.name, v1alpha3VirtualMachineInstanceSpecDomainDevicesFilesystems.name) &&
        Objects.equals(this.virtiofs, v1alpha3VirtualMachineInstanceSpecDomainDevicesFilesystems.virtiofs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, virtiofs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDomainDevicesFilesystems {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    virtiofs: ").append(toIndentedString(virtiofs)).append("\n");
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

