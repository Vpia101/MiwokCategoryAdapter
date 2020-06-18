package com.example.android.miwok;

import android.content.Context;
import android.view.View;

public class Word {

    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId;

    // Image for the word
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //Create a new Word object
    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceID,
                int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = ImageResourceID;
        mAudioResourceId = audioResourceId;
    }

    //get default Translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //get miwok Translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //get Image
    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;

        /**
         * Return the audio resource ID of the word.
         */
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}

