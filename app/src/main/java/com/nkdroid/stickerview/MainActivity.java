package com.nkdroid.stickerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private ResizableTextView tv_sticker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout canvas = (FrameLayout) findViewById(R.id.canvasView);
        EditText editText = (EditText) findViewById(R.id.et);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tv_sticker.setText(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
//……

// add a stickerImage to canvas
        ResizableImageView iv_sticker = new ResizableImageView(MainActivity.this);
        iv_sticker.setImageDrawable(getResources().getDrawable(R.drawable.c10));
        canvas.addView(iv_sticker);

// add a stickerText to canvas
        tv_sticker = new ResizableTextView(MainActivity.this);
        tv_sticker.setText("nkDroid");
        canvas.addView(tv_sticker);
    }
}
