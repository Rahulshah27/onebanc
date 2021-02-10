package shah.rahul.taskdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

import shah.rahul.taskdemo.data.CuisinesProducts;

public class CuisineResult extends AppCompatActivity {

    private TextView mTextView;
    private ArrayList<CuisinesProducts> ProductsList;
    private RecyclerView productRecyclerView;
    private RecyclerViewAdapterResult mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine_result);

        Button cart = findViewById(R.id.cart_result);
//        cart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(CuisineResult.this, Cart.class);
//                startActivity(intent);
//            }
//        });


        ProductsList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            CuisinesProducts products = new CuisinesProducts();

            products.setName("Chinese Cuisine " + i);
            if (i % 2 == 0)
                products.setImage(R.drawable.chinese_food1);
            else if (i % 3 == 0)
                products.setImage(R.drawable.chinese_food2);
            else
                products.setImage(R.drawable.chinese_food3);
            ProductsList.add(products);
        }
        buildRecyclerView();

    }


    public void buildRecyclerView() {
        productRecyclerView = findViewById(R.id.recyclerView_cuisine_result);
        productRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mAdapter = new RecyclerViewAdapterResult(ProductsList);
        productRecyclerView.setLayoutManager(mLayoutManager);
        productRecyclerView.setAdapter(mAdapter);

    }

}