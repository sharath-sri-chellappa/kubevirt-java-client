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
 * SecretVolumeSource represents a reference to a secret data in the same namespace. More info: https://kubernetes.io/docs/concepts/configuration/secret/
 */
@ApiModel(description = "SecretVolumeSource represents a reference to a secret data in the same namespace. More info: https://kubernetes.io/docs/concepts/configuration/secret/")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-29T01:55:00.032Z[Etc/UTC]")
public class V1alpha3VirtualMachineInstanceSpecSecret {
  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_VOLUME_LABEL = "volumeLabel";
  @SerializedName(SERIALIZED_NAME_VOLUME_LABEL)
  private String volumeLabel;


  public V1alpha3VirtualMachineInstanceSpecSecret optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Specify whether the Secret or it&#39;s keys must be defined
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the Secret or it's keys must be defined")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public V1alpha3VirtualMachineInstanceSpecSecret secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * Name of the secret in the pod&#39;s namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
   * @return secretName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")

  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  public V1alpha3VirtualMachineInstanceSpecSecret volumeLabel(String volumeLabel) {
    
    this.volumeLabel = volumeLabel;
    return this;
  }

   /**
   * The volume label of the resulting disk inside the VMI. Different bootstrapping mechanisms require different values. Typical values are \&quot;cidata\&quot; (cloud-init), \&quot;config-2\&quot; (cloud-init) or \&quot;OEMDRV\&quot; (kickstart).
   * @return volumeLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The volume label of the resulting disk inside the VMI. Different bootstrapping mechanisms require different values. Typical values are \"cidata\" (cloud-init), \"config-2\" (cloud-init) or \"OEMDRV\" (kickstart).")

  public String getVolumeLabel() {
    return volumeLabel;
  }


  public void setVolumeLabel(String volumeLabel) {
    this.volumeLabel = volumeLabel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3VirtualMachineInstanceSpecSecret v1alpha3VirtualMachineInstanceSpecSecret = (V1alpha3VirtualMachineInstanceSpecSecret) o;
    return Objects.equals(this.optional, v1alpha3VirtualMachineInstanceSpecSecret.optional) &&
        Objects.equals(this.secretName, v1alpha3VirtualMachineInstanceSpecSecret.secretName) &&
        Objects.equals(this.volumeLabel, v1alpha3VirtualMachineInstanceSpecSecret.volumeLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optional, secretName, volumeLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3VirtualMachineInstanceSpecSecret {\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    volumeLabel: ").append(toIndentedString(volumeLabel)).append("\n");
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

