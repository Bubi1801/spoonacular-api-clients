# NOTE: This file is auto generated by OpenAPI Generator 7.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.IngredientSearch200ResponseResultsInner do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :name,
    :image
  ]

  @type t :: %__MODULE__{
    :id => integer(),
    :name => String.t,
    :image => String.t
  }

  def decode(value) do
    value
  end
end

