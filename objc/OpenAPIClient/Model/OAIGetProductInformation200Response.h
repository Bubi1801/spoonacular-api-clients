#import <Foundation/Foundation.h>
#import "OAIObject.h"

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


#import "OAIGetProductInformation200ResponseIngredientsInner.h"
#import "OAISearchGroceryProductsByUPC200ResponseNutrition.h"
#import "OAISearchGroceryProductsByUPC200ResponseServings.h"
@protocol OAIGetProductInformation200ResponseIngredientsInner;
@class OAIGetProductInformation200ResponseIngredientsInner;
@protocol OAISearchGroceryProductsByUPC200ResponseNutrition;
@class OAISearchGroceryProductsByUPC200ResponseNutrition;
@protocol OAISearchGroceryProductsByUPC200ResponseServings;
@class OAISearchGroceryProductsByUPC200ResponseServings;



@protocol OAIGetProductInformation200Response
@end

@interface OAIGetProductInformation200Response : OAIObject


@property(nonatomic) NSNumber* _id;

@property(nonatomic) NSString* title;

@property(nonatomic) NSArray<NSString*>* breadcrumbs;

@property(nonatomic) NSString* imageType;

@property(nonatomic) NSArray<NSString*>* badges;

@property(nonatomic) NSArray<NSString*>* importantBadges;

@property(nonatomic) NSNumber* ingredientCount;

@property(nonatomic) NSString* generatedText;

@property(nonatomic) NSString* ingredientList;

@property(nonatomic) NSArray<OAIGetProductInformation200ResponseIngredientsInner>* ingredients;

@property(nonatomic) NSNumber* likes;

@property(nonatomic) NSString* aisle;

@property(nonatomic) OAISearchGroceryProductsByUPC200ResponseNutrition* nutrition;

@property(nonatomic) NSNumber* price;

@property(nonatomic) OAISearchGroceryProductsByUPC200ResponseServings* servings;

@property(nonatomic) NSNumber* spoonacularScore;

@end
