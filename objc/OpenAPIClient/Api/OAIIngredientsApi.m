#import "OAIIngredientsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAutocompleteIngredientSearch200ResponseInner.h"
#import "OAIComputeIngredientAmount200Response.h"
#import "OAIGetIngredientInformation200Response.h"
#import "OAIGetIngredientSubstitutes200Response.h"
#import "OAIIngredientSearch200Response.h"
#import "OAIMapIngredientsToGroceryProducts200ResponseInner.h"
#import "OAIMapIngredientsToGroceryProductsRequest.h"
#import "OAISet.h"


@interface OAIIngredientsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIIngredientsApi

NSString* kOAIIngredientsApiErrorDomain = @"OAIIngredientsApiErrorDomain";
NSInteger kOAIIngredientsApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Autocomplete Ingredient Search
/// Autocomplete the entry of an ingredient.
///  @param query The (natural language) search query. (optional)
///
///  @param number The maximum number of items to return (between 1 and 100). Defaults to 10. (optional, default to @10)
///
///  @param metaInformation Whether to return more meta information about the ingredients. (optional)
///
///  @param intolerances A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. (optional)
///
///  @param language The language of the input. Either 'en' or 'de'. (optional)
///
///  @returns OAISet<OAIAutocompleteIngredientSearch200ResponseInner>*
///
-(NSURLSessionTask*) autocompleteIngredientSearchWithQuery: (NSString*) query
    number: (NSNumber*) number
    metaInformation: (NSNumber*) metaInformation
    intolerances: (NSString*) intolerances
    language: (NSString*) language
    completionHandler: (void (^)(OAISet<OAIAutocompleteIngredientSearch200ResponseInner>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/food/ingredients/autocomplete"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (query != nil) {
        queryParams[@"query"] = query;
    }
    if (number != nil) {
        queryParams[@"number"] = number;
    }
    if (metaInformation != nil) {
        queryParams[@"metaInformation"] = [metaInformation isEqual:@(YES)] ? @"true" : @"false";
    }
    if (intolerances != nil) {
        queryParams[@"intolerances"] = intolerances;
    }
    if (language != nil) {
        queryParams[@"language"] = language;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKeyScheme"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAISet<OAIAutocompleteIngredientSearch200ResponseInner>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAISet<OAIAutocompleteIngredientSearch200ResponseInner>*)data, error);
                                }
                            }];
}

///
/// Compute Ingredient Amount
/// Compute the amount you need of a certain ingredient for a certain nutritional goal. For example, how much pineapple do you have to eat to get 10 grams of protein?
///  @param _id The id of the ingredient you want the amount for. 
///
///  @param nutrient The target nutrient. See a list of supported nutrients. 
///
///  @param target The target number of the given nutrient. 
///
///  @param unit The target unit. (optional)
///
///  @returns OAIComputeIngredientAmount200Response*
///
-(NSURLSessionTask*) computeIngredientAmountWithId: (NSNumber*) _id
    nutrient: (NSString*) nutrient
    target: (NSNumber*) target
    unit: (NSString*) unit
    completionHandler: (void (^)(OAIComputeIngredientAmount200Response* output, NSError* error)) handler {
    // verify the required parameter '_id' is set
    if (_id == nil) {
        NSParameterAssert(_id);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"_id"] };
            NSError* error = [NSError errorWithDomain:kOAIIngredientsApiErrorDomain code:kOAIIngredientsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'nutrient' is set
    if (nutrient == nil) {
        NSParameterAssert(nutrient);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"nutrient"] };
            NSError* error = [NSError errorWithDomain:kOAIIngredientsApiErrorDomain code:kOAIIngredientsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'target' is set
    if (target == nil) {
        NSParameterAssert(target);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"target"] };
            NSError* error = [NSError errorWithDomain:kOAIIngredientsApiErrorDomain code:kOAIIngredientsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/food/ingredients/{id}/amount"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (_id != nil) {
        pathParams[@"id"] = _id;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (nutrient != nil) {
        queryParams[@"nutrient"] = nutrient;
    }
    if (target != nil) {
        queryParams[@"target"] = target;
    }
    if (unit != nil) {
        queryParams[@"unit"] = unit;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKeyScheme"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIComputeIngredientAmount200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIComputeIngredientAmount200Response*)data, error);
                                }
                            }];
}

