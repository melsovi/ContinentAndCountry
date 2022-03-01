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

public class CountryFragment extends Fragment {
    private ArrayList<Continent> continent;
    private ContinentAdapter continentAdapter;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler2_view);
        continentAdapter = new ContinentAdapter(continent,this::onClick);
        recyclerView.setAdapter(continentAdapter);
    }

    private void onClick(Continent continent) {
    }


    private void loadData() {
        continent = new ArrayList<>();
        Bundle bundle = getArguments();
        Integer val = bundle.getInt(getString(R.string.key));
        switch (val) {
            case 1:
                continent.add(new Continent("Танзания", R.drawable.tz));
                continent.add(new Continent("Сенегал", R.drawable.sn));
                continent.add(new Continent("ДР Конго", R.drawable.cd));
                continent.add(new Continent("Марокко", R.drawable.ma));
                continent.add(new Continent("Кот-д'Ивуар", R.drawable.ci));
                break;
            case 2:
                continent.add(new Continent("Австралия", R.drawable.nz));
                break;
            case 3:
                continent.add(new Continent("Германия", R.drawable.de));
                continent.add(new Continent("Швецария", R.drawable.ch));
                continent.add(new Continent("Хорватия", R.drawable.hr));
                continent.add(new Continent("Великобритания", R.drawable.gb));
                continent.add(new Continent("Финлядния", R.drawable.fi));
                break;
            case 4:
                continent.add(new Continent("Катар", R.drawable.qa));
                continent.add(new Continent("Казахстан", R.drawable.kz));
                continent.add(new Continent("Япония", R.drawable.jp));
                continent.add(new Continent("Корея", R.drawable.kr));
                continent.add(new Continent("Филипины", R.drawable.ph));
                break;
            case 5:
                continent.add(new Continent("Бразилия", R.drawable.br));
                continent.add(new Continent("Аргентина", R.drawable.ar));
                continent.add(new Continent("Эквадор", R.drawable.ec));
                continent.add(new Continent("Колумбия", R.drawable.co));
                continent.add(new Continent("Чили", R.drawable.cl));
                break;
            case 6:
                continent.add(new Continent("Канада", R.drawable.canada));
                continent.add(new Continent("Куба", R.drawable.cuba));
                continent.add(new Continent("Мексика", R.drawable.mexico));
                continent.add(new Continent("Панама", R.drawable.pahama));
                continent.add(new Continent("Ямайка", R.drawable.jamaika));
                continent.add(new Continent("Гватемала", R.drawable.gvatamella));
                break;
        }
    }

}