package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class Frag4 extends Fragment {

    private View view;
    private ListView list1;
    private ListView list2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag4, container, false);

        list1 = view.findViewById(R.id.frag4_list1);
        List<String> data1 = new ArrayList<>();

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1, data1);
        list1.setAdapter(adapter1);

        data1.add("결제/환불 내역");
        data1.add("쿠폰/프로모션");
        adapter1.notifyDataSetChanged();

        list2 = view.findViewById(R.id.frag4_list4);
        List<String> data2 = new ArrayList<>();

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1, data2);
        list2.setAdapter(adapter2);

        data2.add("명인등록");
        data2.add("위시리스트");
        data2.add("FAQ");
        data2.add("이용약관");
        data2.add("로그아웃");
        adapter2.notifyDataSetChanged();


        return view;
    }
}
