#import <Foundation/Foundation.h>
#import "OAIAnalyzeRecipeRequest.h"
#import "OAISearchRestaurants200Response.h"
#import "OAIApi.h"

/**
* spoonacular API
* The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
*
* The version of the OpenAPI document: 1.1
* Contact: mail@spoonacular.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAIDefaultApi: NSObject <OAIApi>

extern NSString* kOAIDefaultApiErrorDomain;
extern NSInteger kOAIDefaultApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Analyze Recipe
/// This endpoint allows you to send raw recipe information, such as title, servings, and ingredients, to then see what we compute (badges, diets, nutrition, and more). This is useful if you have your own recipe data and want to enrich it with our semantic analysis.
///
/// @param analyzeRecipeRequest Example request body.
/// @param language The input language, either \&quot;en\&quot; or \&quot;de\&quot;. (optional)
/// @param includeNutrition Whether nutrition data should be added to correctly parsed ingredients. (optional)
/// @param includeTaste Whether taste data should be added to correctly parsed ingredients. (optional)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return NSObject*
-(NSURLSessionTask*) analyzeRecipeWithAnalyzeRecipeRequest: (OAIAnalyzeRecipeRequest*) analyzeRecipeRequest
    language: (NSString*) language
    includeNutrition: (NSNumber*) includeNutrition
    includeTaste: (NSNumber*) includeTaste
    completionHandler: (void (^)(NSObject* output, NSError* error)) handler;


/// Create Recipe Card
/// Generate a recipe card for a recipe.
///
/// @param _id The recipe id.
/// @param mask The mask to put over the recipe image (\&quot;ellipseMask\&quot;, \&quot;diamondMask\&quot;, \&quot;starMask\&quot;, \&quot;heartMask\&quot;, \&quot;potMask\&quot;, \&quot;fishMask\&quot;). (optional)
/// @param backgroundImage The background image (\&quot;none\&quot;,\&quot;background1\&quot;, or \&quot;background2\&quot;). (optional)
/// @param backgroundColor The background color for the recipe card as a hex-string. (optional)
/// @param fontColor The font color for the recipe card as a hex-string. (optional)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return NSObject*
-(NSURLSessionTask*) createRecipeCardGetWithId: (NSNumber*) _id
    mask: (NSString*) mask
    backgroundImage: (NSString*) backgroundImage
    backgroundColor: (NSString*) backgroundColor
    fontColor: (NSString*) fontColor
    completionHandler: (void (^)(NSObject* output, NSError* error)) handler;


/// Search Restaurants
/// Search through thousands of restaurants (in North America) by location, cuisine, budget, and more.
///
/// @param query The search query. (optional)
/// @param lat The latitude of the user&#39;s location. (optional)
/// @param lng The longitude of the user&#39;s location.\&quot;. (optional)
/// @param distance The distance around the location in miles. (optional)
/// @param budget The user&#39;s budget for a meal in USD. (optional)
/// @param cuisine The cuisine of the restaurant. (optional)
/// @param minRating The minimum rating of the restaurant between 0 and 5. (optional)
/// @param isOpen Whether the restaurant must be open at the time of search. (optional)
/// @param sort How to sort the results, one of the following &#39;cheapest&#39;, &#39;fastest&#39;, &#39;rating&#39;, &#39;distance&#39; or the default &#39;relevance&#39;. (optional)
/// @param page The page number of results. (optional)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAISearchRestaurants200Response*
-(NSURLSessionTask*) searchRestaurantsWithQuery: (NSString*) query
    lat: (NSNumber*) lat
    lng: (NSNumber*) lng
    distance: (NSNumber*) distance
    budget: (NSNumber*) budget
    cuisine: (NSString*) cuisine
    minRating: (NSNumber*) minRating
    isOpen: (NSNumber*) isOpen
    sort: (NSString*) sort
    page: (NSNumber*) page
    completionHandler: (void (^)(OAISearchRestaurants200Response* output, NSError* error)) handler;



@end
