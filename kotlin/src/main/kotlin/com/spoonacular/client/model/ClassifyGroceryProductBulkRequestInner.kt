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
 * @param title 
 * @param upc 
 * @param pluCode 
 */


data class ClassifyGroceryProductBulkRequestInner (

    @Json(name = "title")
    val title: kotlin.String,

    @Json(name = "upc")
    val upc: kotlin.String,

    @Json(name = "plu_code")
    val pluCode: kotlin.String

)

