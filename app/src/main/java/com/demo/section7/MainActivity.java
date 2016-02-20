package com.demo.section7;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.List;

public class MainActivity extends ListActivity {  //extends AppCompatActivity implements View.OnClickListener

    private CheckBox extraCheese, frenchFries;
    private Button button;
    private RadioButton shaken, stirred;
    private RadioGroup rgrp;
    private ListView listView;

    class BookAdapter extends ArrayAdapter<Book>{

        private LayoutInflater layoutInflater;
        public BookAdapter(Context context, int resource, List<Book> books) {
            super(context, resource, books);
            layoutInflater=LayoutInflater.from(context);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return super.getView(position, convertView, parent);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview);
        // listView=(ListView)findViewById(R.id.listView);
       /* String array[] = getResources().getStringArray(R.array.array);
        String temp[];
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, new String[]{});
        //listView.setAdapter(adapter);
        setListAdapter(adapter);*/



      /*  shaken = (RadioButton) findViewById(R.id.radioButton1);
        stirred = (RadioButton) findViewById(R.id.radioButton2);
        rgrp = (RadioGroup) findViewById(R.id.rgroup);
        shaken.setOnClickListener(this);
        stirred.setOnClickListener(this);*/



      /*  extraCheese = (CheckBox) findViewById(R.id.extraCheese);
        frenchFries = (CheckBox) findViewById(R.id.frnehcFries);
        button = (Button) findViewById(R.id.order);
        button.setOnClickListener(this);

        extraCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {

                    Log.i("data : ", "Extra Cheese has been selected");

                } else {

                    Log.i("data : ", "Extra Cheese has not been selected");
                }
            }


        });

        frenchFries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {

                    Log.i("data : ", "French Fries has been selected");

                } else {

                    Log.i("data : ", "French Fries has not been selected");
                }
            }


        });*/




        /*imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        textView=(TextView)findViewById(R.id.textView);
        textView.setText("This is my picture");
        textView.setCompoundDrawablesWithIntrinsicBounds(null,null,null,getResources().getDrawable(R.drawable.pic));*/
        //Typeface typeface= Typeface.createFromAsset(getAssets(),getString(R.string.path));
        //textView.setTypeface(typeface);

    }


   /* @Override
    public void onClick(View v) {
        int checkedId = rgrp.getCheckedRadioButtonId();

        switch (checkedId) {

            case R.id.radioButton1:
                if (shaken.isChecked()) {
                    Toast.makeText(this, "shaken is clicked", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.radioButton2:
                if (stirred.isChecked()) {

                    Toast.makeText(this, "stirred is clicked", Toast.LENGTH_LONG).show();
                }
                break;

        }*/


       /* String newline = System.getProperty("line.separator");
        StringBuffer buffer = new StringBuffer();
        buffer.append(getString(R.string.burger));

        if (extraCheese.isChecked()) {
            buffer.append(newline);
            buffer.append(getString(R.string.extra_cheese));
        }

        if (frenchFries.isChecked()) {
            buffer.append(newline);
            buffer.append(getString(R.string.french_fries));
        }


        Toast.makeText(this, buffer.toString(), Toast.LENGTH_SHORT).show();*/
}

