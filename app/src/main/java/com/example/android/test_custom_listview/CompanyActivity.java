package com.example.android.test_custom_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CompanyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);


        String[] names1 = getResources().getStringArray(R.array.names);
        int[] ides = getResources().getIntArray(R.array.ids);
        int[] images = new int[]{R.drawable.r1,R.drawable.r2,R.drawable.r3,
                R.drawable.r4,R.drawable.r5,R.drawable.r6
        ,R.drawable.r7};

       List<names> all = new ArrayList<names>();

        for(int i = 0 ; i <7 ; i++){
            names n1 = new names();
            n1.setNames(names1[i]);
            n1.setIdes(ides[i]);
            n1.setImages(images[i]);
            all.add(n1);

        }



    }
}
