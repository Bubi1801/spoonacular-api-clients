# NOTE: This file is auto generated by OpenAPI Generator 7.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.ImageClassificationByUrl200Response do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :category,
    :probability
  ]

  @type t :: %__MODULE__{
    :category => String.t,
    :probability => float()
  }

  def decode(value) do
    value
  end
end

