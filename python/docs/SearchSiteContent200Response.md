# SearchSiteContent200Response



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**articles** | [**List[SearchSiteContent200ResponseArticlesInner]**](SearchSiteContent200ResponseArticlesInner.md) |  | 
**grocery_products** | [**List[SearchSiteContent200ResponseArticlesInner]**](SearchSiteContent200ResponseArticlesInner.md) |  | 
**menu_items** | [**List[SearchSiteContent200ResponseArticlesInner]**](SearchSiteContent200ResponseArticlesInner.md) |  | 
**recipes** | [**List[SearchSiteContent200ResponseArticlesInner]**](SearchSiteContent200ResponseArticlesInner.md) |  | 

## Example

```python
from spoonacular.models.search_site_content200_response import SearchSiteContent200Response

# TODO update the JSON string below
json = "{}"
# create an instance of SearchSiteContent200Response from a JSON string
search_site_content200_response_instance = SearchSiteContent200Response.from_json(json)
# print the JSON string representation of the object
print SearchSiteContent200Response.to_json()

# convert the object into a dict
search_site_content200_response_dict = search_site_content200_response_instance.to_dict()
# create an instance of SearchSiteContent200Response from a dict
search_site_content200_response_form_dict = search_site_content200_response.from_dict(search_site_content200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


