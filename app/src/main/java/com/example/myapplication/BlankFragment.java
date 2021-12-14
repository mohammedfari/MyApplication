package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentBlankBinding;

import java.util.ArrayList;

public class BlankFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match

    private static final String ARG_PARAM1 = "param1";
    private on_click_Item on_click_Item;
    // TODO: Rename and change types of parameters
    private String mParam1;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof on_click_Item){
            on_click_Item = (on_click_Item) context;
        }
    }

    public BlankFragment() {
    }
   public static BlankFragment newInstance(String param1) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        FragmentBlankBinding binding;
        super.onViewCreated(view, savedInstanceState);
        binding = FragmentBlankBinding.bind(view);
        binding.rv.setHasFixedSize(true);
        ArrayList<Product_cl> arrayList = class_ut.getData(mParam1);
        binding.rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        Rr_adapter adapter = new Rr_adapter(arrayList, new on_click_Item() {
            @Override
            public void onClick(Product_cl product) {
                on_click_Item.onClick(product);
            }
        });
        binding.rv.setAdapter(adapter);
    }
}