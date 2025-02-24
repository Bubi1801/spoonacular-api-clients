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
 * @param category 
 * @param probability 
 */


data class ImageClassificationByURL200Response (

    @Json(name = "category")
    val category: kotlin.String,

    @Json(name = "probability")
    val probability: java.math.BigDecimal

)

