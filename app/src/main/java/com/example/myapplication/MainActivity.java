package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.read_test2.databinding.ActivityMainBinding;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements on_click_Item {
    ActivityMainBinding binding;

    public static final String KEY = "KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        String[] categorys = {"كتبي","المكتبة"};

        super.onCreate(savedInstanceState);

//





        setContentView(binding.getRoot());
        class_ut.FellData();
        ArrayList<Fragment> arrayList = new ArrayList<>();
        for (int x=0;x<categorys.length;x++){
            arrayList.add(BlankFragment.newInstance(categorys[x]));
        }
        adapter_Pg adapter = new adapter_Pg(this,arrayList);
        binding.pag.setAdapter(adapter);
        new TabLayoutMediator(binding.tab, binding.pag, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(categorys[position]);
            }
        }).attach();
    }

    @Override
    public void onClick(Product_cl productCl) {
        PDFView pdfView =findViewById(R.id.pdfview);
        Intent intent =new Intent(MainActivity.this,pdfActivity.class);
        intent.putExtra(KEY , productCl );
        startActivity(intent);
          binding.textV.setText(productCl.getName());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu3:
                finish();

        }
        return super.onOptionsItemSelected(item);
    }
}