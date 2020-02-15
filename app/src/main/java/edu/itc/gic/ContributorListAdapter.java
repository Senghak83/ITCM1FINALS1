package edu.itc.gic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContributorListAdapter extends RecyclerView.Adapter<PhoneHorlder> {
    private ArrayList<Contributor>ph;
    public ContributorListAdapter(ArrayList<Contributor> ph){
        this.ph =ph;
    }

    @NonNull
    @Override

    public PhoneHorlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layout = LayoutInflater.from(parent.getContext());
        View v = layout.inflate(R.layout.item_list_contributor,parent,false);
        return new PhoneHorlder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneHorlder holder, int position) {
        holder.getPhone().setText(ph.get(position).getLogin());

    }

    @Override
    public int getItemCount() {
        return ph.isEmpty()? 0 : ph.size();
    }
}
