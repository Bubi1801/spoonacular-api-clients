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
 * @param amount 
 * @param unit 
 */


data class ParseIngredients200ResponseInnerNutritionWeightPerServing (

    @Json(name = "amount")
    val amount: java.math.BigDecimal,

    @Json(name = "unit")
    val unit: kotlin.String

)

