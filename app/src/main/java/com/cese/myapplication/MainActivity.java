package com.cese.myapplication;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    public AudioManager audio;
    public ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.image);
        audio = (AudioManager) getSystemService(AUDIO_SERVICE);
    }

    public void setImage() {
        if (audio.getRingerMode() == AudioManager.RINGER_MODE_NORMAL) {
            image.setImageResource(R.drawable.on);
        }
        else  {
            image.setImageResource(R.drawable.off);
        }
    }

    public void changer(View view) {
        if (audio.getRingerMode() == AudioManager.RINGER_MODE_NORMAL) {
            audio.setRingerMode(AudioManager.RINGER_MODE_SILENT);
        }
        else {
            audio.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
        }
        setImage();
    }

    @Override
    protected void onStart() {
        setImage();
        super.onStart();
    }


    @Override
    protected void onRestart() {
        setImage();
        super.onRestart();
    }

    @Override
    protected void onResume() {
        setImage();
        super.onResume();
    }

    @Override
    protected void onPause() {
        setImage();
        super.onPause();
    }
}






