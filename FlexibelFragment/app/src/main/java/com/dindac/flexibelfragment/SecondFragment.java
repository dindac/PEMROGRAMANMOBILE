package com.dindac.flexibelfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class SecondFragment extends Fragment implements View.OnClickListener {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceStated) {
        super.onViewCreated(view, savedInstanceStated);

        Button btnThird = view.findViewById(R.id.secondButton);
        btnThird.setOnClickListener(this);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Kedua");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("second_fragment.xml");
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setHasOptionsMenu(true);
    }

    public boolean onOptionItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return  super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.secondButton){
            ThirdFragment thirdFragment = new ThirdFragment();
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager !=null){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_content, thirdFragment, ThirdFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        }
    }
}

