package com.example.rita_pc.retrofitdemo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by RITA-PC on 31/12/2016.
 */

public class Flower
{
    @SerializedName("productId")
    private int productId;

    @SerializedName("name")
    private String name;

    @SerializedName("category")
    private String category;

    @SerializedName("instructions")
    private String instructions;

    @SerializedName("price")
    private double price;

    @SerializedName("photo")
    private String photo;


    //private Bitmap bitmap;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
