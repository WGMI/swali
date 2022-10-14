package com.example.swali.Network;

import com.example.swali.Models.Question;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiClient {

    @GET
    Call<List<Question>> fetchQuestions();

}
