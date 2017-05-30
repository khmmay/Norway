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
public class RoutesFragment extends Fragment {


    public RoutesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        ArrayList<ContentElement> elems = new ArrayList<ContentElement>();
        elems.add(new ContentElement("Oslo \u2799 Bergen", "Oslo's sites"));
        elems.add(new ContentElement("Bergen \u2799 Stavanger", "Bergen's sites"));
        elems.add(new ContentElement("Stavanger \u2799 Oslo", "Stavanger's sites"));

        ElemAdapter adapter = new ElemAdapter(getActivity(), elems);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
