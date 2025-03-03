package com.example.quizappkotlin.retrofit

import com.example.quizappkotlin.model.QuestionList
import retrofit2.Response
import retrofit2.http.GET

interface APICall {
    @GET("APIquestions.php")
    suspend fun getQuestions() : Response<QuestionList>

}