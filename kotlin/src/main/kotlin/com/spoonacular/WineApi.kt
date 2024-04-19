/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.spoonacular

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import com.spoonacular.client.model.GetDishPairingForWine200Response
import com.spoonacular.client.model.GetWineDescription200Response
import com.spoonacular.client.model.GetWinePairing200Response
import com.spoonacular.client.model.GetWineRecommendation200Response

import com.squareup.moshi.Json

import spoonacular.infrastructure.ApiClient
import spoonacular.infrastructure.ApiResponse
import spoonacular.infrastructure.ClientException
import spoonacular.infrastructure.ClientError
import spoonacular.infrastructure.ServerException
import spoonacular.infrastructure.ServerError
import spoonacular.infrastructure.MultiValueMap
import spoonacular.infrastructure.PartConfig
import spoonacular.infrastructure.RequestConfig
import spoonacular.infrastructure.RequestMethod
import spoonacular.infrastructure.ResponseType
import spoonacular.infrastructure.Success
import spoonacular.infrastructure.toMultiValue

class WineApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.spoonacular.com")
        }
    }

    /**
     * Dish Pairing for Wine
     * Find a dish that goes well with a given wine.
     * @param wine The type of wine that should be paired, e.g. \&quot;merlot\&quot;, \&quot;riesling\&quot;, or \&quot;malbec\&quot;.
     * @return GetDishPairingForWine200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDishPairingForWine(wine: kotlin.String) : GetDishPairingForWine200Response {
        val localVarResponse = getDishPairingForWineWithHttpInfo(wine = wine)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetDishPairingForWine200Response
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Dish Pairing for Wine
     * Find a dish that goes well with a given wine.
     * @param wine The type of wine that should be paired, e.g. \&quot;merlot\&quot;, \&quot;riesling\&quot;, or \&quot;malbec\&quot;.
     * @return ApiResponse<GetDishPairingForWine200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getDishPairingForWineWithHttpInfo(wine: kotlin.String) : ApiResponse<GetDishPairingForWine200Response?> {
        val localVariableConfig = getDishPairingForWineRequestConfig(wine = wine)

        return request<Unit, GetDishPairingForWine200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getDishPairingForWine
     *
     * @param wine The type of wine that should be paired, e.g. \&quot;merlot\&quot;, \&quot;riesling\&quot;, or \&quot;malbec\&quot;.
     * @return RequestConfig
     */
    fun getDishPairingForWineRequestConfig(wine: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("wine", listOf(wine.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/food/wine/dishes",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Wine Description
     * Get a simple description of a certain wine, e.g. \&quot;malbec\&quot;, \&quot;riesling\&quot;, or \&quot;merlot\&quot;.
     * @param wine The name of the wine that should be paired, e.g. \&quot;merlot\&quot;, \&quot;riesling\&quot;, or \&quot;malbec\&quot;.
     * @return GetWineDescription200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getWineDescription(wine: kotlin.String) : GetWineDescription200Response {
        val localVarResponse = getWineDescriptionWithHttpInfo(wine = wine)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetWineDescription200Response
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Wine Description
     * Get a simple description of a certain wine, e.g. \&quot;malbec\&quot;, \&quot;riesling\&quot;, or \&quot;merlot\&quot;.
     * @param wine The name of the wine that should be paired, e.g. \&quot;merlot\&quot;, \&quot;riesling\&quot;, or \&quot;malbec\&quot;.
     * @return ApiResponse<GetWineDescription200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getWineDescriptionWithHttpInfo(wine: kotlin.String) : ApiResponse<GetWineDescription200Response?> {
        val localVariableConfig = getWineDescriptionRequestConfig(wine = wine)

        return request<Unit, GetWineDescription200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getWineDescription
     *
     * @param wine The name of the wine that should be paired, e.g. \&quot;merlot\&quot;, \&quot;riesling\&quot;, or \&quot;malbec\&quot;.
     * @return RequestConfig
     */
    fun getWineDescriptionRequestConfig(wine: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("wine", listOf(wine.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/food/wine/description",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Wine Pairing
     * Find a wine that goes well with a food. Food can be a dish name (\&quot;steak\&quot;), an ingredient name (\&quot;salmon\&quot;), or a cuisine (\&quot;italian\&quot;).
     * @param food The food to get a pairing for. This can be a dish (\&quot;steak\&quot;), an ingredient (\&quot;salmon\&quot;), or a cuisine (\&quot;italian\&quot;).
     * @param maxPrice The maximum price for the specific wine recommendation in USD. (optional)
     * @return GetWinePairing200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getWinePairing(food: kotlin.String, maxPrice: java.math.BigDecimal? = null) : GetWinePairing200Response {
        val localVarResponse = getWinePairingWithHttpInfo(food = food, maxPrice = maxPrice)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetWinePairing200Response
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Wine Pairing
     * Find a wine that goes well with a food. Food can be a dish name (\&quot;steak\&quot;), an ingredient name (\&quot;salmon\&quot;), or a cuisine (\&quot;italian\&quot;).
     * @param food The food to get a pairing for. This can be a dish (\&quot;steak\&quot;), an ingredient (\&quot;salmon\&quot;), or a cuisine (\&quot;italian\&quot;).
     * @param maxPrice The maximum price for the specific wine recommendation in USD. (optional)
     * @return ApiResponse<GetWinePairing200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getWinePairingWithHttpInfo(food: kotlin.String, maxPrice: java.math.BigDecimal?) : ApiResponse<GetWinePairing200Response?> {
        val localVariableConfig = getWinePairingRequestConfig(food = food, maxPrice = maxPrice)

        return request<Unit, GetWinePairing200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getWinePairing
     *
     * @param food The food to get a pairing for. This can be a dish (\&quot;steak\&quot;), an ingredient (\&quot;salmon\&quot;), or a cuisine (\&quot;italian\&quot;).
     * @param maxPrice The maximum price for the specific wine recommendation in USD. (optional)
     * @return RequestConfig
     */
    fun getWinePairingRequestConfig(food: kotlin.String, maxPrice: java.math.BigDecimal?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("food", listOf(food.toString()))
                if (maxPrice != null) {
                    put("maxPrice", listOf(maxPrice.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/food/wine/pairing",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Wine Recommendation
     * Get a specific wine recommendation (concrete product) for a given wine type, e.g. \&quot;merlot\&quot;.
     * @param wine The type of wine to get a specific product recommendation for.
     * @param maxPrice The maximum price for the specific wine recommendation in USD. (optional)
     * @param minRating The minimum rating of the recommended wine between 0 and 1. For example, 0.8 equals 4 out of 5 stars. (optional)
     * @param number The number of wine recommendations expected (between 1 and 100). (optional, default to 10)
     * @return GetWineRecommendation200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getWineRecommendation(wine: kotlin.String, maxPrice: java.math.BigDecimal? = null, minRating: java.math.BigDecimal? = null, number: java.math.BigDecimal? = java.math.BigDecimal("10")) : GetWineRecommendation200Response {
        val localVarResponse = getWineRecommendationWithHttpInfo(wine = wine, maxPrice = maxPrice, minRating = minRating, number = number)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetWineRecommendation200Response
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Wine Recommendation
     * Get a specific wine recommendation (concrete product) for a given wine type, e.g. \&quot;merlot\&quot;.
     * @param wine The type of wine to get a specific product recommendation for.
     * @param maxPrice The maximum price for the specific wine recommendation in USD. (optional)
     * @param minRating The minimum rating of the recommended wine between 0 and 1. For example, 0.8 equals 4 out of 5 stars. (optional)
     * @param number The number of wine recommendations expected (between 1 and 100). (optional, default to 10)
     * @return ApiResponse<GetWineRecommendation200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getWineRecommendationWithHttpInfo(wine: kotlin.String, maxPrice: java.math.BigDecimal?, minRating: java.math.BigDecimal?, number: java.math.BigDecimal?) : ApiResponse<GetWineRecommendation200Response?> {
        val localVariableConfig = getWineRecommendationRequestConfig(wine = wine, maxPrice = maxPrice, minRating = minRating, number = number)

        return request<Unit, GetWineRecommendation200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getWineRecommendation
     *
     * @param wine The type of wine to get a specific product recommendation for.
     * @param maxPrice The maximum price for the specific wine recommendation in USD. (optional)
     * @param minRating The minimum rating of the recommended wine between 0 and 1. For example, 0.8 equals 4 out of 5 stars. (optional)
     * @param number The number of wine recommendations expected (between 1 and 100). (optional, default to 10)
     * @return RequestConfig
     */
    fun getWineRecommendationRequestConfig(wine: kotlin.String, maxPrice: java.math.BigDecimal?, minRating: java.math.BigDecimal?, number: java.math.BigDecimal?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("wine", listOf(wine.toString()))
                if (maxPrice != null) {
                    put("maxPrice", listOf(maxPrice.toString()))
                }
                if (minRating != null) {
                    put("minRating", listOf(minRating.toString()))
                }
                if (number != null) {
                    put("number", listOf(number.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/food/wine/recommendation",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
