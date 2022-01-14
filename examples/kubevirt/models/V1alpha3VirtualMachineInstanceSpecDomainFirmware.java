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
 * Firmware.
 */
@ApiModel(description = "Firmware.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDomainFirmware {
  public static final String SERIALIZED_NAME_BOOTLOADER = "bootloader";
  @SerializedName(SERIALIZED_NAME_BOOTLOADER)
  private V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader bootloader;

  public static final String SERIALIZED_NAME_SERIAL = "serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;


  public V1alpha3VirtualMachineInstanceSpecDomainFirmware bootloader(V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader bootloader) {
    
    this.bootloader = bootloader;
    return this;
  }

   /**
   * Get bootloader
   * @return bootloader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader getBootloader() {
    return bootloader;
  }


  public void setBootloader(V1alpha3VirtualMachineInstanceSpecDomainFirmwareBootloader bootloader) {
    this.bootloader = bootloader;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainFirmware serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * The system-serial-number in SMBIOS
   * @return serial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The system-serial-number in SMBIOS")

  public String getSerial() {
    return serial;
  }


  public void setSerial(String serial) {
    this.serial = serial;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainFirmware uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID reported by the vmi bios. Defaults to a random generated uid.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID reported by the vmi bios. Defaults to a random generated uid.")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDomainFirmware v1alpha3VirtualMachineInstanceSpecDomainFirmware = (V1alpha3VirtualMachineInstanceSpecDomainFirmware) o;
    return Objects.equals(this.bootloader, v1alpha3VirtualMachineInstanceSpecDomainFirmware.bootloader) &&
        Objects.equals(this.serial, v1alpha3VirtualMachineInstanceSpecDomainFirmware.serial) &&
        Objects.equals(this.uuid, v1alpha3VirtualMachineInstanceSpecDomainFirmware.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootloader, serial, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDomainFirmware {\n");
    sb.append("    bootloader: ").append(toIndentedString(bootloader)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

