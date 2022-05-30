package com.foodapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rajendra.foodapp.adapter.AsiaFoodAdapter;
import com.rajendra.foodapp.adapter.PopularFoodAdapter;
import com.rajendra.foodapp.model.AsiaFood;
import com.rajendra.foodapp.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // now here we will add some dummy data to out model class

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Oreo Shake", "Rs.180", R.drawable.oreo1));
        popularFoodList.add(new PopularFood("Stuffed Garlic Bread", "Rs.90", R.drawable.garlicbread));
        popularFoodList.add(new PopularFood("Paneer Tikka", "Rs.220", R.drawable.paneertikka));
        popularFoodList.add(new PopularFood("Vada Pav", "Rs.70", R.drawable.vadapav));
        popularFoodList.add(new PopularFood("Veg Sushi", "Rs.90", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Fried momos", "Rs.170", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Chicken Sticks", "Rs.350", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Farmhouse Pizza", "Rs.250", R.drawable.asiafood1));
        popularFoodList.add(new PopularFood("Masala Dosa", "Rs.180", R.drawable.dosa));
        setPopularRecycler(popularFoodList);


        List<AsiaFood> asiaFoodList = new ArrayList<>();
       ;
        asiaFoodList.add(new AsiaFood("Choco Dessert", "Rs.350", R.drawable.dessert, "3.9", "The Butter Story"));
        asiaFoodList.add(new AsiaFood("Chocolate Truffle", "Rs.280", R.drawable.truffle, "4.6", "Chocolate Room Cafe"));
        asiaFoodList.add(new AsiaFood("Chocolate Muffins", "Rs.180", R.drawable.muffins, "4.2", "Metro Restaurant"));
        asiaFoodList.add(new AsiaFood("Chocolate Pudding", "Rs.300", R.drawable.pudd, "4.0", "Hazelnut Factory"));
        asiaFoodList.add(new AsiaFood("Choco Drip Cake", "Rs.270", R.drawable.drip_cake, "4.4", "Chocolate Factory"));

        setAsiaRecycler(asiaFoodList);

    }


    private void setPopularRecycler(List<PopularFood> popularFoodList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }

    private void setAsiaRecycler(List<AsiaFood> asiaFoodList) {

        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        asiaRecycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new AsiaFoodAdapter(this, asiaFoodList);
        asiaRecycler.setAdapter(asiaFoodAdapter);

    }


    // Hi all,
    // Today we are going to build a food app.
    // so the first things first lets add font and image assets
    // so lets see the design
    // now we will setup recyclerview
    // first we make a model class then adapter class.
    // now we will create a recyclerview row item layout file
    // so our adapter class is ready
    // now we will bind data with recyclerview
    // so we have successfully setup popular recyclerview
    // now same setup we need to do for asia food
    // will make model class then adapter and setup recyclerview
    // so lets do it fast.
    // so asia food setup done.
    // Now we will setup Bottom app bar
    // bottom app bar setup done if you want you can increase menu item in menu file
    // now we will setup details activity and on click listener in recyclerview row item

}
