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

        ArrayList<Location> elems = new ArrayList<Location>();
        elems.add(new Location(getString(R.string.nOslo),getString(R.string.dOslo), R.drawable.oslo,getString(R.string.gOslo) ));
        elems.add(new Location(getString(R.string.nBergen),getString(R.string.dBergen), R.drawable.bergen, getString(R.string.gBergen)));
        elems.add(new Location(getString(R.string.nStavanger),getString(R.string.dStavanger), R.drawable.stavanger, getString(R.string.gStavanger)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), elems);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}




