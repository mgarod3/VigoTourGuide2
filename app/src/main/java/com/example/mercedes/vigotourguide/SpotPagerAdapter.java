package com.example.mercedes.vigotourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Mercedes on 19/06/2017.
 */

/**
 * {@link SpotPagerAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Spot} objects.
 */

public class SpotPagerAdapter extends FragmentPagerAdapter {

    //Number of tabs
    final int PAGE_COUNT = 4;

    //Context of the app
    private Context mContext;

    /**
     * Create a new {@link SpotPagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public SpotPagerAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1) {
            return new BeachesFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new SurroundingsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.museums);
        } else if (position == 1) {
            return mContext.getString(R.string.beaches);
        } else if (position == 2) {
            return mContext.getString(R.string.restaurants);
        } else {
            return mContext.getString(R.string.surroundings);
        }
    }
}