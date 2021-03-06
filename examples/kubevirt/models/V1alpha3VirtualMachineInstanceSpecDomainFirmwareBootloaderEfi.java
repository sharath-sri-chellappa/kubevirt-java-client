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
 * If set, EFI will be used instead of BIOS.
 */
@ApiModel(description = "If set, EFI will be used instead of BIOS.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderEfi {
  public static final String SERIALIZED_NAME_SECURE_BOOT = "secureBoot";
  @SerializedName(SERIALIZED_NAME_SECURE_BOOT)
  private Boolean secureBoot;


  public V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderEfi secureBoot(Boolean secureBoot) {
    
    this.secureBoot = secureBoot;
    return this;
  }

   /**
   * If set, SecureBoot will be enabled and the OVMF roms will be swapped for SecureBoot-enabled ones. Requires SMM to be enabled. Defaults to true
   * @return secureBoot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, SecureBoot will be enabled and the OVMF roms will be swapped for SecureBoot-enabled ones. Requires SMM to be enabled. Defaults to true")

  public Boolean getSecureBoot() {
    return secureBoot;
  }


  public void setSecureBoot(Boolean secureBoot) {
    this.secureBoot = secureBoot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderEfi v1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderEfi = (V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderEfi) o;
    return Objects.equals(this.secureBoot, v1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderEfi.secureBoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secureBoot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloaderEfi {\n");
    sb.append("    secureBoot: ").append(toIndentedString(secureBoot)).append("\n");
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

