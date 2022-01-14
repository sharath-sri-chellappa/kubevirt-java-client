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

import java.util.ArrayList;
import java.util.List;

/**
 * V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces {
  public static final String SERIALIZED_NAME_BOOT_ORDER = "bootOrder";
  @SerializedName(SERIALIZED_NAME_BOOT_ORDER)
  private Integer bootOrder;

  public static final String SERIALIZED_NAME_BRIDGE = "bridge";
  @SerializedName(SERIALIZED_NAME_BRIDGE)
  private Object bridge;

  public static final String SERIALIZED_NAME_DHCP_OPTIONS = "dhcpOptions";
  @SerializedName(SERIALIZED_NAME_DHCP_OPTIONS)
  private V1alpha3VirtualMachineInstanceSpecDomainDevicesDhcpOptions dhcpOptions;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "macAddress";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_MACVTAP = "macvtap";
  @SerializedName(SERIALIZED_NAME_MACVTAP)
  private Object macvtap;

  public static final String SERIALIZED_NAME_MASQUERADE = "masquerade";
  @SerializedName(SERIALIZED_NAME_MASQUERADE)
  private Object masquerade;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PCI_ADDRESS = "pciAddress";
  @SerializedName(SERIALIZED_NAME_PCI_ADDRESS)
  private String pciAddress;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1alpha3VirtualMachineInstanceSpecDomainDevicesPorts> ports = null;

  public static final String SERIALIZED_NAME_SLIRP = "slirp";
  @SerializedName(SERIALIZED_NAME_SLIRP)
  private Object slirp;

  public static final String SERIALIZED_NAME_SRIOV = "sriov";
  @SerializedName(SERIALIZED_NAME_SRIOV)
  private Object sriov;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces bootOrder(Integer bootOrder) {
    
    this.bootOrder = bootOrder;
    return this;
  }

   /**
   * BootOrder is an integer value &gt; 0, used to determine ordering of boot devices. Lower values take precedence. Each interface or disk that has a boot order must have a unique value. Interfaces without a boot order are not tried.
   * @return bootOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BootOrder is an integer value > 0, used to determine ordering of boot devices. Lower values take precedence. Each interface or disk that has a boot order must have a unique value. Interfaces without a boot order are not tried.")

  public Integer getBootOrder() {
    return bootOrder;
  }


  public void setBootOrder(Integer bootOrder) {
    this.bootOrder = bootOrder;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces bridge(Object bridge) {
    
    this.bridge = bridge;
    return this;
  }

   /**
   * Get bridge
   * @return bridge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getBridge() {
    return bridge;
  }


  public void setBridge(Object bridge) {
    this.bridge = bridge;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces dhcpOptions(V1alpha3VirtualMachineInstanceSpecDomainDevicesDhcpOptions dhcpOptions) {
    
    this.dhcpOptions = dhcpOptions;
    return this;
  }

   /**
   * Get dhcpOptions
   * @return dhcpOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha3VirtualMachineInstanceSpecDomainDevicesDhcpOptions getDhcpOptions() {
    return dhcpOptions;
  }


  public void setDhcpOptions(V1alpha3VirtualMachineInstanceSpecDomainDevicesDhcpOptions dhcpOptions) {
    this.dhcpOptions = dhcpOptions;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces macAddress(String macAddress) {
    
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Interface MAC address. For example: de:ad:00:00:be:af or DE-AD-00-00-BE-AF.
   * @return macAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interface MAC address. For example: de:ad:00:00:be:af or DE-AD-00-00-BE-AF.")

  public String getMacAddress() {
    return macAddress;
  }


  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces macvtap(Object macvtap) {
    
    this.macvtap = macvtap;
    return this;
  }

   /**
   * Get macvtap
   * @return macvtap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMacvtap() {
    return macvtap;
  }


  public void setMacvtap(Object macvtap) {
    this.macvtap = macvtap;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces masquerade(Object masquerade) {
    
    this.masquerade = masquerade;
    return this;
  }

   /**
   * Get masquerade
   * @return masquerade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMasquerade() {
    return masquerade;
  }


  public void setMasquerade(Object masquerade) {
    this.masquerade = masquerade;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Interface model. One of: e1000, e1000e, ne2k_pci, pcnet, rtl8139, virtio. Defaults to virtio. TODO:(ihar) switch to enums once opengen-api supports them. See: https://github.com/kubernetes/kube-openapi/issues/51
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interface model. One of: e1000, e1000e, ne2k_pci, pcnet, rtl8139, virtio. Defaults to virtio. TODO:(ihar) switch to enums once opengen-api supports them. See: https://github.com/kubernetes/kube-openapi/issues/51")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Logical name of the interface as well as a reference to the associated networks. Must match the Name of a Network.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Logical name of the interface as well as a reference to the associated networks. Must match the Name of a Network.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces pciAddress(String pciAddress) {
    
    this.pciAddress = pciAddress;
    return this;
  }

   /**
   * If specified, the virtual network interface will be placed on the guests pci address with the specifed PCI address. For example: 0000:81:01.10
   * @return pciAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the virtual network interface will be placed on the guests pci address with the specifed PCI address. For example: 0000:81:01.10")

  public String getPciAddress() {
    return pciAddress;
  }


  public void setPciAddress(String pciAddress) {
    this.pciAddress = pciAddress;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces ports(List<V1alpha3VirtualMachineInstanceSpecDomainDevicesPorts> ports) {
    
    this.ports = ports;
    return this;
  }

  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces addPortsItem(V1alpha3VirtualMachineInstanceSpecDomainDevicesPorts portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * List of ports to be forwarded to the virtual machine.
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of ports to be forwarded to the virtual machine.")

  public List<V1alpha3VirtualMachineInstanceSpecDomainDevicesPorts> getPorts() {
    return ports;
  }


  public void setPorts(List<V1alpha3VirtualMachineInstanceSpecDomainDevicesPorts> ports) {
    this.ports = ports;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces slirp(Object slirp) {
    
    this.slirp = slirp;
    return this;
  }

   /**
   * Get slirp
   * @return slirp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSlirp() {
    return slirp;
  }


  public void setSlirp(Object slirp) {
    this.slirp = slirp;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces sriov(Object sriov) {
    
    this.sriov = sriov;
    return this;
  }

   /**
   * Get sriov
   * @return sriov
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSriov() {
    return sriov;
  }


  public void setSriov(Object sriov) {
    this.sriov = sriov;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * If specified, the virtual network interface address and its tag will be provided to the guest via config drive
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the virtual network interface address and its tag will be provided to the guest via config drive")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces = (V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces) o;
    return Objects.equals(this.bootOrder, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.bootOrder) &&
        Objects.equals(this.bridge, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.bridge) &&
        Objects.equals(this.dhcpOptions, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.dhcpOptions) &&
        Objects.equals(this.macAddress, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.macAddress) &&
        Objects.equals(this.macvtap, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.macvtap) &&
        Objects.equals(this.masquerade, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.masquerade) &&
        Objects.equals(this.model, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.model) &&
        Objects.equals(this.name, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.name) &&
        Objects.equals(this.pciAddress, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.pciAddress) &&
        Objects.equals(this.ports, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.ports) &&
        Objects.equals(this.slirp, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.slirp) &&
        Objects.equals(this.sriov, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.sriov) &&
        Objects.equals(this.tag, v1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootOrder, bridge, dhcpOptions, macAddress, macvtap, masquerade, model, name, pciAddress, ports, slirp, sriov, tag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDomainDevicesInterfaces {\n");
    sb.append("    bootOrder: ").append(toIndentedString(bootOrder)).append("\n");
    sb.append("    bridge: ").append(toIndentedString(bridge)).append("\n");
    sb.append("    dhcpOptions: ").append(toIndentedString(dhcpOptions)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    macvtap: ").append(toIndentedString(macvtap)).append("\n");
    sb.append("    masquerade: ").append(toIndentedString(masquerade)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pciAddress: ").append(toIndentedString(pciAddress)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    slirp: ").append(toIndentedString(slirp)).append("\n");
    sb.append("    sriov: ").append(toIndentedString(sriov)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
