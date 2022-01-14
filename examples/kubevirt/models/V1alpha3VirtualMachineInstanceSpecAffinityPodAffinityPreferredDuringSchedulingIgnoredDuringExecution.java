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
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 */
@ApiModel(description = "The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {
  public static final String SERIALIZED_NAME_POD_AFFINITY_TERM = "podAffinityTerm";
  @SerializedName(SERIALIZED_NAME_POD_AFFINITY_TERM)
  private V1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPodAffinityTerm podAffinityTerm;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;


  public V1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution podAffinityTerm(V1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPodAffinityTerm podAffinityTerm) {
    
    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

   /**
   * Get podAffinityTerm
   * @return podAffinityTerm
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPodAffinityTerm getPodAffinityTerm() {
    return podAffinityTerm;
  }


  public void setPodAffinityTerm(V1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
  }


  public V1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "weight associated with matching the corresponding podAffinityTerm, in the range 1-100.")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution v1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution = (V1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution) o;
    return Objects.equals(this.podAffinityTerm, v1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution.podAffinityTerm) &&
        Objects.equals(this.weight, v1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podAffinityTerm, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecAffinityPodAffinityPreferredDuringSchedulingIgnoredDuringExecution {\n");
    sb.append("    podAffinityTerm: ").append(toIndentedString(podAffinityTerm)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
