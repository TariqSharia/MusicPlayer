package com.example.android.musicapp;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {
    private static final String LOG_TAG = SongsAdapter.class.getSimpleName();
    public SongsAdapter(Activity context, ArrayList<Songs> SongsList) {
        super(context, 0, SongsList);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list, parent, false);
        }
        Songs currentWord = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        TextView artisttTextView= (TextView) listItemView.findViewById(R.id.artist_text_view);

        songTextView.setText(currentWord.getmSongName());
        artisttTextView.setText(currentWord.getmArtistName());
        return listItemView;
    }
}