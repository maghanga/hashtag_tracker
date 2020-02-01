package com.thinknehru.hashtag_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HahstagsActivity extends AppCompatActivity {
    @BindView(R.id.searchHashtagButton)
    Button mSearchHashtagButton;
    @BindView(R.id.hashtagEditText)
    EditText mHashtagEditText;
    @BindView(R.id.instructionsTextView)
    TextView mInstructionsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hahstags);
        ButterKnife.bind(this);

        mSearchHashtagButton.setOnClickListener(new View.OnClickListener(){

        };

    }
}
