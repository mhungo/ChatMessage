package com.example.chatmessage.Model;

public class Chats {

    public String date;

    public Chats(){

    }

    public Chats(String date){
        this.date = date;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }
}
