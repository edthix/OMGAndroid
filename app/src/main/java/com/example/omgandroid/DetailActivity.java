package com.example.omgandroid;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by ed on 9/9/15.
 */
public class DetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Tell the activity which XML layout is right
        setContentView(R.layout.activity_detail);

        // Enable the "Up" button for more navigation options
        getActionBar().setDisplayHomeAsUpEnabled(true);

        // Access the imageview from XML
        ImageView imageView = (ImageView) findViewById(R.id.img_cover);
    }
}
