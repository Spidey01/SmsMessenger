package com.spidey01.SmsMessenger;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends FragmentActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        FragmentManager manager = getSupportFragmentManager();

        ThreadListFragment f =
            (ThreadListFragment)manager.findFragmentById(R.id.fragment_container);
        if (f == null) {
            FragmentTransaction trans = manager.beginTransaction();
            {
                f = new ThreadListFragment();
                trans.add(R.id.fragment_container, f);
            }
            trans.commit();
        }
    }
}
