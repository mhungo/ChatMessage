package com.example.chatmessage.Model;

public class Requests {

    public String date;

    public Requests(){

    }

    public Requests(String date){
        this.date = date;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }
}
