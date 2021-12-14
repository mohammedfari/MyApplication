package com.example.myapplication;

public class D_log {
    private String result, tit;
    private int num1,num2,img;

    public D_log(String result, String title, int num1, int num2, int img) {
        this.result = result;
        this.tit = tit;
        this.num1 = num1;
        this.num2 = num2;
        this.img = img;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTitle() {
        return tit;
    }

    public void setTitle(String tit) {
        this.tit = tit;
    }

    public int getN1() {
        return num1;
    }

    public void setN1(int n1) {
        this.num1 = num1;
    }

    public int getN2() {
        return num2;
    }

    public void setN2(int n2) {
        this.num2 = num2;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
