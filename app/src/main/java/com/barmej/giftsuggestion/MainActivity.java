package com.barmej.giftsuggestion;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    /**
     * ImageView to display images
     */
    private ImageView mGiftImageView;

    /**
     * Array that hold drawable images ids
     */
    private int[] mGiftsPictures = { R.drawable.gift_1,
            R.drawable.gift_2, R.drawable.gift_3, R.drawable.gift_4,
            R.drawable.gift_5, R.drawable.gift_6, R.drawable.gift_7,
            R.drawable.gift_8, R.drawable.gift_9, R.drawable.gift_10};

    /**
     * Variable used as index to move through images array
     */
    private int mCurrentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get imageView from view hierarchy
        mGiftImageView = findViewById(R.id.image_gift);
    }

    /**
     * Called by android system when the button clicked
     * It's specified as click handler using XML onClick attribute
     *
     * @param view the view that's being clicked
     */
    public void display(View view) {
        // Show the image at the counter index
        Drawable giftDrawable = ContextCompat.getDrawable(this, mGiftsPictures[mCurrentIndex++]);
        mGiftImageView.setImageDrawable(giftDrawable);
    }

}
