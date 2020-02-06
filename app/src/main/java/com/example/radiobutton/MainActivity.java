package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView offerRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        offerRecyclerView = (RecyclerView) findViewById(R.id.offers_lst);

        LinearLayoutManager recyclerLayoutManager = new LinearLayoutManager(this);
        offerRecyclerView.setLayoutManager(recyclerLayoutManager);

        DividerItemDecoration dividerItemDecoration =
                new DividerItemDecoration(offerRecyclerView.getContext(),
                        recyclerLayoutManager.getOrientation());
        offerRecyclerView.addItemDecoration(dividerItemDecoration);


        OffersRecyclerViewAdapter recyclerViewAdapter = new
                OffersRecyclerViewAdapter(getBrands(),this);
        offerRecyclerView.setAdapter(recyclerViewAdapter);
    }

    private List<OffersModel> getBrands(){
        List<OffersModel> modelList = new ArrayList<OffersModel>();
        modelList.add(new OffersModel("Get Upto 20% Off Clothing", 300));
        modelList.add(new OffersModel("Free Smart Phone", 200));
        modelList.add(new OffersModel("Pay $100 get big HD TV", 600));
        modelList.add(new OffersModel("Get Upto 40% Off All", 500));
        modelList.add(new OffersModel("Buy One Get One Free", 100));
        modelList.add(new OffersModel("Pay $200 get Laptop", 1600));
        modelList.add(new OffersModel("Get Upto 50% Off Electronics", 300));
        modelList.add(new OffersModel("Free Movie Ticket", 400));
        modelList.add(new OffersModel("Pay $100 Travel Europe", 700));
        modelList.add(new OffersModel("Get Upto 27% Off Appliance", 600));
        modelList.add(new OffersModel("Get Upto 44% Off Jewellery", 700));
        modelList.add(new OffersModel("Free Coupons", 500));
        modelList.add(new OffersModel("Pay $100 get Tablet", 600));
        return modelList;
    }
}
