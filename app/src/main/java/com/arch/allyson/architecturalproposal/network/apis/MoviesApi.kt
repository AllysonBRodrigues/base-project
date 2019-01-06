package com.arch.allyson.architecturalproposal.network.apis

import com.arch.allyson.architecturalproposal.domain.ResultMoviesList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface MoviesApi {

    @GET("{function}")
    fun getTopRatedMovie(@Path("function")function: String, @Query("api_key") api_key: String,
                         @Query("language") language: String ): Call<ResultMoviesList>

}