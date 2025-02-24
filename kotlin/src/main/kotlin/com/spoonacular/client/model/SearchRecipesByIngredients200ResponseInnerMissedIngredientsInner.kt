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
 * @param aisle 
 * @param amount 
 * @param id 
 * @param image 
 * @param name 
 * @param original 
 * @param originalName 
 * @param unit 
 * @param unitLong 
 * @param unitShort 
 * @param meta 
 * @param extendedName 
 */


data class SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner (

    @Json(name = "aisle")
    val aisle: kotlin.String,

    @Json(name = "amount")
    val amount: java.math.BigDecimal,

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "image")
    val image: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "original")
    val original: kotlin.String,

    @Json(name = "originalName")
    val originalName: kotlin.String,

    @Json(name = "unit")
    val unit: kotlin.String,

    @Json(name = "unitLong")
    val unitLong: kotlin.String,

    @Json(name = "unitShort")
    val unitShort: kotlin.String,

    @Json(name = "meta")
    val meta: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "extendedName")
    val extendedName: kotlin.String? = null

)

