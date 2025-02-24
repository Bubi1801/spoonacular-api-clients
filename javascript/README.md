# spoonacular_api

SpoonacularApi - JavaScript client for spoonacular_api
The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.

Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.1
- Package version: 1.1
- Build package: org.openapitools.codegen.languages.JavascriptClientCodegen
For more information, please visit [https://spoonacular.com/contact](https://spoonacular.com/contact)

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/), please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install spoonacular_api --save
```

Finally, you need to build the module:

```shell
npm run build
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

To use the link you just defined in your project, switch to the directory you want to use your spoonacular_api from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

Finally, you need to build the module:

```shell
npm run build
```

#### git

If the library is hosted at a git repository, e.g.https://github.com/GIT_USER_ID/spoonacular-api-clients/tree/master/javascript/
then install it via:

```shell
    npm install GIT_USER_ID/spoonacular-api-clients/tree/master/javascript/ --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var SpoonacularApi = require('spoonacular_api');

var defaultClient = SpoonacularApi.ApiClient.instance;
// Configure API key authorization: apiKeyScheme
var apiKeyScheme = defaultClient.authentications['apiKeyScheme'];
apiKeyScheme.apiKey = "YOUR API KEY"
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyScheme.apiKeyPrefix['x-api-key'] = "Token"

var api = new SpoonacularApi.DefaultApi()
var analyzeRecipeRequest = {"title":"Spaghetti Carbonara","servings":2,"ingredients":["1 lb spaghetti","3.5 oz pancetta","2 Tbsps olive oil","1  egg","0.5 cup parmesan cheese"],"instructions":"Bring a large pot of water to a boil and season generously with salt. Add the pasta to the water once boiling and cook until al dente. Reserve 2 cups of cooking water and drain the pasta. "}; // {AnalyzeRecipeRequest} Example request body.
var opts = {
  'language': en, // {String} The input language, either \"en\" or \"de\".
  'includeNutrition': false, // {Boolean} Whether nutrition data should be added to correctly parsed ingredients.
  'includeTaste': false // {Boolean} Whether taste data should be added to correctly parsed ingredients.
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.analyzeRecipe(analyzeRecipeRequest, opts, callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://api.spoonacular.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SpoonacularApi.DefaultApi* | [**analyzeRecipe**](docs/DefaultApi.md#analyzeRecipe) | **POST** /recipes/analyze | Analyze Recipe
*SpoonacularApi.DefaultApi* | [**createRecipeCardGet**](docs/DefaultApi.md#createRecipeCardGet) | **GET** /recipes/{id}/card | Create Recipe Card
*SpoonacularApi.DefaultApi* | [**searchRestaurants**](docs/DefaultApi.md#searchRestaurants) | **GET** /food/restaurants/search | Search Restaurants
*SpoonacularApi.IngredientsApi* | [**autocompleteIngredientSearch**](docs/IngredientsApi.md#autocompleteIngredientSearch) | **GET** /food/ingredients/autocomplete | Autocomplete Ingredient Search
*SpoonacularApi.IngredientsApi* | [**computeIngredientAmount**](docs/IngredientsApi.md#computeIngredientAmount) | **GET** /food/ingredients/{id}/amount | Compute Ingredient Amount
*SpoonacularApi.IngredientsApi* | [**getIngredientInformation**](docs/IngredientsApi.md#getIngredientInformation) | **GET** /food/ingredients/{id}/information | Get Ingredient Information
*SpoonacularApi.IngredientsApi* | [**getIngredientSubstitutes**](docs/IngredientsApi.md#getIngredientSubstitutes) | **GET** /food/ingredients/substitutes | Get Ingredient Substitutes
*SpoonacularApi.IngredientsApi* | [**getIngredientSubstitutesByID**](docs/IngredientsApi.md#getIngredientSubstitutesByID) | **GET** /food/ingredients/{id}/substitutes | Get Ingredient Substitutes by ID
*SpoonacularApi.IngredientsApi* | [**ingredientSearch**](docs/IngredientsApi.md#ingredientSearch) | **GET** /food/ingredients/search | Ingredient Search
*SpoonacularApi.IngredientsApi* | [**ingredientsByIDImage**](docs/IngredientsApi.md#ingredientsByIDImage) | **GET** /recipes/{id}/ingredientWidget.png | Ingredients by ID Image
*SpoonacularApi.IngredientsApi* | [**mapIngredientsToGroceryProducts**](docs/IngredientsApi.md#mapIngredientsToGroceryProducts) | **POST** /food/ingredients/map | Map Ingredients to Grocery Products
*SpoonacularApi.IngredientsApi* | [**visualizeIngredients**](docs/IngredientsApi.md#visualizeIngredients) | **POST** /recipes/visualizeIngredients | Ingredients Widget
*SpoonacularApi.MealPlanningApi* | [**addMealPlanTemplate**](docs/MealPlanningApi.md#addMealPlanTemplate) | **POST** /mealplanner/{username}/templates | Add Meal Plan Template
*SpoonacularApi.MealPlanningApi* | [**addToMealPlan**](docs/MealPlanningApi.md#addToMealPlan) | **POST** /mealplanner/{username}/items | Add to Meal Plan
*SpoonacularApi.MealPlanningApi* | [**addToShoppingList**](docs/MealPlanningApi.md#addToShoppingList) | **POST** /mealplanner/{username}/shopping-list/items | Add to Shopping List
*SpoonacularApi.MealPlanningApi* | [**clearMealPlanDay**](docs/MealPlanningApi.md#clearMealPlanDay) | **DELETE** /mealplanner/{username}/day/{date} | Clear Meal Plan Day
*SpoonacularApi.MealPlanningApi* | [**connectUser**](docs/MealPlanningApi.md#connectUser) | **POST** /users/connect | Connect User
*SpoonacularApi.MealPlanningApi* | [**deleteFromMealPlan**](docs/MealPlanningApi.md#deleteFromMealPlan) | **DELETE** /mealplanner/{username}/items/{id} | Delete from Meal Plan
*SpoonacularApi.MealPlanningApi* | [**deleteFromShoppingList**](docs/MealPlanningApi.md#deleteFromShoppingList) | **DELETE** /mealplanner/{username}/shopping-list/items/{id} | Delete from Shopping List
*SpoonacularApi.MealPlanningApi* | [**deleteMealPlanTemplate**](docs/MealPlanningApi.md#deleteMealPlanTemplate) | **DELETE** /mealplanner/{username}/templates/{id} | Delete Meal Plan Template
*SpoonacularApi.MealPlanningApi* | [**generateMealPlan**](docs/MealPlanningApi.md#generateMealPlan) | **GET** /mealplanner/generate | Generate Meal Plan
*SpoonacularApi.MealPlanningApi* | [**generateShoppingList**](docs/MealPlanningApi.md#generateShoppingList) | **POST** /mealplanner/{username}/shopping-list/{start_date}/{end_date} | Generate Shopping List
*SpoonacularApi.MealPlanningApi* | [**getMealPlanTemplate**](docs/MealPlanningApi.md#getMealPlanTemplate) | **GET** /mealplanner/{username}/templates/{id} | Get Meal Plan Template
*SpoonacularApi.MealPlanningApi* | [**getMealPlanTemplates**](docs/MealPlanningApi.md#getMealPlanTemplates) | **GET** /mealplanner/{username}/templates | Get Meal Plan Templates
*SpoonacularApi.MealPlanningApi* | [**getMealPlanWeek**](docs/MealPlanningApi.md#getMealPlanWeek) | **GET** /mealplanner/{username}/week/{start_date} | Get Meal Plan Week
*SpoonacularApi.MealPlanningApi* | [**getShoppingList**](docs/MealPlanningApi.md#getShoppingList) | **GET** /mealplanner/{username}/shopping-list | Get Shopping List
*SpoonacularApi.MenuItemsApi* | [**autocompleteMenuItemSearch**](docs/MenuItemsApi.md#autocompleteMenuItemSearch) | **GET** /food/menuItems/suggest | Autocomplete Menu Item Search
*SpoonacularApi.MenuItemsApi* | [**getMenuItemInformation**](docs/MenuItemsApi.md#getMenuItemInformation) | **GET** /food/menuItems/{id} | Get Menu Item Information
*SpoonacularApi.MenuItemsApi* | [**menuItemNutritionByIDImage**](docs/MenuItemsApi.md#menuItemNutritionByIDImage) | **GET** /food/menuItems/{id}/nutritionWidget.png | Menu Item Nutrition by ID Image
*SpoonacularApi.MenuItemsApi* | [**menuItemNutritionLabelImage**](docs/MenuItemsApi.md#menuItemNutritionLabelImage) | **GET** /food/menuItems/{id}/nutritionLabel.png | Menu Item Nutrition Label Image
*SpoonacularApi.MenuItemsApi* | [**menuItemNutritionLabelWidget**](docs/MenuItemsApi.md#menuItemNutritionLabelWidget) | **GET** /food/menuItems/{id}/nutritionLabel | Menu Item Nutrition Label Widget
*SpoonacularApi.MenuItemsApi* | [**searchMenuItems**](docs/MenuItemsApi.md#searchMenuItems) | **GET** /food/menuItems/search | Search Menu Items
*SpoonacularApi.MenuItemsApi* | [**visualizeMenuItemNutritionByID**](docs/MenuItemsApi.md#visualizeMenuItemNutritionByID) | **GET** /food/menuItems/{id}/nutritionWidget | Menu Item Nutrition by ID Widget
*SpoonacularApi.MiscApi* | [**detectFoodInText**](docs/MiscApi.md#detectFoodInText) | **POST** /food/detect | Detect Food in Text
*SpoonacularApi.MiscApi* | [**getARandomFoodJoke**](docs/MiscApi.md#getARandomFoodJoke) | **GET** /food/jokes/random | Random Food Joke
*SpoonacularApi.MiscApi* | [**getConversationSuggests**](docs/MiscApi.md#getConversationSuggests) | **GET** /food/converse/suggest | Conversation Suggests
*SpoonacularApi.MiscApi* | [**getRandomFoodTrivia**](docs/MiscApi.md#getRandomFoodTrivia) | **GET** /food/trivia/random | Random Food Trivia
*SpoonacularApi.MiscApi* | [**imageAnalysisByURL**](docs/MiscApi.md#imageAnalysisByURL) | **GET** /food/images/analyze | Image Analysis by URL
*SpoonacularApi.MiscApi* | [**imageClassificationByURL**](docs/MiscApi.md#imageClassificationByURL) | **GET** /food/images/classify | Image Classification by URL
*SpoonacularApi.MiscApi* | [**searchAllFood**](docs/MiscApi.md#searchAllFood) | **GET** /food/search | Search All Food
*SpoonacularApi.MiscApi* | [**searchCustomFoods**](docs/MiscApi.md#searchCustomFoods) | **GET** /food/customFoods/search | Search Custom Foods
*SpoonacularApi.MiscApi* | [**searchFoodVideos**](docs/MiscApi.md#searchFoodVideos) | **GET** /food/videos/search | Search Food Videos
*SpoonacularApi.MiscApi* | [**searchSiteContent**](docs/MiscApi.md#searchSiteContent) | **GET** /food/site/search | Search Site Content
*SpoonacularApi.MiscApi* | [**talkToChatbot**](docs/MiscApi.md#talkToChatbot) | **GET** /food/converse | Talk to Chatbot
*SpoonacularApi.ProductsApi* | [**autocompleteProductSearch**](docs/ProductsApi.md#autocompleteProductSearch) | **GET** /food/products/suggest | Autocomplete Product Search
*SpoonacularApi.ProductsApi* | [**classifyGroceryProduct**](docs/ProductsApi.md#classifyGroceryProduct) | **POST** /food/products/classify | Classify Grocery Product
*SpoonacularApi.ProductsApi* | [**classifyGroceryProductBulk**](docs/ProductsApi.md#classifyGroceryProductBulk) | **POST** /food/products/classifyBatch | Classify Grocery Product Bulk
*SpoonacularApi.ProductsApi* | [**getComparableProducts**](docs/ProductsApi.md#getComparableProducts) | **GET** /food/products/upc/{upc}/comparable | Get Comparable Products
*SpoonacularApi.ProductsApi* | [**getProductInformation**](docs/ProductsApi.md#getProductInformation) | **GET** /food/products/{id} | Get Product Information
*SpoonacularApi.ProductsApi* | [**productNutritionByIDImage**](docs/ProductsApi.md#productNutritionByIDImage) | **GET** /food/products/{id}/nutritionWidget.png | Product Nutrition by ID Image
*SpoonacularApi.ProductsApi* | [**productNutritionLabelImage**](docs/ProductsApi.md#productNutritionLabelImage) | **GET** /food/products/{id}/nutritionLabel.png | Product Nutrition Label Image
*SpoonacularApi.ProductsApi* | [**productNutritionLabelWidget**](docs/ProductsApi.md#productNutritionLabelWidget) | **GET** /food/products/{id}/nutritionLabel | Product Nutrition Label Widget
*SpoonacularApi.ProductsApi* | [**searchGroceryProducts**](docs/ProductsApi.md#searchGroceryProducts) | **GET** /food/products/search | Search Grocery Products
*SpoonacularApi.ProductsApi* | [**searchGroceryProductsByUPC**](docs/ProductsApi.md#searchGroceryProductsByUPC) | **GET** /food/products/upc/{upc} | Search Grocery Products by UPC
*SpoonacularApi.ProductsApi* | [**visualizeProductNutritionByID**](docs/ProductsApi.md#visualizeProductNutritionByID) | **GET** /food/products/{id}/nutritionWidget | Product Nutrition by ID Widget
*SpoonacularApi.RecipesApi* | [**analyzeARecipeSearchQuery**](docs/RecipesApi.md#analyzeARecipeSearchQuery) | **GET** /recipes/queries/analyze | Analyze a Recipe Search Query
*SpoonacularApi.RecipesApi* | [**analyzeRecipeInstructions**](docs/RecipesApi.md#analyzeRecipeInstructions) | **POST** /recipes/analyzeInstructions | Analyze Recipe Instructions
*SpoonacularApi.RecipesApi* | [**autocompleteRecipeSearch**](docs/RecipesApi.md#autocompleteRecipeSearch) | **GET** /recipes/autocomplete | Autocomplete Recipe Search
*SpoonacularApi.RecipesApi* | [**classifyCuisine**](docs/RecipesApi.md#classifyCuisine) | **POST** /recipes/cuisine | Classify Cuisine
*SpoonacularApi.RecipesApi* | [**computeGlycemicLoad**](docs/RecipesApi.md#computeGlycemicLoad) | **POST** /food/ingredients/glycemicLoad | Compute Glycemic Load
*SpoonacularApi.RecipesApi* | [**convertAmounts**](docs/RecipesApi.md#convertAmounts) | **GET** /recipes/convert | Convert Amounts
*SpoonacularApi.RecipesApi* | [**createRecipeCard**](docs/RecipesApi.md#createRecipeCard) | **POST** /recipes/visualizeRecipe | Create Recipe Card
*SpoonacularApi.RecipesApi* | [**equipmentByIDImage**](docs/RecipesApi.md#equipmentByIDImage) | **GET** /recipes/{id}/equipmentWidget.png | Equipment by ID Image
*SpoonacularApi.RecipesApi* | [**extractRecipeFromWebsite**](docs/RecipesApi.md#extractRecipeFromWebsite) | **GET** /recipes/extract | Extract Recipe from Website
*SpoonacularApi.RecipesApi* | [**getAnalyzedRecipeInstructions**](docs/RecipesApi.md#getAnalyzedRecipeInstructions) | **GET** /recipes/{id}/analyzedInstructions | Get Analyzed Recipe Instructions
*SpoonacularApi.RecipesApi* | [**getRandomRecipes**](docs/RecipesApi.md#getRandomRecipes) | **GET** /recipes/random | Get Random Recipes
*SpoonacularApi.RecipesApi* | [**getRecipeEquipmentByID**](docs/RecipesApi.md#getRecipeEquipmentByID) | **GET** /recipes/{id}/equipmentWidget.json | Equipment by ID
*SpoonacularApi.RecipesApi* | [**getRecipeInformation**](docs/RecipesApi.md#getRecipeInformation) | **GET** /recipes/{id}/information | Get Recipe Information
*SpoonacularApi.RecipesApi* | [**getRecipeInformationBulk**](docs/RecipesApi.md#getRecipeInformationBulk) | **GET** /recipes/informationBulk | Get Recipe Information Bulk
*SpoonacularApi.RecipesApi* | [**getRecipeIngredientsByID**](docs/RecipesApi.md#getRecipeIngredientsByID) | **GET** /recipes/{id}/ingredientWidget.json | Ingredients by ID
*SpoonacularApi.RecipesApi* | [**getRecipeNutritionWidgetByID**](docs/RecipesApi.md#getRecipeNutritionWidgetByID) | **GET** /recipes/{id}/nutritionWidget.json | Nutrition by ID
*SpoonacularApi.RecipesApi* | [**getRecipePriceBreakdownByID**](docs/RecipesApi.md#getRecipePriceBreakdownByID) | **GET** /recipes/{id}/priceBreakdownWidget.json | Price Breakdown by ID
*SpoonacularApi.RecipesApi* | [**getRecipeTasteByID**](docs/RecipesApi.md#getRecipeTasteByID) | **GET** /recipes/{id}/tasteWidget.json | Taste by ID
*SpoonacularApi.RecipesApi* | [**getSimilarRecipes**](docs/RecipesApi.md#getSimilarRecipes) | **GET** /recipes/{id}/similar | Get Similar Recipes
*SpoonacularApi.RecipesApi* | [**guessNutritionByDishName**](docs/RecipesApi.md#guessNutritionByDishName) | **GET** /recipes/guessNutrition | Guess Nutrition by Dish Name
*SpoonacularApi.RecipesApi* | [**parseIngredients**](docs/RecipesApi.md#parseIngredients) | **POST** /recipes/parseIngredients | Parse Ingredients
*SpoonacularApi.RecipesApi* | [**priceBreakdownByIDImage**](docs/RecipesApi.md#priceBreakdownByIDImage) | **GET** /recipes/{id}/priceBreakdownWidget.png | Price Breakdown by ID Image
*SpoonacularApi.RecipesApi* | [**quickAnswer**](docs/RecipesApi.md#quickAnswer) | **GET** /recipes/quickAnswer | Quick Answer
*SpoonacularApi.RecipesApi* | [**recipeNutritionByIDImage**](docs/RecipesApi.md#recipeNutritionByIDImage) | **GET** /recipes/{id}/nutritionWidget.png | Recipe Nutrition by ID Image
*SpoonacularApi.RecipesApi* | [**recipeNutritionLabelImage**](docs/RecipesApi.md#recipeNutritionLabelImage) | **GET** /recipes/{id}/nutritionLabel.png | Recipe Nutrition Label Image
*SpoonacularApi.RecipesApi* | [**recipeNutritionLabelWidget**](docs/RecipesApi.md#recipeNutritionLabelWidget) | **GET** /recipes/{id}/nutritionLabel | Recipe Nutrition Label Widget
*SpoonacularApi.RecipesApi* | [**recipeTasteByIDImage**](docs/RecipesApi.md#recipeTasteByIDImage) | **GET** /recipes/{id}/tasteWidget.png | Recipe Taste by ID Image
*SpoonacularApi.RecipesApi* | [**searchRecipes**](docs/RecipesApi.md#searchRecipes) | **GET** /recipes/complexSearch | Search Recipes
*SpoonacularApi.RecipesApi* | [**searchRecipesByIngredients**](docs/RecipesApi.md#searchRecipesByIngredients) | **GET** /recipes/findByIngredients | Search Recipes by Ingredients
*SpoonacularApi.RecipesApi* | [**searchRecipesByNutrients**](docs/RecipesApi.md#searchRecipesByNutrients) | **GET** /recipes/findByNutrients | Search Recipes by Nutrients
*SpoonacularApi.RecipesApi* | [**summarizeRecipe**](docs/RecipesApi.md#summarizeRecipe) | **GET** /recipes/{id}/summary | Summarize Recipe
*SpoonacularApi.RecipesApi* | [**visualizeEquipment**](docs/RecipesApi.md#visualizeEquipment) | **POST** /recipes/visualizeEquipment | Equipment Widget
*SpoonacularApi.RecipesApi* | [**visualizePriceBreakdown**](docs/RecipesApi.md#visualizePriceBreakdown) | **POST** /recipes/visualizePriceEstimator | Price Breakdown Widget
*SpoonacularApi.RecipesApi* | [**visualizeRecipeEquipmentByID**](docs/RecipesApi.md#visualizeRecipeEquipmentByID) | **GET** /recipes/{id}/equipmentWidget | Equipment by ID Widget
*SpoonacularApi.RecipesApi* | [**visualizeRecipeIngredientsByID**](docs/RecipesApi.md#visualizeRecipeIngredientsByID) | **GET** /recipes/{id}/ingredientWidget | Ingredients by ID Widget
*SpoonacularApi.RecipesApi* | [**visualizeRecipeNutrition**](docs/RecipesApi.md#visualizeRecipeNutrition) | **POST** /recipes/visualizeNutrition | Recipe Nutrition Widget
*SpoonacularApi.RecipesApi* | [**visualizeRecipeNutritionByID**](docs/RecipesApi.md#visualizeRecipeNutritionByID) | **GET** /recipes/{id}/nutritionWidget | Recipe Nutrition by ID Widget
*SpoonacularApi.RecipesApi* | [**visualizeRecipePriceBreakdownByID**](docs/RecipesApi.md#visualizeRecipePriceBreakdownByID) | **GET** /recipes/{id}/priceBreakdownWidget | Price Breakdown by ID Widget
*SpoonacularApi.RecipesApi* | [**visualizeRecipeTaste**](docs/RecipesApi.md#visualizeRecipeTaste) | **POST** /recipes/visualizeTaste | Recipe Taste Widget
*SpoonacularApi.RecipesApi* | [**visualizeRecipeTasteByID**](docs/RecipesApi.md#visualizeRecipeTasteByID) | **GET** /recipes/{id}/tasteWidget | Recipe Taste by ID Widget
*SpoonacularApi.WineApi* | [**getDishPairingForWine**](docs/WineApi.md#getDishPairingForWine) | **GET** /food/wine/dishes | Dish Pairing for Wine
*SpoonacularApi.WineApi* | [**getWineDescription**](docs/WineApi.md#getWineDescription) | **GET** /food/wine/description | Wine Description
*SpoonacularApi.WineApi* | [**getWinePairing**](docs/WineApi.md#getWinePairing) | **GET** /food/wine/pairing | Wine Pairing
*SpoonacularApi.WineApi* | [**getWineRecommendation**](docs/WineApi.md#getWineRecommendation) | **GET** /food/wine/recommendation | Wine Recommendation


## Documentation for Models

 - [SpoonacularApi.AddMealPlanTemplate200Response](docs/AddMealPlanTemplate200Response.md)
 - [SpoonacularApi.AddMealPlanTemplate200ResponseItemsInner](docs/AddMealPlanTemplate200ResponseItemsInner.md)
 - [SpoonacularApi.AddMealPlanTemplate200ResponseItemsInnerValue](docs/AddMealPlanTemplate200ResponseItemsInnerValue.md)
 - [SpoonacularApi.AddToMealPlanRequest](docs/AddToMealPlanRequest.md)
 - [SpoonacularApi.AddToMealPlanRequestValue](docs/AddToMealPlanRequestValue.md)
 - [SpoonacularApi.AddToMealPlanRequestValueIngredientsInner](docs/AddToMealPlanRequestValueIngredientsInner.md)
 - [SpoonacularApi.AddToShoppingListRequest](docs/AddToShoppingListRequest.md)
 - [SpoonacularApi.AnalyzeARecipeSearchQuery200Response](docs/AnalyzeARecipeSearchQuery200Response.md)
 - [SpoonacularApi.AnalyzeARecipeSearchQuery200ResponseDishesInner](docs/AnalyzeARecipeSearchQuery200ResponseDishesInner.md)
 - [SpoonacularApi.AnalyzeARecipeSearchQuery200ResponseIngredientsInner](docs/AnalyzeARecipeSearchQuery200ResponseIngredientsInner.md)
 - [SpoonacularApi.AnalyzeRecipeInstructions200Response](docs/AnalyzeRecipeInstructions200Response.md)
 - [SpoonacularApi.AnalyzeRecipeInstructions200ResponseIngredientsInner](docs/AnalyzeRecipeInstructions200ResponseIngredientsInner.md)
 - [SpoonacularApi.AnalyzeRecipeInstructions200ResponseParsedInstructionsInner](docs/AnalyzeRecipeInstructions200ResponseParsedInstructionsInner.md)
 - [SpoonacularApi.AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner](docs/AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.md)
 - [SpoonacularApi.AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner](docs/AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner.md)
 - [SpoonacularApi.AnalyzeRecipeRequest](docs/AnalyzeRecipeRequest.md)
 - [SpoonacularApi.AutocompleteIngredientSearch200ResponseInner](docs/AutocompleteIngredientSearch200ResponseInner.md)
 - [SpoonacularApi.AutocompleteMenuItemSearch200Response](docs/AutocompleteMenuItemSearch200Response.md)
 - [SpoonacularApi.AutocompleteProductSearch200Response](docs/AutocompleteProductSearch200Response.md)
 - [SpoonacularApi.AutocompleteProductSearch200ResponseResultsInner](docs/AutocompleteProductSearch200ResponseResultsInner.md)
 - [SpoonacularApi.AutocompleteRecipeSearch200ResponseInner](docs/AutocompleteRecipeSearch200ResponseInner.md)
 - [SpoonacularApi.ClassifyCuisine200Response](docs/ClassifyCuisine200Response.md)
 - [SpoonacularApi.ClassifyGroceryProduct200Response](docs/ClassifyGroceryProduct200Response.md)
 - [SpoonacularApi.ClassifyGroceryProductBulk200ResponseInner](docs/ClassifyGroceryProductBulk200ResponseInner.md)
 - [SpoonacularApi.ClassifyGroceryProductBulkRequestInner](docs/ClassifyGroceryProductBulkRequestInner.md)
 - [SpoonacularApi.ClassifyGroceryProductRequest](docs/ClassifyGroceryProductRequest.md)
 - [SpoonacularApi.ComputeGlycemicLoad200Response](docs/ComputeGlycemicLoad200Response.md)
 - [SpoonacularApi.ComputeGlycemicLoad200ResponseIngredientsInner](docs/ComputeGlycemicLoad200ResponseIngredientsInner.md)
 - [SpoonacularApi.ComputeGlycemicLoadRequest](docs/ComputeGlycemicLoadRequest.md)
 - [SpoonacularApi.ComputeIngredientAmount200Response](docs/ComputeIngredientAmount200Response.md)
 - [SpoonacularApi.ConnectUser200Response](docs/ConnectUser200Response.md)
 - [SpoonacularApi.ConnectUserRequest](docs/ConnectUserRequest.md)
 - [SpoonacularApi.ConvertAmounts200Response](docs/ConvertAmounts200Response.md)
 - [SpoonacularApi.CreateRecipeCard200Response](docs/CreateRecipeCard200Response.md)
 - [SpoonacularApi.DetectFoodInText200Response](docs/DetectFoodInText200Response.md)
 - [SpoonacularApi.DetectFoodInText200ResponseAnnotationsInner](docs/DetectFoodInText200ResponseAnnotationsInner.md)
 - [SpoonacularApi.GenerateMealPlan200Response](docs/GenerateMealPlan200Response.md)
 - [SpoonacularApi.GenerateMealPlan200ResponseNutrients](docs/GenerateMealPlan200ResponseNutrients.md)
 - [SpoonacularApi.GenerateShoppingList200Response](docs/GenerateShoppingList200Response.md)
 - [SpoonacularApi.GetARandomFoodJoke200Response](docs/GetARandomFoodJoke200Response.md)
 - [SpoonacularApi.GetAnalyzedRecipeInstructions200Response](docs/GetAnalyzedRecipeInstructions200Response.md)
 - [SpoonacularApi.GetAnalyzedRecipeInstructions200ResponseIngredientsInner](docs/GetAnalyzedRecipeInstructions200ResponseIngredientsInner.md)
 - [SpoonacularApi.GetAnalyzedRecipeInstructions200ResponseParsedInstructionsInner](docs/GetAnalyzedRecipeInstructions200ResponseParsedInstructionsInner.md)
 - [SpoonacularApi.GetAnalyzedRecipeInstructions200ResponseParsedInstructionsInnerStepsInner](docs/GetAnalyzedRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.md)
 - [SpoonacularApi.GetAnalyzedRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner](docs/GetAnalyzedRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner.md)
 - [SpoonacularApi.GetComparableProducts200Response](docs/GetComparableProducts200Response.md)
 - [SpoonacularApi.GetComparableProducts200ResponseComparableProducts](docs/GetComparableProducts200ResponseComparableProducts.md)
 - [SpoonacularApi.GetComparableProducts200ResponseComparableProductsProteinInner](docs/GetComparableProducts200ResponseComparableProductsProteinInner.md)
 - [SpoonacularApi.GetConversationSuggests200Response](docs/GetConversationSuggests200Response.md)
 - [SpoonacularApi.GetConversationSuggests200ResponseSuggests](docs/GetConversationSuggests200ResponseSuggests.md)
 - [SpoonacularApi.GetConversationSuggests200ResponseSuggestsInner](docs/GetConversationSuggests200ResponseSuggestsInner.md)
 - [SpoonacularApi.GetDishPairingForWine200Response](docs/GetDishPairingForWine200Response.md)
 - [SpoonacularApi.GetIngredientInformation200Response](docs/GetIngredientInformation200Response.md)
 - [SpoonacularApi.GetIngredientInformation200ResponseNutrition](docs/GetIngredientInformation200ResponseNutrition.md)
 - [SpoonacularApi.GetIngredientSubstitutes200Response](docs/GetIngredientSubstitutes200Response.md)
 - [SpoonacularApi.GetMealPlanTemplate200Response](docs/GetMealPlanTemplate200Response.md)
 - [SpoonacularApi.GetMealPlanTemplate200ResponseDaysInner](docs/GetMealPlanTemplate200ResponseDaysInner.md)
 - [SpoonacularApi.GetMealPlanTemplate200ResponseDaysInnerItemsInner](docs/GetMealPlanTemplate200ResponseDaysInnerItemsInner.md)
 - [SpoonacularApi.GetMealPlanTemplate200ResponseDaysInnerItemsInnerValue](docs/GetMealPlanTemplate200ResponseDaysInnerItemsInnerValue.md)
 - [SpoonacularApi.GetMealPlanTemplates200Response](docs/GetMealPlanTemplates200Response.md)
 - [SpoonacularApi.GetMealPlanWeek200Response](docs/GetMealPlanWeek200Response.md)
 - [SpoonacularApi.GetMealPlanWeek200ResponseDaysInner](docs/GetMealPlanWeek200ResponseDaysInner.md)
 - [SpoonacularApi.GetMealPlanWeek200ResponseDaysInnerItemsInner](docs/GetMealPlanWeek200ResponseDaysInnerItemsInner.md)
 - [SpoonacularApi.GetMealPlanWeek200ResponseDaysInnerItemsInnerValue](docs/GetMealPlanWeek200ResponseDaysInnerItemsInnerValue.md)
 - [SpoonacularApi.GetMealPlanWeek200ResponseDaysInnerNutritionSummary](docs/GetMealPlanWeek200ResponseDaysInnerNutritionSummary.md)
 - [SpoonacularApi.GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner](docs/GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner.md)
 - [SpoonacularApi.GetMenuItemInformation200Response](docs/GetMenuItemInformation200Response.md)
 - [SpoonacularApi.GetProductInformation200Response](docs/GetProductInformation200Response.md)
 - [SpoonacularApi.GetProductInformation200ResponseIngredientsInner](docs/GetProductInformation200ResponseIngredientsInner.md)
 - [SpoonacularApi.GetRandomFoodTrivia200Response](docs/GetRandomFoodTrivia200Response.md)
 - [SpoonacularApi.GetRandomRecipes200Response](docs/GetRandomRecipes200Response.md)
 - [SpoonacularApi.GetRandomRecipes200ResponseRecipesInner](docs/GetRandomRecipes200ResponseRecipesInner.md)
 - [SpoonacularApi.GetRecipeEquipmentByID200Response](docs/GetRecipeEquipmentByID200Response.md)
 - [SpoonacularApi.GetRecipeEquipmentByID200ResponseEquipmentInner](docs/GetRecipeEquipmentByID200ResponseEquipmentInner.md)
 - [SpoonacularApi.GetRecipeInformation200Response](docs/GetRecipeInformation200Response.md)
 - [SpoonacularApi.GetRecipeInformation200ResponseExtendedIngredientsInner](docs/GetRecipeInformation200ResponseExtendedIngredientsInner.md)
 - [SpoonacularApi.GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures](docs/GetRecipeInformation200ResponseExtendedIngredientsInnerMeasures.md)
 - [SpoonacularApi.GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric](docs/GetRecipeInformation200ResponseExtendedIngredientsInnerMeasuresMetric.md)
 - [SpoonacularApi.GetRecipeInformation200ResponseWinePairing](docs/GetRecipeInformation200ResponseWinePairing.md)
 - [SpoonacularApi.GetRecipeInformation200ResponseWinePairingProductMatchesInner](docs/GetRecipeInformation200ResponseWinePairingProductMatchesInner.md)
 - [SpoonacularApi.GetRecipeInformationBulk200ResponseInner](docs/GetRecipeInformationBulk200ResponseInner.md)
 - [SpoonacularApi.GetRecipeIngredientsByID200Response](docs/GetRecipeIngredientsByID200Response.md)
 - [SpoonacularApi.GetRecipeIngredientsByID200ResponseIngredientsInner](docs/GetRecipeIngredientsByID200ResponseIngredientsInner.md)
 - [SpoonacularApi.GetRecipeNutritionWidgetByID200Response](docs/GetRecipeNutritionWidgetByID200Response.md)
 - [SpoonacularApi.GetRecipeNutritionWidgetByID200ResponseBadInner](docs/GetRecipeNutritionWidgetByID200ResponseBadInner.md)
 - [SpoonacularApi.GetRecipeNutritionWidgetByID200ResponseGoodInner](docs/GetRecipeNutritionWidgetByID200ResponseGoodInner.md)
 - [SpoonacularApi.GetRecipePriceBreakdownByID200Response](docs/GetRecipePriceBreakdownByID200Response.md)
 - [SpoonacularApi.GetRecipePriceBreakdownByID200ResponseIngredientsInner](docs/GetRecipePriceBreakdownByID200ResponseIngredientsInner.md)
 - [SpoonacularApi.GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount](docs/GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount.md)
 - [SpoonacularApi.GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmountMetric](docs/GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmountMetric.md)
 - [SpoonacularApi.GetRecipeTasteByID200Response](docs/GetRecipeTasteByID200Response.md)
 - [SpoonacularApi.GetShoppingList200Response](docs/GetShoppingList200Response.md)
 - [SpoonacularApi.GetShoppingList200ResponseAislesInner](docs/GetShoppingList200ResponseAislesInner.md)
 - [SpoonacularApi.GetShoppingList200ResponseAislesInnerItemsInner](docs/GetShoppingList200ResponseAislesInnerItemsInner.md)
 - [SpoonacularApi.GetShoppingList200ResponseAislesInnerItemsInnerMeasures](docs/GetShoppingList200ResponseAislesInnerItemsInnerMeasures.md)
 - [SpoonacularApi.GetSimilarRecipes200ResponseInner](docs/GetSimilarRecipes200ResponseInner.md)
 - [SpoonacularApi.GetWineDescription200Response](docs/GetWineDescription200Response.md)
 - [SpoonacularApi.GetWinePairing200Response](docs/GetWinePairing200Response.md)
 - [SpoonacularApi.GetWinePairing200ResponseProductMatchesInner](docs/GetWinePairing200ResponseProductMatchesInner.md)
 - [SpoonacularApi.GetWineRecommendation200Response](docs/GetWineRecommendation200Response.md)
 - [SpoonacularApi.GetWineRecommendation200ResponseRecommendedWinesInner](docs/GetWineRecommendation200ResponseRecommendedWinesInner.md)
 - [SpoonacularApi.GuessNutritionByDishName200Response](docs/GuessNutritionByDishName200Response.md)
 - [SpoonacularApi.GuessNutritionByDishName200ResponseCalories](docs/GuessNutritionByDishName200ResponseCalories.md)
 - [SpoonacularApi.GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent](docs/GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent.md)
 - [SpoonacularApi.ImageAnalysisByURL200Response](docs/ImageAnalysisByURL200Response.md)
 - [SpoonacularApi.ImageAnalysisByURL200ResponseCategory](docs/ImageAnalysisByURL200ResponseCategory.md)
 - [SpoonacularApi.ImageAnalysisByURL200ResponseNutrition](docs/ImageAnalysisByURL200ResponseNutrition.md)
 - [SpoonacularApi.ImageAnalysisByURL200ResponseNutritionCalories](docs/ImageAnalysisByURL200ResponseNutritionCalories.md)
 - [SpoonacularApi.ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent](docs/ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent.md)
 - [SpoonacularApi.ImageAnalysisByURL200ResponseRecipesInner](docs/ImageAnalysisByURL200ResponseRecipesInner.md)
 - [SpoonacularApi.ImageClassificationByURL200Response](docs/ImageClassificationByURL200Response.md)
 - [SpoonacularApi.IngredientSearch200Response](docs/IngredientSearch200Response.md)
 - [SpoonacularApi.IngredientSearch200ResponseResultsInner](docs/IngredientSearch200ResponseResultsInner.md)
 - [SpoonacularApi.MapIngredientsToGroceryProducts200ResponseInner](docs/MapIngredientsToGroceryProducts200ResponseInner.md)
 - [SpoonacularApi.MapIngredientsToGroceryProducts200ResponseInnerProductsInner](docs/MapIngredientsToGroceryProducts200ResponseInnerProductsInner.md)
 - [SpoonacularApi.MapIngredientsToGroceryProductsRequest](docs/MapIngredientsToGroceryProductsRequest.md)
 - [SpoonacularApi.ParseIngredients200ResponseInner](docs/ParseIngredients200ResponseInner.md)
 - [SpoonacularApi.ParseIngredients200ResponseInnerEstimatedCost](docs/ParseIngredients200ResponseInnerEstimatedCost.md)
 - [SpoonacularApi.ParseIngredients200ResponseInnerNutrition](docs/ParseIngredients200ResponseInnerNutrition.md)
 - [SpoonacularApi.ParseIngredients200ResponseInnerNutritionCaloricBreakdown](docs/ParseIngredients200ResponseInnerNutritionCaloricBreakdown.md)
 - [SpoonacularApi.ParseIngredients200ResponseInnerNutritionNutrientsInner](docs/ParseIngredients200ResponseInnerNutritionNutrientsInner.md)
 - [SpoonacularApi.ParseIngredients200ResponseInnerNutritionPropertiesInner](docs/ParseIngredients200ResponseInnerNutritionPropertiesInner.md)
 - [SpoonacularApi.ParseIngredients200ResponseInnerNutritionWeightPerServing](docs/ParseIngredients200ResponseInnerNutritionWeightPerServing.md)
 - [SpoonacularApi.QuickAnswer200Response](docs/QuickAnswer200Response.md)
 - [SpoonacularApi.SearchAllFood200Response](docs/SearchAllFood200Response.md)
 - [SpoonacularApi.SearchAllFood200ResponseSearchResultsInner](docs/SearchAllFood200ResponseSearchResultsInner.md)
 - [SpoonacularApi.SearchAllFood200ResponseSearchResultsInnerResultsInner](docs/SearchAllFood200ResponseSearchResultsInnerResultsInner.md)
 - [SpoonacularApi.SearchCustomFoods200Response](docs/SearchCustomFoods200Response.md)
 - [SpoonacularApi.SearchCustomFoods200ResponseCustomFoodsInner](docs/SearchCustomFoods200ResponseCustomFoodsInner.md)
 - [SpoonacularApi.SearchFoodVideos200Response](docs/SearchFoodVideos200Response.md)
 - [SpoonacularApi.SearchFoodVideos200ResponseVideosInner](docs/SearchFoodVideos200ResponseVideosInner.md)
 - [SpoonacularApi.SearchGroceryProducts200Response](docs/SearchGroceryProducts200Response.md)
 - [SpoonacularApi.SearchGroceryProductsByUPC200Response](docs/SearchGroceryProductsByUPC200Response.md)
 - [SpoonacularApi.SearchGroceryProductsByUPC200ResponseIngredientsInner](docs/SearchGroceryProductsByUPC200ResponseIngredientsInner.md)
 - [SpoonacularApi.SearchGroceryProductsByUPC200ResponseNutrition](docs/SearchGroceryProductsByUPC200ResponseNutrition.md)
 - [SpoonacularApi.SearchGroceryProductsByUPC200ResponseServings](docs/SearchGroceryProductsByUPC200ResponseServings.md)
 - [SpoonacularApi.SearchMenuItems200Response](docs/SearchMenuItems200Response.md)
 - [SpoonacularApi.SearchMenuItems200ResponseMenuItemsInner](docs/SearchMenuItems200ResponseMenuItemsInner.md)
 - [SpoonacularApi.SearchRecipes200Response](docs/SearchRecipes200Response.md)
 - [SpoonacularApi.SearchRecipes200ResponseResultsInner](docs/SearchRecipes200ResponseResultsInner.md)
 - [SpoonacularApi.SearchRecipesByIngredients200ResponseInner](docs/SearchRecipesByIngredients200ResponseInner.md)
 - [SpoonacularApi.SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner](docs/SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner.md)
 - [SpoonacularApi.SearchRecipesByNutrients200ResponseInner](docs/SearchRecipesByNutrients200ResponseInner.md)
 - [SpoonacularApi.SearchRestaurants200Response](docs/SearchRestaurants200Response.md)
 - [SpoonacularApi.SearchRestaurants200ResponseRestaurantsInner](docs/SearchRestaurants200ResponseRestaurantsInner.md)
 - [SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress](docs/SearchRestaurants200ResponseRestaurantsInnerAddress.md)
 - [SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerLocalHours](docs/SearchRestaurants200ResponseRestaurantsInnerLocalHours.md)
 - [SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational](docs/SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.md)
 - [SpoonacularApi.SearchSiteContent200Response](docs/SearchSiteContent200Response.md)
 - [SpoonacularApi.SearchSiteContent200ResponseArticlesInner](docs/SearchSiteContent200ResponseArticlesInner.md)
 - [SpoonacularApi.SearchSiteContent200ResponseArticlesInnerDataPointsInner](docs/SearchSiteContent200ResponseArticlesInnerDataPointsInner.md)
 - [SpoonacularApi.SummarizeRecipe200Response](docs/SummarizeRecipe200Response.md)
 - [SpoonacularApi.TalkToChatbot200Response](docs/TalkToChatbot200Response.md)
 - [SpoonacularApi.TalkToChatbot200ResponseMediaInner](docs/TalkToChatbot200ResponseMediaInner.md)


## Documentation for Authorization


Authentication schemes defined for the API:
### apiKeyScheme


- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header

