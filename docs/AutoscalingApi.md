# AutoscalingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAPIGroup**](AutoscalingApi.md#getAPIGroup) | **GET** /apis/autoscaling/ |  |


<a id="getAPIGroup"></a>
# **getAPIGroup**
> V1APIGroup getAPIGroup().execute();



get information of a group

### Example
```java
// Import classes:
import client.ApiClient;
import client.ApiException;
import client.Configuration;
import client.auth.*;
import client.models.*;
import client.apis.AutoscalingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: BearerToken
    ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerToken.setApiKeyPrefix("Token");

    AutoscalingApi apiInstance = new AutoscalingApi(defaultClient);
    try {
      V1APIGroup result = apiInstance.getAPIGroup()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoscalingApi#getAPIGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1APIGroup**](V1APIGroup.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, application/vnd.kubernetes.protobuf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |

