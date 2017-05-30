package com.may.android.norway;


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
public class CitiesFragment extends Fragment {


    public CitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        ArrayList<ContentElement> elems = new ArrayList<ContentElement>();
        elems.add(new ContentElement("Oslo", "Oslo is a beautiful city featuring:\n" +
                "-\tVikingskipshuset (a museum for Viking ships)\n" +
                "-\tthe Munch-museet with Munch’s famous “Scream”\n" +
                "-\tthe fortress Akershus\n" +
                "-\tan opera house\n" +
                "-\tand a famous castle\n", R.drawable.oslo, "geo:59.9139,10.7522"));
        elems.add(new ContentElement("Bergen", "Bergen offers the world famous Bryggen houses, as well as Fløyen, a hiking region, and the Hanseatic museum.", R.drawable.bergen, "geo:60.3913,5.3221"));
        elems.add(new ContentElement("Stavanger", "There is not too much to see in Stavanger, except for it's cathedral and the norwegian museum of oil.", R.drawable.stavanger, "geo:58.97,5.7331"));

        ElemAdapter adapter = new ElemAdapter(getActivity(), elems);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }


}




