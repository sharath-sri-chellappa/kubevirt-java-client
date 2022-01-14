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
 * Settings to control the bootloader that is used.
 */
@ApiModel(description = "Settings to control the bootloader that is used.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader {
  public static final String SERIALIZED_NAME_BIOS = "bios";
  @SerializedName(SERIALIZED_NAME_BIOS)
  private V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderBios bios;

  public static final String SERIALIZED_NAME_EFI = "efi";
  @SerializedName(SERIALIZED_NAME_EFI)
  private V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderEfi efi;


  public V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader bios(V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderBios bios) {
    
    this.bios = bios;
    return this;
  }

   /**
   * Get bios
   * @return bios
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderBios getBios() {
    return bios;
  }


  public void setBios(V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderBios bios) {
    this.bios = bios;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader efi(V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderEfi efi) {
    
    this.efi = efi;
    return this;
  }

   /**
   * Get efi
   * @return efi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderEfi getEfi() {
    return efi;
  }


  public void setEfi(V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderEfi efi) {
    this.efi = efi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader v1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader = (V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader) o;
    return Objects.equals(this.bios, v1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader.bios) &&
        Objects.equals(this.efi, v1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader.efi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bios, efi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader {\n");
    sb.append("    bios: ").append(toIndentedString(bios)).append("\n");
    sb.append("    efi: ").append(toIndentedString(efi)).append("\n");
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

