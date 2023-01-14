//package com.example.zakiamahbubabdullah_farmer;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import com.google.android.gms.tasks.OnFailureListener;
//import com.google.android.gms.tasks.OnSuccessListener;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//public class TambahActivity extends AppCompatActivity {
//
//    EditText edName, edMatkul;
//    Button btn_simpan;
//    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tambah);
//
//        edName = findViewById(R.id.edMatkul);
//        edMatkul = findViewById(R.id.edMatkul);
//        btn_simpan = findViewById(R.id.btn_simpan);
//
//        btn_simpan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String getName = edName.getText().toString();
//                String getMatkul = edMatkul.getText().toString();
//
//                if(getName.isEmpty()){
//                    edName.setError("Masukkan Nama ... ");
//                }
//                else if(getMatkul.isEmpty()){
//                    edMatkul.setError("Matakuliah masih kosong!");                }
//                else{
//                    database.child("Mahasiswa").push().setValue(new ModelMahasiswa(getName, getMatkul)).addOnSuccessListener(new OnSuccessListener<Void>() {
//                        @Override
//                        public void onSuccess(Void aVoid) {
//                            Toast.makeText(TambahActivity.this, "Data berhasil disimpan!", Toast.LENGTH_SHORT).show();
//                            startActivity(new Intent(TambahActivity.this, Firebase.class));
//                            finish();
//
//                        }
//                    }) .addOnFailureListener(new OnFailureListener() {
//                        @Override
//                        public void onFailure(@NonNull Exception e) {
//                            Toast.makeText(TambahActivity.this, "Gagal menyimpan data!", Toast.LENGTH_SHORT).show();
//
//                        }
//                    });
//                }
//            }
//        });
//    }
//}