package com.demo.section7;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 28-Jan-16.
 */
public class GridViewActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

    }

    private List<Country> getCountries() {

        List<Country> countries = new ArrayList<Country>();
        countries.add(new Country("Bahamas", R.drawable.bahamas));
        countries.add(new Country("Australia", R.drawable.australia));
        countries.add(new Country("Belgium", R.drawable.belgium));
        countries.add(new Country("Bangladesh", R.drawable.bangladesh));
        countries.add(new Country("Austria", R.drawable.austria));
        countries.add(new Country("Bermuda", R.drawable.bermuda));
        return countries;
    }

}
