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
 * @param summary 
 * @param title 
 */


data class SummarizeRecipe200Response (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "summary")
    val summary: kotlin.String,

    @Json(name = "title")
    val title: kotlin.String

)

