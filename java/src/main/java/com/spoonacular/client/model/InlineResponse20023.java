/*
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.spoonacular.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.spoonacular.client.model.InlineResponse20023Ingredients;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20023
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-03T15:10:59.332+02:00[Europe/Berlin]")
public class InlineResponse20023 {
  public static final String SERIALIZED_NAME_TOTAL_GLYCEMIC_LOAD = "totalGlycemicLoad";
  @SerializedName(SERIALIZED_NAME_TOTAL_GLYCEMIC_LOAD)
  private BigDecimal totalGlycemicLoad;

  public static final String SERIALIZED_NAME_INGREDIENTS = "ingredients";
  @SerializedName(SERIALIZED_NAME_INGREDIENTS)
  private List<InlineResponse20023Ingredients> ingredients = new ArrayList<>();

  public InlineResponse20023 totalGlycemicLoad(BigDecimal totalGlycemicLoad) {
    this.totalGlycemicLoad = totalGlycemicLoad;
    return this;
  }

   /**
   * Get totalGlycemicLoad
   * @return totalGlycemicLoad
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTotalGlycemicLoad() {
    return totalGlycemicLoad;
  }

  public void setTotalGlycemicLoad(BigDecimal totalGlycemicLoad) {
    this.totalGlycemicLoad = totalGlycemicLoad;
  }

  public InlineResponse20023 ingredients(List<InlineResponse20023Ingredients> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public InlineResponse20023 addIngredientsItem(InlineResponse20023Ingredients ingredientsItem) {
    this.ingredients.add(ingredientsItem);
    return this;
  }

   /**
   * Get ingredients
   * @return ingredients
  **/
  @ApiModelProperty(required = true, value = "")
  public List<InlineResponse20023Ingredients> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<InlineResponse20023Ingredients> ingredients) {
    this.ingredients = ingredients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20023 inlineResponse20023 = (InlineResponse20023) o;
    return Objects.equals(this.totalGlycemicLoad, inlineResponse20023.totalGlycemicLoad) &&
        Objects.equals(this.ingredients, inlineResponse20023.ingredients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalGlycemicLoad, ingredients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20023 {\n");
    sb.append("    totalGlycemicLoad: ").append(toIndentedString(totalGlycemicLoad)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

