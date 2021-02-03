package com.i4bchile.templateproyect.model.remote

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface APIFunctions {
    @GET("all.json")
    suspend fun getsomething(): Response<List<Any>>
}

class RetrofitClient {

    companion object {
        private const val BASE_URL = "https://akabab.github.io/superhero-api/api/"

        fun retrofitClient(): APIFunctions{
            val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
                GsonConverterFactory.create()
            ).build()

            return retrofit.create(APIFunctions::class.java)


        }
    }


}