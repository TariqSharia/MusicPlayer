package com.example.android.musicapp;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView yaSamtAlbum = (TextView) findViewById(R.id.ya_samt_album);
        TextView unkownAlbum = (TextView) findViewById(R.id.unknown_album);

        yaSamtAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yaSamtAlbumIntent = new Intent(AlbumsActivity.this, YaSamtActivity.class);
                startActivity(yaSamtAlbumIntent);
            }
        });

        unkownAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent unkownAlbumIntent = new Intent(AlbumsActivity.this, UnknownAlbumActivity.class);
                startActivity(unkownAlbumIntent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }
}
