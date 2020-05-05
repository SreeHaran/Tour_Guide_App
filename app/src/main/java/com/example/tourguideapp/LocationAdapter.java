package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentPlace = getItem(position);

        ImageView locationImage = listItemView.findViewById(R.id.list_image);
        locationImage.setImageResource(currentPlace.getmLocationImage());

        TextView locationName = listItemView.findViewById(R.id.list_location);
        locationName.setText(currentPlace.getmLocationName());

        TextView locationDetails = listItemView.findViewById(R.id.list_details);
        locationDetails.setText(currentPlace.getmLocationDetails());

        return listItemView;
    }
}