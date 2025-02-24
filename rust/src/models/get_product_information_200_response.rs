/*
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 * Generated by: https://openapi-generator.tech
 */

/// GetProductInformation200Response : 



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetProductInformation200Response {
    #[serde(rename = "id")]
    pub id: i32,
    #[serde(rename = "title")]
    pub title: String,
    #[serde(rename = "breadcrumbs")]
    pub breadcrumbs: Vec<String>,
    #[serde(rename = "imageType")]
    pub image_type: String,
    #[serde(rename = "badges")]
    pub badges: Vec<String>,
    #[serde(rename = "importantBadges")]
    pub important_badges: Vec<String>,
    #[serde(rename = "ingredientCount")]
    pub ingredient_count: i32,
    #[serde(rename = "generatedText", skip_serializing_if = "Option::is_none")]
    pub generated_text: Option<String>,
    #[serde(rename = "ingredientList")]
    pub ingredient_list: String,
    #[serde(rename = "ingredients")]
    pub ingredients: Vec<crate::models::GetProductInformation200ResponseIngredientsInner>,
    #[serde(rename = "likes")]
    pub likes: f32,
    #[serde(rename = "aisle")]
    pub aisle: String,
    #[serde(rename = "nutrition")]
    pub nutrition: Box<crate::models::SearchGroceryProductsByUpc200ResponseNutrition>,
    #[serde(rename = "price")]
    pub price: f32,
    #[serde(rename = "servings")]
    pub servings: Box<crate::models::SearchGroceryProductsByUpc200ResponseServings>,
    #[serde(rename = "spoonacularScore")]
    pub spoonacular_score: f32,
}

impl GetProductInformation200Response {
    /// 
    pub fn new(id: i32, title: String, breadcrumbs: Vec<String>, image_type: String, badges: Vec<String>, important_badges: Vec<String>, ingredient_count: i32, ingredient_list: String, ingredients: Vec<crate::models::GetProductInformation200ResponseIngredientsInner>, likes: f32, aisle: String, nutrition: crate::models::SearchGroceryProductsByUpc200ResponseNutrition, price: f32, servings: crate::models::SearchGroceryProductsByUpc200ResponseServings, spoonacular_score: f32) -> GetProductInformation200Response {
        GetProductInformation200Response {
            id,
            title,
            breadcrumbs,
            image_type,
            badges,
            important_badges,
            ingredient_count,
            generated_text: None,
            ingredient_list,
            ingredients,
            likes,
            aisle,
            nutrition: Box::new(nutrition),
            price,
            servings: Box::new(servings),
            spoonacular_score,
        }
    }
}


