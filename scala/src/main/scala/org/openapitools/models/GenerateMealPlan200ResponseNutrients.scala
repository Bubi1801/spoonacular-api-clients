package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import spoonacular._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param calories 
 * @param carbohydrates 
 * @param fat 
 * @param protein 
 */
case class GenerateMealPlan200ResponseNutrients(calories: BigDecimal,
                carbohydrates: BigDecimal,
                fat: BigDecimal,
                protein: BigDecimal
                )

object GenerateMealPlan200ResponseNutrients {
    /**
     * Creates the codec for converting GenerateMealPlan200ResponseNutrients from and to JSON.
     */
    implicit val decoder: Decoder[GenerateMealPlan200ResponseNutrients] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateMealPlan200ResponseNutrients] = deriveEncoder
}
