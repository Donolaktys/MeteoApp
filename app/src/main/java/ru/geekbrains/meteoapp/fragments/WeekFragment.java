package ru.geekbrains.meteoapp.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

import ru.geekbrains.meteoapp.adapters.DayViewAdapter;
import ru.geekbrains.meteoapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class WeekFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three_days, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.fragmentViewThreeDay);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        DayViewAdapter adapter = new DayViewAdapter(7);
        recyclerView.setAdapter(adapter);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(rootView.getContext(),  LinearLayoutManager.VERTICAL);
        itemDecoration.setDrawable(Objects.requireNonNull(rootView.getContext().getDrawable(R.drawable.day_view_decorator)));
        recyclerView.addItemDecoration(itemDecoration);
        return rootView;
    }
}
