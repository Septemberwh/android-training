package com.example.septe.myapplication.fragment;


import android.content.Intent;
import android.icu.util.ValueIterator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.septe.myapplication.MainActivity;
import com.example.septe.myapplication.R;
import com.example.septe.myapplication.service.TestService1;
import com.example.septe.myapplication.tools.MyAsyncTask;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment8 extends Fragment {

    private TextView txttitle;
    private ProgressBar pgbar;
    private Button btnupdate;

    private Button start;
    private Button stop;


    public BlankFragment8() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment8, container, false);
        txttitle = (TextView) view.findViewById(R.id.txttile);
        pgbar = (ProgressBar) view.findViewById(R.id.pgbar);
        btnupdate = (Button) view.findViewById(R.id.btnupdate);
        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyAsyncTask myTask = new MyAsyncTask(txttitle, pgbar);
                myTask.execute(1000);
            }
        });

        start = (Button) view.findViewById(R.id.btn_8_1);
        stop = (Button) view.findViewById(R.id.btn_8_2);
        // 创建启动
        final Intent intent = new Intent(getActivity(), TestService1.class);
//        intent.setAction("android.intent.action.TEST_SERVICE1");
        // 为两个按钮设置点击事件，分别是启动与停止service
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startService(intent);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().stopService(intent);
            }
        });

        return view;
    }

}
