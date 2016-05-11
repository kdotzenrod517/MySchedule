package com.example.kdotz.myschedule;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    private ListView scheduleListView = null;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        scheduleListView = (ListView) rootView.findViewById(R.id.schedule);

        ScheduleAdapter scheduleAdapter = new ScheduleAdapter(getActivity());

        scheduleAdapter.add(new ScheduleDetail("Birthdays","My Birthday", "5/17/2016" ));
        scheduleAdapter.add(new ScheduleDetail("Events", "Home to Minnesota", "5/13/16"));
        scheduleAdapter.add(new ScheduleDetail("Weddings", "Lauren's Wedding", "7/9/2016"));
        scheduleListView.setAdapter(scheduleAdapter);

        scheduleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ScheduleDetail item = (ScheduleDetail) scheduleListView.getAdapter().getItem(position);

                Intent intent = new Intent(view.getContext(), ScheduleDetailActivity.class);

                intent.putExtra(ScheduleDetailActivity.EXTRA_TITLE, item.getscheduleTitle());
                intent.putExtra(ScheduleDetailActivity.EXTRA_DESCRIP, item.getScheduleDescrip());
                intent.putExtra(ScheduleDetailActivity.EXTRA_DATE, item.getscheduleDate());

                startActivity(intent);

            }
        });

        return rootView;
    }
}
