package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Client_data extends AppCompatActivity {

    private EditText user_name, user_surname, user_email, user_password,
            user_gender, user_age, user_date_of_birth, client_weight, client_height;
    private Button change_name, change_surname, change_email, change_password,
            change_gender, change_age, change_date_of_birth, change_weight, change_height;
    private com.example.myapplication4.Work_with_server work_with_server;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_data);

        user_name = findViewById(R.id.user_name);
        user_surname = findViewById(R.id.user_surname);
        user_email = findViewById(R.id.user_email);
        user_password = findViewById(R.id.user_password);
        user_gender = findViewById(R.id.user_gender);
        user_age = findViewById(R.id.user_age);
        user_date_of_birth = findViewById(R.id.user_date_of_birth);
        client_weight = findViewById(R.id.client_weight);
        client_height = findViewById(R.id.client_height);

        change_name = findViewById(R.id.change_name);
        change_surname = findViewById(R.id.change_surname);
        change_email = findViewById(R.id.change_email);
        change_password = findViewById(R.id.change_password);
        change_gender = findViewById(R.id.change_gender);
        change_age = findViewById(R.id.change_age);
        change_date_of_birth = findViewById(R.id.change_date_of_birth);
        change_weight = findViewById(R.id.change_weight);
        change_height = findViewById(R.id.change_height);

    } 
}
