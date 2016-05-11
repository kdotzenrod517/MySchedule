package com.example.kdotz.myschedule;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class ScheduleDetailActivityFragment extends Fragment {

    public ScheduleDetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_schedule_detail, container, false);

        Intent intent = getActivity().getIntent();

        String name = intent.getStringExtra(ScheduleDetailActivity.EXTRA_TITLE);
        String descrip = intent.getStringExtra(ScheduleDetailActivity.EXTRA_DESCRIP);
        String date = intent.getStringExtra(ScheduleDetailActivity.EXTRA_DATE);

        TextView scheduleDetailTextView = (TextView)rootView.findViewById(R.id.detail_text);
        TextView scheduleDetailDateView = (TextView)rootView.findViewById(R.id.detail_text2);

        scheduleDetailTextView.setText(descrip);
        scheduleDetailDateView.setText(date);

        return rootView;
    }
}
