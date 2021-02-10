package shah.rahul.taskdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import shah.rahul.taskdemo.data.Cuisine;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    List<Cuisine> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showSlider();
        viewPager = findViewById(R.id.view_pager);
        MyAdapter adapter = new MyAdapter(this, list);
        viewPager.setAdapter(adapter);

    }

    private void showSlider() {
        list.add(new Cuisine("Chinese Cuisine", R.drawable.cuisine_chinese));
        list.add(new Cuisine("North Indian Cuisine", R.drawable.cuisine_north_indian));
        list.add(new Cuisine("South Indian Cuisine", R.drawable.cuisine_south_indian));
        list.add(new Cuisine("Italian Cuisine", R.drawable.cuisine_italian));
        list.add(new Cuisine("Mexican Cuisine", R.drawable.cuisine_maxican));
    }
}