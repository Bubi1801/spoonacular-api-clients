package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import spoonacular._
import org.openapitools.models.GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount

/**
 * 
 * @param amount 
 * @param image 
 * @param name 
 */
case class GetRecipeIngredientsByID200ResponseIngredientsInner(amount: Option[GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount],
                image: String,
                name: String
                )

object GetRecipeIngredientsByID200ResponseIngredientsInner {
    /**
     * Creates the codec for converting GetRecipeIngredientsByID200ResponseIngredientsInner from and to JSON.
     */
    implicit val decoder: Decoder[GetRecipeIngredientsByID200ResponseIngredientsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetRecipeIngredientsByID200ResponseIngredientsInner] = deriveEncoder
}
