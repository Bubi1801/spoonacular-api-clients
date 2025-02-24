#import <Foundation/Foundation.h>
#import "OAIAutocompleteProductSearch200Response.h"
#import "OAIClassifyGroceryProduct200Response.h"
#import "OAIClassifyGroceryProductBulk200ResponseInner.h"
#import "OAIClassifyGroceryProductBulkRequestInner.h"
#import "OAIClassifyGroceryProductRequest.h"
#import "OAIGetComparableProducts200Response.h"
#import "OAIGetProductInformation200Response.h"
#import "OAISearchGroceryProducts200Response.h"
#import "OAISearchGroceryProductsByUPC200Response.h"
#import "OAISet.h"
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



@interface OAIProductsApi: NSObject <OAIApi>

extern NSString* kOAIProductsApiErrorDomain;
extern NSInteger kOAIProductsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Autocomplete Product Search
/// Generate suggestions for grocery products based on a (partial) query. The matches will be found by looking in the title only.
///
/// @param query The (partial) search query.
/// @param number The number of results to return (between 1 and 25). (optional)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAIAutocompleteProductSearch200Response*
-(NSURLSessionTask*) autocompleteProductSearchWithQuery: (NSString*) query
    number: (NSNumber*) number
    completionHandler: (void (^)(OAIAutocompleteProductSearch200Response* output, NSError* error)) handler;


/// Classify Grocery Product
/// This endpoint allows you to match a packaged food to a basic category, e.g. a specific brand of milk to the category milk.
///
/// @param classifyGroceryProductRequest 
/// @param locale The display name of the returned category, supported is en_US (for American English) and en_GB (for British English). (optional)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAIClassifyGroceryProduct200Response*
-(NSURLSessionTask*) classifyGroceryProductWithClassifyGroceryProductRequest: (OAIClassifyGroceryProductRequest*) classifyGroceryProductRequest
    locale: (NSString*) locale
    completionHandler: (void (^)(OAIClassifyGroceryProduct200Response* output, NSError* error)) handler;


/// Classify Grocery Product Bulk
/// Provide a set of product jsons, get back classified products.
///
/// @param classifyGroceryProductBulkRequestInner 
/// @param locale The display name of the returned category, supported is en_US (for American English) and en_GB (for British English). (optional)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAISet<OAIClassifyGroceryProductBulk200ResponseInner>*
-(NSURLSessionTask*) classifyGroceryProductBulkWithClassifyGroceryProductBulkRequestInner: (OAISet<OAIClassifyGroceryProductBulkRequestInner>*) classifyGroceryProductBulkRequestInner
    locale: (NSString*) locale
    completionHandler: (void (^)(OAISet<OAIClassifyGroceryProductBulk200ResponseInner>* output, NSError* error)) handler;


/// Get Comparable Products
/// Find comparable products to the given one.
///
/// @param upc The UPC of the product for which you want to find comparable products.
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAIGetComparableProducts200Response*
-(NSURLSessionTask*) getComparableProductsWithUpc: (NSNumber*) upc
    completionHandler: (void (^)(OAIGetComparableProducts200Response* output, NSError* error)) handler;


/// Get Product Information
/// Use a product id to get full information about a product, such as ingredients, nutrition, etc. The nutritional information is per serving.
///
/// @param _id The item&#39;s id.
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAIGetProductInformation200Response*
-(NSURLSessionTask*) getProductInformationWithId: (NSNumber*) _id
    completionHandler: (void (^)(OAIGetProductInformation200Response* output, NSError* error)) handler;


/// Product Nutrition by ID Image
/// Visualize a product's nutritional information as an image.
///
/// @param _id The id of the product.
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return NSURL*
-(NSURLSessionTask*) productNutritionByIDImageWithId: (NSNumber*) _id
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler;


/// Product Nutrition Label Image
/// Get a product's nutrition label as an image.
///
/// @param _id The product id.
/// @param showOptionalNutrients Whether to show optional nutrients. (optional)
/// @param showZeroValues Whether to show zero values. (optional)
/// @param showIngredients Whether to show a list of ingredients. (optional)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return NSURL*
-(NSURLSessionTask*) productNutritionLabelImageWithId: (NSNumber*) _id
    showOptionalNutrients: (NSNumber*) showOptionalNutrients
    showZeroValues: (NSNumber*) showZeroValues
    showIngredients: (NSNumber*) showIngredients
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler;


/// Product Nutrition Label Widget
/// Get a product's nutrition label as an HTML widget.
///
/// @param _id The product id.
/// @param defaultCss Whether the default CSS should be added to the response. (optional) (default to @(YES))
/// @param showOptionalNutrients Whether to show optional nutrients. (optional)
/// @param showZeroValues Whether to show zero values. (optional)
/// @param showIngredients Whether to show a list of ingredients. (optional)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return NSString*
-(NSURLSessionTask*) productNutritionLabelWidgetWithId: (NSNumber*) _id
    defaultCss: (NSNumber*) defaultCss
    showOptionalNutrients: (NSNumber*) showOptionalNutrients
    showZeroValues: (NSNumber*) showZeroValues
    showIngredients: (NSNumber*) showIngredients
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Search Grocery Products
/// Search packaged food products, such as frozen pizza or Greek yogurt.
///
/// @param query The (natural language) search query. (optional)
/// @param minCalories The minimum amount of calories the product must have. (optional)
/// @param maxCalories The maximum amount of calories the product can have. (optional)
/// @param minCarbs The minimum amount of carbohydrates in grams the product must have. (optional)
/// @param maxCarbs The maximum amount of carbohydrates in grams the product can have. (optional)
/// @param minProtein The minimum amount of protein in grams the product must have. (optional)
/// @param maxProtein The maximum amount of protein in grams the product can have. (optional)
/// @param minFat The minimum amount of fat in grams the product must have. (optional)
/// @param maxFat The maximum amount of fat in grams the product can have. (optional)
/// @param addProductInformation If set to true, you get more information about the products returned. (optional)
/// @param offset The number of results to skip (between 0 and 900). (optional)
/// @param number The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAISearchGroceryProducts200Response*
-(NSURLSessionTask*) searchGroceryProductsWithQuery: (NSString*) query
    minCalories: (NSNumber*) minCalories
    maxCalories: (NSNumber*) maxCalories
    minCarbs: (NSNumber*) minCarbs
    maxCarbs: (NSNumber*) maxCarbs
    minProtein: (NSNumber*) minProtein
    maxProtein: (NSNumber*) maxProtein
    minFat: (NSNumber*) minFat
    maxFat: (NSNumber*) maxFat
    addProductInformation: (NSNumber*) addProductInformation
    offset: (NSNumber*) offset
    number: (NSNumber*) number
    completionHandler: (void (^)(OAISearchGroceryProducts200Response* output, NSError* error)) handler;


/// Search Grocery Products by UPC
/// Get information about a packaged food using its UPC.
///
/// @param upc The product&#39;s UPC.
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAISearchGroceryProductsByUPC200Response*
-(NSURLSessionTask*) searchGroceryProductsByUPCWithUpc: (NSNumber*) upc
    completionHandler: (void (^)(OAISearchGroceryProductsByUPC200Response* output, NSError* error)) handler;


/// Product Nutrition by ID Widget
/// Visualize a product's nutritional information as HTML including CSS.
///
/// @param _id The item&#39;s id.
/// @param defaultCss Whether the default CSS should be added to the response. (optional) (default to @(YES))
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return NSString*
-(NSURLSessionTask*) visualizeProductNutritionByIDWithId: (NSNumber*) _id
    defaultCss: (NSNumber*) defaultCss
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;



@end
