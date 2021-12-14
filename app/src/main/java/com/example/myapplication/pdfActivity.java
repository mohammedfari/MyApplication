package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        PDFView pdfView =findViewById(R.id.pdfview);
        Product_cl productCl = (Product_cl) getIntent().getSerializableExtra(MainActivity.KEY);

        if (!TextUtils.isEmpty(productCl.getFileName()))
        pdfView.fromAsset(productCl.getFileName()).load();
    }
}