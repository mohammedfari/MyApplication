package com.example.myapplication;

import java.util.ArrayList;
import java.util.Arrays;

public class class_ut {
    static ArrayList<Product_cl> productCls = new ArrayList<>();
    public static void FellData(){

       //category1
        productCls.add(new Product_cl("مدخل الي تجربة المستخدم","المكتبة",R.drawable.ux,"تعليمي",0 , "UX-Arabic.pdf"));
        productCls.add(new Product_cl("كل الطرق لا تؤدي الي روما","المكتبة",R.drawable.roma,"رواية",0,"roma.pdf" ));
        productCls.add(new Product_cl("التسويق والترابح من الانترنت","المكتبة",R.drawable.tasoeg,"تعليمي",0,"tasoeg.pdf"));
        productCls.add(new Product_cl("اللغة العربية","المكتبة",R.drawable.arb,"تعليمي",0,"arb.pdf"));
        productCls.add(new Product_cl("اساسيات اللغة الانجليزية","المكتبة",R.drawable.english,"تعليمي",0,"english.pdf"));
        productCls.add(new Product_cl("ليطمئن قلبي","المكتبة",R.drawable.haert,"رواية",0,"haert.pdf"));
//        //category2
        productCls.add(new Product_cl("اللغة العربية","كتبي",R.drawable.arb,"تعليمي",R.drawable.ic__792947_star_xmas_icon,"arb.pdf"));
        productCls.add(new Product_cl("التسويق والترابح من الانترنت","كتبي",R.drawable.tasoeg,"تعليمي",R.drawable.ic__792947_star_xmas_icon,"tasoeg.pdf"));
        productCls.add(new Product_cl("اساسيات اللغة الانجليزية ","كتبي ",R.drawable.english,"تعليمي",R.drawable.ic__792947_star_xmas_icon , "english.pdf"));
        productCls.add(new Product_cl("ليطمئن قلبي","كتبي",R.drawable.haert,"رواية",R.drawable.ic__792947_star_xmas_icon , "haert.pdf"));
        productCls.add(new Product_cl("كل الطرق لا تؤدي الي روما","كتبي",R.drawable.roma,"رواية",R.drawable.ic__792947_star_xmas_icon,"roma.pdf"));

   }

    public static ArrayList<Product_cl> getData(String  category){
        ArrayList<Product_cl> arrayList = new ArrayList<>();
        for (int y = 0; y< productCls.size(); y++){
            if (category.equals(productCls.get(y).getCategory_name())){
                arrayList.add(productCls.get(y));
            }
        }
        return arrayList;
    }
}
