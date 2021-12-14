package com.example.myapplication;

import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;

public class Product_cl implements Serializable {
    private String name,category_name;
    private int img;
    private String price;
    private int star;
    private String fileName ;


    public Product_cl(String name, String category_name, int img, String price, int star, String fileName) {
        this.name = name;
        this.category_name = category_name;
        this.img = img;
        this.price = price;
        this.star = star;
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
