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
 * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
 */
@ApiModel(description = "Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDnsConfig {
  public static final String SERIALIZED_NAME_NAMESERVERS = "nameservers";
  @SerializedName(SERIALIZED_NAME_NAMESERVERS)
  private List<String> nameservers = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<V1alpha3VirtualMachineInstanceSpecDnsConfigOptions> options = null;

  public static final String SERIALIZED_NAME_SEARCHES = "searches";
  @SerializedName(SERIALIZED_NAME_SEARCHES)
  private List<String> searches = null;


  public V1alpha3VirtualMachineInstanceSpecDnsConfig nameservers(List<String> nameservers) {
    
    this.nameservers = nameservers;
    return this;
  }

  public V1alpha3VirtualMachineInstanceSpecDnsConfig addNameserversItem(String nameserversItem) {
    if (this.nameservers == null) {
      this.nameservers = new ArrayList<>();
    }
    this.nameservers.add(nameserversItem);
    return this;
  }

   /**
   * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
   * @return nameservers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.")

  public List<String> getNameservers() {
    return nameservers;
  }


  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }


  public V1alpha3VirtualMachineInstanceSpecDnsConfig options(List<V1alpha3VirtualMachineInstanceSpecDnsConfigOptions> options) {
    
    this.options = options;
    return this;
  }

  public V1alpha3VirtualMachineInstanceSpecDnsConfig addOptionsItem(V1alpha3VirtualMachineInstanceSpecDnsConfigOptions optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.")

  public List<V1alpha3VirtualMachineInstanceSpecDnsConfigOptions> getOptions() {
    return options;
  }


  public void setOptions(List<V1alpha3VirtualMachineInstanceSpecDnsConfigOptions> options) {
    this.options = options;
  }


  public V1alpha3VirtualMachineInstanceSpecDnsConfig searches(List<String> searches) {
    
    this.searches = searches;
    return this;
  }

  public V1alpha3VirtualMachineInstanceSpecDnsConfig addSearchesItem(String searchesItem) {
    if (this.searches == null) {
      this.searches = new ArrayList<>();
    }
    this.searches.add(searchesItem);
    return this;
  }

   /**
   * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
   * @return searches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.")

  public List<String> getSearches() {
    return searches;
  }


  public void setSearches(List<String> searches) {
    this.searches = searches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDnsConfig v1alpha3VirtualMachineInstanceSpecDnsConfig = (V1alpha3VirtualMachineInstanceSpecDnsConfig) o;
    return Objects.equals(this.nameservers, v1alpha3VirtualMachineInstanceSpecDnsConfig.nameservers) &&
        Objects.equals(this.options, v1alpha3VirtualMachineInstanceSpecDnsConfig.options) &&
        Objects.equals(this.searches, v1alpha3VirtualMachineInstanceSpecDnsConfig.searches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameservers, options, searches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDnsConfig {\n");
    sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
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
