# NOTE: This file is auto generated by OpenAPI Generator 7.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.GetRecipePriceBreakdownById200ResponseIngredientsInnerAmountMetric do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :unit,
    :value
  ]

  @type t :: %__MODULE__{
    :unit => String.t,
    :value => float()
  }

  def decode(value) do
    value
  end
end

