package com.example.vedioapp;

public class Model {
    private int imageview;
    private String textview;
    private String videoview;

    Model(int imageview,String textview,String videoview){
        this.imageview = imageview ;
        this.textview = textview;
        this.videoview = videoview;
    }

    public int getImageview() {
        return imageview;
    }

    public String getTextview() {
        return textview;
    }

    public  String getVideoview(){
        return videoview;
    }

}
