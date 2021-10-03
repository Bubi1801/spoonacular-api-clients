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
import com.spoonacular.client.model.InlineResponse20042Measures;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * InlineResponse20042Items
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-03T15:10:59.332+02:00[Europe/Berlin]")
public class InlineResponse20042Items {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MEASURES = "measures";
  @SerializedName(SERIALIZED_NAME_MEASURES)
  private InlineResponse20042Measures measures = null;

  public static final String SERIALIZED_NAME_PANTRY_ITEM = "pantryItem";
  @SerializedName(SERIALIZED_NAME_PANTRY_ITEM)
  private Boolean pantryItem;

  public static final String SERIALIZED_NAME_AISLE = "aisle";
  @SerializedName(SERIALIZED_NAME_AISLE)
  private String aisle;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private BigDecimal cost;

  public static final String SERIALIZED_NAME_INGREDIENT_ID = "ingredientId";
  @SerializedName(SERIALIZED_NAME_INGREDIENT_ID)
  private Integer ingredientId;

  public InlineResponse20042Items id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse20042Items name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse20042Items measures(InlineResponse20042Measures measures) {
    this.measures = measures;
    return this;
  }

   /**
   * Get measures
   * @return measures
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20042Measures getMeasures() {
    return measures;
  }

  public void setMeasures(InlineResponse20042Measures measures) {
    this.measures = measures;
  }

  public InlineResponse20042Items pantryItem(Boolean pantryItem) {
    this.pantryItem = pantryItem;
    return this;
  }

   /**
   * Get pantryItem
   * @return pantryItem
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getPantryItem() {
    return pantryItem;
  }

  public void setPantryItem(Boolean pantryItem) {
    this.pantryItem = pantryItem;
  }

  public InlineResponse20042Items aisle(String aisle) {
    this.aisle = aisle;
    return this;
  }

   /**
   * Get aisle
   * @return aisle
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAisle() {
    return aisle;
  }

  public void setAisle(String aisle) {
    this.aisle = aisle;
  }

  public InlineResponse20042Items cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public InlineResponse20042Items ingredientId(Integer ingredientId) {
    this.ingredientId = ingredientId;
    return this;
  }

   /**
   * Get ingredientId
   * @return ingredientId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIngredientId() {
    return ingredientId;
  }

  public void setIngredientId(Integer ingredientId) {
    this.ingredientId = ingredientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20042Items inlineResponse20042Items = (InlineResponse20042Items) o;
    return Objects.equals(this.id, inlineResponse20042Items.id) &&
        Objects.equals(this.name, inlineResponse20042Items.name) &&
        Objects.equals(this.measures, inlineResponse20042Items.measures) &&
        Objects.equals(this.pantryItem, inlineResponse20042Items.pantryItem) &&
        Objects.equals(this.aisle, inlineResponse20042Items.aisle) &&
        Objects.equals(this.cost, inlineResponse20042Items.cost) &&
        Objects.equals(this.ingredientId, inlineResponse20042Items.ingredientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, measures, pantryItem, aisle, cost, ingredientId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20042Items {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    measures: ").append(toIndentedString(measures)).append("\n");
    sb.append("    pantryItem: ").append(toIndentedString(pantryItem)).append("\n");
    sb.append("    aisle: ").append(toIndentedString(aisle)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    ingredientId: ").append(toIndentedString(ingredientId)).append("\n");
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

