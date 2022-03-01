package com.company.continentandcountry;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnClick{
    private RecyclerView recyclerView;
    private ArrayList<Continent> continents;
    private ContinentAdapter continentAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_continent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler_view);
        continentAdapter = new ContinentAdapter(continents, this::onClick);
        recyclerView.setAdapter(continentAdapter);


    }

    private void loadData() {
        continents = new ArrayList<>();
        continents.add(new Continent("Africa", R.drawable.ic_africa, 1));
        continents.add(new Continent("Australia", R.drawable.ic_australia, 2));
        continents.add(new Continent("Europa", R.drawable.ic_europa, 3));
        continents.add(new Continent("Eurasia", R.drawable.ic_eurasia, 4));
        continents.add(new Continent("North America", R.drawable.ic_north_america, 5));
        continents.add(new Continent("South America", R.drawable.ic_south_america, 6));

    }

    @Override
    public void onClick(Continent continent) {
        Bundle bundle = new Bundle();
        bundle.putInt(getString(R.string.key), continent.getKeyId());
        Fragment fragment = new CountryFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_main, fragment).addToBackStack(null).commit();
    }

}