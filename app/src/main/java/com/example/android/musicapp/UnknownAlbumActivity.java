package com.example.android.musicapp;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class UnknownAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Songs> Songslist = new ArrayList<Songs>();
        Songslist.add(new Songs("first song",  "Unkown Artist"));
        Songslist.add(new Songs("second song", "Unkown Artist"));
        Songslist.add(new Songs("third song",  "Unkown Artist"));
        Songslist.add(new Songs("fourth song", "Unkown Artist"));
        Songslist.add(new Songs("fifth song",  "Unkown Artist"));
        Songslist.add(new Songs("sixth song",  "Unkown Artist"));
        Songslist.add(new Songs("seventh song","Unkown Artist"));
        Songslist.add(new Songs("eighth song", "Unkown Artist"));
        Songslist.add(new Songs("ninth song",  "Unkown Artist"));
        Songslist.add(new Songs("tenth song",  "Unkown Artist"));

        SongsAdapter adapter = new SongsAdapter(this, Songslist);
        ListView listView = (ListView) findViewById(R.id.song_list_view);
        listView.setAdapter(adapter);
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
