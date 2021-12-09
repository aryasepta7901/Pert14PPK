package com.example.sqlitepractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class ViewMahasiswa extends AppCompatActivity {

    private ArrayList<MahasiswaModal> mahasiswaModalArrayList;
    private DBHandler dbHandler;
    private  MahasiswaRVAdapter mahasiswaRVAdapter;
    private RecyclerView mahasiswaRV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_mahasiswa);

        mahasiswaModalArrayList = new ArrayList<>();
        dbHandler = new DBHandler(ViewMahasiswa.this);

        mahasiswaModalArrayList =
                dbHandler.readMahasiswa();

        mahasiswaRVAdapter = new
                MahasiswaRVAdapter(mahasiswaModalArrayList,
                ViewMahasiswa.this);
        mahasiswaRV = findViewById(R.id.idRVMahasiswa);

        LinearLayoutManager linearLayoutManager = new
                LinearLayoutManager(ViewMahasiswa.this,
                RecyclerView.VERTICAL, false);

        mahasiswaRV.setLayoutManager(linearLayoutManager);

        mahasiswaRV.setAdapter(mahasiswaRVAdapter);
    }
}
