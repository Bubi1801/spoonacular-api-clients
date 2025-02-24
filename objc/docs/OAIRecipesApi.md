# OAIRecipesApi

All URIs are relative to *https://api.spoonacular.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeARecipeSearchQuery**](OAIRecipesApi.md#analyzearecipesearchquery) | **GET** /recipes/queries/analyze | Analyze a Recipe Search Query
[**analyzeRecipeInstructions**](OAIRecipesApi.md#analyzerecipeinstructions) | **POST** /recipes/analyzeInstructions | Analyze Recipe Instructions
[**autocompleteRecipeSearch**](OAIRecipesApi.md#autocompleterecipesearch) | **GET** /recipes/autocomplete | Autocomplete Recipe Search
[**classifyCuisine**](OAIRecipesApi.md#classifycuisine) | **POST** /recipes/cuisine | Classify Cuisine
[**computeGlycemicLoad**](OAIRecipesApi.md#computeglycemicload) | **POST** /food/ingredients/glycemicLoad | Compute Glycemic Load
[**convertAmounts**](OAIRecipesApi.md#convertamounts) | **GET** /recipes/convert | Convert Amounts
[**createRecipeCard**](OAIRecipesApi.md#createrecipecard) | **POST** /recipes/visualizeRecipe | Create Recipe Card
[**equipmentByIDImage**](OAIRecipesApi.md#equipmentbyidimage) | **GET** /recipes/{id}/equipmentWidget.png | Equipment by ID Image
[**extractRecipeFromWebsite**](OAIRecipesApi.md#extractrecipefromwebsite) | **GET** /recipes/extract | Extract Recipe from Website
[**getAnalyzedRecipeInstructions**](OAIRecipesApi.md#getanalyzedrecipeinstructions) | **GET** /recipes/{id}/analyzedInstructions | Get Analyzed Recipe Instructions
[**getRandomRecipes**](OAIRecipesApi.md#getrandomrecipes) | **GET** /recipes/random | Get Random Recipes
[**getRecipeEquipmentByID**](OAIRecipesApi.md#getrecipeequipmentbyid) | **GET** /recipes/{id}/equipmentWidget.json | Equipment by ID
[**getRecipeInformation**](OAIRecipesApi.md#getrecipeinformation) | **GET** /recipes/{id}/information | Get Recipe Information
[**getRecipeInformationBulk**](OAIRecipesApi.md#getrecipeinformationbulk) | **GET** /recipes/informationBulk | Get Recipe Information Bulk
[**getRecipeIngredientsByID**](OAIRecipesApi.md#getrecipeingredientsbyid) | **GET** /recipes/{id}/ingredientWidget.json | Ingredients by ID
[**getRecipeNutritionWidgetByID**](OAIRecipesApi.md#getrecipenutritionwidgetbyid) | **GET** /recipes/{id}/nutritionWidget.json | Nutrition by ID
[**getRecipePriceBreakdownByID**](OAIRecipesApi.md#getrecipepricebreakdownbyid) | **GET** /recipes/{id}/priceBreakdownWidget.json | Price Breakdown by ID
[**getRecipeTasteByID**](OAIRecipesApi.md#getrecipetastebyid) | **GET** /recipes/{id}/tasteWidget.json | Taste by ID
[**getSimilarRecipes**](OAIRecipesApi.md#getsimilarrecipes) | **GET** /recipes/{id}/similar | Get Similar Recipes
[**guessNutritionByDishName**](OAIRecipesApi.md#guessnutritionbydishname) | **GET** /recipes/guessNutrition | Guess Nutrition by Dish Name
[**parseIngredients**](OAIRecipesApi.md#parseingredients) | **POST** /recipes/parseIngredients | Parse Ingredients
[**priceBreakdownByIDImage**](OAIRecipesApi.md#pricebreakdownbyidimage) | **GET** /recipes/{id}/priceBreakdownWidget.png | Price Breakdown by ID Image
[**quickAnswer**](OAIRecipesApi.md#quickanswer) | **GET** /recipes/quickAnswer | Quick Answer
[**recipeNutritionByIDImage**](OAIRecipesApi.md#recipenutritionbyidimage) | **GET** /recipes/{id}/nutritionWidget.png | Recipe Nutrition by ID Image
[**recipeNutritionLabelImage**](OAIRecipesApi.md#recipenutritionlabelimage) | **GET** /recipes/{id}/nutritionLabel.png | Recipe Nutrition Label Image
[**recipeNutritionLabelWidget**](OAIRecipesApi.md#recipenutritionlabelwidget) | **GET** /recipes/{id}/nutritionLabel | Recipe Nutrition Label Widget
[**recipeTasteByIDImage**](OAIRecipesApi.md#recipetastebyidimage) | **GET** /recipes/{id}/tasteWidget.png | Recipe Taste by ID Image
[**searchRecipes**](OAIRecipesApi.md#searchrecipes) | **GET** /recipes/complexSearch | Search Recipes
[**searchRecipesByIngredients**](OAIRecipesApi.md#searchrecipesbyingredients) | **GET** /recipes/findByIngredients | Search Recipes by Ingredients
[**searchRecipesByNutrients**](OAIRecipesApi.md#searchrecipesbynutrients) | **GET** /recipes/findByNutrients | Search Recipes by Nutrients
[**summarizeRecipe**](OAIRecipesApi.md#summarizerecipe) | **GET** /recipes/{id}/summary | Summarize Recipe
[**visualizeEquipment**](OAIRecipesApi.md#visualizeequipment) | **POST** /recipes/visualizeEquipment | Equipment Widget
[**visualizePriceBreakdown**](OAIRecipesApi.md#visualizepricebreakdown) | **POST** /recipes/visualizePriceEstimator | Price Breakdown Widget
[**visualizeRecipeEquipmentByID**](OAIRecipesApi.md#visualizerecipeequipmentbyid) | **GET** /recipes/{id}/equipmentWidget | Equipment by ID Widget
[**visualizeRecipeIngredientsByID**](OAIRecipesApi.md#visualizerecipeingredientsbyid) | **GET** /recipes/{id}/ingredientWidget | Ingredients by ID Widget
[**visualizeRecipeNutrition**](OAIRecipesApi.md#visualizerecipenutrition) | **POST** /recipes/visualizeNutrition | Recipe Nutrition Widget
[**visualizeRecipeNutritionByID**](OAIRecipesApi.md#visualizerecipenutritionbyid) | **GET** /recipes/{id}/nutritionWidget | Recipe Nutrition by ID Widget
[**visualizeRecipePriceBreakdownByID**](OAIRecipesApi.md#visualizerecipepricebreakdownbyid) | **GET** /recipes/{id}/priceBreakdownWidget | Price Breakdown by ID Widget
[**visualizeRecipeTaste**](OAIRecipesApi.md#visualizerecipetaste) | **POST** /recipes/visualizeTaste | Recipe Taste Widget
[**visualizeRecipeTasteByID**](OAIRecipesApi.md#visualizerecipetastebyid) | **GET** /recipes/{id}/tasteWidget | Recipe Taste by ID Widget


# **analyzeARecipeSearchQuery**
```objc
-(NSURLSessionTask*) analyzeARecipeSearchQueryWithQ: (NSString*) q
        completionHandler: (void (^)(OAIAnalyzeARecipeSearchQuery200Response* output, NSError* error)) handler;
```

Analyze a Recipe Search Query

Parse a recipe search query to find out its intention.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* q = salmon with fusilli and no nuts; // The recipe search query.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Analyze a Recipe Search Query
[apiInstance analyzeARecipeSearchQueryWithQ:q
          completionHandler: ^(OAIAnalyzeARecipeSearchQuery200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->analyzeARecipeSearchQuery: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **NSString***| The recipe search query. | 

### Return type

[**OAIAnalyzeARecipeSearchQuery200Response***](OAIAnalyzeARecipeSearchQuery200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyzeRecipeInstructions**
```objc
-(NSURLSessionTask*) analyzeRecipeInstructionsWithInstructions: (NSString*) instructions
        completionHandler: (void (^)(OAIAnalyzeRecipeInstructions200Response* output, NSError* error)) handler;
```

Analyze Recipe Instructions

This endpoint allows you to break down instructions into atomic steps. Furthermore, each step will contain the ingredients and equipment required. Additionally, all ingredients and equipment from the recipe's instructions will be extracted independently of the step they're used in.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* instructions = @"instructions_example"; // The recipe's instructions.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Analyze Recipe Instructions
[apiInstance analyzeRecipeInstructionsWithInstructions:instructions
          completionHandler: ^(OAIAnalyzeRecipeInstructions200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->analyzeRecipeInstructions: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instructions** | **NSString***| The recipe&#39;s instructions. | 

### Return type

[**OAIAnalyzeRecipeInstructions200Response***](OAIAnalyzeRecipeInstructions200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **autocompleteRecipeSearch**
```objc
-(NSURLSessionTask*) autocompleteRecipeSearchWithQuery: (NSString*) query
    number: (NSNumber*) number
        completionHandler: (void (^)(OAISet<OAIAutocompleteRecipeSearch200ResponseInner>* output, NSError* error)) handler;
```

Autocomplete Recipe Search

Autocomplete a partial input to suggest possible recipe names.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* query = burger; // The (natural language) search query. (optional)
NSNumber* number = 10; // The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Autocomplete Recipe Search
[apiInstance autocompleteRecipeSearchWithQuery:query
              number:number
          completionHandler: ^(OAISet<OAIAutocompleteRecipeSearch200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->autocompleteRecipeSearch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **NSString***| The (natural language) search query. | [optional] 
 **number** | **NSNumber***| The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional] [default to @10]

### Return type

[**OAISet<OAIAutocompleteRecipeSearch200ResponseInner>***](OAIAutocompleteRecipeSearch200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **classifyCuisine**
```objc
-(NSURLSessionTask*) classifyCuisineWithTitle: (NSString*) title
    ingredientList: (NSString*) ingredientList
    language: (NSString*) language
        completionHandler: (void (^)(OAIClassifyCuisine200Response* output, NSError* error)) handler;
```

Classify Cuisine

Classify the recipe's cuisine.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* title = @"title_example"; // The title of the recipe.
NSString* ingredientList = @"ingredientList_example"; // The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n).
NSString* language = en; // The language of the input. Either 'en' or 'de'. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Classify Cuisine
[apiInstance classifyCuisineWithTitle:title
              ingredientList:ingredientList
              language:language
          completionHandler: ^(OAIClassifyCuisine200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->classifyCuisine: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **NSString***| The title of the recipe. | 
 **ingredientList** | **NSString***| The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n). | 
 **language** | **NSString***| The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] 

### Return type

[**OAIClassifyCuisine200Response***](OAIClassifyCuisine200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **computeGlycemicLoad**
```objc
-(NSURLSessionTask*) computeGlycemicLoadWithComputeGlycemicLoadRequest: (OAIComputeGlycemicLoadRequest*) computeGlycemicLoadRequest
    language: (NSString*) language
        completionHandler: (void (^)(OAIComputeGlycemicLoad200Response* output, NSError* error)) handler;
```

Compute Glycemic Load

Retrieve the glycemic index for a list of ingredients and compute the individual and total glycemic load.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


OAIComputeGlycemicLoadRequest* computeGlycemicLoadRequest = {"ingredients":["1 kiwi","2 cups rice","2 glasses of water"]}; // 
NSString* language = en; // The language of the input. Either 'en' or 'de'. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Compute Glycemic Load
[apiInstance computeGlycemicLoadWithComputeGlycemicLoadRequest:computeGlycemicLoadRequest
              language:language
          completionHandler: ^(OAIComputeGlycemicLoad200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->computeGlycemicLoad: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **computeGlycemicLoadRequest** | [**OAIComputeGlycemicLoadRequest***](OAIComputeGlycemicLoadRequest.md)|  | 
 **language** | **NSString***| The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] 

### Return type

[**OAIComputeGlycemicLoad200Response***](OAIComputeGlycemicLoad200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **convertAmounts**
```objc
-(NSURLSessionTask*) convertAmountsWithIngredientName: (NSString*) ingredientName
    sourceAmount: (NSNumber*) sourceAmount
    sourceUnit: (NSString*) sourceUnit
    targetUnit: (NSString*) targetUnit
        completionHandler: (void (^)(OAIConvertAmounts200Response* output, NSError* error)) handler;
```

Convert Amounts

Convert amounts like \"2 cups of flour to grams\".

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* ingredientName = flour; // The ingredient which you want to convert.
NSNumber* sourceAmount = 2.5; // The amount from which you want to convert, e.g. the 2.5 in \"2.5 cups of flour to grams\".
NSString* sourceUnit = cups; // The unit from which you want to convert, e.g. the grams in \"2.5 cups of flour to grams\". You can also use \"piece\", e.g. \"3.4 oz tomatoes to piece\"
NSString* targetUnit = grams; // The unit to which you want to convert, e.g. the grams in \"2.5 cups of flour to grams\". You can also use \"piece\", e.g. \"3.4 oz tomatoes to piece\"

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Convert Amounts
[apiInstance convertAmountsWithIngredientName:ingredientName
              sourceAmount:sourceAmount
              sourceUnit:sourceUnit
              targetUnit:targetUnit
          completionHandler: ^(OAIConvertAmounts200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->convertAmounts: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingredientName** | **NSString***| The ingredient which you want to convert. | 
 **sourceAmount** | **NSNumber***| The amount from which you want to convert, e.g. the 2.5 in \&quot;2.5 cups of flour to grams\&quot;. | 
 **sourceUnit** | **NSString***| The unit from which you want to convert, e.g. the grams in \&quot;2.5 cups of flour to grams\&quot;. You can also use \&quot;piece\&quot;, e.g. \&quot;3.4 oz tomatoes to piece\&quot; | 
 **targetUnit** | **NSString***| The unit to which you want to convert, e.g. the grams in \&quot;2.5 cups of flour to grams\&quot;. You can also use \&quot;piece\&quot;, e.g. \&quot;3.4 oz tomatoes to piece\&quot; | 

### Return type

[**OAIConvertAmounts200Response***](OAIConvertAmounts200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createRecipeCard**
```objc
-(NSURLSessionTask*) createRecipeCardWithTitle: (NSString*) title
    ingredients: (NSString*) ingredients
    instructions: (NSString*) instructions
    readyInMinutes: (NSNumber*) readyInMinutes
    servings: (NSNumber*) servings
    mask: (NSString*) mask
    backgroundImage: (NSString*) backgroundImage
    image: (NSURL*) image
    imageUrl: (NSString*) imageUrl
    author: (NSString*) author
    backgroundColor: (NSString*) backgroundColor
    fontColor: (NSString*) fontColor
    source: (NSString*) source
        completionHandler: (void (^)(OAICreateRecipeCard200Response* output, NSError* error)) handler;
```

Create Recipe Card

Generate a recipe card for a recipe.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* title = @"title_example"; // The title of the recipe.
NSString* ingredients = @"ingredients_example"; // The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n).
NSString* instructions = @"instructions_example"; // The instructions to make the recipe. One step per line (separate lines with \\\\n).
NSNumber* readyInMinutes = @56; // The number of minutes it takes to get the recipe on the table.
NSNumber* servings = @56; // The number of servings the recipe makes.
NSString* mask = @"mask_example"; // The mask to put over the recipe image ('ellipseMask', 'diamondMask', 'starMask', 'heartMask', 'potMask', 'fishMask').
NSString* backgroundImage = @"backgroundImage_example"; // The background image ('none', 'background1', or 'background2').
NSURL* image = [NSURL fileURLWithPath:@"/path/to/file"]; // The binary image of the recipe as jpg. (optional)
NSString* imageUrl = @"imageUrl_example"; // If you do not sent a binary image you can also pass the image URL. (optional)
NSString* author = @"author_example"; // The author of the recipe. (optional)
NSString* backgroundColor = @"backgroundColor_example"; // The background color for the recipe card as a hex-string. (optional)
NSString* fontColor = @"fontColor_example"; // The font color for the recipe card as a hex-string. (optional)
NSString* source = @"source_example"; // The source of the recipe. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Create Recipe Card
[apiInstance createRecipeCardWithTitle:title
              ingredients:ingredients
              instructions:instructions
              readyInMinutes:readyInMinutes
              servings:servings
              mask:mask
              backgroundImage:backgroundImage
              image:image
              imageUrl:imageUrl
              author:author
              backgroundColor:backgroundColor
              fontColor:fontColor
              source:source
          completionHandler: ^(OAICreateRecipeCard200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->createRecipeCard: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **NSString***| The title of the recipe. | 
 **ingredients** | **NSString***| The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n). | 
 **instructions** | **NSString***| The instructions to make the recipe. One step per line (separate lines with \\\\n). | 
 **readyInMinutes** | **NSNumber***| The number of minutes it takes to get the recipe on the table. | 
 **servings** | **NSNumber***| The number of servings the recipe makes. | 
 **mask** | **NSString***| The mask to put over the recipe image (&#39;ellipseMask&#39;, &#39;diamondMask&#39;, &#39;starMask&#39;, &#39;heartMask&#39;, &#39;potMask&#39;, &#39;fishMask&#39;). | 
 **backgroundImage** | **NSString***| The background image (&#39;none&#39;, &#39;background1&#39;, or &#39;background2&#39;). | 
 **image** | **NSURL*****NSURL***| The binary image of the recipe as jpg. | [optional] 
 **imageUrl** | **NSString***| If you do not sent a binary image you can also pass the image URL. | [optional] 
 **author** | **NSString***| The author of the recipe. | [optional] 
 **backgroundColor** | **NSString***| The background color for the recipe card as a hex-string. | [optional] 
 **fontColor** | **NSString***| The font color for the recipe card as a hex-string. | [optional] 
 **source** | **NSString***| The source of the recipe. | [optional] 

### Return type

[**OAICreateRecipeCard200Response***](OAICreateRecipeCard200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **equipmentByIDImage**
```objc
-(NSURLSessionTask*) equipmentByIDImageWithId: (NSNumber*) _id
        completionHandler: (void (^)(NSURL* output, NSError* error)) handler;
```

Equipment by ID Image

Visualize a recipe's equipment list as an image.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 44860; // The recipe id.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Equipment by ID Image
[apiInstance equipmentByIDImageWithId:_id
          completionHandler: ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->equipmentByIDImage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The recipe id. | 

### Return type

**NSURL***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **extractRecipeFromWebsite**
```objc
-(NSURLSessionTask*) extractRecipeFromWebsiteWithUrl: (NSString*) url
    forceExtraction: (NSNumber*) forceExtraction
    analyze: (NSNumber*) analyze
    includeNutrition: (NSNumber*) includeNutrition
    includeTaste: (NSNumber*) includeTaste
        completionHandler: (void (^)(OAIGetRecipeInformation200Response* output, NSError* error)) handler;
```

Extract Recipe from Website

This endpoint lets you extract recipe data such as title, ingredients, and instructions from any properly formatted Website.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* url = https://foodista.com/recipe/ZHK4KPB6/chocolate-crinkle-cookies; // The URL of the recipe page.
NSNumber* forceExtraction = true; // If true, the extraction will be triggered whether we already know the recipe or not. Use this only if information is missing as this operation is slower. (optional)
NSNumber* analyze = false; // If true, the recipe will be analyzed and classified resolving in more data such as cuisines, dish types, and more. (optional)
NSNumber* includeNutrition = @(NO); // Include nutrition data in the recipe information. Nutrition data is per serving. If you want the nutrition data for the entire recipe, just multiply by the number of servings. (optional) (default to @(NO))
NSNumber* includeTaste = false; // Whether taste data should be added to correctly parsed ingredients. (optional) (default to @(NO))

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Extract Recipe from Website
[apiInstance extractRecipeFromWebsiteWithUrl:url
              forceExtraction:forceExtraction
              analyze:analyze
              includeNutrition:includeNutrition
              includeTaste:includeTaste
          completionHandler: ^(OAIGetRecipeInformation200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->extractRecipeFromWebsite: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **NSString***| The URL of the recipe page. | 
 **forceExtraction** | **NSNumber***| If true, the extraction will be triggered whether we already know the recipe or not. Use this only if information is missing as this operation is slower. | [optional] 
 **analyze** | **NSNumber***| If true, the recipe will be analyzed and classified resolving in more data such as cuisines, dish types, and more. | [optional] 
 **includeNutrition** | **NSNumber***| Include nutrition data in the recipe information. Nutrition data is per serving. If you want the nutrition data for the entire recipe, just multiply by the number of servings. | [optional] [default to @(NO)]
 **includeTaste** | **NSNumber***| Whether taste data should be added to correctly parsed ingredients. | [optional] [default to @(NO)]

### Return type

[**OAIGetRecipeInformation200Response***](OAIGetRecipeInformation200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAnalyzedRecipeInstructions**
```objc
-(NSURLSessionTask*) getAnalyzedRecipeInstructionsWithId: (NSNumber*) _id
    stepBreakdown: (NSNumber*) stepBreakdown
        completionHandler: (void (^)(OAIGetAnalyzedRecipeInstructions200Response* output, NSError* error)) handler;
```

Get Analyzed Recipe Instructions

Get an analyzed breakdown of a recipe's instructions. Each step is enriched with the ingredients and equipment required.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.
NSNumber* stepBreakdown = true; // Whether to break down the recipe steps even more. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Get Analyzed Recipe Instructions
[apiInstance getAnalyzedRecipeInstructionsWithId:_id
              stepBreakdown:stepBreakdown
          completionHandler: ^(OAIGetAnalyzedRecipeInstructions200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->getAnalyzedRecipeInstructions: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 
 **stepBreakdown** | **NSNumber***| Whether to break down the recipe steps even more. | [optional] 

### Return type

[**OAIGetAnalyzedRecipeInstructions200Response***](OAIGetAnalyzedRecipeInstructions200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRandomRecipes**
```objc
-(NSURLSessionTask*) getRandomRecipesWithLimitLicense: (NSNumber*) limitLicense
    includeNutrition: (NSNumber*) includeNutrition
    includeTags: (NSString*) includeTags
    excludeTags: (NSString*) excludeTags
    number: (NSNumber*) number
        completionHandler: (void (^)(OAIGetRandomRecipes200Response* output, NSError* error)) handler;
```

Get Random Recipes

Find random (popular) recipes. If you need to filter recipes by diet, nutrition etc. you might want to consider using the complex recipe search endpoint and set the sort request parameter to random.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* limitLicense = true; // Whether the recipes should have an open license that allows display with proper attribution. (optional) (default to @(YES))
NSNumber* includeNutrition = @(NO); // Include nutrition data in the recipe information. Nutrition data is per serving. If you want the nutrition data for the entire recipe, just multiply by the number of servings. (optional) (default to @(NO))
NSString* includeTags = vegetarian,gluten; // A comma-separated list of tags that the random recipe(s) must adhere to. (optional)
NSString* excludeTags = meat,dairy; // A comma-separated list of tags that the random recipe(s) must not adhere to. (optional)
NSNumber* number = 10; // The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Get Random Recipes
[apiInstance getRandomRecipesWithLimitLicense:limitLicense
              includeNutrition:includeNutrition
              includeTags:includeTags
              excludeTags:excludeTags
              number:number
          completionHandler: ^(OAIGetRandomRecipes200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->getRandomRecipes: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limitLicense** | **NSNumber***| Whether the recipes should have an open license that allows display with proper attribution. | [optional] [default to @(YES)]
 **includeNutrition** | **NSNumber***| Include nutrition data in the recipe information. Nutrition data is per serving. If you want the nutrition data for the entire recipe, just multiply by the number of servings. | [optional] [default to @(NO)]
 **includeTags** | **NSString***| A comma-separated list of tags that the random recipe(s) must adhere to. | [optional] 
 **excludeTags** | **NSString***| A comma-separated list of tags that the random recipe(s) must not adhere to. | [optional] 
 **number** | **NSNumber***| The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional] [default to @10]

### Return type

[**OAIGetRandomRecipes200Response***](OAIGetRandomRecipes200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRecipeEquipmentByID**
```objc
-(NSURLSessionTask*) getRecipeEquipmentByIDWithId: (NSNumber*) _id
        completionHandler: (void (^)(OAIGetRecipeEquipmentByID200Response* output, NSError* error)) handler;
```

Equipment by ID

Get a recipe's equipment list.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Equipment by ID
[apiInstance getRecipeEquipmentByIDWithId:_id
          completionHandler: ^(OAIGetRecipeEquipmentByID200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->getRecipeEquipmentByID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 

### Return type

[**OAIGetRecipeEquipmentByID200Response***](OAIGetRecipeEquipmentByID200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRecipeInformation**
```objc
-(NSURLSessionTask*) getRecipeInformationWithId: (NSNumber*) _id
    includeNutrition: (NSNumber*) includeNutrition
        completionHandler: (void (^)(OAIGetRecipeInformation200Response* output, NSError* error)) handler;
```

Get Recipe Information

Use a recipe id to get full information about a recipe, such as ingredients, nutrition, diet and allergen information, etc.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.
NSNumber* includeNutrition = @(NO); // Include nutrition data in the recipe information. Nutrition data is per serving. If you want the nutrition data for the entire recipe, just multiply by the number of servings. (optional) (default to @(NO))

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Get Recipe Information
[apiInstance getRecipeInformationWithId:_id
              includeNutrition:includeNutrition
          completionHandler: ^(OAIGetRecipeInformation200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->getRecipeInformation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 
 **includeNutrition** | **NSNumber***| Include nutrition data in the recipe information. Nutrition data is per serving. If you want the nutrition data for the entire recipe, just multiply by the number of servings. | [optional] [default to @(NO)]

### Return type

[**OAIGetRecipeInformation200Response***](OAIGetRecipeInformation200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRecipeInformationBulk**
```objc
-(NSURLSessionTask*) getRecipeInformationBulkWithIds: (NSString*) ids
    includeNutrition: (NSNumber*) includeNutrition
        completionHandler: (void (^)(OAISet<OAIGetRecipeInformationBulk200ResponseInner>* output, NSError* error)) handler;
```

Get Recipe Information Bulk

Get information about multiple recipes at once. This is equivalent to calling the Get Recipe Information endpoint multiple times, but faster.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* ids = 715538,716429; // A comma-separated list of recipe ids.
NSNumber* includeNutrition = @(NO); // Include nutrition data in the recipe information. Nutrition data is per serving. If you want the nutrition data for the entire recipe, just multiply by the number of servings. (optional) (default to @(NO))

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Get Recipe Information Bulk
[apiInstance getRecipeInformationBulkWithIds:ids
              includeNutrition:includeNutrition
          completionHandler: ^(OAISet<OAIGetRecipeInformationBulk200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->getRecipeInformationBulk: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **NSString***| A comma-separated list of recipe ids. | 
 **includeNutrition** | **NSNumber***| Include nutrition data in the recipe information. Nutrition data is per serving. If you want the nutrition data for the entire recipe, just multiply by the number of servings. | [optional] [default to @(NO)]

### Return type

[**OAISet<OAIGetRecipeInformationBulk200ResponseInner>***](OAIGetRecipeInformationBulk200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRecipeIngredientsByID**
```objc
-(NSURLSessionTask*) getRecipeIngredientsByIDWithId: (NSNumber*) _id
        completionHandler: (void (^)(OAIGetRecipeIngredientsByID200Response* output, NSError* error)) handler;
```

Ingredients by ID

Get a recipe's ingredient list.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Ingredients by ID
[apiInstance getRecipeIngredientsByIDWithId:_id
          completionHandler: ^(OAIGetRecipeIngredientsByID200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->getRecipeIngredientsByID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 

### Return type

[**OAIGetRecipeIngredientsByID200Response***](OAIGetRecipeIngredientsByID200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRecipeNutritionWidgetByID**
```objc
-(NSURLSessionTask*) getRecipeNutritionWidgetByIDWithId: (NSNumber*) _id
        completionHandler: (void (^)(OAIGetRecipeNutritionWidgetByID200Response* output, NSError* error)) handler;
```

Nutrition by ID

Get a recipe's nutrition data.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Nutrition by ID
[apiInstance getRecipeNutritionWidgetByIDWithId:_id
          completionHandler: ^(OAIGetRecipeNutritionWidgetByID200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->getRecipeNutritionWidgetByID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 

### Return type

[**OAIGetRecipeNutritionWidgetByID200Response***](OAIGetRecipeNutritionWidgetByID200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRecipePriceBreakdownByID**
```objc
-(NSURLSessionTask*) getRecipePriceBreakdownByIDWithId: (NSNumber*) _id
        completionHandler: (void (^)(OAIGetRecipePriceBreakdownByID200Response* output, NSError* error)) handler;
```

Price Breakdown by ID

Get a recipe's price breakdown data.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Price Breakdown by ID
[apiInstance getRecipePriceBreakdownByIDWithId:_id
          completionHandler: ^(OAIGetRecipePriceBreakdownByID200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->getRecipePriceBreakdownByID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 

### Return type

[**OAIGetRecipePriceBreakdownByID200Response***](OAIGetRecipePriceBreakdownByID200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRecipeTasteByID**
```objc
-(NSURLSessionTask*) getRecipeTasteByIDWithId: (NSNumber*) _id
    normalize: (NSNumber*) normalize
        completionHandler: (void (^)(OAIGetRecipeTasteByID200Response* output, NSError* error)) handler;
```

Taste by ID

Get a recipe's taste. The tastes supported are sweet, salty, sour, bitter, savory, and fatty.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.
NSNumber* normalize = true; // Normalize to the strongest taste. (optional) (default to @(YES))

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Taste by ID
[apiInstance getRecipeTasteByIDWithId:_id
              normalize:normalize
          completionHandler: ^(OAIGetRecipeTasteByID200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->getRecipeTasteByID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 
 **normalize** | **NSNumber***| Normalize to the strongest taste. | [optional] [default to @(YES)]

### Return type

[**OAIGetRecipeTasteByID200Response***](OAIGetRecipeTasteByID200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSimilarRecipes**
```objc
-(NSURLSessionTask*) getSimilarRecipesWithId: (NSNumber*) _id
    number: (NSNumber*) number
    limitLicense: (NSNumber*) limitLicense
        completionHandler: (void (^)(OAISet<OAIGetSimilarRecipes200ResponseInner>* output, NSError* error)) handler;
```

Get Similar Recipes

Find recipes which are similar to the given one.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.
NSNumber* number = 10; // The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)
NSNumber* limitLicense = true; // Whether the recipes should have an open license that allows display with proper attribution. (optional) (default to @(YES))

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Get Similar Recipes
[apiInstance getSimilarRecipesWithId:_id
              number:number
              limitLicense:limitLicense
          completionHandler: ^(OAISet<OAIGetSimilarRecipes200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->getSimilarRecipes: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 
 **number** | **NSNumber***| The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional] [default to @10]
 **limitLicense** | **NSNumber***| Whether the recipes should have an open license that allows display with proper attribution. | [optional] [default to @(YES)]

### Return type

[**OAISet<OAIGetSimilarRecipes200ResponseInner>***](OAIGetSimilarRecipes200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **guessNutritionByDishName**
```objc
-(NSURLSessionTask*) guessNutritionByDishNameWithTitle: (NSString*) title
        completionHandler: (void (^)(OAIGuessNutritionByDishName200Response* output, NSError* error)) handler;
```

Guess Nutrition by Dish Name

Estimate the macronutrients of a dish based on its title.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* title = Spaghetti Aglio et Olio; // The title of the dish.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Guess Nutrition by Dish Name
[apiInstance guessNutritionByDishNameWithTitle:title
          completionHandler: ^(OAIGuessNutritionByDishName200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->guessNutritionByDishName: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **NSString***| The title of the dish. | 

### Return type

[**OAIGuessNutritionByDishName200Response***](OAIGuessNutritionByDishName200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **parseIngredients**
```objc
-(NSURLSessionTask*) parseIngredientsWithIngredientList: (NSString*) ingredientList
    servings: (NSNumber*) servings
    language: (NSString*) language
    includeNutrition: (NSNumber*) includeNutrition
        completionHandler: (void (^)(OAISet<OAIParseIngredients200ResponseInner>* output, NSError* error)) handler;
```

Parse Ingredients

Extract an ingredient from plain text.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* ingredientList = @"ingredientList_example"; // The ingredient list of the recipe, one ingredient per line.
NSNumber* servings = @56; // The number of servings that you can make from the ingredients.
NSString* language = en; // The language of the input. Either 'en' or 'de'. (optional)
NSNumber* includeNutrition = @56; //  (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Parse Ingredients
[apiInstance parseIngredientsWithIngredientList:ingredientList
              servings:servings
              language:language
              includeNutrition:includeNutrition
          completionHandler: ^(OAISet<OAIParseIngredients200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->parseIngredients: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingredientList** | **NSString***| The ingredient list of the recipe, one ingredient per line. | 
 **servings** | **NSNumber***| The number of servings that you can make from the ingredients. | 
 **language** | **NSString***| The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] 
 **includeNutrition** | **NSNumber***|  | [optional] 

### Return type

[**OAISet<OAIParseIngredients200ResponseInner>***](OAIParseIngredients200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **priceBreakdownByIDImage**
```objc
-(NSURLSessionTask*) priceBreakdownByIDImageWithId: (NSNumber*) _id
        completionHandler: (void (^)(NSURL* output, NSError* error)) handler;
```

Price Breakdown by ID Image

Visualize a recipe's price breakdown.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1082038; // The recipe id.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Price Breakdown by ID Image
[apiInstance priceBreakdownByIDImageWithId:_id
          completionHandler: ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->priceBreakdownByIDImage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The recipe id. | 

### Return type

**NSURL***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quickAnswer**
```objc
-(NSURLSessionTask*) quickAnswerWithQ: (NSString*) q
        completionHandler: (void (^)(OAIQuickAnswer200Response* output, NSError* error)) handler;
```

Quick Answer

Answer a nutrition related natural language question.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* q = How much vitamin c is in 2 apples?; // The nutrition related question.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Quick Answer
[apiInstance quickAnswerWithQ:q
          completionHandler: ^(OAIQuickAnswer200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->quickAnswer: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **NSString***| The nutrition related question. | 

### Return type

[**OAIQuickAnswer200Response***](OAIQuickAnswer200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recipeNutritionByIDImage**
```objc
-(NSURLSessionTask*) recipeNutritionByIDImageWithId: (NSNumber*) _id
        completionHandler: (void (^)(NSURL* output, NSError* error)) handler;
```

Recipe Nutrition by ID Image

Visualize a recipe's nutritional information as an image.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1082038; // The recipe id.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Recipe Nutrition by ID Image
[apiInstance recipeNutritionByIDImageWithId:_id
          completionHandler: ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->recipeNutritionByIDImage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The recipe id. | 

### Return type

**NSURL***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recipeNutritionLabelImage**
```objc
-(NSURLSessionTask*) recipeNutritionLabelImageWithId: (NSNumber*) _id
    showOptionalNutrients: (NSNumber*) showOptionalNutrients
    showZeroValues: (NSNumber*) showZeroValues
    showIngredients: (NSNumber*) showIngredients
        completionHandler: (void (^)(NSURL* output, NSError* error)) handler;
```

Recipe Nutrition Label Image

Get a recipe's nutrition label as an image.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 641166; // The recipe id.
NSNumber* showOptionalNutrients = false; // Whether to show optional nutrients. (optional)
NSNumber* showZeroValues = false; // Whether to show zero values. (optional)
NSNumber* showIngredients = false; // Whether to show a list of ingredients. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Recipe Nutrition Label Image
[apiInstance recipeNutritionLabelImageWithId:_id
              showOptionalNutrients:showOptionalNutrients
              showZeroValues:showZeroValues
              showIngredients:showIngredients
          completionHandler: ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->recipeNutritionLabelImage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The recipe id. | 
 **showOptionalNutrients** | **NSNumber***| Whether to show optional nutrients. | [optional] 
 **showZeroValues** | **NSNumber***| Whether to show zero values. | [optional] 
 **showIngredients** | **NSNumber***| Whether to show a list of ingredients. | [optional] 

### Return type

**NSURL***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recipeNutritionLabelWidget**
```objc
-(NSURLSessionTask*) recipeNutritionLabelWidgetWithId: (NSNumber*) _id
    defaultCss: (NSNumber*) defaultCss
    showOptionalNutrients: (NSNumber*) showOptionalNutrients
    showZeroValues: (NSNumber*) showZeroValues
    showIngredients: (NSNumber*) showIngredients
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Recipe Nutrition Label Widget

Get a recipe's nutrition label as an HTML widget.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 641166; // The recipe id.
NSNumber* defaultCss = false; // Whether the default CSS should be added to the response. (optional) (default to @(YES))
NSNumber* showOptionalNutrients = false; // Whether to show optional nutrients. (optional)
NSNumber* showZeroValues = false; // Whether to show zero values. (optional)
NSNumber* showIngredients = false; // Whether to show a list of ingredients. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Recipe Nutrition Label Widget
[apiInstance recipeNutritionLabelWidgetWithId:_id
              defaultCss:defaultCss
              showOptionalNutrients:showOptionalNutrients
              showZeroValues:showZeroValues
              showIngredients:showIngredients
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->recipeNutritionLabelWidget: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The recipe id. | 
 **defaultCss** | **NSNumber***| Whether the default CSS should be added to the response. | [optional] [default to @(YES)]
 **showOptionalNutrients** | **NSNumber***| Whether to show optional nutrients. | [optional] 
 **showZeroValues** | **NSNumber***| Whether to show zero values. | [optional] 
 **showIngredients** | **NSNumber***| Whether to show a list of ingredients. | [optional] 

### Return type

**NSString***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recipeTasteByIDImage**
```objc
-(NSURLSessionTask*) recipeTasteByIDImageWithId: (NSNumber*) _id
    normalize: (NSNumber*) normalize
    rgb: (NSString*) rgb
        completionHandler: (void (^)(NSURL* output, NSError* error)) handler;
```

Recipe Taste by ID Image

Get a recipe's taste as an image. The tastes supported are sweet, salty, sour, bitter, savory, and fatty.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 69095; // The recipe id.
NSNumber* normalize = false; // Normalize to the strongest taste. (optional)
NSString* rgb = 75,192,192; // Red, green, blue values for the chart color. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Recipe Taste by ID Image
[apiInstance recipeTasteByIDImageWithId:_id
              normalize:normalize
              rgb:rgb
          completionHandler: ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->recipeTasteByIDImage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The recipe id. | 
 **normalize** | **NSNumber***| Normalize to the strongest taste. | [optional] 
 **rgb** | **NSString***| Red, green, blue values for the chart color. | [optional] 

### Return type

**NSURL***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **searchRecipes**
```objc
-(NSURLSessionTask*) searchRecipesWithQuery: (NSString*) query
    cuisine: (NSString*) cuisine
    excludeCuisine: (NSString*) excludeCuisine
    diet: (NSString*) diet
    intolerances: (NSString*) intolerances
    equipment: (NSString*) equipment
    includeIngredients: (NSString*) includeIngredients
    excludeIngredients: (NSString*) excludeIngredients
    type: (NSString*) type
    instructionsRequired: (NSNumber*) instructionsRequired
    fillIngredients: (NSNumber*) fillIngredients
    addRecipeInformation: (NSNumber*) addRecipeInformation
    addRecipeNutrition: (NSNumber*) addRecipeNutrition
    author: (NSString*) author
    tags: (NSString*) tags
    recipeBoxId: (NSNumber*) recipeBoxId
    titleMatch: (NSString*) titleMatch
    maxReadyTime: (NSNumber*) maxReadyTime
    minServings: (NSNumber*) minServings
    maxServings: (NSNumber*) maxServings
    ignorePantry: (NSNumber*) ignorePantry
    sort: (NSString*) sort
    sortDirection: (NSString*) sortDirection
    minCarbs: (NSNumber*) minCarbs
    maxCarbs: (NSNumber*) maxCarbs
    minProtein: (NSNumber*) minProtein
    maxProtein: (NSNumber*) maxProtein
    minCalories: (NSNumber*) minCalories
    maxCalories: (NSNumber*) maxCalories
    minFat: (NSNumber*) minFat
    maxFat: (NSNumber*) maxFat
    minAlcohol: (NSNumber*) minAlcohol
    maxAlcohol: (NSNumber*) maxAlcohol
    minCaffeine: (NSNumber*) minCaffeine
    maxCaffeine: (NSNumber*) maxCaffeine
    minCopper: (NSNumber*) minCopper
    maxCopper: (NSNumber*) maxCopper
    minCalcium: (NSNumber*) minCalcium
    maxCalcium: (NSNumber*) maxCalcium
    minCholine: (NSNumber*) minCholine
    maxCholine: (NSNumber*) maxCholine
    minCholesterol: (NSNumber*) minCholesterol
    maxCholesterol: (NSNumber*) maxCholesterol
    minFluoride: (NSNumber*) minFluoride
    maxFluoride: (NSNumber*) maxFluoride
    minSaturatedFat: (NSNumber*) minSaturatedFat
    maxSaturatedFat: (NSNumber*) maxSaturatedFat
    minVitaminA: (NSNumber*) minVitaminA
    maxVitaminA: (NSNumber*) maxVitaminA
    minVitaminC: (NSNumber*) minVitaminC
    maxVitaminC: (NSNumber*) maxVitaminC
    minVitaminD: (NSNumber*) minVitaminD
    maxVitaminD: (NSNumber*) maxVitaminD
    minVitaminE: (NSNumber*) minVitaminE
    maxVitaminE: (NSNumber*) maxVitaminE
    minVitaminK: (NSNumber*) minVitaminK
    maxVitaminK: (NSNumber*) maxVitaminK
    minVitaminB1: (NSNumber*) minVitaminB1
    maxVitaminB1: (NSNumber*) maxVitaminB1
    minVitaminB2: (NSNumber*) minVitaminB2
    maxVitaminB2: (NSNumber*) maxVitaminB2
    minVitaminB5: (NSNumber*) minVitaminB5
    maxVitaminB5: (NSNumber*) maxVitaminB5
    minVitaminB3: (NSNumber*) minVitaminB3
    maxVitaminB3: (NSNumber*) maxVitaminB3
    minVitaminB6: (NSNumber*) minVitaminB6
    maxVitaminB6: (NSNumber*) maxVitaminB6
    minVitaminB12: (NSNumber*) minVitaminB12
    maxVitaminB12: (NSNumber*) maxVitaminB12
    minFiber: (NSNumber*) minFiber
    maxFiber: (NSNumber*) maxFiber
    minFolate: (NSNumber*) minFolate
    maxFolate: (NSNumber*) maxFolate
    minFolicAcid: (NSNumber*) minFolicAcid
    maxFolicAcid: (NSNumber*) maxFolicAcid
    minIodine: (NSNumber*) minIodine
    maxIodine: (NSNumber*) maxIodine
    minIron: (NSNumber*) minIron
    maxIron: (NSNumber*) maxIron
    minMagnesium: (NSNumber*) minMagnesium
    maxMagnesium: (NSNumber*) maxMagnesium
    minManganese: (NSNumber*) minManganese
    maxManganese: (NSNumber*) maxManganese
    minPhosphorus: (NSNumber*) minPhosphorus
    maxPhosphorus: (NSNumber*) maxPhosphorus
    minPotassium: (NSNumber*) minPotassium
    maxPotassium: (NSNumber*) maxPotassium
    minSelenium: (NSNumber*) minSelenium
    maxSelenium: (NSNumber*) maxSelenium
    minSodium: (NSNumber*) minSodium
    maxSodium: (NSNumber*) maxSodium
    minSugar: (NSNumber*) minSugar
    maxSugar: (NSNumber*) maxSugar
    minZinc: (NSNumber*) minZinc
    maxZinc: (NSNumber*) maxZinc
    offset: (NSNumber*) offset
    number: (NSNumber*) number
    limitLicense: (NSNumber*) limitLicense
        completionHandler: (void (^)(OAISearchRecipes200Response* output, NSError* error)) handler;
```

Search Recipes

Search through hundreds of thousands of recipes using advanced filtering and ranking. NOTE: This method combines searching by query, by ingredients, and by nutrients into one endpoint.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* query = burger; // The (natural language) search query. (optional)
NSString* cuisine = italian; // The cuisine(s) of the recipes. One or more, comma separated (will be interpreted as 'OR'). See a full list of supported cuisines. (optional)
NSString* excludeCuisine = greek; // The cuisine(s) the recipes must not match. One or more, comma separated (will be interpreted as 'AND'). See a full list of supported cuisines. (optional)
NSString* diet = vegetarian; // The diet for which the recipes must be suitable. See a full list of supported diets. (optional)
NSString* intolerances = gluten; // A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. (optional)
NSString* equipment = pan; // The equipment required. Multiple values will be interpreted as 'or'. For example, value could be \"blender, frying pan, bowl\". (optional)
NSString* includeIngredients = tomato,cheese; // A comma-separated list of ingredients that should/must be used in the recipes. (optional)
NSString* excludeIngredients = eggs; // A comma-separated list of ingredients or ingredient types that the recipes must not contain. (optional)
NSString* type = main course; // The type of recipe. See a full list of supported meal types. (optional)
NSNumber* instructionsRequired = true; // Whether the recipes must have instructions. (optional)
NSNumber* fillIngredients = false; // Add information about the ingredients and whether they are used or missing in relation to the query. (optional)
NSNumber* addRecipeInformation = false; // If set to true, you get more information about the recipes returned. (optional)
NSNumber* addRecipeNutrition = false; // If set to true, you get nutritional information about each recipes returned. (optional)
NSString* author = coffeebean; // The username of the recipe author. (optional)
NSString* tags = @"tags_example"; // The tags (can be diets, meal types, cuisines, or intolerances) that the recipe must have. (optional)
NSNumber* recipeBoxId = 2468; // The id of the recipe box to which the search should be limited to. (optional)
NSString* titleMatch = Crock Pot; // Enter text that must be found in the title of the recipes. (optional)
NSNumber* maxReadyTime = 20; // The maximum time in minutes it should take to prepare and cook the recipe. (optional)
NSNumber* minServings = 1; // The minimum amount of servings the recipe is for. (optional)
NSNumber* maxServings = 8; // The maximum amount of servings the recipe is for. (optional)
NSNumber* ignorePantry = false; // Whether to ignore typical pantry items, such as water, salt, flour, etc. (optional) (default to @(NO))
NSString* sort = calories; // The strategy to sort recipes by. See a full list of supported sorting options. (optional)
NSString* sortDirection = asc; // The direction in which to sort. Must be either 'asc' (ascending) or 'desc' (descending). (optional)
NSNumber* minCarbs = 10; // The minimum amount of carbohydrates in grams the recipe must have. (optional)
NSNumber* maxCarbs = 100; // The maximum amount of carbohydrates in grams the recipe can have. (optional)
NSNumber* minProtein = 10; // The minimum amount of protein in grams the recipe must have. (optional)
NSNumber* maxProtein = 100; // The maximum amount of protein in grams the recipe can have. (optional)
NSNumber* minCalories = 50; // The minimum amount of calories the recipe must have. (optional)
NSNumber* maxCalories = 800; // The maximum amount of calories the recipe can have. (optional)
NSNumber* minFat = 1; // The minimum amount of fat in grams the recipe must have. (optional)
NSNumber* maxFat = 100; // The maximum amount of fat in grams the recipe can have. (optional)
NSNumber* minAlcohol = 0; // The minimum amount of alcohol in grams the recipe must have. (optional)
NSNumber* maxAlcohol = 100; // The maximum amount of alcohol in grams the recipe can have. (optional)
NSNumber* minCaffeine = 0; // The minimum amount of caffeine in milligrams the recipe must have. (optional)
NSNumber* maxCaffeine = 100; // The maximum amount of caffeine in milligrams the recipe can have. (optional)
NSNumber* minCopper = 0; // The minimum amount of copper in milligrams the recipe must have. (optional)
NSNumber* maxCopper = 100; // The maximum amount of copper in milligrams the recipe can have. (optional)
NSNumber* minCalcium = 0; // The minimum amount of calcium in milligrams the recipe must have. (optional)
NSNumber* maxCalcium = 100; // The maximum amount of calcium in milligrams the recipe can have. (optional)
NSNumber* minCholine = 0; // The minimum amount of choline in milligrams the recipe must have. (optional)
NSNumber* maxCholine = 100; // The maximum amount of choline in milligrams the recipe can have. (optional)
NSNumber* minCholesterol = 0; // The minimum amount of cholesterol in milligrams the recipe must have. (optional)
NSNumber* maxCholesterol = 100; // The maximum amount of cholesterol in milligrams the recipe can have. (optional)
NSNumber* minFluoride = 0; // The minimum amount of fluoride in milligrams the recipe must have. (optional)
NSNumber* maxFluoride = 100; // The maximum amount of fluoride in milligrams the recipe can have. (optional)
NSNumber* minSaturatedFat = 0; // The minimum amount of saturated fat in grams the recipe must have. (optional)
NSNumber* maxSaturatedFat = 100; // The maximum amount of saturated fat in grams the recipe can have. (optional)
NSNumber* minVitaminA = 0; // The minimum amount of Vitamin A in IU the recipe must have. (optional)
NSNumber* maxVitaminA = 100; // The maximum amount of Vitamin A in IU the recipe can have. (optional)
NSNumber* minVitaminC = 0; // The minimum amount of Vitamin C milligrams the recipe must have. (optional)
NSNumber* maxVitaminC = 100; // The maximum amount of Vitamin C in milligrams the recipe can have. (optional)
NSNumber* minVitaminD = 0; // The minimum amount of Vitamin D in micrograms the recipe must have. (optional)
NSNumber* maxVitaminD = 100; // The maximum amount of Vitamin D in micrograms the recipe can have. (optional)
NSNumber* minVitaminE = 0; // The minimum amount of Vitamin E in milligrams the recipe must have. (optional)
NSNumber* maxVitaminE = 100; // The maximum amount of Vitamin E in milligrams the recipe can have. (optional)
NSNumber* minVitaminK = 0; // The minimum amount of Vitamin K in micrograms the recipe must have. (optional)
NSNumber* maxVitaminK = 100; // The maximum amount of Vitamin K in micrograms the recipe can have. (optional)
NSNumber* minVitaminB1 = 0; // The minimum amount of Vitamin B1 in milligrams the recipe must have. (optional)
NSNumber* maxVitaminB1 = 100; // The maximum amount of Vitamin B1 in milligrams the recipe can have. (optional)
NSNumber* minVitaminB2 = 0; // The minimum amount of Vitamin B2 in milligrams the recipe must have. (optional)
NSNumber* maxVitaminB2 = 100; // The maximum amount of Vitamin B2 in milligrams the recipe can have. (optional)
NSNumber* minVitaminB5 = 0; // The minimum amount of Vitamin B5 in milligrams the recipe must have. (optional)
NSNumber* maxVitaminB5 = 100; // The maximum amount of Vitamin B5 in milligrams the recipe can have. (optional)
NSNumber* minVitaminB3 = 0; // The minimum amount of Vitamin B3 in milligrams the recipe must have. (optional)
NSNumber* maxVitaminB3 = 100; // The maximum amount of Vitamin B3 in milligrams the recipe can have. (optional)
NSNumber* minVitaminB6 = 0; // The minimum amount of Vitamin B6 in milligrams the recipe must have. (optional)
NSNumber* maxVitaminB6 = 100; // The maximum amount of Vitamin B6 in milligrams the recipe can have. (optional)
NSNumber* minVitaminB12 = 0; // The minimum amount of Vitamin B12 in micrograms the recipe must have. (optional)
NSNumber* maxVitaminB12 = 100; // The maximum amount of Vitamin B12 in micrograms the recipe can have. (optional)
NSNumber* minFiber = 0; // The minimum amount of fiber in grams the recipe must have. (optional)
NSNumber* maxFiber = 100; // The maximum amount of fiber in grams the recipe can have. (optional)
NSNumber* minFolate = 0; // The minimum amount of folate in micrograms the recipe must have. (optional)
NSNumber* maxFolate = 100; // The maximum amount of folate in micrograms the recipe can have. (optional)
NSNumber* minFolicAcid = 0; // The minimum amount of folic acid in micrograms the recipe must have. (optional)
NSNumber* maxFolicAcid = 100; // The maximum amount of folic acid in micrograms the recipe can have. (optional)
NSNumber* minIodine = 0; // The minimum amount of iodine in micrograms the recipe must have. (optional)
NSNumber* maxIodine = 100; // The maximum amount of iodine in micrograms the recipe can have. (optional)
NSNumber* minIron = 0; // The minimum amount of iron in milligrams the recipe must have. (optional)
NSNumber* maxIron = 100; // The maximum amount of iron in milligrams the recipe can have. (optional)
NSNumber* minMagnesium = 0; // The minimum amount of magnesium in milligrams the recipe must have. (optional)
NSNumber* maxMagnesium = 100; // The maximum amount of magnesium in milligrams the recipe can have. (optional)
NSNumber* minManganese = 0; // The minimum amount of manganese in milligrams the recipe must have. (optional)
NSNumber* maxManganese = 100; // The maximum amount of manganese in milligrams the recipe can have. (optional)
NSNumber* minPhosphorus = 0; // The minimum amount of phosphorus in milligrams the recipe must have. (optional)
NSNumber* maxPhosphorus = 100; // The maximum amount of phosphorus in milligrams the recipe can have. (optional)
NSNumber* minPotassium = 0; // The minimum amount of potassium in milligrams the recipe must have. (optional)
NSNumber* maxPotassium = 100; // The maximum amount of potassium in milligrams the recipe can have. (optional)
NSNumber* minSelenium = 0; // The minimum amount of selenium in micrograms the recipe must have. (optional)
NSNumber* maxSelenium = 100; // The maximum amount of selenium in micrograms the recipe can have. (optional)
NSNumber* minSodium = 0; // The minimum amount of sodium in milligrams the recipe must have. (optional)
NSNumber* maxSodium = 100; // The maximum amount of sodium in milligrams the recipe can have. (optional)
NSNumber* minSugar = 0; // The minimum amount of sugar in grams the recipe must have. (optional)
NSNumber* maxSugar = 100; // The maximum amount of sugar in grams the recipe can have. (optional)
NSNumber* minZinc = 0; // The minimum amount of zinc in milligrams the recipe must have. (optional)
NSNumber* maxZinc = 100; // The maximum amount of zinc in milligrams the recipe can have. (optional)
NSNumber* offset = @56; // The number of results to skip (between 0 and 900). (optional)
NSNumber* number = 10; // The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)
NSNumber* limitLicense = true; // Whether the recipes should have an open license that allows display with proper attribution. (optional) (default to @(YES))

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Search Recipes
[apiInstance searchRecipesWithQuery:query
              cuisine:cuisine
              excludeCuisine:excludeCuisine
              diet:diet
              intolerances:intolerances
              equipment:equipment
              includeIngredients:includeIngredients
              excludeIngredients:excludeIngredients
              type:type
              instructionsRequired:instructionsRequired
              fillIngredients:fillIngredients
              addRecipeInformation:addRecipeInformation
              addRecipeNutrition:addRecipeNutrition
              author:author
              tags:tags
              recipeBoxId:recipeBoxId
              titleMatch:titleMatch
              maxReadyTime:maxReadyTime
              minServings:minServings
              maxServings:maxServings
              ignorePantry:ignorePantry
              sort:sort
              sortDirection:sortDirection
              minCarbs:minCarbs
              maxCarbs:maxCarbs
              minProtein:minProtein
              maxProtein:maxProtein
              minCalories:minCalories
              maxCalories:maxCalories
              minFat:minFat
              maxFat:maxFat
              minAlcohol:minAlcohol
              maxAlcohol:maxAlcohol
              minCaffeine:minCaffeine
              maxCaffeine:maxCaffeine
              minCopper:minCopper
              maxCopper:maxCopper
              minCalcium:minCalcium
              maxCalcium:maxCalcium
              minCholine:minCholine
              maxCholine:maxCholine
              minCholesterol:minCholesterol
              maxCholesterol:maxCholesterol
              minFluoride:minFluoride
              maxFluoride:maxFluoride
              minSaturatedFat:minSaturatedFat
              maxSaturatedFat:maxSaturatedFat
              minVitaminA:minVitaminA
              maxVitaminA:maxVitaminA
              minVitaminC:minVitaminC
              maxVitaminC:maxVitaminC
              minVitaminD:minVitaminD
              maxVitaminD:maxVitaminD
              minVitaminE:minVitaminE
              maxVitaminE:maxVitaminE
              minVitaminK:minVitaminK
              maxVitaminK:maxVitaminK
              minVitaminB1:minVitaminB1
              maxVitaminB1:maxVitaminB1
              minVitaminB2:minVitaminB2
              maxVitaminB2:maxVitaminB2
              minVitaminB5:minVitaminB5
              maxVitaminB5:maxVitaminB5
              minVitaminB3:minVitaminB3
              maxVitaminB3:maxVitaminB3
              minVitaminB6:minVitaminB6
              maxVitaminB6:maxVitaminB6
              minVitaminB12:minVitaminB12
              maxVitaminB12:maxVitaminB12
              minFiber:minFiber
              maxFiber:maxFiber
              minFolate:minFolate
              maxFolate:maxFolate
              minFolicAcid:minFolicAcid
              maxFolicAcid:maxFolicAcid
              minIodine:minIodine
              maxIodine:maxIodine
              minIron:minIron
              maxIron:maxIron
              minMagnesium:minMagnesium
              maxMagnesium:maxMagnesium
              minManganese:minManganese
              maxManganese:maxManganese
              minPhosphorus:minPhosphorus
              maxPhosphorus:maxPhosphorus
              minPotassium:minPotassium
              maxPotassium:maxPotassium
              minSelenium:minSelenium
              maxSelenium:maxSelenium
              minSodium:minSodium
              maxSodium:maxSodium
              minSugar:minSugar
              maxSugar:maxSugar
              minZinc:minZinc
              maxZinc:maxZinc
              offset:offset
              number:number
              limitLicense:limitLicense
          completionHandler: ^(OAISearchRecipes200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->searchRecipes: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **NSString***| The (natural language) search query. | [optional] 
 **cuisine** | **NSString***| The cuisine(s) of the recipes. One or more, comma separated (will be interpreted as &#39;OR&#39;). See a full list of supported cuisines. | [optional] 
 **excludeCuisine** | **NSString***| The cuisine(s) the recipes must not match. One or more, comma separated (will be interpreted as &#39;AND&#39;). See a full list of supported cuisines. | [optional] 
 **diet** | **NSString***| The diet for which the recipes must be suitable. See a full list of supported diets. | [optional] 
 **intolerances** | **NSString***| A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. | [optional] 
 **equipment** | **NSString***| The equipment required. Multiple values will be interpreted as &#39;or&#39;. For example, value could be \&quot;blender, frying pan, bowl\&quot;. | [optional] 
 **includeIngredients** | **NSString***| A comma-separated list of ingredients that should/must be used in the recipes. | [optional] 
 **excludeIngredients** | **NSString***| A comma-separated list of ingredients or ingredient types that the recipes must not contain. | [optional] 
 **type** | **NSString***| The type of recipe. See a full list of supported meal types. | [optional] 
 **instructionsRequired** | **NSNumber***| Whether the recipes must have instructions. | [optional] 
 **fillIngredients** | **NSNumber***| Add information about the ingredients and whether they are used or missing in relation to the query. | [optional] 
 **addRecipeInformation** | **NSNumber***| If set to true, you get more information about the recipes returned. | [optional] 
 **addRecipeNutrition** | **NSNumber***| If set to true, you get nutritional information about each recipes returned. | [optional] 
 **author** | **NSString***| The username of the recipe author. | [optional] 
 **tags** | **NSString***| The tags (can be diets, meal types, cuisines, or intolerances) that the recipe must have. | [optional] 
 **recipeBoxId** | **NSNumber***| The id of the recipe box to which the search should be limited to. | [optional] 
 **titleMatch** | **NSString***| Enter text that must be found in the title of the recipes. | [optional] 
 **maxReadyTime** | **NSNumber***| The maximum time in minutes it should take to prepare and cook the recipe. | [optional] 
 **minServings** | **NSNumber***| The minimum amount of servings the recipe is for. | [optional] 
 **maxServings** | **NSNumber***| The maximum amount of servings the recipe is for. | [optional] 
 **ignorePantry** | **NSNumber***| Whether to ignore typical pantry items, such as water, salt, flour, etc. | [optional] [default to @(NO)]
 **sort** | **NSString***| The strategy to sort recipes by. See a full list of supported sorting options. | [optional] 
 **sortDirection** | **NSString***| The direction in which to sort. Must be either &#39;asc&#39; (ascending) or &#39;desc&#39; (descending). | [optional] 
 **minCarbs** | **NSNumber***| The minimum amount of carbohydrates in grams the recipe must have. | [optional] 
 **maxCarbs** | **NSNumber***| The maximum amount of carbohydrates in grams the recipe can have. | [optional] 
 **minProtein** | **NSNumber***| The minimum amount of protein in grams the recipe must have. | [optional] 
 **maxProtein** | **NSNumber***| The maximum amount of protein in grams the recipe can have. | [optional] 
 **minCalories** | **NSNumber***| The minimum amount of calories the recipe must have. | [optional] 
 **maxCalories** | **NSNumber***| The maximum amount of calories the recipe can have. | [optional] 
 **minFat** | **NSNumber***| The minimum amount of fat in grams the recipe must have. | [optional] 
 **maxFat** | **NSNumber***| The maximum amount of fat in grams the recipe can have. | [optional] 
 **minAlcohol** | **NSNumber***| The minimum amount of alcohol in grams the recipe must have. | [optional] 
 **maxAlcohol** | **NSNumber***| The maximum amount of alcohol in grams the recipe can have. | [optional] 
 **minCaffeine** | **NSNumber***| The minimum amount of caffeine in milligrams the recipe must have. | [optional] 
 **maxCaffeine** | **NSNumber***| The maximum amount of caffeine in milligrams the recipe can have. | [optional] 
 **minCopper** | **NSNumber***| The minimum amount of copper in milligrams the recipe must have. | [optional] 
 **maxCopper** | **NSNumber***| The maximum amount of copper in milligrams the recipe can have. | [optional] 
 **minCalcium** | **NSNumber***| The minimum amount of calcium in milligrams the recipe must have. | [optional] 
 **maxCalcium** | **NSNumber***| The maximum amount of calcium in milligrams the recipe can have. | [optional] 
 **minCholine** | **NSNumber***| The minimum amount of choline in milligrams the recipe must have. | [optional] 
 **maxCholine** | **NSNumber***| The maximum amount of choline in milligrams the recipe can have. | [optional] 
 **minCholesterol** | **NSNumber***| The minimum amount of cholesterol in milligrams the recipe must have. | [optional] 
 **maxCholesterol** | **NSNumber***| The maximum amount of cholesterol in milligrams the recipe can have. | [optional] 
 **minFluoride** | **NSNumber***| The minimum amount of fluoride in milligrams the recipe must have. | [optional] 
 **maxFluoride** | **NSNumber***| The maximum amount of fluoride in milligrams the recipe can have. | [optional] 
 **minSaturatedFat** | **NSNumber***| The minimum amount of saturated fat in grams the recipe must have. | [optional] 
 **maxSaturatedFat** | **NSNumber***| The maximum amount of saturated fat in grams the recipe can have. | [optional] 
 **minVitaminA** | **NSNumber***| The minimum amount of Vitamin A in IU the recipe must have. | [optional] 
 **maxVitaminA** | **NSNumber***| The maximum amount of Vitamin A in IU the recipe can have. | [optional] 
 **minVitaminC** | **NSNumber***| The minimum amount of Vitamin C milligrams the recipe must have. | [optional] 
 **maxVitaminC** | **NSNumber***| The maximum amount of Vitamin C in milligrams the recipe can have. | [optional] 
 **minVitaminD** | **NSNumber***| The minimum amount of Vitamin D in micrograms the recipe must have. | [optional] 
 **maxVitaminD** | **NSNumber***| The maximum amount of Vitamin D in micrograms the recipe can have. | [optional] 
 **minVitaminE** | **NSNumber***| The minimum amount of Vitamin E in milligrams the recipe must have. | [optional] 
 **maxVitaminE** | **NSNumber***| The maximum amount of Vitamin E in milligrams the recipe can have. | [optional] 
 **minVitaminK** | **NSNumber***| The minimum amount of Vitamin K in micrograms the recipe must have. | [optional] 
 **maxVitaminK** | **NSNumber***| The maximum amount of Vitamin K in micrograms the recipe can have. | [optional] 
 **minVitaminB1** | **NSNumber***| The minimum amount of Vitamin B1 in milligrams the recipe must have. | [optional] 
 **maxVitaminB1** | **NSNumber***| The maximum amount of Vitamin B1 in milligrams the recipe can have. | [optional] 
 **minVitaminB2** | **NSNumber***| The minimum amount of Vitamin B2 in milligrams the recipe must have. | [optional] 
 **maxVitaminB2** | **NSNumber***| The maximum amount of Vitamin B2 in milligrams the recipe can have. | [optional] 
 **minVitaminB5** | **NSNumber***| The minimum amount of Vitamin B5 in milligrams the recipe must have. | [optional] 
 **maxVitaminB5** | **NSNumber***| The maximum amount of Vitamin B5 in milligrams the recipe can have. | [optional] 
 **minVitaminB3** | **NSNumber***| The minimum amount of Vitamin B3 in milligrams the recipe must have. | [optional] 
 **maxVitaminB3** | **NSNumber***| The maximum amount of Vitamin B3 in milligrams the recipe can have. | [optional] 
 **minVitaminB6** | **NSNumber***| The minimum amount of Vitamin B6 in milligrams the recipe must have. | [optional] 
 **maxVitaminB6** | **NSNumber***| The maximum amount of Vitamin B6 in milligrams the recipe can have. | [optional] 
 **minVitaminB12** | **NSNumber***| The minimum amount of Vitamin B12 in micrograms the recipe must have. | [optional] 
 **maxVitaminB12** | **NSNumber***| The maximum amount of Vitamin B12 in micrograms the recipe can have. | [optional] 
 **minFiber** | **NSNumber***| The minimum amount of fiber in grams the recipe must have. | [optional] 
 **maxFiber** | **NSNumber***| The maximum amount of fiber in grams the recipe can have. | [optional] 
 **minFolate** | **NSNumber***| The minimum amount of folate in micrograms the recipe must have. | [optional] 
 **maxFolate** | **NSNumber***| The maximum amount of folate in micrograms the recipe can have. | [optional] 
 **minFolicAcid** | **NSNumber***| The minimum amount of folic acid in micrograms the recipe must have. | [optional] 
 **maxFolicAcid** | **NSNumber***| The maximum amount of folic acid in micrograms the recipe can have. | [optional] 
 **minIodine** | **NSNumber***| The minimum amount of iodine in micrograms the recipe must have. | [optional] 
 **maxIodine** | **NSNumber***| The maximum amount of iodine in micrograms the recipe can have. | [optional] 
 **minIron** | **NSNumber***| The minimum amount of iron in milligrams the recipe must have. | [optional] 
 **maxIron** | **NSNumber***| The maximum amount of iron in milligrams the recipe can have. | [optional] 
 **minMagnesium** | **NSNumber***| The minimum amount of magnesium in milligrams the recipe must have. | [optional] 
 **maxMagnesium** | **NSNumber***| The maximum amount of magnesium in milligrams the recipe can have. | [optional] 
 **minManganese** | **NSNumber***| The minimum amount of manganese in milligrams the recipe must have. | [optional] 
 **maxManganese** | **NSNumber***| The maximum amount of manganese in milligrams the recipe can have. | [optional] 
 **minPhosphorus** | **NSNumber***| The minimum amount of phosphorus in milligrams the recipe must have. | [optional] 
 **maxPhosphorus** | **NSNumber***| The maximum amount of phosphorus in milligrams the recipe can have. | [optional] 
 **minPotassium** | **NSNumber***| The minimum amount of potassium in milligrams the recipe must have. | [optional] 
 **maxPotassium** | **NSNumber***| The maximum amount of potassium in milligrams the recipe can have. | [optional] 
 **minSelenium** | **NSNumber***| The minimum amount of selenium in micrograms the recipe must have. | [optional] 
 **maxSelenium** | **NSNumber***| The maximum amount of selenium in micrograms the recipe can have. | [optional] 
 **minSodium** | **NSNumber***| The minimum amount of sodium in milligrams the recipe must have. | [optional] 
 **maxSodium** | **NSNumber***| The maximum amount of sodium in milligrams the recipe can have. | [optional] 
 **minSugar** | **NSNumber***| The minimum amount of sugar in grams the recipe must have. | [optional] 
 **maxSugar** | **NSNumber***| The maximum amount of sugar in grams the recipe can have. | [optional] 
 **minZinc** | **NSNumber***| The minimum amount of zinc in milligrams the recipe must have. | [optional] 
 **maxZinc** | **NSNumber***| The maximum amount of zinc in milligrams the recipe can have. | [optional] 
 **offset** | **NSNumber***| The number of results to skip (between 0 and 900). | [optional] 
 **number** | **NSNumber***| The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional] [default to @10]
 **limitLicense** | **NSNumber***| Whether the recipes should have an open license that allows display with proper attribution. | [optional] [default to @(YES)]

### Return type

[**OAISearchRecipes200Response***](OAISearchRecipes200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **searchRecipesByIngredients**
```objc
-(NSURLSessionTask*) searchRecipesByIngredientsWithIngredients: (NSString*) ingredients
    number: (NSNumber*) number
    limitLicense: (NSNumber*) limitLicense
    ranking: (NSNumber*) ranking
    ignorePantry: (NSNumber*) ignorePantry
        completionHandler: (void (^)(OAISet<OAISearchRecipesByIngredients200ResponseInner>* output, NSError* error)) handler;
```

Search Recipes by Ingredients

 Ever wondered what recipes you can cook with the ingredients you have in your fridge or pantry? This endpoint lets you find recipes that either maximize the usage of ingredients you have at hand (pre shopping) or minimize the ingredients that you don't currently have (post shopping).         

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* ingredients = carrots,tomatoes; // A comma-separated list of ingredients that the recipes should contain. (optional)
NSNumber* number = 10; // The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)
NSNumber* limitLicense = true; // Whether the recipes should have an open license that allows display with proper attribution. (optional) (default to @(YES))
NSNumber* ranking = 1; // Whether to maximize used ingredients (1) or minimize missing ingredients (2) first. (optional)
NSNumber* ignorePantry = false; // Whether to ignore typical pantry items, such as water, salt, flour, etc. (optional) (default to @(NO))

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Search Recipes by Ingredients
[apiInstance searchRecipesByIngredientsWithIngredients:ingredients
              number:number
              limitLicense:limitLicense
              ranking:ranking
              ignorePantry:ignorePantry
          completionHandler: ^(OAISet<OAISearchRecipesByIngredients200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->searchRecipesByIngredients: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingredients** | **NSString***| A comma-separated list of ingredients that the recipes should contain. | [optional] 
 **number** | **NSNumber***| The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional] [default to @10]
 **limitLicense** | **NSNumber***| Whether the recipes should have an open license that allows display with proper attribution. | [optional] [default to @(YES)]
 **ranking** | **NSNumber***| Whether to maximize used ingredients (1) or minimize missing ingredients (2) first. | [optional] 
 **ignorePantry** | **NSNumber***| Whether to ignore typical pantry items, such as water, salt, flour, etc. | [optional] [default to @(NO)]

### Return type

[**OAISet<OAISearchRecipesByIngredients200ResponseInner>***](OAISearchRecipesByIngredients200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **searchRecipesByNutrients**
```objc
-(NSURLSessionTask*) searchRecipesByNutrientsWithMinCarbs: (NSNumber*) minCarbs
    maxCarbs: (NSNumber*) maxCarbs
    minProtein: (NSNumber*) minProtein
    maxProtein: (NSNumber*) maxProtein
    minCalories: (NSNumber*) minCalories
    maxCalories: (NSNumber*) maxCalories
    minFat: (NSNumber*) minFat
    maxFat: (NSNumber*) maxFat
    minAlcohol: (NSNumber*) minAlcohol
    maxAlcohol: (NSNumber*) maxAlcohol
    minCaffeine: (NSNumber*) minCaffeine
    maxCaffeine: (NSNumber*) maxCaffeine
    minCopper: (NSNumber*) minCopper
    maxCopper: (NSNumber*) maxCopper
    minCalcium: (NSNumber*) minCalcium
    maxCalcium: (NSNumber*) maxCalcium
    minCholine: (NSNumber*) minCholine
    maxCholine: (NSNumber*) maxCholine
    minCholesterol: (NSNumber*) minCholesterol
    maxCholesterol: (NSNumber*) maxCholesterol
    minFluoride: (NSNumber*) minFluoride
    maxFluoride: (NSNumber*) maxFluoride
    minSaturatedFat: (NSNumber*) minSaturatedFat
    maxSaturatedFat: (NSNumber*) maxSaturatedFat
    minVitaminA: (NSNumber*) minVitaminA
    maxVitaminA: (NSNumber*) maxVitaminA
    minVitaminC: (NSNumber*) minVitaminC
    maxVitaminC: (NSNumber*) maxVitaminC
    minVitaminD: (NSNumber*) minVitaminD
    maxVitaminD: (NSNumber*) maxVitaminD
    minVitaminE: (NSNumber*) minVitaminE
    maxVitaminE: (NSNumber*) maxVitaminE
    minVitaminK: (NSNumber*) minVitaminK
    maxVitaminK: (NSNumber*) maxVitaminK
    minVitaminB1: (NSNumber*) minVitaminB1
    maxVitaminB1: (NSNumber*) maxVitaminB1
    minVitaminB2: (NSNumber*) minVitaminB2
    maxVitaminB2: (NSNumber*) maxVitaminB2
    minVitaminB5: (NSNumber*) minVitaminB5
    maxVitaminB5: (NSNumber*) maxVitaminB5
    minVitaminB3: (NSNumber*) minVitaminB3
    maxVitaminB3: (NSNumber*) maxVitaminB3
    minVitaminB6: (NSNumber*) minVitaminB6
    maxVitaminB6: (NSNumber*) maxVitaminB6
    minVitaminB12: (NSNumber*) minVitaminB12
    maxVitaminB12: (NSNumber*) maxVitaminB12
    minFiber: (NSNumber*) minFiber
    maxFiber: (NSNumber*) maxFiber
    minFolate: (NSNumber*) minFolate
    maxFolate: (NSNumber*) maxFolate
    minFolicAcid: (NSNumber*) minFolicAcid
    maxFolicAcid: (NSNumber*) maxFolicAcid
    minIodine: (NSNumber*) minIodine
    maxIodine: (NSNumber*) maxIodine
    minIron: (NSNumber*) minIron
    maxIron: (NSNumber*) maxIron
    minMagnesium: (NSNumber*) minMagnesium
    maxMagnesium: (NSNumber*) maxMagnesium
    minManganese: (NSNumber*) minManganese
    maxManganese: (NSNumber*) maxManganese
    minPhosphorus: (NSNumber*) minPhosphorus
    maxPhosphorus: (NSNumber*) maxPhosphorus
    minPotassium: (NSNumber*) minPotassium
    maxPotassium: (NSNumber*) maxPotassium
    minSelenium: (NSNumber*) minSelenium
    maxSelenium: (NSNumber*) maxSelenium
    minSodium: (NSNumber*) minSodium
    maxSodium: (NSNumber*) maxSodium
    minSugar: (NSNumber*) minSugar
    maxSugar: (NSNumber*) maxSugar
    minZinc: (NSNumber*) minZinc
    maxZinc: (NSNumber*) maxZinc
    offset: (NSNumber*) offset
    number: (NSNumber*) number
    random: (NSNumber*) random
    limitLicense: (NSNumber*) limitLicense
        completionHandler: (void (^)(OAISet<OAISearchRecipesByNutrients200ResponseInner>* output, NSError* error)) handler;
```

Search Recipes by Nutrients

Find a set of recipes that adhere to the given nutritional limits. You may set limits for macronutrients (calories, protein, fat, and carbohydrate) and/or many micronutrients.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* minCarbs = 10; // The minimum amount of carbohydrates in grams the recipe must have. (optional)
NSNumber* maxCarbs = 100; // The maximum amount of carbohydrates in grams the recipe can have. (optional)
NSNumber* minProtein = 10; // The minimum amount of protein in grams the recipe must have. (optional)
NSNumber* maxProtein = 100; // The maximum amount of protein in grams the recipe can have. (optional)
NSNumber* minCalories = 50; // The minimum amount of calories the recipe must have. (optional)
NSNumber* maxCalories = 800; // The maximum amount of calories the recipe can have. (optional)
NSNumber* minFat = 1; // The minimum amount of fat in grams the recipe must have. (optional)
NSNumber* maxFat = 100; // The maximum amount of fat in grams the recipe can have. (optional)
NSNumber* minAlcohol = 0; // The minimum amount of alcohol in grams the recipe must have. (optional)
NSNumber* maxAlcohol = 100; // The maximum amount of alcohol in grams the recipe can have. (optional)
NSNumber* minCaffeine = 0; // The minimum amount of caffeine in milligrams the recipe must have. (optional)
NSNumber* maxCaffeine = 100; // The maximum amount of caffeine in milligrams the recipe can have. (optional)
NSNumber* minCopper = 0; // The minimum amount of copper in milligrams the recipe must have. (optional)
NSNumber* maxCopper = 100; // The maximum amount of copper in milligrams the recipe can have. (optional)
NSNumber* minCalcium = 0; // The minimum amount of calcium in milligrams the recipe must have. (optional)
NSNumber* maxCalcium = 100; // The maximum amount of calcium in milligrams the recipe can have. (optional)
NSNumber* minCholine = 0; // The minimum amount of choline in milligrams the recipe must have. (optional)
NSNumber* maxCholine = 100; // The maximum amount of choline in milligrams the recipe can have. (optional)
NSNumber* minCholesterol = 0; // The minimum amount of cholesterol in milligrams the recipe must have. (optional)
NSNumber* maxCholesterol = 100; // The maximum amount of cholesterol in milligrams the recipe can have. (optional)
NSNumber* minFluoride = 0; // The minimum amount of fluoride in milligrams the recipe must have. (optional)
NSNumber* maxFluoride = 100; // The maximum amount of fluoride in milligrams the recipe can have. (optional)
NSNumber* minSaturatedFat = 0; // The minimum amount of saturated fat in grams the recipe must have. (optional)
NSNumber* maxSaturatedFat = 100; // The maximum amount of saturated fat in grams the recipe can have. (optional)
NSNumber* minVitaminA = 0; // The minimum amount of Vitamin A in IU the recipe must have. (optional)
NSNumber* maxVitaminA = 100; // The maximum amount of Vitamin A in IU the recipe can have. (optional)
NSNumber* minVitaminC = 0; // The minimum amount of Vitamin C in milligrams the recipe must have. (optional)
NSNumber* maxVitaminC = 100; // The maximum amount of Vitamin C in milligrams the recipe can have. (optional)
NSNumber* minVitaminD = 0; // The minimum amount of Vitamin D in micrograms the recipe must have. (optional)
NSNumber* maxVitaminD = 100; // The maximum amount of Vitamin D in micrograms the recipe can have. (optional)
NSNumber* minVitaminE = 0; // The minimum amount of Vitamin E in milligrams the recipe must have. (optional)
NSNumber* maxVitaminE = 100; // The maximum amount of Vitamin E in milligrams the recipe can have. (optional)
NSNumber* minVitaminK = 0; // The minimum amount of Vitamin K in micrograms the recipe must have. (optional)
NSNumber* maxVitaminK = 100; // The maximum amount of Vitamin K in micrograms the recipe can have. (optional)
NSNumber* minVitaminB1 = 0; // The minimum amount of Vitamin B1 in milligrams the recipe must have. (optional)
NSNumber* maxVitaminB1 = 100; // The maximum amount of Vitamin B1 in milligrams the recipe can have. (optional)
NSNumber* minVitaminB2 = 0; // The minimum amount of Vitamin B2 in milligrams the recipe must have. (optional)
NSNumber* maxVitaminB2 = 100; // The maximum amount of Vitamin B2 in milligrams the recipe can have. (optional)
NSNumber* minVitaminB5 = 0; // The minimum amount of Vitamin B5 in milligrams the recipe must have. (optional)
NSNumber* maxVitaminB5 = 100; // The maximum amount of Vitamin B5 in milligrams the recipe can have. (optional)
NSNumber* minVitaminB3 = 0; // The minimum amount of Vitamin B3 in milligrams the recipe must have. (optional)
NSNumber* maxVitaminB3 = 100; // The maximum amount of Vitamin B3 in milligrams the recipe can have. (optional)
NSNumber* minVitaminB6 = 0; // The minimum amount of Vitamin B6 in milligrams the recipe must have. (optional)
NSNumber* maxVitaminB6 = 100; // The maximum amount of Vitamin B6 in milligrams the recipe can have. (optional)
NSNumber* minVitaminB12 = 0; // The minimum amount of Vitamin B12 in micrograms the recipe must have. (optional)
NSNumber* maxVitaminB12 = 100; // The maximum amount of Vitamin B12 in micrograms the recipe can have. (optional)
NSNumber* minFiber = 0; // The minimum amount of fiber in grams the recipe must have. (optional)
NSNumber* maxFiber = 100; // The maximum amount of fiber in grams the recipe can have. (optional)
NSNumber* minFolate = 0; // The minimum amount of folate in micrograms the recipe must have. (optional)
NSNumber* maxFolate = 100; // The maximum amount of folate in micrograms the recipe can have. (optional)
NSNumber* minFolicAcid = 0; // The minimum amount of folic acid in micrograms the recipe must have. (optional)
NSNumber* maxFolicAcid = 100; // The maximum amount of folic acid in micrograms the recipe can have. (optional)
NSNumber* minIodine = 0; // The minimum amount of iodine in micrograms the recipe must have. (optional)
NSNumber* maxIodine = 100; // The maximum amount of iodine in micrograms the recipe can have. (optional)
NSNumber* minIron = 0; // The minimum amount of iron in milligrams the recipe must have. (optional)
NSNumber* maxIron = 100; // The maximum amount of iron in milligrams the recipe can have. (optional)
NSNumber* minMagnesium = 0; // The minimum amount of magnesium in milligrams the recipe must have. (optional)
NSNumber* maxMagnesium = 100; // The maximum amount of magnesium in milligrams the recipe can have. (optional)
NSNumber* minManganese = 0; // The minimum amount of manganese in milligrams the recipe must have. (optional)
NSNumber* maxManganese = 100; // The maximum amount of manganese in milligrams the recipe can have. (optional)
NSNumber* minPhosphorus = 0; // The minimum amount of phosphorus in milligrams the recipe must have. (optional)
NSNumber* maxPhosphorus = 100; // The maximum amount of phosphorus in milligrams the recipe can have. (optional)
NSNumber* minPotassium = 0; // The minimum amount of potassium in milligrams the recipe must have. (optional)
NSNumber* maxPotassium = 100; // The maximum amount of potassium in milligrams the recipe can have. (optional)
NSNumber* minSelenium = 0; // The minimum amount of selenium in micrograms the recipe must have. (optional)
NSNumber* maxSelenium = 100; // The maximum amount of selenium in micrograms the recipe can have. (optional)
NSNumber* minSodium = 0; // The minimum amount of sodium in milligrams the recipe must have. (optional)
NSNumber* maxSodium = 100; // The maximum amount of sodium in milligrams the recipe can have. (optional)
NSNumber* minSugar = 0; // The minimum amount of sugar in grams the recipe must have. (optional)
NSNumber* maxSugar = 100; // The maximum amount of sugar in grams the recipe can have. (optional)
NSNumber* minZinc = 0; // The minimum amount of zinc in milligrams the recipe must have. (optional)
NSNumber* maxZinc = 100; // The maximum amount of zinc in milligrams the recipe can have. (optional)
NSNumber* offset = @56; // The number of results to skip (between 0 and 900). (optional)
NSNumber* number = 10; // The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)
NSNumber* random = false; // If true, every request will give you a random set of recipes within the requested limits. (optional)
NSNumber* limitLicense = true; // Whether the recipes should have an open license that allows display with proper attribution. (optional) (default to @(YES))

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Search Recipes by Nutrients
[apiInstance searchRecipesByNutrientsWithMinCarbs:minCarbs
              maxCarbs:maxCarbs
              minProtein:minProtein
              maxProtein:maxProtein
              minCalories:minCalories
              maxCalories:maxCalories
              minFat:minFat
              maxFat:maxFat
              minAlcohol:minAlcohol
              maxAlcohol:maxAlcohol
              minCaffeine:minCaffeine
              maxCaffeine:maxCaffeine
              minCopper:minCopper
              maxCopper:maxCopper
              minCalcium:minCalcium
              maxCalcium:maxCalcium
              minCholine:minCholine
              maxCholine:maxCholine
              minCholesterol:minCholesterol
              maxCholesterol:maxCholesterol
              minFluoride:minFluoride
              maxFluoride:maxFluoride
              minSaturatedFat:minSaturatedFat
              maxSaturatedFat:maxSaturatedFat
              minVitaminA:minVitaminA
              maxVitaminA:maxVitaminA
              minVitaminC:minVitaminC
              maxVitaminC:maxVitaminC
              minVitaminD:minVitaminD
              maxVitaminD:maxVitaminD
              minVitaminE:minVitaminE
              maxVitaminE:maxVitaminE
              minVitaminK:minVitaminK
              maxVitaminK:maxVitaminK
              minVitaminB1:minVitaminB1
              maxVitaminB1:maxVitaminB1
              minVitaminB2:minVitaminB2
              maxVitaminB2:maxVitaminB2
              minVitaminB5:minVitaminB5
              maxVitaminB5:maxVitaminB5
              minVitaminB3:minVitaminB3
              maxVitaminB3:maxVitaminB3
              minVitaminB6:minVitaminB6
              maxVitaminB6:maxVitaminB6
              minVitaminB12:minVitaminB12
              maxVitaminB12:maxVitaminB12
              minFiber:minFiber
              maxFiber:maxFiber
              minFolate:minFolate
              maxFolate:maxFolate
              minFolicAcid:minFolicAcid
              maxFolicAcid:maxFolicAcid
              minIodine:minIodine
              maxIodine:maxIodine
              minIron:minIron
              maxIron:maxIron
              minMagnesium:minMagnesium
              maxMagnesium:maxMagnesium
              minManganese:minManganese
              maxManganese:maxManganese
              minPhosphorus:minPhosphorus
              maxPhosphorus:maxPhosphorus
              minPotassium:minPotassium
              maxPotassium:maxPotassium
              minSelenium:minSelenium
              maxSelenium:maxSelenium
              minSodium:minSodium
              maxSodium:maxSodium
              minSugar:minSugar
              maxSugar:maxSugar
              minZinc:minZinc
              maxZinc:maxZinc
              offset:offset
              number:number
              random:random
              limitLicense:limitLicense
          completionHandler: ^(OAISet<OAISearchRecipesByNutrients200ResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->searchRecipesByNutrients: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **minCarbs** | **NSNumber***| The minimum amount of carbohydrates in grams the recipe must have. | [optional] 
 **maxCarbs** | **NSNumber***| The maximum amount of carbohydrates in grams the recipe can have. | [optional] 
 **minProtein** | **NSNumber***| The minimum amount of protein in grams the recipe must have. | [optional] 
 **maxProtein** | **NSNumber***| The maximum amount of protein in grams the recipe can have. | [optional] 
 **minCalories** | **NSNumber***| The minimum amount of calories the recipe must have. | [optional] 
 **maxCalories** | **NSNumber***| The maximum amount of calories the recipe can have. | [optional] 
 **minFat** | **NSNumber***| The minimum amount of fat in grams the recipe must have. | [optional] 
 **maxFat** | **NSNumber***| The maximum amount of fat in grams the recipe can have. | [optional] 
 **minAlcohol** | **NSNumber***| The minimum amount of alcohol in grams the recipe must have. | [optional] 
 **maxAlcohol** | **NSNumber***| The maximum amount of alcohol in grams the recipe can have. | [optional] 
 **minCaffeine** | **NSNumber***| The minimum amount of caffeine in milligrams the recipe must have. | [optional] 
 **maxCaffeine** | **NSNumber***| The maximum amount of caffeine in milligrams the recipe can have. | [optional] 
 **minCopper** | **NSNumber***| The minimum amount of copper in milligrams the recipe must have. | [optional] 
 **maxCopper** | **NSNumber***| The maximum amount of copper in milligrams the recipe can have. | [optional] 
 **minCalcium** | **NSNumber***| The minimum amount of calcium in milligrams the recipe must have. | [optional] 
 **maxCalcium** | **NSNumber***| The maximum amount of calcium in milligrams the recipe can have. | [optional] 
 **minCholine** | **NSNumber***| The minimum amount of choline in milligrams the recipe must have. | [optional] 
 **maxCholine** | **NSNumber***| The maximum amount of choline in milligrams the recipe can have. | [optional] 
 **minCholesterol** | **NSNumber***| The minimum amount of cholesterol in milligrams the recipe must have. | [optional] 
 **maxCholesterol** | **NSNumber***| The maximum amount of cholesterol in milligrams the recipe can have. | [optional] 
 **minFluoride** | **NSNumber***| The minimum amount of fluoride in milligrams the recipe must have. | [optional] 
 **maxFluoride** | **NSNumber***| The maximum amount of fluoride in milligrams the recipe can have. | [optional] 
 **minSaturatedFat** | **NSNumber***| The minimum amount of saturated fat in grams the recipe must have. | [optional] 
 **maxSaturatedFat** | **NSNumber***| The maximum amount of saturated fat in grams the recipe can have. | [optional] 
 **minVitaminA** | **NSNumber***| The minimum amount of Vitamin A in IU the recipe must have. | [optional] 
 **maxVitaminA** | **NSNumber***| The maximum amount of Vitamin A in IU the recipe can have. | [optional] 
 **minVitaminC** | **NSNumber***| The minimum amount of Vitamin C in milligrams the recipe must have. | [optional] 
 **maxVitaminC** | **NSNumber***| The maximum amount of Vitamin C in milligrams the recipe can have. | [optional] 
 **minVitaminD** | **NSNumber***| The minimum amount of Vitamin D in micrograms the recipe must have. | [optional] 
 **maxVitaminD** | **NSNumber***| The maximum amount of Vitamin D in micrograms the recipe can have. | [optional] 
 **minVitaminE** | **NSNumber***| The minimum amount of Vitamin E in milligrams the recipe must have. | [optional] 
 **maxVitaminE** | **NSNumber***| The maximum amount of Vitamin E in milligrams the recipe can have. | [optional] 
 **minVitaminK** | **NSNumber***| The minimum amount of Vitamin K in micrograms the recipe must have. | [optional] 
 **maxVitaminK** | **NSNumber***| The maximum amount of Vitamin K in micrograms the recipe can have. | [optional] 
 **minVitaminB1** | **NSNumber***| The minimum amount of Vitamin B1 in milligrams the recipe must have. | [optional] 
 **maxVitaminB1** | **NSNumber***| The maximum amount of Vitamin B1 in milligrams the recipe can have. | [optional] 
 **minVitaminB2** | **NSNumber***| The minimum amount of Vitamin B2 in milligrams the recipe must have. | [optional] 
 **maxVitaminB2** | **NSNumber***| The maximum amount of Vitamin B2 in milligrams the recipe can have. | [optional] 
 **minVitaminB5** | **NSNumber***| The minimum amount of Vitamin B5 in milligrams the recipe must have. | [optional] 
 **maxVitaminB5** | **NSNumber***| The maximum amount of Vitamin B5 in milligrams the recipe can have. | [optional] 
 **minVitaminB3** | **NSNumber***| The minimum amount of Vitamin B3 in milligrams the recipe must have. | [optional] 
 **maxVitaminB3** | **NSNumber***| The maximum amount of Vitamin B3 in milligrams the recipe can have. | [optional] 
 **minVitaminB6** | **NSNumber***| The minimum amount of Vitamin B6 in milligrams the recipe must have. | [optional] 
 **maxVitaminB6** | **NSNumber***| The maximum amount of Vitamin B6 in milligrams the recipe can have. | [optional] 
 **minVitaminB12** | **NSNumber***| The minimum amount of Vitamin B12 in micrograms the recipe must have. | [optional] 
 **maxVitaminB12** | **NSNumber***| The maximum amount of Vitamin B12 in micrograms the recipe can have. | [optional] 
 **minFiber** | **NSNumber***| The minimum amount of fiber in grams the recipe must have. | [optional] 
 **maxFiber** | **NSNumber***| The maximum amount of fiber in grams the recipe can have. | [optional] 
 **minFolate** | **NSNumber***| The minimum amount of folate in micrograms the recipe must have. | [optional] 
 **maxFolate** | **NSNumber***| The maximum amount of folate in micrograms the recipe can have. | [optional] 
 **minFolicAcid** | **NSNumber***| The minimum amount of folic acid in micrograms the recipe must have. | [optional] 
 **maxFolicAcid** | **NSNumber***| The maximum amount of folic acid in micrograms the recipe can have. | [optional] 
 **minIodine** | **NSNumber***| The minimum amount of iodine in micrograms the recipe must have. | [optional] 
 **maxIodine** | **NSNumber***| The maximum amount of iodine in micrograms the recipe can have. | [optional] 
 **minIron** | **NSNumber***| The minimum amount of iron in milligrams the recipe must have. | [optional] 
 **maxIron** | **NSNumber***| The maximum amount of iron in milligrams the recipe can have. | [optional] 
 **minMagnesium** | **NSNumber***| The minimum amount of magnesium in milligrams the recipe must have. | [optional] 
 **maxMagnesium** | **NSNumber***| The maximum amount of magnesium in milligrams the recipe can have. | [optional] 
 **minManganese** | **NSNumber***| The minimum amount of manganese in milligrams the recipe must have. | [optional] 
 **maxManganese** | **NSNumber***| The maximum amount of manganese in milligrams the recipe can have. | [optional] 
 **minPhosphorus** | **NSNumber***| The minimum amount of phosphorus in milligrams the recipe must have. | [optional] 
 **maxPhosphorus** | **NSNumber***| The maximum amount of phosphorus in milligrams the recipe can have. | [optional] 
 **minPotassium** | **NSNumber***| The minimum amount of potassium in milligrams the recipe must have. | [optional] 
 **maxPotassium** | **NSNumber***| The maximum amount of potassium in milligrams the recipe can have. | [optional] 
 **minSelenium** | **NSNumber***| The minimum amount of selenium in micrograms the recipe must have. | [optional] 
 **maxSelenium** | **NSNumber***| The maximum amount of selenium in micrograms the recipe can have. | [optional] 
 **minSodium** | **NSNumber***| The minimum amount of sodium in milligrams the recipe must have. | [optional] 
 **maxSodium** | **NSNumber***| The maximum amount of sodium in milligrams the recipe can have. | [optional] 
 **minSugar** | **NSNumber***| The minimum amount of sugar in grams the recipe must have. | [optional] 
 **maxSugar** | **NSNumber***| The maximum amount of sugar in grams the recipe can have. | [optional] 
 **minZinc** | **NSNumber***| The minimum amount of zinc in milligrams the recipe must have. | [optional] 
 **maxZinc** | **NSNumber***| The maximum amount of zinc in milligrams the recipe can have. | [optional] 
 **offset** | **NSNumber***| The number of results to skip (between 0 and 900). | [optional] 
 **number** | **NSNumber***| The maximum number of items to return (between 1 and 100). Defaults to 10. | [optional] [default to @10]
 **random** | **NSNumber***| If true, every request will give you a random set of recipes within the requested limits. | [optional] 
 **limitLicense** | **NSNumber***| Whether the recipes should have an open license that allows display with proper attribution. | [optional] [default to @(YES)]

### Return type

[**OAISet<OAISearchRecipesByNutrients200ResponseInner>***](OAISearchRecipesByNutrients200ResponseInner.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **summarizeRecipe**
```objc
-(NSURLSessionTask*) summarizeRecipeWithId: (NSNumber*) _id
        completionHandler: (void (^)(OAISummarizeRecipe200Response* output, NSError* error)) handler;
```

Summarize Recipe

Automatically generate a short description that summarizes key information about the recipe.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Summarize Recipe
[apiInstance summarizeRecipeWithId:_id
          completionHandler: ^(OAISummarizeRecipe200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->summarizeRecipe: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 

### Return type

[**OAISummarizeRecipe200Response***](OAISummarizeRecipe200Response.md)

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **visualizeEquipment**
```objc
-(NSURLSessionTask*) visualizeEquipmentWithInstructions: (NSString*) instructions
    view: (NSString*) view
    defaultCss: (NSNumber*) defaultCss
    showBacklink: (NSNumber*) showBacklink
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Equipment Widget

Visualize the equipment used to make a recipe.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* instructions = @"instructions_example"; // The recipe's instructions.
NSString* view = @"view_example"; // How to visualize the ingredients, either 'grid' or 'list'. (optional)
NSNumber* defaultCss = @56; // Whether the default CSS should be added to the response. (optional)
NSNumber* showBacklink = @56; // Whether to show a backlink to spoonacular. If set false, this call counts against your quota. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Equipment Widget
[apiInstance visualizeEquipmentWithInstructions:instructions
              view:view
              defaultCss:defaultCss
              showBacklink:showBacklink
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->visualizeEquipment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instructions** | **NSString***| The recipe&#39;s instructions. | 
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

# **visualizePriceBreakdown**
```objc
-(NSURLSessionTask*) visualizePriceBreakdownWithIngredientList: (NSString*) ingredientList
    servings: (NSNumber*) servings
    language: (NSString*) language
    mode: (NSNumber*) mode
    defaultCss: (NSNumber*) defaultCss
    showBacklink: (NSNumber*) showBacklink
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Price Breakdown Widget

Visualize the price breakdown of a recipe.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* ingredientList = @"ingredientList_example"; // The ingredient list of the recipe, one ingredient per line.
NSNumber* servings = @56; // The number of servings.
NSString* language = en; // The language of the input. Either 'en' or 'de'. (optional)
NSNumber* mode = @56; // The mode in which the widget should be delivered. 1 = separate views (compact), 2 = all in one view (full). (optional)
NSNumber* defaultCss = @56; // Whether the default CSS should be added to the response. (optional)
NSNumber* showBacklink = @56; // Whether to show a backlink to spoonacular. If set false, this call counts against your quota. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Price Breakdown Widget
[apiInstance visualizePriceBreakdownWithIngredientList:ingredientList
              servings:servings
              language:language
              mode:mode
              defaultCss:defaultCss
              showBacklink:showBacklink
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->visualizePriceBreakdown: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingredientList** | **NSString***| The ingredient list of the recipe, one ingredient per line. | 
 **servings** | **NSNumber***| The number of servings. | 
 **language** | **NSString***| The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] 
 **mode** | **NSNumber***| The mode in which the widget should be delivered. 1 &#x3D; separate views (compact), 2 &#x3D; all in one view (full). | [optional] 
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

# **visualizeRecipeEquipmentByID**
```objc
-(NSURLSessionTask*) visualizeRecipeEquipmentByIDWithId: (NSNumber*) _id
    defaultCss: (NSNumber*) defaultCss
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Equipment by ID Widget

Visualize a recipe's equipment list.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.
NSNumber* defaultCss = false; // Whether the default CSS should be added to the response. (optional) (default to @(YES))

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Equipment by ID Widget
[apiInstance visualizeRecipeEquipmentByIDWithId:_id
              defaultCss:defaultCss
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->visualizeRecipeEquipmentByID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 
 **defaultCss** | **NSNumber***| Whether the default CSS should be added to the response. | [optional] [default to @(YES)]

### Return type

**NSString***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **visualizeRecipeIngredientsByID**
```objc
-(NSURLSessionTask*) visualizeRecipeIngredientsByIDWithId: (NSNumber*) _id
    defaultCss: (NSNumber*) defaultCss
    measure: (NSString*) measure
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Ingredients by ID Widget

Visualize a recipe's ingredient list.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.
NSNumber* defaultCss = false; // Whether the default CSS should be added to the response. (optional) (default to @(YES))
NSString* measure = metric; // Whether the the measures should be 'us' or 'metric'. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Ingredients by ID Widget
[apiInstance visualizeRecipeIngredientsByIDWithId:_id
              defaultCss:defaultCss
              measure:measure
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->visualizeRecipeIngredientsByID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 
 **defaultCss** | **NSNumber***| Whether the default CSS should be added to the response. | [optional] [default to @(YES)]
 **measure** | **NSString***| Whether the the measures should be &#39;us&#39; or &#39;metric&#39;. | [optional] 

### Return type

**NSString***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **visualizeRecipeNutrition**
```objc
-(NSURLSessionTask*) visualizeRecipeNutritionWithIngredientList: (NSString*) ingredientList
    servings: (NSNumber*) servings
    language: (NSString*) language
    defaultCss: (NSNumber*) defaultCss
    showBacklink: (NSNumber*) showBacklink
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Recipe Nutrition Widget

Visualize a recipe's nutritional information as HTML including CSS.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* ingredientList = @"ingredientList_example"; // The ingredient list of the recipe, one ingredient per line.
NSNumber* servings = @56; // The number of servings.
NSString* language = en; // The language of the input. Either 'en' or 'de'. (optional)
NSNumber* defaultCss = @56; // Whether the default CSS should be added to the response. (optional)
NSNumber* showBacklink = @56; // Whether to show a backlink to spoonacular. If set false, this call counts against your quota. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Recipe Nutrition Widget
[apiInstance visualizeRecipeNutritionWithIngredientList:ingredientList
              servings:servings
              language:language
              defaultCss:defaultCss
              showBacklink:showBacklink
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->visualizeRecipeNutrition: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingredientList** | **NSString***| The ingredient list of the recipe, one ingredient per line. | 
 **servings** | **NSNumber***| The number of servings. | 
 **language** | **NSString***| The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] 
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

# **visualizeRecipeNutritionByID**
```objc
-(NSURLSessionTask*) visualizeRecipeNutritionByIDWithId: (NSNumber*) _id
    defaultCss: (NSNumber*) defaultCss
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Recipe Nutrition by ID Widget

Visualize a recipe's nutritional information as HTML including CSS.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.
NSNumber* defaultCss = false; // Whether the default CSS should be added to the response. (optional) (default to @(YES))

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Recipe Nutrition by ID Widget
[apiInstance visualizeRecipeNutritionByIDWithId:_id
              defaultCss:defaultCss
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->visualizeRecipeNutritionByID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 
 **defaultCss** | **NSNumber***| Whether the default CSS should be added to the response. | [optional] [default to @(YES)]

### Return type

**NSString***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **visualizeRecipePriceBreakdownByID**
```objc
-(NSURLSessionTask*) visualizeRecipePriceBreakdownByIDWithId: (NSNumber*) _id
    defaultCss: (NSNumber*) defaultCss
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Price Breakdown by ID Widget

Visualize a recipe's price breakdown.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.
NSNumber* defaultCss = false; // Whether the default CSS should be added to the response. (optional) (default to @(YES))

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Price Breakdown by ID Widget
[apiInstance visualizeRecipePriceBreakdownByIDWithId:_id
              defaultCss:defaultCss
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->visualizeRecipePriceBreakdownByID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 
 **defaultCss** | **NSNumber***| Whether the default CSS should be added to the response. | [optional] [default to @(YES)]

### Return type

**NSString***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **visualizeRecipeTaste**
```objc
-(NSURLSessionTask*) visualizeRecipeTasteWithIngredientList: (NSString*) ingredientList
    language: (NSString*) language
    normalize: (NSNumber*) normalize
    rgb: (NSString*) rgb
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Recipe Taste Widget

Visualize a recipe's taste information as HTML including CSS. You can play around with that endpoint!

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSString* ingredientList = @"ingredientList_example"; // The ingredient list of the recipe, one ingredient per line.
NSString* language = en; // The language of the input. Either 'en' or 'de'. (optional)
NSNumber* normalize = @56; // Normalize to the strongest taste. (optional)
NSString* rgb = @"rgb_example"; // Red, green, blue values for the chart color. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Recipe Taste Widget
[apiInstance visualizeRecipeTasteWithIngredientList:ingredientList
              language:language
              normalize:normalize
              rgb:rgb
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->visualizeRecipeTaste: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingredientList** | **NSString***| The ingredient list of the recipe, one ingredient per line. | 
 **language** | **NSString***| The language of the input. Either &#39;en&#39; or &#39;de&#39;. | [optional] 
 **normalize** | **NSNumber***| Normalize to the strongest taste. | [optional] 
 **rgb** | **NSString***| Red, green, blue values for the chart color. | [optional] 

### Return type

**NSString***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **visualizeRecipeTasteByID**
```objc
-(NSURLSessionTask*) visualizeRecipeTasteByIDWithId: (NSNumber*) _id
    normalize: (NSNumber*) normalize
    rgb: (NSString*) rgb
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Recipe Taste by ID Widget

Get a recipe's taste. The tastes supported are sweet, salty, sour, bitter, savory, and fatty.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: apiKeyScheme)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"x-api-key"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"x-api-key"];


NSNumber* _id = 1; // The item's id.
NSNumber* normalize = true; // Whether to normalize to the strongest taste. (optional) (default to @(YES))
NSString* rgb = 75,192,192; // Red, green, blue values for the chart color. (optional)

OAIRecipesApi*apiInstance = [[OAIRecipesApi alloc] init];

// Recipe Taste by ID Widget
[apiInstance visualizeRecipeTasteByIDWithId:_id
              normalize:normalize
              rgb:rgb
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRecipesApi->visualizeRecipeTasteByID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| The item&#39;s id. | 
 **normalize** | **NSNumber***| Whether to normalize to the strongest taste. | [optional] [default to @(YES)]
 **rgb** | **NSString***| Red, green, blue values for the chart color. | [optional] 

### Return type

**NSString***

### Authorization

[apiKeyScheme](../README.md#apiKeyScheme)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

