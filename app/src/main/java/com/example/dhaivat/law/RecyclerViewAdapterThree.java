package com.example.dhaivat.law;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RecyclerViewAdapterThree extends RecyclerView.Adapter<RecyclerViewAdapterThree.ClubViewHolder>{


    List<Three.Club> clubs;

   public RecyclerViewAdapterThree(List<Three.Club> clubs){
        this.clubs=clubs;
    }


    public static class ClubViewHolder extends RecyclerView.ViewHolder {

        TextView clubNameone;
        TextView clubNametwo;


        public ClubViewHolder(@NonNull View itemView) {
            super(itemView);
            clubNameone = (TextView)itemView.findViewById(R.id.club_nameone);
            clubNametwo = (TextView)itemView.findViewById(R.id.club_nametwo);
        }
    }

    @NonNull
    @Override
    public RecyclerViewAdapterThree.ClubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layoutnew,parent,false);
        ClubViewHolder cvh = new ClubViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterThree.ClubViewHolder holder, int position) {

        holder.clubNameone.setText(clubs.get(position).nameone);
        holder.clubNametwo.setText(clubs.get(position).nametwo);

    }

    @Override
    public int getItemCount() {
        return clubs.size();
    }
}
