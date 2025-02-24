/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.spoonacular.client.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name 
 * @param amount 
 * @param unit 
 * @param percentOfDailyNeeds 
 */


data class ParseIngredients200ResponseInnerNutritionNutrientsInner (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "amount")
    val amount: java.math.BigDecimal,

    @Json(name = "unit")
    val unit: kotlin.String,

    @Json(name = "percentOfDailyNeeds")
    val percentOfDailyNeeds: java.math.BigDecimal

)

