package com.nektarlabs.interactivestory.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.nektarlabs.interactivestory.R;
import com.nektarlabs.interactivestory.model.Page;

public class StoryActivity extends Activity {

    private Page[] mPages;

    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if (name == null) {
            name = "Friend";
        }

        Log.d(TAG, name);

        mPages = new Page[7];
    }
}
