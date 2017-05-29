package com.coderefer.firebasedatabaseexample.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by vamsi on 18-Jul-16.
 */

public class Movie implements Parcelable{

    public String movieName;
    public String moviePoster;
    public float movieRating;

    public Movie(){

    }
    public Movie(String movieName,String moviePoster,float movieRating){
        this.movieName = movieName;
        this.moviePoster = moviePoster;
        this.movieRating  = movieRating;
    }

    protected Movie(Parcel in) {
        movieName = in.readString();
        moviePoster = in.readString();
        movieRating = in.readFloat();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public float getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(float movieRating) {
        this.movieRating = movieRating;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(movieName);
        dest.writeString(moviePoster);
        dest.writeFloat(movieRating);
    }
}
