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

package com.spoonacular;

import com.spoonacular.client.ApiInvoker;
import com.spoonacular.client.ApiException;
import com.spoonacular.client.Pair;

import com.spoonacular.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import com.spoonacular.client.model.AnalyzeRecipeRequest;
import java.math.BigDecimal;
import com.spoonacular.client.model.SearchRestaurants200Response;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class DefaultApi {
  String basePath = "https://api.spoonacular.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Analyze Recipe
  * This endpoint allows you to send raw recipe information, such as title, servings, and ingredients, to then see what we compute (badges, diets, nutrition, and more). This is useful if you have your own recipe data and want to enrich it with our semantic analysis.
   * @param analyzeRecipeRequest Example request body.
   * @param language The input language, either \&quot;en\&quot; or \&quot;de\&quot;.
   * @param includeNutrition Whether nutrition data should be added to correctly parsed ingredients.
   * @param includeTaste Whether taste data should be added to correctly parsed ingredients.
   * @return Object
  */
  public Object analyzeRecipe (AnalyzeRecipeRequest analyzeRecipeRequest, String language, Boolean includeNutrition, Boolean includeTaste) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = analyzeRecipeRequest;
    // verify the required parameter 'analyzeRecipeRequest' is set
    if (analyzeRecipeRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'analyzeRecipeRequest' when calling analyzeRecipe",
        new ApiException(400, "Missing the required parameter 'analyzeRecipeRequest' when calling analyzeRecipe"));
    }

    // create path and map variables
    String path = "/recipes/analyze";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "language", language));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "includeNutrition", includeNutrition));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "includeTaste", includeTaste));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKeyScheme" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Analyze Recipe
   * This endpoint allows you to send raw recipe information, such as title, servings, and ingredients, to then see what we compute (badges, diets, nutrition, and more). This is useful if you have your own recipe data and want to enrich it with our semantic analysis.
   * @param analyzeRecipeRequest Example request body.   * @param language The input language, either \&quot;en\&quot; or \&quot;de\&quot;.   * @param includeNutrition Whether nutrition data should be added to correctly parsed ingredients.   * @param includeTaste Whether taste data should be added to correctly parsed ingredients.
  */
  public void analyzeRecipe (AnalyzeRecipeRequest analyzeRecipeRequest, String language, Boolean includeNutrition, Boolean includeTaste, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = analyzeRecipeRequest;

    // verify the required parameter 'analyzeRecipeRequest' is set
    if (analyzeRecipeRequest == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'analyzeRecipeRequest' when calling analyzeRecipe",
        new ApiException(400, "Missing the required parameter 'analyzeRecipeRequest' when calling analyzeRecipe"));
    }

    // create path and map variables
    String path = "/recipes/analyze".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "language", language));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "includeNutrition", includeNutrition));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "includeTaste", includeTaste));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKeyScheme" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Create Recipe Card
  * Generate a recipe card for a recipe.
   * @param id The recipe id.
   * @param mask The mask to put over the recipe image (\&quot;ellipseMask\&quot;, \&quot;diamondMask\&quot;, \&quot;starMask\&quot;, \&quot;heartMask\&quot;, \&quot;potMask\&quot;, \&quot;fishMask\&quot;).
   * @param backgroundImage The background image (\&quot;none\&quot;,\&quot;background1\&quot;, or \&quot;background2\&quot;).
   * @param backgroundColor The background color for the recipe card as a hex-string.
   * @param fontColor The font color for the recipe card as a hex-string.
   * @return Object
  */
  public Object createRecipeCardGet (BigDecimal id, String mask, String backgroundImage, String backgroundColor, String fontColor) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling createRecipeCardGet",
        new ApiException(400, "Missing the required parameter 'id' when calling createRecipeCardGet"));
    }

    // create path and map variables
    String path = "/recipes/{id}/card".replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "mask", mask));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "backgroundImage", backgroundImage));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "backgroundColor", backgroundColor));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fontColor", fontColor));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKeyScheme" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Create Recipe Card
   * Generate a recipe card for a recipe.
   * @param id The recipe id.   * @param mask The mask to put over the recipe image (\&quot;ellipseMask\&quot;, \&quot;diamondMask\&quot;, \&quot;starMask\&quot;, \&quot;heartMask\&quot;, \&quot;potMask\&quot;, \&quot;fishMask\&quot;).   * @param backgroundImage The background image (\&quot;none\&quot;,\&quot;background1\&quot;, or \&quot;background2\&quot;).   * @param backgroundColor The background color for the recipe card as a hex-string.   * @param fontColor The font color for the recipe card as a hex-string.
  */
  public void createRecipeCardGet (BigDecimal id, String mask, String backgroundImage, String backgroundColor, String fontColor, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling createRecipeCardGet",
        new ApiException(400, "Missing the required parameter 'id' when calling createRecipeCardGet"));
    }

    // create path and map variables
    String path = "/recipes/{id}/card".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "mask", mask));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "backgroundImage", backgroundImage));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "backgroundColor", backgroundColor));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fontColor", fontColor));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKeyScheme" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Search Restaurants
  * Search through thousands of restaurants (in North America) by location, cuisine, budget, and more.
   * @param query The search query.
   * @param lat The latitude of the user&#39;s location.
   * @param lng The longitude of the user&#39;s location.\&quot;.
   * @param distance The distance around the location in miles.
   * @param budget The user&#39;s budget for a meal in USD.
   * @param cuisine The cuisine of the restaurant.
   * @param minRating The minimum rating of the restaurant between 0 and 5.
   * @param isOpen Whether the restaurant must be open at the time of search.
   * @param sort How to sort the results, one of the following &#39;cheapest&#39;, &#39;fastest&#39;, &#39;rating&#39;, &#39;distance&#39; or the default &#39;relevance&#39;.
   * @param page The page number of results.
   * @return SearchRestaurants200Response
  */
  public SearchRestaurants200Response searchRestaurants (String query, BigDecimal lat, BigDecimal lng, BigDecimal distance, BigDecimal budget, String cuisine, BigDecimal minRating, Boolean isOpen, String sort, BigDecimal page) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/food/restaurants/search";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "query", query));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "lat", lat));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "lng", lng));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "distance", distance));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "budget", budget));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cuisine", cuisine));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "min-rating", minRating));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "is-open", isOpen));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort", sort));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKeyScheme" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (SearchRestaurants200Response) ApiInvoker.deserialize(localVarResponse, "", SearchRestaurants200Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Search Restaurants
   * Search through thousands of restaurants (in North America) by location, cuisine, budget, and more.
   * @param query The search query.   * @param lat The latitude of the user&#39;s location.   * @param lng The longitude of the user&#39;s location.\&quot;.   * @param distance The distance around the location in miles.   * @param budget The user&#39;s budget for a meal in USD.   * @param cuisine The cuisine of the restaurant.   * @param minRating The minimum rating of the restaurant between 0 and 5.   * @param isOpen Whether the restaurant must be open at the time of search.   * @param sort How to sort the results, one of the following &#39;cheapest&#39;, &#39;fastest&#39;, &#39;rating&#39;, &#39;distance&#39; or the default &#39;relevance&#39;.   * @param page The page number of results.
  */
  public void searchRestaurants (String query, BigDecimal lat, BigDecimal lng, BigDecimal distance, BigDecimal budget, String cuisine, BigDecimal minRating, Boolean isOpen, String sort, BigDecimal page, final Response.Listener<SearchRestaurants200Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/food/restaurants/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "query", query));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "lat", lat));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "lng", lng));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "distance", distance));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "budget", budget));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cuisine", cuisine));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "min-rating", minRating));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "is-open", isOpen));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort", sort));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKeyScheme" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SearchRestaurants200Response) ApiInvoker.deserialize(localVarResponse,  "", SearchRestaurants200Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
