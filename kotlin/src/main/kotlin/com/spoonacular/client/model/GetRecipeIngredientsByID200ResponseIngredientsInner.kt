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

import com.spoonacular.client.model.GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param image 
 * @param name 
 * @param amount 
 */


data class GetRecipeIngredientsByID200ResponseIngredientsInner (

    @Json(name = "image")
    val image: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "amount")
    val amount: GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount? = null

)

