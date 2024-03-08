package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import spoonacular._
import org.openapitools.models.GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmountMetric

/**
 * 
 * @param metric 
 * @param us 
 */
case class GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount(metric: GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmountMetric,
                us: GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmountMetric
                )

object GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount {
    /**
     * Creates the codec for converting GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount from and to JSON.
     */
    implicit val decoder: Decoder[GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount] = deriveEncoder
}
