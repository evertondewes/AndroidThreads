package com.example.androidthreads;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressionarBotao(View v){
        ProgressBar pb1 = findViewById(R.id.progressBar);
        ProgressBar pb2 = findViewById(R.id.progressBar2);


        LinhaExecucao le1 = new LinhaExecucao(pb1);
        LinhaExecucao le2 = new LinhaExecucao(pb2);

        le1.start();
        le2.start();

        ProgressBar pb3 = findViewById(R.id.progressBar3);
        ProgressBar pb4 = findViewById(R.id.progressBar4);

        LinhaExecucaoInterface lei3 = new LinhaExecucaoInterface(pb3);
        LinhaExecucaoInterface lei4 = new LinhaExecucaoInterface(pb4);


        Thread t3 = new Thread(lei3);
        Thread t4 = new Thread(lei4);

        t3.start();
        t4.start();


    }
}
