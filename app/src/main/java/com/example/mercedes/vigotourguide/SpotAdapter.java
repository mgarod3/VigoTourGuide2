package com.example.mercedes.vigotourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mercedes on 19/06/2017.
 */

/**
 * {@link SpotAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Spot} objects.
 */
public class SpotAdapter extends ArrayAdapter<Spot> {

    Spot currentSpot;
    View listItemView;
    TextView spotName;
    TextView spotDescription;
    TextView spotAddress;
    ImageView imageView;

    /**
     * Create a new {@link SpotAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param spots   is the list of {@link Spot}s to be displayed.
     */
    public SpotAdapter(Context context, ArrayList<Spot> spots) {
        super(context, 0, spots);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Spot} object located at this position in the list
        currentSpot = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID spot_name_text.
        spotName = (TextView) listItemView.findViewById(R.id.spot_name_text);
        // Get the name from the currentSpot object and set this text on
        // the spotName TextView.
        spotName.setText(currentSpot.getSpotName());

        // Find the TextView in the list_item.xml layout with the ID spot_description_text.
        spotDescription = (TextView) listItemView.findViewById(R.id.spot_description_text);
        // Get the description from the currentSpot object and set this text on
        // the spotDescription TextView.
        spotDescription.setText(currentSpot.getSpotShortDescription());

        // Find the ImageView in the list_item.xml layout with the ID image.
        imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image from the currentSpot object and set it on
        // the imageView.
        imageView.setImageResource(currentSpot.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID spot_address_text.
        spotAddress = (TextView) listItemView.findViewById(R.id.spot_address_text);

        // Check if an address is provided for this spot or not
        if (currentSpot.hasAddress()) {
            // If an address is available, display the provided address based on the resource ID
            spotAddress.setText(currentSpot.getSpotAddress());
            // Make sure the view is visible
            spotAddress.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            spotAddress.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 or 3 TextViews) and 1 image view
        // so that it can be shown in the ListView.
        return listItemView;
    }
}
