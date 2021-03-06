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

import java.util.HashMap;
import java.util.Map;

/**
 * Resources describes the Compute Resources required by this vmi.
 */
@ApiModel(description = "Resources describes the Compute Resources required by this vmi.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDomainResources {
  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private Map<String, Object> limits = null;

  public static final String SERIALIZED_NAME_OVERCOMMIT_GUEST_OVERHEAD = "overcommitGuestOverhead";
  @SerializedName(SERIALIZED_NAME_OVERCOMMIT_GUEST_OVERHEAD)
  private Boolean overcommitGuestOverhead;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private Map<String, Object> requests = null;


  public V1alpha3VirtualMachineInstanceSpecDomainResources limits(Map<String, Object> limits) {
    
    this.limits = limits;
    return this;
  }

  public V1alpha3VirtualMachineInstanceSpecDomainResources putLimitsItem(String key, Object limitsItem) {
    if (this.limits == null) {
      this.limits = new HashMap<>();
    }
    this.limits.put(key, limitsItem);
    return this;
  }

   /**
   * Limits describes the maximum amount of compute resources allowed. Valid resource keys are \&quot;memory\&quot; and \&quot;cpu\&quot;.
   * @return limits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limits describes the maximum amount of compute resources allowed. Valid resource keys are \"memory\" and \"cpu\".")

  public Map<String, Object> getLimits() {
    return limits;
  }


  public void setLimits(Map<String, Object> limits) {
    this.limits = limits;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainResources overcommitGuestOverhead(Boolean overcommitGuestOverhead) {
    
    this.overcommitGuestOverhead = overcommitGuestOverhead;
    return this;
  }

   /**
   * Don&#39;t ask the scheduler to take the guest-management overhead into account. Instead put the overhead only into the container&#39;s memory limit. This can lead to crashes if all memory is in use on a node. Defaults to false.
   * @return overcommitGuestOverhead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Don't ask the scheduler to take the guest-management overhead into account. Instead put the overhead only into the container's memory limit. This can lead to crashes if all memory is in use on a node. Defaults to false.")

  public Boolean getOvercommitGuestOverhead() {
    return overcommitGuestOverhead;
  }


  public void setOvercommitGuestOverhead(Boolean overcommitGuestOverhead) {
    this.overcommitGuestOverhead = overcommitGuestOverhead;
  }


  public V1alpha3VirtualMachineInstanceSpecDomainResources requests(Map<String, Object> requests) {
    
    this.requests = requests;
    return this;
  }

  public V1alpha3VirtualMachineInstanceSpecDomainResources putRequestsItem(String key, Object requestsItem) {
    if (this.requests == null) {
      this.requests = new HashMap<>();
    }
    this.requests.put(key, requestsItem);
    return this;
  }

   /**
   * Requests is a description of the initial vmi resources. Valid resource keys are \&quot;memory\&quot; and \&quot;cpu\&quot;.
   * @return requests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests is a description of the initial vmi resources. Valid resource keys are \"memory\" and \"cpu\".")

  public Map<String, Object> getRequests() {
    return requests;
  }


  public void setRequests(Map<String, Object> requests) {
    this.requests = requests;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDomainResources v1alpha3VirtualMachineInstanceSpecDomainResources = (V1alpha3VirtualMachineInstanceSpecDomainResources) o;
    return Objects.equals(this.limits, v1alpha3VirtualMachineInstanceSpecDomainResources.limits) &&
        Objects.equals(this.overcommitGuestOverhead, v1alpha3VirtualMachineInstanceSpecDomainResources.overcommitGuestOverhead) &&
        Objects.equals(this.requests, v1alpha3VirtualMachineInstanceSpecDomainResources.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, overcommitGuestOverhead, requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDomainResources {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    overcommitGuestOverhead: ").append(toIndentedString(overcommitGuestOverhead)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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

