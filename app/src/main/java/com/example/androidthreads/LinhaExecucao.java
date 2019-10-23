package com.example.androidthreads;

import android.widget.ProgressBar;

import java.util.Random;

public class LinhaExecucao extends Thread {

    private ProgressBar pb;

    public LinhaExecucao(ProgressBar pb) {
        super();
        this.pb = pb;
    }

    @Override
    public void run() {
        super.run();

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
