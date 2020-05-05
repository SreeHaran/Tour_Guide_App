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
public class OtherAttractionsFragment extends Fragment {

    public OtherAttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restuarant, container, false);

        super.onCreate(savedInstanceState);

        TextView name = rootView.findViewById(R.id.fragment_name);
        name.setText(getString(R.string.attractions));

        ArrayList<Location> locationList = new ArrayList<Location>();

        locationList.add(new Location(getString(R.string.attractions_name_1), R.drawable.others_1, getString(R.string.attractions_details_1)));
        locationList.add(new Location(getString(R.string.attractions_name_2), R.drawable.others_2, getString(R.string.attractions_details_2)));
        locationList.add(new Location(getString(R.string.attractions_name_3), R.drawable.others_3, getString(R.string.attractions_details_3)));
        locationList.add(new Location(getString(R.string.attractions_name_4), R.drawable.others_4, getString(R.string.attractions_details_4)));
        locationList.add(new Location(getString(R.string.attractions_name_5), R.drawable.others_5, getString(R.string.attractions_details_5)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locationList);
        ListView listItemView = rootView.findViewById(R.id.list);
        listItemView.setAdapter(adapter);

        return rootView;
    }
}
