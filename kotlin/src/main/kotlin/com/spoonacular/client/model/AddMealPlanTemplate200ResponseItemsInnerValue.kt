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
 * @param id 
 * @param servings 
 * @param title 
 * @param imageType 
 */


data class AddMealPlanTemplate200ResponseItemsInnerValue (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "servings")
    val servings: java.math.BigDecimal? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "imageType")
    val imageType: kotlin.String? = null

)

