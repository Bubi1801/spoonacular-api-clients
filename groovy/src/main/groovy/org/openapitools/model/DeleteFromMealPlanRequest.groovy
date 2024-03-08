package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class DeleteFromMealPlanRequest {
    /* The username. */
    String username
    /* The shopping list item id. */
    BigDecimal id
    /* The private hash for the username. */
    String hash
}
