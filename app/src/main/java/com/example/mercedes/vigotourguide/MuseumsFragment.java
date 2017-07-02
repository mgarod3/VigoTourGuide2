package com.example.mercedes.vigotourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {
    Spot currentSpot;

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.spot_list, container, false);

        // Create a list of spots
        final ArrayList<Spot> spots = new ArrayList<Spot>();
        spots.add(new Spot(R.string.museo_marco_name, R.string.museo_marco_description,
                R.drawable.museum_marco, R.string.museo_marco_address));
        spots.add(new Spot(R.string.museo_mar_name, R.string.museo_mar_description,
                R.drawable.museum_sea, R.string.museo_mar_address));
        spots.add(new Spot(R.string.museo_verbum_name, R.string.museo_verbum_description,
                R.drawable.museum_verbum, R.string.museo_verbum_address));
        spots.add(new Spot(R.string.museo_pacheco_name, R.string.museo_pacheco_description,
                R.drawable.museum_pacheco, R.string.museo_pacheco_address));
        spots.add(new Spot(R.string.museo_liste_name, R.string.museo_liste_description,
                R.drawable.museum_liste, R.string.museo_liste_address));
        spots.add(new Spot(R.string.museo_quinones_name, R.string.museo_quinones_description,
                R.drawable.museum_quinones, R.string.museo_quinones_address));

        // Create an {@link SpotAdapter}, whose data source is a list of {@link Spot}s. The
        // adapter knows how to create list items for each item in the list.
        SpotAdapter adapter = new SpotAdapter(getActivity(), spots);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // spot_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SpotAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Spot} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
