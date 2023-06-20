package com.example.gripproject.Data;

public class Transaction {
    private String fromUser;
    private String ToUser;
    private int amountTransferred;
    private int status;

    public Transaction(String fromUser,String ToUser,int amountTransferred,int status){
        this.fromUser=fromUser;
        this.ToUser=ToUser;
        this.amountTransferred=amountTransferred;
        this.status=status;
    }

    public String getFromUser(){
        return fromUser;
    }

    public void setFromUser(String fromUser){
        this.fromUser=fromUser;
    }

    public String getToUser(){
        return ToUser;
    }

    public int getAmountTransferred(){
        return amountTransferred;
    }

    public int getStatus(){
        return status;
    }

    public void setToUser(String ToUser){
        this.ToUser=ToUser;
    }

    public void setStatus(int status){
        this.status=status;
    }

    public void setAmountTransferred(int amountTransferred){
        this.amountTransferred=amountTransferred;
    }

}