///
/// Get Ingredient Information
/// Use an ingredient id to get all available information about an ingredient, such as its image and supermarket aisle.
///  @param _id The item's id. 
///
///  @param amount The amount of this ingredient. (optional)
///
///  @param unit The unit for the given amount. (optional)
///
///  @returns OAIGetIngredientInformation200Response*
///
-(NSURLSessionTask*) getIngredientInformationWithId: (NSNumber*) _id
    amount: (NSNumber*) amount
    unit: (NSString*) unit
    completionHandler: (void (^)(OAIGetIngredientInformation200Response* output, NSError* error)) handler {
    // verify the required parameter '_id' is set
    if (_id == nil) {
        NSParameterAssert(_id);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"_id"] };
            NSError* error = [NSError errorWithDomain:kOAIIngredientsApiErrorDomain code:kOAIIngredientsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/food/ingredients/{id}/information"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (_id != nil) {
        pathParams[@"id"] = _id;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (amount != nil) {
        queryParams[@"amount"] = amount;
    }
    if (unit != nil) {
        queryParams[@"unit"] = unit;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKeyScheme"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIGetIngredientInformation200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIGetIngredientInformation200Response*)data, error);
                                }
                            }];
}

///
/// Get Ingredient Substitutes
/// Search for substitutes for a given ingredient.
///  @param ingredientName The name of the ingredient you want to replace. 
///
///  @returns OAIGetIngredientSubstitutes200Response*
///
-(NSURLSessionTask*) getIngredientSubstitutesWithIngredientName: (NSString*) ingredientName
    completionHandler: (void (^)(OAIGetIngredientSubstitutes200Response* output, NSError* error)) handler {
    // verify the required parameter 'ingredientName' is set
    if (ingredientName == nil) {
        NSParameterAssert(ingredientName);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"ingredientName"] };
            NSError* error = [NSError errorWithDomain:kOAIIngredientsApiErrorDomain code:kOAIIngredientsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/food/ingredients/substitutes"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (ingredientName != nil) {
        queryParams[@"ingredientName"] = ingredientName;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKeyScheme"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIGetIngredientSubstitutes200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIGetIngredientSubstitutes200Response*)data, error);
                                }
                            }];
}

///
/// Get Ingredient Substitutes by ID
/// Search for substitutes for a given ingredient.
///  @param _id The item's id. 
///
///  @returns OAIGetIngredientSubstitutes200Response*
///
-(NSURLSessionTask*) getIngredientSubstitutesByIDWithId: (NSNumber*) _id
    completionHandler: (void (^)(OAIGetIngredientSubstitutes200Response* output, NSError* error)) handler {
    // verify the required parameter '_id' is set
    if (_id == nil) {
        NSParameterAssert(_id);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"_id"] };
            NSError* error = [NSError errorWithDomain:kOAIIngredientsApiErrorDomain code:kOAIIngredientsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/food/ingredients/{id}/substitutes"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (_id != nil) {
        pathParams[@"id"] = _id;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKeyScheme"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIGetIngredientSubstitutes200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIGetIngredientSubstitutes200Response*)data, error);
                                }
                            }];
}

