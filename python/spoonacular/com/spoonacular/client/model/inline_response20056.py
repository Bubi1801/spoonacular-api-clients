# coding: utf-8

"""
    spoonacular API

    The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.  # noqa: E501

    The version of the OpenAPI document: 1.0
    Contact: mail@spoonacular.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class InlineResponse20056(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'answer_text': 'str',
        'media': 'list[object]'
    }

    attribute_map = {
        'answer_text': 'answerText',
        'media': 'media'
    }

    def __init__(self, answer_text=None, media=None):  # noqa: E501
        """InlineResponse20056 - a model defined in OpenAPI"""  # noqa: E501

        self._answer_text = None
        self._media = None
        self.discriminator = None

        self.answer_text = answer_text
        self.media = media

    @property
    def answer_text(self):
        """Gets the answer_text of this InlineResponse20056.  # noqa: E501


        :return: The answer_text of this InlineResponse20056.  # noqa: E501
        :rtype: str
        """
        return self._answer_text

    @answer_text.setter
    def answer_text(self, answer_text):
        """Sets the answer_text of this InlineResponse20056.


        :param answer_text: The answer_text of this InlineResponse20056.  # noqa: E501
        :type: str
        """
        if answer_text is None:
            raise ValueError("Invalid value for `answer_text`, must not be `None`")  # noqa: E501
        if answer_text is not None and len(answer_text) < 1:
            raise ValueError("Invalid value for `answer_text`, length must be greater than or equal to `1`")  # noqa: E501

        self._answer_text = answer_text

    @property
    def media(self):
        """Gets the media of this InlineResponse20056.  # noqa: E501


        :return: The media of this InlineResponse20056.  # noqa: E501
        :rtype: list[object]
        """
        return self._media

    @media.setter
    def media(self, media):
        """Sets the media of this InlineResponse20056.


        :param media: The media of this InlineResponse20056.  # noqa: E501
        :type: list[object]
        """
        if media is None:
            raise ValueError("Invalid value for `media`, must not be `None`")  # noqa: E501

        self._media = media

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, InlineResponse20056):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
