package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Doctor_interface extends AppCompatActivity {

    private Button give_consultation, no_give_consultation, change_data;
    private com.example.myapplication4.Work_with_server work_with_server;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_interface);

        change_data = findViewById(R.id.change_data);
        give_consultation = findViewById(R.id.give_consultation);
        no_give_consultation = findViewById(R.id.no_give_consultation);

    }
}
