package com.example.kjh_portpolio1;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class MainActivity_ViewPager_Adapter extends PagerAdapter {

    private int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
    private LayoutInflater inflater;
    private Context context;

    public MainActivity_ViewPager_Adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((View)object);
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_main_viewpager_item, container, false);
        ImageView imageView = view.findViewById(R.id.image);
        imageView.setImageResource(images[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }
}





















