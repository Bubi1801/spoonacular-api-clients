-module(spoonacular_map_ingredients_to_grocery_products_request).

-export([encode/1]).

-export_type([spoonacular_map_ingredients_to_grocery_products_request/0]).

-type spoonacular_map_ingredients_to_grocery_products_request() ::
    #{ 'ingredients' := list(),
       'servings' := integer()
     }.

encode(#{ 'ingredients' := Ingredients,
          'servings' := Servings
        }) ->
    #{ 'ingredients' => Ingredients,
       'servings' => Servings
     }.
