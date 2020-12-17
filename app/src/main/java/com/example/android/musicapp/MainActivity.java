package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView songlist = (TextView) findViewById(R.id.song_list);
        TextView albums = (TextView) findViewById(R.id.album);

        songlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songListIntent = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(songListIntent);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });
    }
}