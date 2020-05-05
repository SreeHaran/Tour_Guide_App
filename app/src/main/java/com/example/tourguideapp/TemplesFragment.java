package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TemplesFragment extends Fragment {

    public TemplesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restuarant, container, false);

        super.onCreate(savedInstanceState);

        TextView name = rootView.findViewById(R.id.fragment_name);
        name.setText(getString(R.string.holy_places));

        ArrayList<Location> locationList = new ArrayList<Location>();

        locationList.add(new Location(getString(R.string.holy_place_1), R.drawable.holy_place_1, getString(R.string.holy_place_details_1)));
        locationList.add(new Location(getString(R.string.holy_place_2), R.drawable.holy_place_2, getString(R.string.holy_place_details_2)));
        locationList.add(new Location(getString(R.string.holy_place_3), R.drawable.holy_place_3, getString(R.string.holy_place_details_3)));
        locationList.add(new Location(getString(R.string.holy_place_4), R.drawable.holy_place_4, getString(R.string.holy_place_details_4)));
        locationList.add(new Location(getString(R.string.holy_place_5), R.drawable.holy_place_5, getString(R.string.holy_place_details_5)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locationList);
        ListView listItemView = rootView.findViewById(R.id.list);
        listItemView.setAdapter(adapter);

        return rootView;
    }
}
