package com.example.septe.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.septe.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment6 extends Fragment {


    public BlankFragment6() {
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
        View view = inflater.inflate(R.layout.fragment_blank_fragment6, container, false);

        // show data
        String[] strs = {"计生", "必胜", "相声", "草绳", "节省"};
        // create ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(),android.R.layout.simple_expandable_list_item_1, strs);
        ListView list_test = (ListView) view.findViewById(R.id.list_test);
        list_test.setAdapter(adapter);
        return view;
    }

}
