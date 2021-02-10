package shah.rahul.taskdemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

import shah.rahul.taskdemo.data.Cuisine;


public class MyAdapter extends PagerAdapter {

    Context context;
    List<Cuisine> cuisineList;

    public MyAdapter(Context context, List<Cuisine> cuisineList) {
        this.context = context;
        this.cuisineList = cuisineList;
    }

    @Override
    public int getCount() {
        return cuisineList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.cuisine_item, container, false);

        ImageView cuisineImage = view.findViewById(R.id.img_cuisine);
        TextView cuisineTitle = view.findViewById(R.id.tv_cuisine_title);

        //set data
        cuisineImage.setImageResource(cuisineList.get(position).getImage());
        cuisineTitle.setText(cuisineList.get(position).getTitle());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ""+cuisineList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                context.startActivity(new Intent(context, SecondActivity.class));
            }
        });

        container.addView(view);
        return view;
    }
}
