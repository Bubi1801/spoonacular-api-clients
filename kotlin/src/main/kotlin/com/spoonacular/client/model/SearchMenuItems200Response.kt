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

import com.spoonacular.client.model.SearchMenuItems200ResponseMenuItemsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param menuItems 
 * @param totalMenuItems 
 * @param type 
 * @param offset 
 * @param number 
 */


data class SearchMenuItems200Response (

    @Json(name = "menuItems")
    val menuItems: kotlin.collections.Set<SearchMenuItems200ResponseMenuItemsInner>,

    @Json(name = "totalMenuItems")
    val totalMenuItems: kotlin.Int,

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "offset")
    val offset: kotlin.Int,

    @Json(name = "number")
    val number: kotlin.Int

)

