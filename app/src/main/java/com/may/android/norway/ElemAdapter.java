package com.may.android.norway;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Henrik on 30.05.2017.
 */

public class ElemAdapter extends ArrayAdapter<ContentElement> {


    public ElemAdapter(@NonNull Context context, ArrayList<ContentElement> elem) {
        super(context, 0, elem);
        // mColorResourceID=color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // Get the {@link AndroidFlavor} object located at this position in the list
        final ContentElement currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miTextView = (TextView) listItemView.findViewById(R.id.heading);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miTextView.setText(currentWord.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView enTextView = (TextView) listItemView.findViewById(R.id.description);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        enTextView.setText(currentWord.getDescription());

        TextView navigateView = (TextView) listItemView.findViewById(R.id.navigate);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.elemImg);
        if (currentWord.getHasImage()) {
            imageView.setImageResource(currentWord.getImageID());
        } else {
            navigateView.setVisibility(View.GONE);
            imageView.setVisibility(View.GONE);
        }

        navigateView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Uri gmmIntentUri = Uri.parse(currentWord.getGeoLocation());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                getContext().startActivity(mapIntent);
            }
        });




        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        //ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        //iconView.setImageResource(currentAndroidFlavor.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
