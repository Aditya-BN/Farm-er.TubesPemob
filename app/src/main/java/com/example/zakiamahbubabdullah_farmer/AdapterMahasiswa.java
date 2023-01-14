//package com.example.zakiamahbubabdullah_farmer;
//
//import android.app.Activity;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ListView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.cardview.widget.CardView;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//import java.util.List;
//
//public class AdapterMahasiswa extends RecyclerView.Adapter<AdapterMahasiswa.MyViewHolder> {
//
//    private List <GlobalClass> mList;
//    private Activity activity;
//    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
//
//    public AdapterMahasiswa(List<GlobalClass>mList, Activity activity){
//        this.mList = mList;
//        this.activity = activity;
//    }
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from((parent.getContext()));
//        View viewItem = inflater.inflate(R.layout.layout_item, parent, false);
//        return new MyViewHolder(viewItem);
//    }
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        final GlobalClass data = mList.get(position);
//        holder.tv_nama.setText("Nama : " + data.getGCNama());
//        holder.tv_alamat.setText("Alamat : " + data.getGCAlamat());
//        holder.tv_telpon.setText("No Hp : " + data.getGCNoHp());
//        holder.tv_email.setText("Email : " + data.getGCEmail());
//        holder.tv_pengiriman.setText("Pengiriman : " + data.getGCPengiriman());
//        holder.tv_pembayaran.setText("Pembayaran : " + data.getGCPilihBank());
//        holder.tv_pemilikrek.setText("Nama Pemilik Rekening : " + data.getGCNamaPemilik());
//        holder.tv_norek.setText("Nomor Rekening : " + data.getGCNoRek());
//        holder.tv_namabank.setText("Nama Bank : " + data.getGCNamaBank());
//        holder.tv_finalNproduk.setText("Produk : " + data.getGCProduk());
//        holder.tv_totalBayar.setText("Total Harga Produk : " + data.getTotalBayar());
//        holder.tv_biayaAfterOngkir.setText("Total Harga Produk + Ongkir : " + data.getTotalBayarProduk());
//    }
//
//
//    @Override
//    public int getItemCount() {
//        return mList.size();
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder {
//        TextView tv_nama, tv_alamat, tv_telpon, tv_email, tv_pengiriman, tv_pembayaran,
//        tv_pemilikrek, tv_norek, tv_namabank,tv_finalNproduk, tv_totalBayar, tv_biayaAfterOngkir;
//        CardView card_hasil;
//
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//            tv_nama = itemView.findViewById(R.id.tv_nama);
//            tv_alamat = itemView.findViewById(R.id.tv_alamat);
//            tv_telpon = itemView.findViewById(R.id.tv_telpon);
//            tv_email = itemView.findViewById(R.id.tv_email);
//            tv_pengiriman = itemView.findViewById(R.id.tv_pengiriman);
//            tv_pembayaran = itemView.findViewById(R.id.tv_pembayaran);
//            tv_pemilikrek = itemView.findViewById(R.id.tv_pemilikrek);
//            tv_norek = itemView.findViewById(R.id.tv_norek);
//            tv_namabank = itemView.findViewById(R.id.namabank);
//            tv_finalNproduk = itemView.findViewById(R.id.tv_finalNproduk);
//            tv_totalBayar = itemView.findViewById(R.id.tv_totalbayar);
//            tv_biayaAfterOngkir = itemView.findViewById(R.id.tv_biayaAfterOngkir);
//            card_hasil = itemView.findViewById(R.id.card_hasil);
//        }
//    }
//}
