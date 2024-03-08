-module(spoonacular_get_recipe_information_200_response_extended_ingredients_inner_measures_metric).

-export([encode/1]).

-export_type([spoonacular_get_recipe_information_200_response_extended_ingredients_inner_measures_metric/0]).

-type spoonacular_get_recipe_information_200_response_extended_ingredients_inner_measures_metric() ::
    #{ 'amount' := integer(),
       'unitLong' := binary(),
       'unitShort' := binary()
     }.

encode(#{ 'amount' := Amount,
          'unitLong' := UnitLong,
          'unitShort' := UnitShort
        }) ->
    #{ 'amount' => Amount,
       'unitLong' => UnitLong,
       'unitShort' => UnitShort
     }.
