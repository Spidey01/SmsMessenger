package com.spidey01.SmsMessenger;

import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ThreadListFragment extends ListFragment {

    private static String[] test_dummy = {
        // "thread 0",
        // "thread 1",
        // "thread 2",
        // "thread 3",
        // "thread 4",
        // "thread 5",
        // "thread 6",
        // "thread 7",
        // "thread 8",
        // "thread 9"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListAdapter model = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, test_dummy);
        setListAdapter(model);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.thread_list_fragment, container, false);
    }

    @Override
    public void onListItemClick(ListView list, View v, int position, long id) {
        Toast.makeText(getActivity(),
                getListView().getItemAtPosition(position).toString(),
                Toast.LENGTH_LONG).show();
    }
}

