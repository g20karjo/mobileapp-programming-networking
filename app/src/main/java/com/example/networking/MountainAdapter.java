package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MountainAdapter extends RecyclerView.Adapter<MountainAdapter.MountainAdapterViewHolder> {
    private List<Mountains> Mountains;

    public MountainAdapter(List<Mountains> Mountains) {
        this.Mountains = Mountains;
    }

    @NonNull
    @Override
    public MountainAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent, false);
        return new MountainAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MountainAdapterViewHolder holder, int position) {
        holder.mountain_name.setText(Mountains.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return Mountains.size();
    }

    public class MountainAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView mountain_name;

        public MountainAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            mountain_name = itemView.findViewById(R.id.Mountain_Name);
        }
    }
}
