package com.coderefer.firebasedatabaseexample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.coderefer.firebasedatabaseexample.MainActivity;
import com.coderefer.firebasedatabaseexample.R;
import com.coderefer.firebasedatabaseexample.models.Movie;
import com.squareup.picasso.Picasso;

/**
 * Created by vamsitallapudi on 5/22/17.
 */

public class MovieDetailFragment extends Fragment {

    private Movie movie;
    private ImageView ivDetailBanner;
    private TextView tvDetailHeading;
    private RatingBar mRatingBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.movie_detail_fragment, container, false);
        if (getArguments() != null) {
            movie = getArguments().getParcelable(MainActivity.MOVIE_KEY);
        }
        if (movie != null) {
            initializeViews(view);
            Picasso.with(getActivity()).load(movie.getMoviePoster()).into(ivDetailBanner);
            tvDetailHeading.setText(movie.getMovieName());
            mRatingBar.setRating(movie.getMovieRating());
        }
        return view;
    }

    private void initializeViews(View view) {
        ivDetailBanner = (ImageView) view.findViewById(R.id.iv_detail);
        tvDetailHeading = (TextView) view.findViewById(R.id.tv_detail_heading);
        mRatingBar = (RatingBar) view.findViewById(R.id.rating_detail);
    }
}
