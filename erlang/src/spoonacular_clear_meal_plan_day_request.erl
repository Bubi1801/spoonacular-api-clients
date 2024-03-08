-module(spoonacular_clear_meal_plan_day_request).

-export([encode/1]).

-export_type([spoonacular_clear_meal_plan_day_request/0]).

-type spoonacular_clear_meal_plan_day_request() ::
    #{ 'username' := binary(),
       'date' := binary(),
       'hash' := binary()
     }.

encode(#{ 'username' := Username,
          'date' := Date,
          'hash' := Hash
        }) ->
    #{ 'username' => Username,
       'date' => Date,
       'hash' => Hash
     }.
