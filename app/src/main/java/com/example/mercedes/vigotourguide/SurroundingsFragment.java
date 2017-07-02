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
public class SurroundingsFragment extends Fragment {
    Spot currentSpot;

    public SurroundingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.spot_list, container, false);

        // Create a list of spots
        final ArrayList<Spot> spots = new ArrayList<Spot>();
        spots.add(new Spot(R.string.surroundings_cies_name, R.string.surroundings_cies_description,
                R.drawable.others_ciesislands));
        spots.add(new Spot(R.string.surroundings_tecla_name, R.string.surroundings_tecla_description,
                R.drawable.others_santatecla));
        spots.add(new Spot(R.string.surroundings_combarro_name, R.string.surroundings_combarro_description,
                R.drawable.others_combarro));
        spots.add(new Spot(R.string.surroundings_mondariz_name, R.string.surroundings_mondariz_description,
                R.drawable.others_mondariz));
        spots.add(new Spot(R.string.surroundings_valença_name, R.string.surroundings_valença_description,
                R.drawable.others_valenca));
        spots.add(new Spot(R.string.surroundings_ribadavia_name, R.string.surroundings_ribadavia_description,
                R.drawable.others_ribadavia));

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
