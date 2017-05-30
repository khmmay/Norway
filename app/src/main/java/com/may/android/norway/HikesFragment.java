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
public class HikesFragment extends Fragment {

    public HikesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        ArrayList<Location> elems = new ArrayList<Location>();
        elems.add(new Location(getString(R.string.nTrolltunga), getString(R.string.dTrolltunga), R.drawable.tolltunga, getString(R.string.gTrolltunga)));
        elems.add(new Location(getString(R.string.nPreikestolen), getString(R.string.dPreikestolen), R.drawable.preikestolen, getString(R.string.gPreikestolen)));
        elems.add(new Location(getString(R.string.nKjerag), getString(R.string.dKjerag), R.drawable.kjerag, getString(R.string.gKjerag)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), elems);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
