package com.example.android.miwok;

/**
 * Created by aviator on 15/12/17.
 */

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * List Item supporting image for the word
     */
    private int mImageResourceId;

    /**
     * List Item supporting audio for the word
     */
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceId    is the audio resource for pronunciation of the miwok word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with(such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    image Resource id for the image on the wordlist
     * @param audioResourceId    audio Resource id for the word on the wordlist
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    /**
     * Get the Miwok translation of the word.
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Set the default translation of the word.
     */
    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }


    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Set the default translation of the word.
     */
    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    /**
     * Get List Item supporting image for the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Set List Item supporting image for the word
     */
    public void setImageResourceId(int imageResourceId) {
        this.mImageResourceId = imageResourceId;
    }

    /**
     * Get List Item supporting audio for the word
     */
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Set List Item supporting audio for the word
     */
    public void setmAudioResourceId(int audioResourceId) {
        this.mAudioResourceId = audioResourceId;
    }

    /**
     * Returns the string representation of the {@link Word} object.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
