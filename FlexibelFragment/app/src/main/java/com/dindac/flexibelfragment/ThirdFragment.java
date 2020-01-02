package com.dindac.flexibelfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ThirdFragment extends Fragment {


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceStated) {
        super.onViewCreated(view, savedInstanceStated);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Ketiga");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("third_fragment.xml");
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setHasOptionsMenu(true);
    }

    public boolean onOptionItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return  super.onOptionsItemSelected(item);
    }


}

