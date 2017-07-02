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
public class BeachesFragment extends Fragment {

    Spot currentSpot;

    public BeachesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.spot_list, container, false);

        // Create a list of spots
        final ArrayList<Spot> spots = new ArrayList<Spot>();
        spots.add(new Spot(R.string.beach_samil_name, R.string.beach_samil_description,
                R.drawable.beach_samil, R.string.beach_samil_address));
        spots.add(new Spot(R.string.beach_vao_name, R.string.beach_vao_description,
                R.drawable.beach_vao, R.string.beach_vao_address));
        spots.add(new Spot(R.string.beach_fontaiña_name, R.string.beach_fontaiña_description,
                R.drawable.beach_fontaina, R.string.beach_fontaiña_address));
        spots.add(new Spot(R.string.beach_adro_name, R.string.beach_adro_description,
                R.drawable.beach_oadro, R.string.beach_adro_address));
        spots.add(new Spot(R.string.beach_baluarte_name, R.string.beach_baluarte_description,
                R.drawable.beach_baluarte, R.string.beach_baluarte_address));
        spots.add(new Spot(R.string.beach_saians_name, R.string.beach_saians_description,
                R.drawable.beach_saians, R.string.beach_saians_address));

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
