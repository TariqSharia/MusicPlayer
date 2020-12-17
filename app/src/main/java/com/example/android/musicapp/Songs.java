package com.example.android.musicapp;

public class Songs {
    private String mSongName;
    private String mArtistName;

    public Songs(String SongName, String ArtistName) {
        mSongName = SongName;
        mArtistName = ArtistName;
    }

    public String getmSongName(){
        return mSongName;
    }

    public String getmArtistName(){
        return mArtistName;
    }
}
