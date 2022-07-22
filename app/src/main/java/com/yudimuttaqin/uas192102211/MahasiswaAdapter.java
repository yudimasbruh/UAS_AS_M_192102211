package com.yudimuttaqin.uas192102211;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaViewHolder> {
    private List<MahasiswaModel> _mahasiswaModelList;

    public MahasiswaAdapter(List<MahasiswaModel> mahasiswaModelList){
        this._mahasiswaModelList = mahasiswaModelList;
    }

    @NonNull
    @Override

    public  MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.list_mahasiswa, parent, false);
        return new MahasiswaViewHolder(v);
    }

    public void onBindViewHolder(@NonNull MahasiswaModel holder, int position) {

    }
    @Override
    public  void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position){
        MahasiswaModel mm = _mahasiswaModelList.get(position);

        holder._nimTextView.setText(mm.getNIM());
        holder._namaTextView.setText(mm.getNama());
        holder._jkTextView.setText(mm.getJenisKelamin());

    }

    @Override
    public int getItemCount(){
        int count = 0;
        if(_mahasiswaModelList != null){
            count = _mahasiswaModelList.size();
        }
        return count;
    }
}