package com.example.myapplication4;

public class Client extends com.example.myapplication4.User {
    public Integer weight;
    public Integer height;

    public Client(String name, String surname, String email, String password,
                  String gender, Integer age, String date_of_birth, Integer weight, Integer height) {
        super(name, surname, email, password, gender, age, date_of_birth);
    }

    public void pay(){}
    public void order_consultation(){}
}
