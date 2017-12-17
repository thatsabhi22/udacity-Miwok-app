package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aviator on 16/12/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param wordList       A List of Word objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> wordList) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, wordList);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID english_word
        TextView defaultTranslation = (TextView)listItemView.findViewById(R.id.english_word);

        // Get the default translation from current Word object and
        // set this text on the name TextView
        defaultTranslation.setText(currentWord.getmDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID miwok_word
        TextView miwokTranslation = (TextView)listItemView.findViewById(R.id.miwok_word);

        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        miwokTranslation.setText(currentWord.getmMiwokTranslation());

        // Find the ImageView in the list_item.xml layout with the ID list_image
        ImageView wordImage = (ImageView)listItemView.findViewById(R.id.list_image);

        //If image resource not found visibility of the ImageView set to GONE
        if(currentWord.getImageResourceId() == 0)
            wordImage.setVisibility(View.GONE);
        else
            wordImage.setImageResource(currentWord.getImageResourceId());

        //Return the whole list item layout
        return listItemView;
    }
}
