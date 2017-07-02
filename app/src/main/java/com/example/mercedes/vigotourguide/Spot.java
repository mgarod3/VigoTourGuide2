package com.example.mercedes.vigotourguide;

/**
 * Created by Mercedes on 18/06/2017.
 */

public class Spot {

    /**
     * Constant value that represents no address was provided for this spot
     */
    private static final int NO_ADDRESS_PROVIDED = -1;
    /**
     * Spot name
     */
    private int mSpotName;
    /**
     * Spot Short Description
     */
    private int mSpotShortDescription;
    /**
     * Image resource ID for the spot
     */
    private int mImageResourceId;
    /**
     * Spot address
     */
    private int mSpotAddress = NO_ADDRESS_PROVIDED;

    /**
     * Create a new Spot object.
     *
     * @param spotName             is the name of the spot
     * @param spotShortDescription is a short description of the spot
     * @param imageResourceId      is an image of the spot
     * @param spotAddress          is the address where the spot is located
     */
    public Spot(int spotName, int spotShortDescription, int imageResourceId, int spotAddress) {
        mSpotName = spotName;
        mSpotShortDescription = spotShortDescription;
        mImageResourceId = imageResourceId;
        mSpotAddress = spotAddress;
    }

    /**
     * Create a new Spot object.
     *
     * @param spotName             is the name of the spot
     * @param spotShortDescription is a short description of the spot
     * @param imageResourceId      is an image of the spot
     */
    public Spot(int spotName, int spotShortDescription, int imageResourceId) {
        mSpotName = spotName;
        mSpotShortDescription = spotShortDescription;
        mImageResourceId = imageResourceId;
    }

    public int getSpotName() {
        return mSpotName;
    }

    public int getSpotShortDescription() {
        return mSpotShortDescription;
    }

    public int getSpotAddress() {
        return mSpotAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an address for this spot.
     */
    public boolean hasAddress() {
        return mSpotAddress != NO_ADDRESS_PROVIDED;
    }
}
