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

import com.spoonacular.client.model.SearchCustomFoods200ResponseCustomFoodsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param customFoods 
 * @param type 
 * @param offset 
 * @param number 
 */


data class SearchCustomFoods200Response (

    @Json(name = "customFoods")
    val customFoods: kotlin.collections.Set<SearchCustomFoods200ResponseCustomFoodsInner>,

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "offset")
    val offset: kotlin.Int,

    @Json(name = "number")
    val number: kotlin.Int

)

