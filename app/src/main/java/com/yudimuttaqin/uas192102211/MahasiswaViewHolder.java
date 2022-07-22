package com.yudimuttaqin.uas192102211;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MahasiswaViewHolder extends RecyclerView.ViewHolder {

    public TextView _jkTextView;
    public TextView _namaTextView;
    public TextView _nimTextView;

    public MahasiswaViewHolder(@NonNull View itemView) {
        super(itemView);

        _jkTextView = (TextView) itemView.findViewById(R.id.jkTextView);
        _namaTextView = (TextView) itemView.findViewById(R.id.namaTextView);
        _nimTextView = (TextView) itemView.findViewById(R.id.nimTextView);
    }
}
