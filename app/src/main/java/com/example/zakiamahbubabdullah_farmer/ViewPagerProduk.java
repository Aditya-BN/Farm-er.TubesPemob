package com.example.zakiamahbubabdullah_farmer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerProduk extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.mipmap.kentanginfo, R.mipmap.caberawitinfo, R.mipmap.cabeinfo, R.mipmap.teronginfo, R.mipmap.jagunginfo, R.mipmap.timuninfo,
                                R.mipmap.apel1info, R.mipmap.manggainfo, R.mipmap.pisanginfo};

    public ViewPagerProduk(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position){
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        final ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
        imageView.setImageResource(images[position]);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    Intent intent = new Intent(context,Kentang.class);
                    context.startActivity(intent);
                }
                else if (position == 1){
                    Intent intent = new Intent(context,CabeRawit.class);
                    context.startActivity(intent);
                }
                else if (position == 2) {
                    Intent intent = new Intent(context, Cabe.class);
                    context.startActivity(intent);
                }
                else if (position == 3) {
                    Intent intent = new Intent(context, Terong.class);
                    context.startActivity(intent);
                }
                else if (position == 4) {
                    Intent intent = new Intent(context, Jagung.class);
                    context.startActivity(intent);
                }
                else if (position == 5) {
                    Intent intent = new Intent(context, Timun.class);
                    context.startActivity(intent);
                }
                else if (position == 6){
                    Intent intent = new Intent(context,Apel.class);
                    context.startActivity(intent);
                }
                else if (position == 7) {
                    Intent intent = new Intent(context, Mangga.class);
                    context.startActivity(intent);
                }
                else if (position == 8) {
                    Intent intent = new Intent(context, Pisang.class);
                    context.startActivity(intent);
                }
            }
        });

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
