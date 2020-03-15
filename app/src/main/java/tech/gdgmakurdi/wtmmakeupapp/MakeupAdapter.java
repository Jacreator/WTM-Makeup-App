package tech.gdgmakurdi.wtmmakeupapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MakeupAdapter extends RecyclerView.Adapter<MakeupAdapter.MakeupViewHolder> {

    List<Makeup> makeupList;

    public MakeupAdapter(List<Makeup> makeupList) {
        this.makeupList = makeupList;
    }

    @NonNull
    @Override
    public MakeupAdapter.MakeupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.makeup_item, parent, false);
        return new MakeupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MakeupAdapter.MakeupViewHolder holder, int position) {
        Makeup makeup = makeupList.get(position);
        holder.titleTextView.setText(makeup.getMakeupTitle());
    }

    @Override
    public int getItemCount() {
        return makeupList.size();
    }

    public class MakeupViewHolder extends RecyclerView.ViewHolder {

        public ImageView thumbnailImageView;
        public TextView titleTextView;
        public MakeupViewHolder(@NonNull View itemView) {
            super(itemView);

            thumbnailImageView = itemView.findViewById(R.id.thumb);
            titleTextView = itemView.findViewById(R.id.title);
        }
    }
}
