#import "OAISearchRecipesByIngredients200ResponseInnerMissedIngredientsInner.h"

@implementation OAISearchRecipesByIngredients200ResponseInnerMissedIngredientsInner

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"aisle": @"aisle", @"amount": @"amount", @"_id": @"id", @"image": @"image", @"meta": @"meta", @"name": @"name", @"extendedName": @"extendedName", @"original": @"original", @"originalName": @"originalName", @"unit": @"unit", @"unitLong": @"unitLong", @"unitShort": @"unitShort" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"meta", @"extendedName", ];
  return [optionalProperties containsObject:propertyName];
}

@end
