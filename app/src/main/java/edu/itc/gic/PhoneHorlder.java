package edu.itc.gic;

import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PhoneHorlder extends RecyclerView.ViewHolder {

    private EditText phone;
    public PhoneHorlder(@NonNull View itemView) {
        super(itemView);

        phone = itemView.findViewById(R.id.avatar);
    }

    public EditText getPhone(){return phone;}

}
