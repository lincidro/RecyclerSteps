package com.eduardo.recyclerpractice1.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eduardo.recyclerpractice1.Model.Car;
import com.eduardo.recyclerpractice1.R;

import java.util.List;

public class CarAdapterRecycler extends RecyclerView.Adapter<CarAdapterRecycler.MyViewHolder>{

    private List<Car> carList;

    public CarAdapterRecycler(List<Car> carList){
        this.carList = carList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Car car = carList.get(position);
        holder.etBrand.setText(car.getBrand());
        holder.etCc.setText(String.valueOf(car.getCc()));
        holder.etDoors.setText(String.valueOf(car.getDoors()));
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView etBrand, etCc, etDoors;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            etBrand = itemView.findViewById(R.id.tv_brand);
            etCc = itemView.findViewById(R.id.tv_cc);
            etDoors = itemView.findViewById(R.id.tv_doors);
        }
    }
}
