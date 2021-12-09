package com.example.sqlitepractice;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MahasiswaRVAdapter extends RecyclerView.Adapter<MahasiswaRVAdapter.ViewHolder> {

    private ArrayList<MahasiswaModal> mahasiswaModalArrayList;
    private Context context;

    public MahasiswaRVAdapter(ArrayList<MahasiswaModal> mahasiswaModalArrayList,Context context)
    {
        this.mahasiswaModalArrayList = mahasiswaModalArrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public MahasiswaRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mahasiswa_rv_item
                ,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaRVAdapter.ViewHolder holder, int position) {
        MahasiswaModal modal = mahasiswaModalArrayList.get(position);
        holder.nimTV.setText(modal.getNim());
        holder.namaTV.setText(modal.getNama());
        holder.kelasTV.setText(modal.getKelas());
        holder.nohpTV.setText(modal.getNohp());

    }

    @Override
    public int getItemCount() {
        return mahasiswaModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nimTV,namaTV,kelasTV,nohpTV;



        public ViewHolder(View itemView) {
            super(itemView);

            nimTV = itemView.findViewById(R.id.nimTextView);
            namaTV = itemView.findViewById(R.id.namaTextView);
            kelasTV = itemView.findViewById(R.id.kelasTextView);
            nohpTV = itemView.findViewById(R.id.nohpTextView);
        }
    }
}