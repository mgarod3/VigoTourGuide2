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
public class RestaurantsFragment extends Fragment {
    Spot currentSpot;

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.spot_list, container, false);
        // Create a list of spots
        final ArrayList<Spot> spots = new ArrayList<Spot>();
        spots.add(new Spot(R.string.restaurant_casa_marco_name, R.string.restaurant_casa_marco_description,
                R.drawable.restaurant_casamarco, R.string.restaurant_casa_marco_address));
        spots.add(new Spot(R.string.restaurant_maruja_limon_name, R.string.restaurant_maruja_limon_description,
                R.drawable.restaurant_marujalimon, R.string.restaurant_maruja_limon_address));
        spots.add(new Spot(R.string.restaurant_picadillo_name, R.string.restaurant_picadillo_description,
                R.drawable.restaurant_elpicadillo, R.string.restaurant_picadillo_address));
        spots.add(new Spot(R.string.restaurant_chilam_balam_name, R.string.restaurant_chilam_balam_description,
                R.drawable.restaurant_chilambalam, R.string.restaurant_chilam_balam_address));
        spots.add(new Spot(R.string.restaurant_mosquito_name, R.string.restaurant_mosquito_description,
                R.drawable.restaurant_elmosquito, R.string.restaurant_mosquito_address));
        spots.add(new Spot(R.string.restaurant_juanita_name, R.string.restaurant_juanita_description,
                R.drawable.restaurant_lajuanita, R.string.restaurant_juanita_address));

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

