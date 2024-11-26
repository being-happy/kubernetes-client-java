/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: master
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package client.models;

import java.util.Objects;
import client.models.V1NonResourceAttributes;
import client.models.V1ResourceAttributes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import client.JSON;

/**
 * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
@ApiModel(description = "SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T07:42:50.433063Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1SubjectAccessReviewSpec {
  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String, List<String>> extra = new HashMap<>();

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES = "nonResourceAttributes";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES)
  private V1NonResourceAttributes nonResourceAttributes;

  public static final String SERIALIZED_NAME_RESOURCE_ATTRIBUTES = "resourceAttributes";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ATTRIBUTES)
  private V1ResourceAttributes resourceAttributes;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public V1SubjectAccessReviewSpec() {
  }

  public V1SubjectAccessReviewSpec extra(Map<String, List<String>> extra) {
    this.extra = extra;
    return this;
  }

  public V1SubjectAccessReviewSpec putExtraItem(String key, List<String> extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

   /**
   * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
   * @return extra
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.")
  public Map<String, List<String>> getExtra() {
    return extra;
  }

  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }


  public V1SubjectAccessReviewSpec groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public V1SubjectAccessReviewSpec addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Groups is the groups you&#39;re testing for.
   * @return groups
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Groups is the groups you're testing for.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public V1SubjectAccessReviewSpec nonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

   /**
   * Get nonResourceAttributes
   * @return nonResourceAttributes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }

  public void setNonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }


  public V1SubjectAccessReviewSpec resourceAttributes(V1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
    return this;
  }

   /**
   * Get resourceAttributes
   * @return resourceAttributes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(V1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }


  public V1SubjectAccessReviewSpec uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * UID information about the requesting user.
   * @return uid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "UID information about the requesting user.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  public V1SubjectAccessReviewSpec user(String user) {
    this.user = user;
    return this;
  }

   /**
   * User is the user you&#39;re testing for. If you specify \&quot;User\&quot; but not \&quot;Groups\&quot;, then is it interpreted as \&quot;What if User were not a member of any groups
   * @return user
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "User is the user you're testing for. If you specify \"User\" but not \"Groups\", then is it interpreted as \"What if User were not a member of any groups")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SubjectAccessReviewSpec v1SubjectAccessReviewSpec = (V1SubjectAccessReviewSpec) o;
    return Objects.equals(this.extra, v1SubjectAccessReviewSpec.extra) &&
        Objects.equals(this.groups, v1SubjectAccessReviewSpec.groups) &&
        Objects.equals(this.nonResourceAttributes, v1SubjectAccessReviewSpec.nonResourceAttributes) &&
        Objects.equals(this.resourceAttributes, v1SubjectAccessReviewSpec.resourceAttributes) &&
        Objects.equals(this.uid, v1SubjectAccessReviewSpec.uid) &&
        Objects.equals(this.user, v1SubjectAccessReviewSpec.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, groups, nonResourceAttributes, resourceAttributes, uid, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SubjectAccessReviewSpec {\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    nonResourceAttributes: ").append(toIndentedString(nonResourceAttributes)).append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("extra");
    openapiFields.add("groups");
    openapiFields.add("nonResourceAttributes");
    openapiFields.add("resourceAttributes");
    openapiFields.add("uid");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1SubjectAccessReviewSpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1SubjectAccessReviewSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1SubjectAccessReviewSpec is not found in the empty JSON string", V1SubjectAccessReviewSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1SubjectAccessReviewSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1SubjectAccessReviewSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull() && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }
      // validate the optional field `nonResourceAttributes`
      if (jsonObj.get("nonResourceAttributes") != null && !jsonObj.get("nonResourceAttributes").isJsonNull()) {
        V1NonResourceAttributes.validateJsonElement(jsonObj.get("nonResourceAttributes"));
      }
      // validate the optional field `resourceAttributes`
      if (jsonObj.get("resourceAttributes") != null && !jsonObj.get("resourceAttributes").isJsonNull()) {
        V1ResourceAttributes.validateJsonElement(jsonObj.get("resourceAttributes"));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1SubjectAccessReviewSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1SubjectAccessReviewSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1SubjectAccessReviewSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1SubjectAccessReviewSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1SubjectAccessReviewSpec>() {
           @Override
           public void write(JsonWriter out, V1SubjectAccessReviewSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1SubjectAccessReviewSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1SubjectAccessReviewSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1SubjectAccessReviewSpec
  * @throws IOException if the JSON string is invalid with respect to V1SubjectAccessReviewSpec
  */
  public static V1SubjectAccessReviewSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1SubjectAccessReviewSpec.class);
  }

 /**
  * Convert an instance of V1SubjectAccessReviewSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

