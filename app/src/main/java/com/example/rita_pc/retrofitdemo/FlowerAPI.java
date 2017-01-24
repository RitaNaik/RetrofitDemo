package com.example.rita_pc.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by RITA-PC on 31/12/2016.
 */

public interface FlowerAPI
{

    @GET("/feeds/flowers.json")
    public Call<List<Flower>> getData();
}
