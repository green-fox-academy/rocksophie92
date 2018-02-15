package com.sophiecodes.matchmakertinder.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.sophiecodes.matchmakertinder.R;

import butterknife.BindView;

public class MatchListActivity extends AppCompatActivity {

    @BindView(R.id.name)
    TextView name;

    @BindView(R.id.language)
    TextView language;

    @BindView(R.id.miniProfileImage)
    ImageView miniProfileImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_match_list);
    }
}
