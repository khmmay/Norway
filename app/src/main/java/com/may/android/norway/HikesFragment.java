package com.may.android.norway;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HikesFragment extends Fragment {


    public HikesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        ArrayList<ContentElement> elems = new ArrayList<ContentElement>();
        elems.add(new ContentElement("Trolltunga", "-\tDuration: 11hours (6 hours up, 1 hour at Trolltunga, and 4 hours back down)\n" +
                "-\tDistance: 22km\n" +
                "-\tTip: First kilometer is the hardest!\n" +
                "-\tMore: http://www.norwaytonowhere.com/a-guide-to-hiking-trolltunga", R.drawable.tolltunga, "geo:60.124473,6.740110"));
        elems.add(new ContentElement("Preikestolen", "-\tDuration: 4hours (return)\n" +
                "-\tDistance: 6km, 604m high\n" +
                "-\tMore: https://www.visitnorway.de/listings/preikestolen/185528/", R.drawable.preikestolen, "geo:58.59115,6.1882433"));
        elems.add(new ContentElement("Kjerag", "-\tDuration: 6 to 8 hours (return)\n" +
                "-\tDistance: 12km, 500m climbing\n" +
                "-\tMore: http://www.earthtrekkers.com/kjeragbolten-hike-complete-guide/", R.drawable.kjerag, "geo:59.034792,6.577576"));

        ElemAdapter adapter = new ElemAdapter(getActivity(), elems);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
