# OAIIngredientsApi

All URIs are relative to *https://api.spoonacular.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**autocompleteIngredientSearch**](OAIIngredientsApi.md#autocompleteingredientsearch) | **GET** /food/ingredients/autocomplete | Autocomplete Ingredient Search
[**computeIngredientAmount**](OAIIngredientsApi.md#computeingredientamount) | **GET** /food/ingredients/{id}/amount | Compute Ingredient Amount
[**getIngredientInformation**](OAIIngredientsApi.md#getingredientinformation) | **GET** /food/ingredients/{id}/information | Get Ingredient Information
[**getIngredientSubstitutes**](OAIIngredientsApi.md#getingredientsubstitutes) | **GET** /food/ingredients/substitutes | Get Ingredient Substitutes
[**getIngredientSubstitutesByID**](OAIIngredientsApi.md#getingredientsubstitutesbyid) | **GET** /food/ingredients/{id}/substitutes | Get Ingredient Substitutes by ID
[**ingredientSearch**](OAIIngredientsApi.md#ingredientsearch) | **GET** /food/ingredients/search | Ingredient Search
[**ingredientsByIDImage**](OAIIngredientsApi.md#ingredientsbyidimage) | **GET** /recipes/{id}/ingredientWidget.png | Ingredients by ID Image
[**mapIngredientsToGroceryProducts**](OAIIngredientsApi.md#mapingredientstogroceryproducts) | **POST** /food/ingredients/map | Map Ingredients to Grocery Products
[**visualizeIngredients**](OAIIngredientsApi.md#visualizeingredients) | **POST** /recipes/visualizeIngredients | Ingredients Widget


# **autocompleteIngredientSearch**
```objc
-(NSURLSessionTask*) autocompleteIngredientSearchWithQuery: (NSString*) query
    number: (NSNumber*) number
    metaInformation: (NSNumber*) metaInformation
    intolerances: (NSString*) intolerances
    language: (NSString*) language
        completionHandler: (void (^)(OAISet<OAIAutocompleteIngredientSearch200ResponseInner>* output, NSError* error)) handler;
```

Autocomplete Ingredient Search

Autocomplete the entry of an ingredient.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* query = burger; // The (natural language) search query. (optional)
NSNumber* number = 10; // The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)
NSNumber* metaInformation = false; // Whether to return more meta information about the ingredients. (optional)
NSString* intolerances = egg; // A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. (optional)
NSString* language = en; // The language of the input. Either 'en' or 'de'. (optional)

OAIIngredientsApi*apiInstance = [[OAIIngredientsApi alloc] init];

// Autocomplete Ingredient Search
[apiInstance autocompleteIngredientSearchWithQuery:query
              number:number
              metaInformation:metaInformation
              intolerances:intolerances
              language:language
          completionHandler: ^(OAISet<OAIAutocompleteIngredientSearch200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIngredientsApi->autocompleteIngredientSearch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **NSString***| The (natural language) search query. | [optional] 
 **number** | **NSNumber***| The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional] [default to @10]
 **metaInformation** | **NSNumber***| Whether to return more meta information about the ingredients. | [optional] 
 **intolerances** | **NSString***| A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. | [optional] 
 **language** | **NSString***| The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] 

### Return type

[**OAISet<OAIAutocompleteIngredientSearch200ResponseInner>***](OAIAutocompleteIngredientSearch200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **computeIngredientAmount**
```objc
-(NSURLSessionTask*) computeIngredientAmountWithId: (NSNumber*) _id
    nutrient: (NSString*) nutrient
    target: (NSNumber*) target
    unit: (NSString*) unit
        completionHandler: (void (^)(OAIComputeIngredientAmount200Response* output, NSError* error)) handler;
```

Compute Ingredient Amount

Compute the amount you need of a certain ingredient for a certain nutritional goal. For example, how much pineapple do you have to eat to get 10 grams of protein?

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 9266; // The id of the ingredient you want the amount for.
NSString* nutrient = protein; // The target nutrient. See a list of supported nutrients.
NSNumber* target = 2; // The target number of the given nutrient.
NSString* unit = oz; // The target unit. (optional)

OAIIngredientsApi*apiInstance = [[OAIIngredientsApi alloc] init];

// Compute Ingredient Amount
[apiInstance computeIngredientAmountWithId:_id
              nutrient:nutrient
              target:target
              unit:unit
          completionHandler: ^(OAIComputeIngredientAmount200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIngredientsApi->computeIngredientAmount: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The id of the ingredient you want the amount for. | 
 **nutrient** | **NSString***| The target nutrient. See a list of supported nutrients. | 
 **target** | **NSNumber***| The target number of the given nutrient. | 
 **unit** | **NSString***| The target unit. | [optional] 

### Return type

[**OAIComputeIngredientAmount200Response***](OAIComputeIngredientAmount200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIngredientInformation**
```objc
-(NSURLSessionTask*) getIngredientInformationWithId: (NSNumber*) _id
    amount: (NSNumber*) amount
    unit: (NSString*) unit
        completionHandler: (void (^)(OAIGetIngredientInformation200Response* output, NSError* error)) handler;
```

Get Ingredient Information

Use an ingredient id to get all available information about an ingredient, such as its image and supermarket aisle.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.
NSNumber* amount = 150; // The amount of this ingredient. (optional)
NSString* unit = grams; // The unit for the given amount. (optional)

OAIIngredientsApi*apiInstance = [[OAIIngredientsApi alloc] init];

// Get Ingredient Information
[apiInstance getIngredientInformationWithId:_id
              amount:amount
              unit:unit
          completionHandler: ^(OAIGetIngredientInformation200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIngredientsApi->getIngredientInformation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 
 **amount** | **NSNumber***| The amount of this ingredient. | [optional] 
 **unit** | **NSString***| The unit for the given amount. | [optional] 

### Return type

[**OAIGetIngredientInformation200Response***](OAIGetIngredientInformation200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIngredientSubstitutes**
```objc
-(NSURLSessionTask*) getIngredientSubstitutesWithIngredientName: (NSString*) ingredientName
        completionHandler: (void (^)(OAIGetIngredientSubstitutes200Response* output, NSError* error)) handler;
```

Get Ingredient Substitutes

Search for substitutes for a given ingredient.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* ingredientName = butter; // The name of the ingredient you want to replace.

OAIIngredientsApi*apiInstance = [[OAIIngredientsApi alloc] init];

// Get Ingredient Substitutes
[apiInstance getIngredientSubstitutesWithIngredientName:ingredientName
          completionHandler: ^(OAIGetIngredientSubstitutes200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIngredientsApi->getIngredientSubstitutes: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingredientName** | **NSString***| The name of the ingredient you want to replace. | 

### Return type

[**OAIGetIngredientSubstitutes200Response***](OAIGetIngredientSubstitutes200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getIngredientSubstitutesByID**
```objc
-(NSURLSessionTask*) getIngredientSubstitutesByIDWithId: (NSNumber*) _id
        completionHandler: (void (^)(OAIGetIngredientSubstitutes200Response* output, NSError* error)) handler;
```

Get Ingredient Substitutes by ID

Search for substitutes for a given ingredient.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.

OAIIngredientsApi*apiInstance = [[OAIIngredientsApi alloc] init];

// Get Ingredient Substitutes by ID
[apiInstance getIngredientSubstitutesByIDWithId:_id
          completionHandler: ^(OAIGetIngredientSubstitutes200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIngredientsApi->getIngredientSubstitutesByID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 

### Return type

[**OAIGetIngredientSubstitutes200Response***](OAIGetIngredientSubstitutes200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ingredientSearch**
```objc
-(NSURLSessionTask*) ingredientSearchWithQuery: (NSString*) query
    addChildren: (NSNumber*) addChildren
    minProteinPercent: (NSNumber*) minProteinPercent
    maxProteinPercent: (NSNumber*) maxProteinPercent
    minFatPercent: (NSNumber*) minFatPercent
    maxFatPercent: (NSNumber*) maxFatPercent
    minCarbsPercent: (NSNumber*) minCarbsPercent
    maxCarbsPercent: (NSNumber*) maxCarbsPercent
    metaInformation: (NSNumber*) metaInformation
    intolerances: (NSString*) intolerances
    sort: (NSString*) sort
    sortDirection: (NSString*) sortDirection
    offset: (NSNumber*) offset
    number: (NSNumber*) number
    language: (NSString*) language
        completionHandler: (void (^)(OAIIngredientSearch200Response* output, NSError* error)) handler;
```

Ingredient Search

Search for simple whole foods (e.g. fruits, vegetables, nuts, grains, meat, fish, dairy etc.).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* query = burger; // The (natural language) search query. (optional)
NSNumber* addChildren = true; // Whether to add children of found foods. (optional)
NSNumber* minProteinPercent = 10; // The minimum percentage of protein the food must have (between 0 and 100). (optional)
NSNumber* maxProteinPercent = 90; // The maximum percentage of protein the food can have (between 0 and 100). (optional)
NSNumber* minFatPercent = 10; // The minimum percentage of fat the food must have (between 0 and 100). (optional)
NSNumber* maxFatPercent = 90; // The maximum percentage of fat the food can have (between 0 and 100). (optional)
NSNumber* minCarbsPercent = 10; // The minimum percentage of carbs the food must have (between 0 and 100). (optional)
NSNumber* maxCarbsPercent = 90; // The maximum percentage of carbs the food can have (between 0 and 100). (optional)
NSNumber* metaInformation = false; // Whether to return more meta information about the ingredients. (optional)
NSString* intolerances = egg; // A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. (optional)
NSString* sort = calories; // The strategy to sort recipes by. See a full list of supported sorting options. (optional)
NSString* sortDirection = asc; // The direction in which to sort. Must be either 'asc' (ascending) or 'desc' (descending). (optional)
NSNumber* offset = @56; // The number of results to skip (between 0 and 900). (optional)
NSNumber* number = 10; // The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)
NSString* language = en; // The language of the input. Either 'en' or 'de'. (optional)

OAIIngredientsApi*apiInstance = [[OAIIngredientsApi alloc] init];

// Ingredient Search
[apiInstance ingredientSearchWithQuery:query
              addChildren:addChildren
              minProteinPercent:minProteinPercent
              maxProteinPercent:maxProteinPercent
              minFatPercent:minFatPercent
              maxFatPercent:maxFatPercent
              minCarbsPercent:minCarbsPercent
              maxCarbsPercent:maxCarbsPercent
              metaInformation:metaInformation
              intolerances:intolerances
              sort:sort
              sortDirection:sortDirection
              offset:offset
              number:number
              language:language
          completionHandler: ^(OAIIngredientSearch200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIngredientsApi->ingredientSearch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **NSString***| The (natural language) search query. | [optional] 
 **addChildren** | **NSNumber***| Whether to add children of found foods. | [optional] 
 **minProteinPercent** | **NSNumber***| The minimum percentage of protein the food must have (between 0 and 100). | [optional] 
 **maxProteinPercent** | **NSNumber***| The maximum percentage of protein the food can have (between 0 and 100). | [optional] 
 **minFatPercent** | **NSNumber***| The minimum percentage of fat the food must have (between 0 and 100). | [optional] 
 **maxFatPercent** | **NSNumber***| The maximum percentage of fat the food can have (between 0 and 100). | [optional] 
 **minCarbsPercent** | **NSNumber***| The minimum percentage of carbs the food must have (between 0 and 100). | [optional] 
 **maxCarbsPercent** | **NSNumber***| The maximum percentage of carbs the food can have (between 0 and 100). | [optional] 
 **metaInformation** | **NSNumber***| Whether to return more meta information about the ingredients. | [optional] 
 **intolerances** | **NSString***| A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. | [optional] 
 **sort** | **NSString***| The strategy to sort recipes by. See a full list of supported sorting options. | [optional] 
 **sortDirection** | **NSString***| The direction in which to sort. Must be either &#39;asc&#39; (ascending) or &#39;desc&#39; (descending). | [optional] 
 **offset** | **NSNumber***| The number of results to skip (between 0 and 900). | [optional] 
 **number** | **NSNumber***| The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional] [default to @10]
 **language** | **NSString***| The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] 

### Return type

[**OAIIngredientSearch200Response***](OAIIngredientSearch200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ingredientsByIDImage**
```objc
-(NSURLSessionTask*) ingredientsByIDImageWithId: (NSNumber*) _id
    measure: (NSString*) measure
        completionHandler: (void (^)(NSURL* output, NSError* error)) handler;
```

Ingredients by ID Image

Visualize a recipe's ingredient list.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1082038; // The recipe id.
NSString* measure = metric; // Whether the the measures should be 'us' or 'metric'. (optional)

OAIIngredientsApi*apiInstance = [[OAIIngredientsApi alloc] init];

// Ingredients by ID Image
[apiInstance ingredientsByIDImageWithId:_id
              measure:measure
          completionHandler: ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIngredientsApi->ingredientsByIDImage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The recipe id. | 
 **measure** | **NSString***| Whether the the measures should be &#39;us&#39; or &#39;metric&#39;. | [optional] 

### Return type

**NSURL***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mapIngredientsToGroceryProducts**
```objc
-(NSURLSessionTask*) mapIngredientsToGroceryProductsWithMapIngredientsToGroceryProductsRequest: (OAIMapIngredientsToGroceryProductsRequest*) mapIngredientsToGroceryProductsRequest
        completionHandler: (void (^)(OAISet<OAIMapIngredientsToGroceryProducts200ResponseInner>* output, NSError* error)) handler;
```

Map Ingredients to Grocery Products

Map a set of ingredients to products you can buy in the grocery store.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


OAIMapIngredientsToGroceryProductsRequest* mapIngredientsToGroceryProductsRequest = {"ingredients":["eggs","bacon"],"servings":2}; // 

OAIIngredientsApi*apiInstance = [[OAIIngredientsApi alloc] init];

// Map Ingredients to Grocery Products
[apiInstance mapIngredientsToGroceryProductsWithMapIngredientsToGroceryProductsRequest:mapIngredientsToGroceryProductsRequest
          completionHandler: ^(OAISet<OAIMapIngredientsToGroceryProducts200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIngredientsApi->mapIngredientsToGroceryProducts: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mapIngredientsToGroceryProductsRequest** | [**OAIMapIngredientsToGroceryProductsRequest***](OAIMapIngredientsToGroceryProductsRequest.md)|  | 

### Return type

[**OAISet<OAIMapIngredientsToGroceryProducts200ResponseInner>***](OAIMapIngredientsToGroceryProducts200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **visualizeIngredients**
```objc
-(NSURLSessionTask*) visualizeIngredientsWithIngredientList: (NSString*) ingredientList
    servings: (NSNumber*) servings
    language: (NSString*) language
    measure: (NSString*) measure
    view: (NSString*) view
    defaultCss: (NSNumber*) defaultCss
    showBacklink: (NSNumber*) showBacklink
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Ingredients Widget

Visualize ingredients of a recipe. You can play around with that endpoint!

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* ingredientList = @"ingredientList_example"; // The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n).
NSNumber* servings = @56; // The number of servings.
NSString* language = en; // The language of the input. Either 'en' or 'de'. (optional)
NSString* measure = @"measure_example"; // The original system of measurement, either 'metric' or 'us'. (optional)
NSString* view = @"view_example"; // How to visualize the ingredients, either 'grid' or 'list'. (optional)
NSNumber* defaultCss = @56; // Whether the default CSS should be added to the response. (optional)
NSNumber* showBacklink = @56; // Whether to show a backlink to spoonacular. If set false, this call counts against your quota. (optional)

OAIIngredientsApi*apiInstance = [[OAIIngredientsApi alloc] init];

// Ingredients Widget
[apiInstance visualizeIngredientsWithIngredientList:ingredientList
              servings:servings
              language:language
              measure:measure
              view:view
              defaultCss:defaultCss
              showBacklink:showBacklink
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIngredientsApi->visualizeIngredients: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingredientList** | **NSString***| The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n). | 
 **servings** | **NSNumber***| The number of servings. | 
 **language** | **NSString***| The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] 
 **measure** | **NSString***| The original system of measurement, either &#39;metric&#39; or &#39;us&#39;. | [optional] 
 **view** | **NSString***| How to visualize the ingredients, either &#39;grid&#39; or &#39;list&#39;. | [optional] 
 **defaultCss** | **NSNumber***| Whether the default CSS should be added to the response. | [optional] 
 **showBacklink** | **NSNumber***| Whether to show a backlink to spoonacular. If set false, this call counts against your quota. | [optional] 

### Return type

**NSString***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

