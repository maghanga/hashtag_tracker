package com.thinknehru.hashtag_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchHashtagActivity extends AppCompatActivity {
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

        mSearchHashtagButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String hashtag = mHashtagEditText.getText().toString();
                Intent intent = new Intent(SearchHashtagActivity.this, HashtagActivity.class);
                intent.putExtra("hashtag", hashtag);
                startActivity(intent);
            }
        });

    }
}