///
/// Ingredient Search
/// Search for simple whole foods (e.g. fruits, vegetables, nuts, grains, meat, fish, dairy etc.).
///  @param query The (natural language) search query. (optional)
///
///  @param addChildren Whether to add children of found foods. (optional)
///
///  @param minProteinPercent The minimum percentage of protein the food must have (between 0 and 100). (optional)
///
///  @param maxProteinPercent The maximum percentage of protein the food can have (between 0 and 100). (optional)
///
///  @param minFatPercent The minimum percentage of fat the food must have (between 0 and 100). (optional)
///
///  @param maxFatPercent The maximum percentage of fat the food can have (between 0 and 100). (optional)
///
///  @param minCarbsPercent The minimum percentage of carbs the food must have (between 0 and 100). (optional)
///
///  @param maxCarbsPercent The maximum percentage of carbs the food can have (between 0 and 100). (optional)
///
///  @param metaInformation Whether to return more meta information about the ingredients. (optional)
///
///  @param intolerances A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances. (optional)
///
///  @param sort The strategy to sort recipes by. See a full list of supported sorting options. (optional)
///
///  @param sortDirection The direction in which to sort. Must be either 'asc' (ascending) or 'desc' (descending). (optional)
///
///  @param offset The number of results to skip (between 0 and 900). (optional)
///
///  @param number The maximum number of items to return (between 1 and 100). Defaults to 10. (optional, default to @10)
///
///  @param language The language of the input. Either 'en' or 'de'. (optional)
///
///  @returns OAIIngredientSearch200Response*
///
-(NSURLSessionTask*) ingredientSearchWithQuery: (NSString*) query
    addChildren: (NSNumber*) addChildren
    minProteinPercent: (NSNumber*) minProteinPercent
    maxProteinPercent: (NSNumber*) maxProteinPercent
    minFatPercent: (NSNumber*) minFatPercent
    maxFatPercent: (NSNumber*) maxFatPercent
    minCarbsPercent: (NSNumber*) minCarbsPercent
    maxCarbsPercent: (NSNumber*) maxCarbsPercent
    metaInformation: (NSNumber*) metaInformation
    intolerances: (NSString*) intolerances
    sort: (NSString*) sort
    sortDirection: (NSString*) sortDirection
    offset: (NSNumber*) offset
    number: (NSNumber*) number
    language: (NSString*) language
    completionHandler: (void (^)(OAIIngredientSearch200Response* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/food/ingredients/search"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (query != nil) {
        queryParams[@"query"] = query;
    }
    if (addChildren != nil) {
        queryParams[@"addChildren"] = [addChildren isEqual:@(YES)] ? @"true" : @"false";
    }
    if (minProteinPercent != nil) {
        queryParams[@"minProteinPercent"] = minProteinPercent;
    }
    if (maxProteinPercent != nil) {
        queryParams[@"maxProteinPercent"] = maxProteinPercent;
    }
    if (minFatPercent != nil) {
        queryParams[@"minFatPercent"] = minFatPercent;
    }
    if (maxFatPercent != nil) {
        queryParams[@"maxFatPercent"] = maxFatPercent;
    }
    if (minCarbsPercent != nil) {
        queryParams[@"minCarbsPercent"] = minCarbsPercent;
    }
    if (maxCarbsPercent != nil) {
        queryParams[@"maxCarbsPercent"] = maxCarbsPercent;
    }
    if (metaInformation != nil) {
        queryParams[@"metaInformation"] = [metaInformation isEqual:@(YES)] ? @"true" : @"false";
    }
    if (intolerances != nil) {
        queryParams[@"intolerances"] = intolerances;
    }
    if (sort != nil) {
        queryParams[@"sort"] = sort;
    }
    if (sortDirection != nil) {
        queryParams[@"sortDirection"] = sortDirection;
    }
    if (offset != nil) {
        queryParams[@"offset"] = offset;
    }
    if (number != nil) {
        queryParams[@"number"] = number;
    }
    if (language != nil) {
        queryParams[@"language"] = language;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKeyScheme"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIIngredientSearch200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIIngredientSearch200Response*)data, error);
                                }
                            }];
}

