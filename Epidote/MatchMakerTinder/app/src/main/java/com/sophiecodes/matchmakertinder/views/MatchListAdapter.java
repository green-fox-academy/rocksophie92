package com.sophiecodes.matchmakertinder.views;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.sophiecodes.matchmakertinder.R;
import com.sophiecodes.matchmakertinder.models.Apprentice;


public class MatchListAdapter extends RecyclerView.Adapter<MatchListAdapter.ViewHolder> {
    private final CopyOnWriteArrayList<Apprentice> mDataset;
    private View v;

    public MatchListAdapter(List<Apprentice> data) {

        mDataset = new CopyOnWriteArrayList<>();

        if (data != null) {
            mDataset.addAll(data);
        }
    }

    @Override
    public MatchListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        this.v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_match_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        Apprentice apprentice = mDataset.get(position);
        if (apprentice == null) {
            return;
        }
        holder.language.setText(apprentice.getLanguage());
        holder.profileImage.setImageResource(apprentice.getResId());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView profileImage;
        private TextView language;

        ViewHolder(final View v) {
            super(v);
            this.name = v.findViewById(R.id.name);
            this.profileImage = v.findViewById(R.id.miniProfileImage);
            this.language = v.findViewById(R.id.language);
        }
    }
}