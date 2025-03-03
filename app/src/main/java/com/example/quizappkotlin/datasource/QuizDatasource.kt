package com.example.quizappkotlin.datasource

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.quizappkotlin.model.QuestionList
import com.example.quizappkotlin.retrofit.APICall
import com.example.quizappkotlin.retrofit.RetrofitInstance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuizDatasource {

    var questionsAPI : APICall

    init {
        questionsAPI = RetrofitInstance().getRetrofitInstance().create(APICall::class.java)
    }


    fun getQuestionsFromAPI() : LiveData<QuestionList> {

        var data = MutableLiveData<QuestionList>()

        var questionList : QuestionList

        CoroutineScope(Dispatchers.IO).launch {

            var response = questionsAPI.getQuestions()

            if (response != null ){

                questionList = response.body()!!

                data.postValue(questionList)

            }


        }

        return data

    }

}