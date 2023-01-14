//package com.example.zakiamahbubabdullah_farmer;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.DefaultItemAnimator;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.Display;
//import android.view.View;
//
//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//import java.util.ArrayList;
//
//public class Firebase extends AppCompatActivity {
//
//    AdapterMahasiswa adapterMahasiswa;
//    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
//    ArrayList<GlobalClass> GlobalClass;
//    RecyclerView tv_tampil;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_firebase);
//
//        tv_tampil = findViewById(R.id.tv_tampil);
//        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this);
//        tv_tampil.setLayoutManager(mLayout);
//        tv_tampil.setItemAnimator(new DefaultItemAnimator());
//
//        tampilData();
//    }
//
//    private void tampilData()
//    {
//        database.child("GlobalClass").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                GlobalClass = new ArrayList<>();
//                for (DataSnapshot item : snapshot.getChildren()){
//                    GlobalClass pesanan = item.getValue(GlobalClass.class);
//                    pesanan.setKey(item.getKey());
//                    GlobalClass.add(pesanan);
//
//                }
//                adapterMahasiswa = new AdapterMahasiswa(GlobalClass, Firebase.this);
//                tv_tampil.setAdapter(adapterMahasiswa);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//    }
//}