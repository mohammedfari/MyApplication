package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class adapter_Pg extends FragmentStateAdapter {
    ArrayList<Fragment> arrayList;
    public adapter_Pg(@NonNull FragmentActivity fragmentActivity, ArrayList<Fragment> fragments) {
        super(fragmentActivity);
        this.arrayList = fragments;
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public Fragment createFragment(int position) {
        return arrayList.get(position);
    }
}
