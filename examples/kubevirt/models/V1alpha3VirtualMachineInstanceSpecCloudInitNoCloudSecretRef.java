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
 * UserDataSecretRef references a k8s secret that contains NoCloud userdata.
 */
@ApiModel(description = "UserDataSecretRef references a k8s secret that contains NoCloud userdata.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecCloudInitNoCloudSecretRef {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1alpha3VirtualMachineInstanceSpecCloudInitNoCloudSecretRef name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecCloudInitNoCloudSecretRef v1alpha3VirtualMachineInstanceSpecCloudInitNoCloudSecretRef = (V1alpha3VirtualMachineInstanceSpecCloudInitNoCloudSecretRef) o;
    return Objects.equals(this.name, v1alpha3VirtualMachineInstanceSpecCloudInitNoCloudSecretRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecCloudInitNoCloudSecretRef {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
