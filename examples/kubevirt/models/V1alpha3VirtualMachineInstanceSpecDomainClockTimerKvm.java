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
 * KVM  (KVM clock) - lets guests read the host’s wall clock time (paravirtualized). For linux guests.
 */
@ApiModel(description = "KVM  (KVM clock) - lets guests read the host’s wall clock time (paravirtualized). For linux guests.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecDomainClockTimerKvm {
  public static final String SERIALIZED_NAME_PRESENT = "present";
  @SerializedName(SERIALIZED_NAME_PRESENT)
  private Boolean present;


  public V1alpha3VirtualMachineInstanceSpecDomainClockTimerKvm present(Boolean present) {
    
    this.present = present;
    return this;
  }

   /**
   * Enabled set to false makes sure that the machine type or a preset can&#39;t add the timer. Defaults to true.
   * @return present
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enabled set to false makes sure that the machine type or a preset can't add the timer. Defaults to true.")

  public Boolean getPresent() {
    return present;
  }


  public void setPresent(Boolean present) {
    this.present = present;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecDomainClockTimerKvm v1alpha3VirtualMachineInstanceSpecDomainClockTimerKvm = (V1alpha3VirtualMachineInstanceSpecDomainClockTimerKvm) o;
    return Objects.equals(this.present, v1alpha3VirtualMachineInstanceSpecDomainClockTimerKvm.present);
  }

  @Override
  public int hashCode() {
    return Objects.hash(present);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecDomainClockTimerKvm {\n");
    sb.append("    present: ").append(toIndentedString(present)).append("\n");
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

