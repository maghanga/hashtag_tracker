package com.thinknehru.hashtag_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;

public class HashtagActivity extends AppCompatActivity {
    @BindView(R.id.hashtagTextView)
    TextView mHashtagTextView;
    @BindView(R.id.listView) ListView mListView;
    private String[] posts = new String[] {"And here goes the #Arsenal", "Pablo Mari just underwent his first training session with the #Arsenal first team", "Cedric move to #Arsenal confirmed"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashtag);

        mListView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, posts);
        mListView.setAdapter(adapter);



    }
}
