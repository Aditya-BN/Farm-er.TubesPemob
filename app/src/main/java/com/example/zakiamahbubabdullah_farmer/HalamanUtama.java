package com.example.zakiamahbubabdullah_farmer;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.material.snackbar.Snackbar;

import java.util.Timer;
import java.util.TimerTask;

public class HalamanUtama extends AppCompatActivity {
    int currentPage = 0, currentPageProduk = 0;
    Timer timer;
    final long DELAY_MS = 500;
    final long PERIOD_MS = 3000;
    private int dotscount;
    private ImageView[] dots;
    ViewPager viewPager;
    LinearLayout sliderDotspanel;

    ViewFlipper viewFlipper;
    Animation fadein, fadeout;
    Button semuaproduk;

    private MapView mapView;
    private GoogleMap gmap;
    private static final String MAP_VIEW_BUNDLE_KEY = "MapViewBundleKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
        ImageView ketiga = findViewById(R.id.map);
        final ImageView apel = findViewById(R.id.apel);
        ImageView cabe = findViewById(R.id.cabe);
        ImageView caberawit = findViewById(R.id.caberawit);
        ImageView jagung = findViewById(R.id.jagung);
        ImageView kentang = findViewById(R.id.kentang);
        ImageView mangga = findViewById(R.id.mangga);
        ImageView pisang = findViewById(R.id.pisang);
        ImageView terong = findViewById(R.id.terong);
        ImageView timun = findViewById(R.id.timun);
        Button infokami = findViewById(R.id.infokami);

        //inisialisasi viewpager buat image slidernya
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        sliderDotspanel = (LinearLayout) findViewById(R.id.sliderdots);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        //program buat buletan buletan yang ada dibawah gambar
        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];
        for (int i = 0; i < dotscount; i++) {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);
            sliderDotspanel.addView(dots[i], params);
        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < dotscount; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            @Override
            public void run() {
                if (currentPage == 4 - 1) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);


        final Handler handlerProduk = new Handler();
        final Runnable UpdateProduk = new Runnable() {
            @Override
            public void run() {
                if (currentPageProduk == 10 - 1) {
                    currentPageProduk = 0;
                }

            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handlerProduk.post(UpdateProduk);
            }
        }, DELAY_MS, PERIOD_MS);

        viewFlipper = (ViewFlipper) findViewById(R.id.flipper);
        fadein = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadeout);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();


        semuaproduk = findViewById(R.id.produk);
        semuaproduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanUtama.this,ProdukSayur.class);
                startActivity(intent);
            }
        });

        ketiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://goo.gl/maps/b1Kes85pQZcL7Jeb6"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        apel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HalamanUtama.this, Apel.class);
                startActivity(intent1);
            }
        });
        cabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(HalamanUtama.this, Cabe.class);
                startActivity(intent2);
            }
        });
        caberawit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(HalamanUtama.this, CabeRawit.class);
                startActivity(intent3);
            }
        });
        jagung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(HalamanUtama.this, Jagung.class);
                startActivity(intent5);
            }
        });
        kentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(HalamanUtama.this, Kentang.class);
                startActivity(intent6);
            }
        });
        mangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(HalamanUtama.this, Mangga.class);
                startActivity(intent7);
            }
        });
        pisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(HalamanUtama.this, Mangga.class);
                startActivity(intent8);
            }
        });
        terong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(HalamanUtama.this, Terong.class);
                startActivity(intent9);
            }
        });
        timun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(HalamanUtama.this, Timun.class);
                startActivity(intent10);
            }
        });
        infokami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(HalamanUtama.this, TentangKami.class);
                startActivity(intent11);
            }
        });
    }
}