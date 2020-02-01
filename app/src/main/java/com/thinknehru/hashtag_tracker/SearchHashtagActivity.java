package com.thinknehru.hashtag_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchHashtagActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.searchHashtagButton)
    Button mSearchHashtagButton;
    @BindView(R.id.hashtagEditText)
    EditText mHashtagEditText;
    @BindView(R.id.instructionsTextView)
    TextView mInstructionsTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_hashtag);
        ButterKnife.bind(this);

        Toast.makeText(SearchHashtagActivity.this, "Type #Arsenal as an example and search to get posts from the hashtag", Toast.LENGTH_SHORT).show();

        Log.d("SearchHashtagActivity", "In the onCreate: works as expected");

        mSearchHashtagButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v == mSearchHashtagButton) {
            String hashtag = mHashtagEditText.getText().toString();
            Intent intent = new Intent(SearchHashtagActivity.this, HashtagActivity.class);
            intent.putExtra("hashtag", hashtag);
            startActivity(intent);

        Log.d("SearchHashtagActivity", "In the onClick: works as expected");
        }
    }
}
