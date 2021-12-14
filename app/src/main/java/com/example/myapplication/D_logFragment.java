package com.example.myapplication;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class D_logFragment extends androidx.fragment.app.DialogFragment{
    public static final String NUM1 = "num1";
    public static final String NUM2 = "num2";
    public static final String O = "O";

    public static D_logFragment newInstance(int num1, int num2, String o) {
        D_logFragment fragment = new D_logFragment();
        Bundle args = new Bundle();
        args.putInt(NUM1,num1);
        args.putInt(NUM2,num2);
        args.putString(O,o);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }
}
