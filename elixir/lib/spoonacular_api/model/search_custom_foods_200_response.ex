# NOTE: This file is auto generated by OpenAPI Generator 7.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.SearchCustomFoods200Response do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :customFoods,
    :type,
    :offset,
    :number
  ]

  @type t :: %__MODULE__{
    :customFoods => [SpoonacularAPI.Model.SearchCustomFoods200ResponseCustomFoodsInner.t],
    :type => String.t,
    :offset => integer(),
    :number => integer()
  }

  alias SpoonacularAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:customFoods, :list, SpoonacularAPI.Model.SearchCustomFoods200ResponseCustomFoodsInner)
  end
end

