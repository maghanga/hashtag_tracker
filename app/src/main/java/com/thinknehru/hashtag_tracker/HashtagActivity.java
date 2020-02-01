package com.thinknehru.hashtag_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HashtagActivity extends AppCompatActivity {
    @BindView(R.id.hashtagTextView)
    TextView mHashtagTextView;
    @BindView(R.id.listView) ListView mListView;
    private String[] posts = new String[] {"And here goes the #Arsenal", "Pablo Mari just underwent his first training session with the #Arsenal first team", "Cedric move to #Arsenal confirmed", "#Arsenal are number 10 in the league standings", "Ian Wright: #Arsenal will thrash Burnley on sunday", "#Arsenal has been optimistic since Arteta took over as head coach", "Who are #Arsenal going to sign in he summer?", "Come on you gunners #Arsenal", "And the transfer deadline is past, #Arsenal come out with two defensive reinforcements", "Is #Arsenal the next liverpool?", "Bet #Arsenal will win a major trophy way before Chelsea and Man Utd", "Go #Arsenal", "#Arsenal to face Burnley tomorrow at the Emirates", "#Arsenal for the win"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashtag);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, posts);
        mListView.setAdapter(adapter);

        Intent intent = getIntent();
        String hashtag = getIntent().getStringExtra("hashtag");
        mHashtagTextView.setText("Here are all the posts from the hashtag " + hashtag);

        Toast.makeText(HashtagActivity.this, "Success!!", Toast.LENGTH_LONG).show();

    }
}
