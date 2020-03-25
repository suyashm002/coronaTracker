package com.suyash.coronavirusapp.ui.main

import com.suyash.coronavirusapp.network.ApiClient
import com.suyash.coronavirusapp.network.response.CountryWiseCase
import com.suyash.coronavirusapp.network.response.WorldStats
import com.suyash.coronavirusapp.util.NetworkResult
import com.suyash.coronavirusapp.util.safeApiCall
import javax.inject.Inject

class MainRepo @Inject constructor(private val apiClient: ApiClient){

    suspend fun getCountryWiseCases(): NetworkResult<CountryWiseCase> {
        var networkResult: NetworkResult<CountryWiseCase>? = null

        safeApiCall( { apiClient.getCountryWiseCases() },
            { networkResult = it },
            { networkResult = it }
        )

        return networkResult!!
    }

    suspend fun getWorldStats(): NetworkResult<WorldStats> {
        var networkResult: NetworkResult<WorldStats>? = null

        safeApiCall( { apiClient.getWorldStats() },
            { networkResult = it },
            { networkResult = it }
        )

        return networkResult!!
    }
}