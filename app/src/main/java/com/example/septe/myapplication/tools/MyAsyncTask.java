package com.example.septe.myapplication.tools;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyAsyncTask extends AsyncTask<Integer, Integer, String> {

    private TextView txt;
    private ProgressBar pgbar;

    public MyAsyncTask(TextView txt, ProgressBar pgbar) {
        super();
        this.txt = txt;
        this.pgbar = pgbar;
    }

    public class DelayOperator {
        public void delay() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 改方法不运行在UI线程中，主要用于异步操作，通过调用publishProgress()方法
    // 触发onProgressUpdate对UI进行操作
    @Override
    protected String doInBackground(Integer... integers) {
        DelayOperator dop = new DelayOperator();
        int i = 0;
        for (i = 10; i <= 100; i+=10) {
            dop.delay();
            publishProgress(i);
        }
        return i + integers[0].intValue() + "";
    }

    @Override
    protected void onPreExecute() {
        txt.setText("开始执行异步线程");
    }

    // 在doBackground方法中，每次调用publishProgress方法都会触发该方法
    // 运行在UI线程中，可对UI控件进行操作
    @Override
    protected void onProgressUpdate(Integer... values) {
        int value = values[0];
        pgbar.setProgress(value);
    }

}
