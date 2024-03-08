package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import spoonacular._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param value 
 * @param unit 
 */
case class ParseIngredients200ResponseInnerEstimatedCost(value: BigDecimal,
                unit: String
                )

object ParseIngredients200ResponseInnerEstimatedCost {
    /**
     * Creates the codec for converting ParseIngredients200ResponseInnerEstimatedCost from and to JSON.
     */
    implicit val decoder: Decoder[ParseIngredients200ResponseInnerEstimatedCost] = deriveDecoder
    implicit val encoder: ObjectEncoder[ParseIngredients200ResponseInnerEstimatedCost] = deriveEncoder
}
