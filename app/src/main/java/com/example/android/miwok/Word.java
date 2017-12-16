package com.example.android.miwok;

/**
 * Created by aviator on 15/12/17.
 */

    /**
    * {@link Word} represents a vocabulary word that the user wants to learn.
    * It contains a default translation and a Miwok translation for that word.
    */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;


    /**
     +     * Create a new Word object.
     +     *
     +     * @param defaultTranslation is the word in a language that the user is already familiar with
     +     *                           (such as English)
     +     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
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
}
