# SearchRecipes200ResponseResultsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | 
**title** | **str** |  | 
**image** | **str** |  | 
**image_type** | **str** |  | 

## Example

```python
from spoonacular.models.search_recipes200_response_results_inner import SearchRecipes200ResponseResultsInner

# TODO update the JSON string below
json = "{}"
# create an instance of SearchRecipes200ResponseResultsInner from a JSON string
search_recipes200_response_results_inner_instance = SearchRecipes200ResponseResultsInner.from_json(json)
# print the JSON string representation of the object
print SearchRecipes200ResponseResultsInner.to_json()

# convert the object into a dict
search_recipes200_response_results_inner_dict = search_recipes200_response_results_inner_instance.to_dict()
# create an instance of SearchRecipes200ResponseResultsInner from a dict
search_recipes200_response_results_inner_form_dict = search_recipes200_response_results_inner.from_dict(search_recipes200_response_results_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


