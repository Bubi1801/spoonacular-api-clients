# NOTE: This file is auto generated by OpenAPI Generator 7.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.GetDishPairingForWine200Response do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :pairings,
    :text
  ]

  @type t :: %__MODULE__{
    :pairings => [String.t],
    :text => String.t
  }

  def decode(value) do
    value
  end
end

