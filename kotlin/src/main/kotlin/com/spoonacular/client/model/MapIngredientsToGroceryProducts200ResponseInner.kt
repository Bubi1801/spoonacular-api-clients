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

import com.spoonacular.client.model.MapIngredientsToGroceryProducts200ResponseInnerProductsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param original 
 * @param originalName 
 * @param ingredientImage 
 * @param meta 
 * @param products 
 */


data class MapIngredientsToGroceryProducts200ResponseInner (

    @Json(name = "original")
    val original: kotlin.String,

    @Json(name = "originalName")
    val originalName: kotlin.String,

    @Json(name = "ingredientImage")
    val ingredientImage: kotlin.String,

    @Json(name = "meta")
    val meta: kotlin.collections.List<kotlin.String>,

    @Json(name = "products")
    val products: kotlin.collections.Set<MapIngredientsToGroceryProducts200ResponseInnerProductsInner>

)

