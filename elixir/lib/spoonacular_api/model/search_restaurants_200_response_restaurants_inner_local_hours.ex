# NOTE: This file is auto generated by OpenAPI Generator 7.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.SearchRestaurants200ResponseRestaurantsInnerLocalHours do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :operational,
    :delivery,
    :pickup,
    :dine_in
  ]

  @type t :: %__MODULE__{
    :operational => SpoonacularAPI.Model.SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.t | nil,
    :delivery => SpoonacularAPI.Model.SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.t | nil,
    :pickup => SpoonacularAPI.Model.SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.t | nil,
    :dine_in => SpoonacularAPI.Model.SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.t | nil
  }

  alias SpoonacularAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:operational, :struct, SpoonacularAPI.Model.SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational)
     |> Deserializer.deserialize(:delivery, :struct, SpoonacularAPI.Model.SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational)
     |> Deserializer.deserialize(:pickup, :struct, SpoonacularAPI.Model.SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational)
     |> Deserializer.deserialize(:dine_in, :struct, SpoonacularAPI.Model.SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational)
  end
end

