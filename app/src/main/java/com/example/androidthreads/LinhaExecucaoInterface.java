package com.example.androidthreads;

import android.widget.ProgressBar;

import java.util.Random;

public class LinhaExecucaoInterface implements Runnable {

    private ProgressBar pb;

    public LinhaExecucaoInterface(ProgressBar pb) {
        this.pb = pb;
    }

    @Override
    public void run() {
        Random r = new Random();

        int i = 0;
        while (true) {
            if(i==100) {
                i = 0;
            }
            try{
                Thread.sleep(r.nextInt(1000));
            }catch (Exception e) {

            }
            this.pb.setProgress(i);
            i++;
        }
    }
}