///
/// Ingredients by ID Image
/// Visualize a recipe's ingredient list.
///  @param _id The recipe id. 
///
///  @param measure Whether the the measures should be 'us' or 'metric'. (optional)
///
///  @returns NSURL*
///
-(NSURLSessionTask*) ingredientsByIDImageWithId: (NSNumber*) _id
    measure: (NSString*) measure
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler {
    // verify the required parameter '_id' is set
    if (_id == nil) {
        NSParameterAssert(_id);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"_id"] };
            NSError* error = [NSError errorWithDomain:kOAIIngredientsApiErrorDomain code:kOAIIngredientsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/recipes/{id}/ingredientWidget.png"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (_id != nil) {
        pathParams[@"id"] = _id;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (measure != nil) {
        queryParams[@"measure"] = measure;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"image/png"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKeyScheme"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSURL*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSURL*)data, error);
                                }
                            }];
}

///
/// Map Ingredients to Grocery Products
/// Map a set of ingredients to products you can buy in the grocery store.
///  @param mapIngredientsToGroceryProductsRequest  
///
///  @returns OAISet<OAIMapIngredientsToGroceryProducts200ResponseInner>*
///
-(NSURLSessionTask*) mapIngredientsToGroceryProductsWithMapIngredientsToGroceryProductsRequest: (OAIMapIngredientsToGroceryProductsRequest*) mapIngredientsToGroceryProductsRequest
    completionHandler: (void (^)(OAISet<OAIMapIngredientsToGroceryProducts200ResponseInner>* output, NSError* error)) handler {
    // verify the required parameter 'mapIngredientsToGroceryProductsRequest' is set
    if (mapIngredientsToGroceryProductsRequest == nil) {
        NSParameterAssert(mapIngredientsToGroceryProductsRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"mapIngredientsToGroceryProductsRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIIngredientsApiErrorDomain code:kOAIIngredientsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/food/ingredients/map"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKeyScheme"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = mapIngredientsToGroceryProductsRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAISet<OAIMapIngredientsToGroceryProducts200ResponseInner>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAISet<OAIMapIngredientsToGroceryProducts200ResponseInner>*)data, error);
                                }
                            }];
}

///
/// Ingredients Widget
/// Visualize ingredients of a recipe. You can play around with that endpoint!
///  @param ingredientList The ingredient list of the recipe, one ingredient per line (separate lines with \\\\n). 
///
///  @param servings The number of servings. 
///
///  @param language The language of the input. Either 'en' or 'de'. (optional)
///
///  @param measure The original system of measurement, either 'metric' or 'us'. (optional)
///
///  @param view How to visualize the ingredients, either 'grid' or 'list'. (optional)
///
///  @param defaultCss Whether the default CSS should be added to the response. (optional)
///
///  @param showBacklink Whether to show a backlink to spoonacular. If set false, this call counts against your quota. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) visualizeIngredientsWithIngredientList: (NSString*) ingredientList
    servings: (NSNumber*) servings
    language: (NSString*) language
    measure: (NSString*) measure
    view: (NSString*) view
    defaultCss: (NSNumber*) defaultCss
    showBacklink: (NSNumber*) showBacklink
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'ingredientList' is set
    if (ingredientList == nil) {
        NSParameterAssert(ingredientList);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"ingredientList"] };
            NSError* error = [NSError errorWithDomain:kOAIIngredientsApiErrorDomain code:kOAIIngredientsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'servings' is set
    if (servings == nil) {
        NSParameterAssert(servings);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"servings"] };
            NSError* error = [NSError errorWithDomain:kOAIIngredientsApiErrorDomain code:kOAIIngredientsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/recipes/visualizeIngredients"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (language != nil) {
        queryParams[@"language"] = language;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"text/html"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"apiKeyScheme"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (ingredientList) {
        formParams[@"ingredientList"] = ingredientList;
    }
    if (servings) {
        formParams[@"servings"] = servings;
    }
    if (measure) {
        formParams[@"measure"] = measure;
    }
    if (view) {
        formParams[@"view"] = view;
    }
    if (defaultCss) {
        formParams[@"defaultCss"] = defaultCss;
    }
    if (showBacklink) {
        formParams[@"showBacklink"] = showBacklink;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}



@end
