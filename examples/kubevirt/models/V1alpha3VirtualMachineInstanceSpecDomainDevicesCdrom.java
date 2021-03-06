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
 * Attach a volume as a cdrom to the vmi.
 */
@ApiModel(description = "Attach a volume as a cdrom to the vmi.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDomainDevicesCdrom {
  public static final String SERIALIZED_NAME_BUS = "bus";
  @SerializedName(SERIALIZED_NAME_BUS)
  private String bus;

  public static final String SERIALIZED_NAME_READONLY = "readonly";
  @SerializedName(SERIALIZED_NAME_READONLY)
  private Boolean readonly;

  public static final String SERIALIZED_NAME_TRAY = "tray";
  @SerializedName(SERIALIZED_NAME_TRAY)
  private String tray;


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesCdrom bus(String bus) {
    
    this.bus = bus;
    return this;
  }

   /**
   * Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi.
   * @return bus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi.")

  public String getBus() {
    return bus;
  }


  public void setBus(String bus) {
    this.bus = bus;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesCdrom readonly(Boolean readonly) {
    
    this.readonly = readonly;
    return this;
  }

   /**
   * ReadOnly. Defaults to true.
   * @return readonly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReadOnly. Defaults to true.")

  public Boolean getReadonly() {
    return readonly;
  }


  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesCdrom tray(String tray) {
    
    this.tray = tray;
    return this;
  }

   /**
   * Tray indicates if the tray of the device is open or closed. Allowed values are \&quot;open\&quot; and \&quot;closed\&quot;. Defaults to closed.
   * @return tray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tray indicates if the tray of the device is open or closed. Allowed values are \"open\" and \"closed\". Defaults to closed.")

  public String getTray() {
    return tray;
  }


  public void setTray(String tray) {
    this.tray = tray;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDomainDevicesCdrom v1alpha3VirtualMachineInstanceSpecDomainDevicesCdrom = (V1alpha3VirtualMachineInstanceSpecDomainDevicesCdrom) o;
    return Objects.equals(this.bus, v1alpha3VirtualMachineInstanceSpecDomainDevicesCdrom.bus) &&
        Objects.equals(this.readonly, v1alpha3VirtualMachineInstanceSpecDomainDevicesCdrom.readonly) &&
        Objects.equals(this.tray, v1alpha3VirtualMachineInstanceSpecDomainDevicesCdrom.tray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bus, readonly, tray);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDomainDevicesCdrom {\n");
    sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
    sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
    sb.append("    tray: ").append(toIndentedString(tray)).append("\n");
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

