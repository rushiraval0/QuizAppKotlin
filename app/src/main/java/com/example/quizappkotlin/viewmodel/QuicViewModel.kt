package com.example.quizappkotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.quizappkotlin.datasource.QuizDatasource
import com.example.quizappkotlin.model.QuestionList

class QuizViewModel: ViewModel()  {

    private var repository :QuizDatasource = QuizDatasource()

    private var questionsLiveData  : LiveData<QuestionList> = repository.getQuestionsFromAPI()


    fun getQuestionsFromLiveData(): LiveData<QuestionList> {
        return questionsLiveData
    }
}