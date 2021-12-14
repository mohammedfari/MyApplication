package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.CustomiItemBinding;

import java.util.ArrayList;

public class Rr_adapter extends RecyclerView.Adapter<Rr_adapter.Holder>{
    ArrayList<Product_cl> arrayList;
    on_click_Item on_click_Item;

    public Rr_adapter(ArrayList<Product_cl> arrayList, on_click_Item on_click_Item) {
        this.arrayList = arrayList;
        this.on_click_Item = on_click_Item;
    }



    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.customi_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.Bind(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        CustomiItemBinding binding;
        Product_cl productCl;
        public Holder(@NonNull View itemView) {
            super(itemView);
            binding = CustomiItemBinding.bind(itemView);
            binding.name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    on_click_Item.onClick(productCl);
                }
            });
        }

        public void Bind(Product_cl item) {
            productCl = item;
            binding.name.setText(item.getName());
//            binding.desc.setText(item.getCategory_name());

            binding.price.setText(String.valueOf(item.getPrice()));
            binding.imageView2.setImageResource(item.getImg());
            binding.starIv.setImageResource(item.getStar());
            binding.rv.setHasFixedSize(true);

            binding.rv.setLayoutManager
                    (new LinearLayoutManager(binding.getRoot().getContext(), LinearLayoutManager.HORIZONTAL, false));
        }
    }
}
