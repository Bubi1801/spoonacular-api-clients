-module(spoonacular_products_api).

-export([autocomplete_product_search/2, autocomplete_product_search/3,
         classify_grocery_product/2, classify_grocery_product/3,
         classify_grocery_product_bulk/2, classify_grocery_product_bulk/3,
         get_comparable_products/2, get_comparable_products/3,
         get_product_information/2, get_product_information/3,
         product_nutrition_by_id_image/2, product_nutrition_by_id_image/3,
         product_nutrition_label_image/2, product_nutrition_label_image/3,
         product_nutrition_label_widget/2, product_nutrition_label_widget/3,
         search_grocery_products/1, search_grocery_products/2,
         search_grocery_products_by_upc/2, search_grocery_products_by_upc/3,
         visualize_product_nutrition_by_id/2, visualize_product_nutrition_by_id/3]).

-define(BASE_URL, <<"">>).

%% @doc Autocomplete Product Search
%% Generate suggestions for grocery products based on a (partial) query. The matches will be found by looking in the title only.
-spec autocomplete_product_search(ctx:ctx(), binary()) -> {ok, spoonacular_autocomplete_product_search_200_response:spoonacular_autocomplete_product_search_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
autocomplete_product_search(Ctx, Query) ->
    autocomplete_product_search(Ctx, Query, #{}).

-spec autocomplete_product_search(ctx:ctx(), binary(), maps:map()) -> {ok, spoonacular_autocomplete_product_search_200_response:spoonacular_autocomplete_product_search_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
autocomplete_product_search(Ctx, Query, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(spoonacular_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/food/products/suggest"],
    QS = lists:flatten([{<<"query">>, Query}])++spoonacular_utils:optional_params(['number'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = spoonacular_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    spoonacular_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Classify Grocery Product
%% This endpoint allows you to match a packaged food to a basic category, e.g. a specific brand of milk to the category milk.
-spec classify_grocery_product(ctx:ctx(), spoonacular_classify_grocery_product_request:spoonacular_classify_grocery_product_request()) -> {ok, spoonacular_classify_grocery_product_200_response:spoonacular_classify_grocery_product_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
classify_grocery_product(Ctx, SpoonacularClassifyGroceryProductRequest) ->
    classify_grocery_product(Ctx, SpoonacularClassifyGroceryProductRequest, #{}).

-spec classify_grocery_product(ctx:ctx(), spoonacular_classify_grocery_product_request:spoonacular_classify_grocery_product_request(), maps:map()) -> {ok, spoonacular_classify_grocery_product_200_response:spoonacular_classify_grocery_product_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
classify_grocery_product(Ctx, SpoonacularClassifyGroceryProductRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(spoonacular_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/food/products/classify"],
    QS = lists:flatten([])++spoonacular_utils:optional_params(['locale'], _OptionalParams),
    Headers = [],
    Body1 = SpoonacularClassifyGroceryProductRequest,
    ContentTypeHeader = spoonacular_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    spoonacular_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Classify Grocery Product Bulk
%% Provide a set of product jsons, get back classified products.
-spec classify_grocery_product_bulk(ctx:ctx(), spoonacular_set:spoonacular_set()) -> {ok, [spoonacular_classify_grocery_product_bulk_200_response_inner:spoonacular_classify_grocery_product_bulk_200_response_inner()], spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
classify_grocery_product_bulk(Ctx, SpoonacularClassifyGroceryProductBulkRequestInnerArray) ->
    classify_grocery_product_bulk(Ctx, SpoonacularClassifyGroceryProductBulkRequestInnerArray, #{}).

-spec classify_grocery_product_bulk(ctx:ctx(), spoonacular_set:spoonacular_set(), maps:map()) -> {ok, [spoonacular_classify_grocery_product_bulk_200_response_inner:spoonacular_classify_grocery_product_bulk_200_response_inner()], spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
classify_grocery_product_bulk(Ctx, SpoonacularClassifyGroceryProductBulkRequestInnerArray, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(spoonacular_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/food/products/classifyBatch"],
    QS = lists:flatten([])++spoonacular_utils:optional_params(['locale'], _OptionalParams),
    Headers = [],
    Body1 = SpoonacularClassifyGroceryProductBulkRequestInnerArray,
    ContentTypeHeader = spoonacular_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    spoonacular_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Comparable Products
%% Find comparable products to the given one.
-spec get_comparable_products(ctx:ctx(), integer()) -> {ok, spoonacular_get_comparable_products_200_response:spoonacular_get_comparable_products_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
get_comparable_products(Ctx, Upc) ->
    get_comparable_products(Ctx, Upc, #{}).

-spec get_comparable_products(ctx:ctx(), integer(), maps:map()) -> {ok, spoonacular_get_comparable_products_200_response:spoonacular_get_comparable_products_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
get_comparable_products(Ctx, Upc, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(spoonacular_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/food/products/upc/", Upc, "/comparable"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = spoonacular_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    spoonacular_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Product Information
%% Use a product id to get full information about a product, such as ingredients, nutrition, etc. The nutritional information is per serving.
-spec get_product_information(ctx:ctx(), integer()) -> {ok, spoonacular_get_product_information_200_response:spoonacular_get_product_information_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
get_product_information(Ctx, Id) ->
    get_product_information(Ctx, Id, #{}).

-spec get_product_information(ctx:ctx(), integer(), maps:map()) -> {ok, spoonacular_get_product_information_200_response:spoonacular_get_product_information_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
get_product_information(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(spoonacular_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/food/products/", Id, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = spoonacular_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    spoonacular_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Product Nutrition by ID Image
%% Visualize a product's nutritional information as an image.
-spec product_nutrition_by_id_image(ctx:ctx(), integer()) -> {ok, maps:map(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
product_nutrition_by_id_image(Ctx, Id) ->
    product_nutrition_by_id_image(Ctx, Id, #{}).

-spec product_nutrition_by_id_image(ctx:ctx(), integer(), maps:map()) -> {ok, maps:map(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
product_nutrition_by_id_image(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(spoonacular_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/food/products/", Id, "/nutritionWidget.png"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = spoonacular_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    spoonacular_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Product Nutrition Label Image
%% Get a product's nutrition label as an image.
-spec product_nutrition_label_image(ctx:ctx(), integer()) -> {ok, maps:map(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
product_nutrition_label_image(Ctx, Id) ->
    product_nutrition_label_image(Ctx, Id, #{}).

-spec product_nutrition_label_image(ctx:ctx(), integer(), maps:map()) -> {ok, maps:map(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
product_nutrition_label_image(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(spoonacular_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/food/products/", Id, "/nutritionLabel.png"],
    QS = lists:flatten([])++spoonacular_utils:optional_params(['showOptionalNutrients', 'showZeroValues', 'showIngredients'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = spoonacular_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    spoonacular_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Product Nutrition Label Widget
%% Get a product's nutrition label as an HTML widget.
-spec product_nutrition_label_widget(ctx:ctx(), integer()) -> {ok, binary(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
product_nutrition_label_widget(Ctx, Id) ->
    product_nutrition_label_widget(Ctx, Id, #{}).

-spec product_nutrition_label_widget(ctx:ctx(), integer(), maps:map()) -> {ok, binary(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
product_nutrition_label_widget(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(spoonacular_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/food/products/", Id, "/nutritionLabel"],
    QS = lists:flatten([])++spoonacular_utils:optional_params(['defaultCss', 'showOptionalNutrients', 'showZeroValues', 'showIngredients'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = spoonacular_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    spoonacular_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Search Grocery Products
%% Search packaged food products, such as frozen pizza or Greek yogurt.
-spec search_grocery_products(ctx:ctx()) -> {ok, spoonacular_search_grocery_products_200_response:spoonacular_search_grocery_products_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
search_grocery_products(Ctx) ->
    search_grocery_products(Ctx, #{}).

-spec search_grocery_products(ctx:ctx(), maps:map()) -> {ok, spoonacular_search_grocery_products_200_response:spoonacular_search_grocery_products_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
search_grocery_products(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(spoonacular_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/food/products/search"],
    QS = lists:flatten([])++spoonacular_utils:optional_params(['query', 'minCalories', 'maxCalories', 'minCarbs', 'maxCarbs', 'minProtein', 'maxProtein', 'minFat', 'maxFat', 'addProductInformation', 'offset', 'number'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = spoonacular_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    spoonacular_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Search Grocery Products by UPC
%% Get information about a packaged food using its UPC.
-spec search_grocery_products_by_upc(ctx:ctx(), integer()) -> {ok, spoonacular_search_grocery_products_by_upc_200_response:spoonacular_search_grocery_products_by_upc_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
search_grocery_products_by_upc(Ctx, Upc) ->
    search_grocery_products_by_upc(Ctx, Upc, #{}).

-spec search_grocery_products_by_upc(ctx:ctx(), integer(), maps:map()) -> {ok, spoonacular_search_grocery_products_by_upc_200_response:spoonacular_search_grocery_products_by_upc_200_response(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
search_grocery_products_by_upc(Ctx, Upc, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(spoonacular_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/food/products/upc/", Upc, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = spoonacular_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    spoonacular_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Product Nutrition by ID Widget
%% Visualize a product's nutritional information as HTML including CSS.
-spec visualize_product_nutrition_by_id(ctx:ctx(), integer()) -> {ok, binary(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
visualize_product_nutrition_by_id(Ctx, Id) ->
    visualize_product_nutrition_by_id(Ctx, Id, #{}).

-spec visualize_product_nutrition_by_id(ctx:ctx(), integer(), maps:map()) -> {ok, binary(), spoonacular_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), spoonacular_utils:response_info()}.
visualize_product_nutrition_by_id(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(spoonacular_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/food/products/", Id, "/nutritionWidget"],
    QS = lists:flatten([])++spoonacular_utils:optional_params(['defaultCss'], _OptionalParams),
    Headers = []++spoonacular_utils:optional_params(['Accept'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = spoonacular_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    spoonacular_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


