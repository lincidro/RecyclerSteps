package com.eduardo.recyclerpractice1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.eduardo.recyclerpractice1.Adapter.CarAdapterRecycler;
import com.eduardo.recyclerpractice1.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Car> carList;
    private CarAdapterRecycler adapter;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initXML();
        setupRecycler();
    }

    private void initXML(){
        carList = new ArrayList<>();
        rv = findViewById(R.id.recycler_view);
        populateList();
    }

    private void setupRecycler(){
        adapter = new CarAdapterRecycler(carList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
        rv.setAdapter(adapter);
    }

    private void populateList(){
        carList.add(new Car("Suzuki",1500,5));
        carList.add(new Car("Toyota",1500,5));
        carList.add(new Car("Suzuki",2000,5));
        carList.add(new Car("Lamborghini",4500,5));
        carList.add(new Car("Daewoo",1500,5));
        carList.add(new Car("Renault",1500,5));
        carList.add(new Car("Peugeot",1500,5));
        carList.add(new Car("Maserati",3500,5));
        carList.add(new Car("Subaru",2500,5));
        carList.add(new Car("Alfa Romeo",1500,5));
        carList.add(new Car("Volkswagen",1500,5));
        carList.add(new Car("BMW",3500,5));
        carList.add(new Car("Mercedes Benz",3000,5));
    }
}
