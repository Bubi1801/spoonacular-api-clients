package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class ConvertAmounts200Response {
    
    BigDecimal sourceAmount
    
    String sourceUnit
    
    BigDecimal targetAmount
    
    String targetUnit
    
    String answer
}
