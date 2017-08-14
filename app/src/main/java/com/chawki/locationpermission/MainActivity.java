package com.chawki.locationpermission;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.fillColor;
import static android.graphics.Typeface.BOLD;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Typeface bold = Typeface.createFromAsset(getAssets(), "fonts/Klavika-Bold.otf");

        TextView can_we = (TextView) findViewById(R.id.can_we);
        can_we.setTypeface(bold);

        final Typeface regular = Typeface.createFromAsset(getAssets(), "fonts/Klavika-Regular.otf");
        TextView msg = (TextView) findViewById(R.id.msg);
        msg.setTypeface(regular);

        final Typeface mediem = Typeface.createFromAsset(getAssets(), "fonts/Klavika-Medium.otf");
        TextView no_msg = (TextView) findViewById(R.id.no_msg);
        no_msg.setTypeface(mediem, BOLD);
        final br.com.simplepass.loading_button_lib.customViews.CircularProgressButton angry_btn = (br.com.simplepass.loading_button_lib.customViews.CircularProgressButton) findViewById(R.id.angry_btn);
        angry_btn.setTypeface(mediem);
        angry_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angry_btn.startAnimation();
                Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.checked);
                angry_btn.doneLoadingAnimation(fillColor,largeIcon);
            }
        });
    }
}
