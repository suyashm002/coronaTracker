package com.suyash.coronavirusapp.network

import com.suyash.coronavirusapp.network.response.CountryWiseCase
import com.suyash.coronavirusapp.network.response.WorldStats
import retrofit2.http.GET

@JvmSuppressWildcards
interface ApiClient {

    @GET("coronavirus/cases_by_country.php")
    suspend fun getCountryWiseCases(): CountryWiseCase

    @GET("coronavirus/worldstat.php")
    suspend fun getWorldStats(): WorldStats
}