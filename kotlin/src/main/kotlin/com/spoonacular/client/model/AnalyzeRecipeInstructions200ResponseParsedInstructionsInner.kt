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

import com.spoonacular.client.model.AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name 
 * @param steps 
 */


data class AnalyzeRecipeInstructions200ResponseParsedInstructionsInner (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "steps")
    val steps: kotlin.collections.Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner>? = null

)

