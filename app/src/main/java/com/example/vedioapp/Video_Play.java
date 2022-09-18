package com.example.vedioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Video_Play extends AppCompatActivity {
    VideoView videoView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play);
        videoView = findViewById(R.id.videoView);
        textView = findViewById(R.id.textView2);

        Intent intent = getIntent();
        String v = intent.getStringExtra("vid");
        String t = intent.getStringExtra("Text");
        textView.setText(t);

        videoView.setVideoURI(Uri.parse(v));
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);


    }
}