package com.example.vivek.assignment104;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by vivek on 11-06-2016.
 */
public class ListFragment extends android.app.ListFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_fragment,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ListView listView = (ListView)view.findViewById(R.id.listView);
        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("Youtube");
        listNames.add("Google");
        listNames.add("Facebook");

        ArrayList<Integer> listImages = new ArrayList<>();
        listImages.add(R.drawable.youtube);
        listImages.add(R.drawable.google);
        listImages.add(R.drawable.facebook);

        CustomAdapter customAdapter = new CustomAdapter(getActivity(),listNames,listImages);
        listView.setAdapter(customAdapter);
    }

}
