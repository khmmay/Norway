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
public class DayplansFragment extends Fragment {


    public DayplansFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        ArrayList<ContentElement> elems = new ArrayList<ContentElement>();
        elems.add(new ContentElement("6/2/17", "Oslo's sites"));
        elems.add(new ContentElement("6/3/17", "Bergen's sites"));
        elems.add(new ContentElement("6/4/17", "Stavanger's sites"));
        elems.add(new ContentElement("6/5/17", "Oslo's sites"));
        elems.add(new ContentElement("6/6/17", "Bergen's sites"));
        elems.add(new ContentElement("6/7/17", "Stavanger's sites"));
        elems.add(new ContentElement("6/8/17", "Oslo's sites"));
        elems.add(new ContentElement("6/9/17", "Bergen's sites"));
        elems.add(new ContentElement("6/10/17", "Stavanger's sites"));
        elems.add(new ContentElement("6/11/17", "Stavanger's sites"));

        ElemAdapter adapter = new ElemAdapter(getActivity(), elems);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
