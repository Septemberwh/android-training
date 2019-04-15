package com.example.septe.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.septe.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment3} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment3 extends Fragment {

    public BlankFragment3() {
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
        final View view = inflater.inflate(R.layout.fragment_blank_fragment3, container, false);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) view.findViewById(checkedId);
                Toast.makeText(view.getContext(), "按钮组发生改变，你选了：" + radioButton.getText(), Toast.LENGTH_LONG).show();
            }
        });
        //
        Button btnchange = (Button) view.findViewById(R.id.btnpost);
        final RadioGroup radioGroup1 = (RadioGroup) view.findViewById(R.id.radioGroup);
        // 为radioGroup设置一个监听器 setOnCheckedChanged()
        btnchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                    RadioButton rd = (RadioButton) radioGroup1.getChildAt(i);
                    if (rd.isChecked()) {
                        Toast.makeText(getContext(), "点击提交按钮，获取你选择的是：" + rd.getText(), Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
        return view;
    }

}
