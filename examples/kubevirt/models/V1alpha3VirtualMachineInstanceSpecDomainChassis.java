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
 * Chassis specifies the chassis info passed to the domain.
 */
@ApiModel(description = "Chassis specifies the chassis info passed to the domain.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDomainChassis {
  public static final String SERIALIZED_NAME_ASSET = "asset";
  @SerializedName(SERIALIZED_NAME_ASSET)
  private String asset;

  public static final String SERIALIZED_NAME_MANUFACTURER = "manufacturer";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER)
  private String manufacturer;

  public static final String SERIALIZED_NAME_SERIAL = "serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public V1alpha3VirtualMachineInstanceSpecDomainChassis asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAsset() {
    return asset;
  }


  public void setAsset(String asset) {
    this.asset = asset;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainChassis manufacturer(String manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturer() {
    return manufacturer;
  }


  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainChassis serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerial() {
    return serial;
  }


  public void setSerial(String serial) {
    this.serial = serial;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainChassis sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainChassis version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDomainChassis v1alpha3VirtualMachineInstanceSpecDomainChassis = (V1alpha3VirtualMachineInstanceSpecDomainChassis) o;
    return Objects.equals(this.asset, v1alpha3VirtualMachineInstanceSpecDomainChassis.asset) &&
        Objects.equals(this.manufacturer, v1alpha3VirtualMachineInstanceSpecDomainChassis.manufacturer) &&
        Objects.equals(this.serial, v1alpha3VirtualMachineInstanceSpecDomainChassis.serial) &&
        Objects.equals(this.sku, v1alpha3VirtualMachineInstanceSpecDomainChassis.sku) &&
        Objects.equals(this.version, v1alpha3VirtualMachineInstanceSpecDomainChassis.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, manufacturer, serial, sku, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDomainChassis {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
