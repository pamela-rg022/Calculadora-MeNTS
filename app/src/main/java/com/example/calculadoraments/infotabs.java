package com.example.calculadoraments;

import android.os.Bundle;

import com.example.calculadoraments.ui.main.PlaceholderFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.calculadoraments.ui.main.SectionsPagerAdapter;

public class infotabs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infotabs);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        //FloatingActionButton fab = findViewById(R.id.fab);
        FloatingActionButton inicio = findViewById(R.id.floatingActioninicio);

        //inicio.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  NavHostFragment.findNavController(PlaceholderFragment.this)
                //        .navigate(R.id.action_placeholderFragment_to_First2Fragment);
            //}
//        });

        //fab.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                  //      .setAction("Action", null).show();
                //NavHostFragment.findNavController(infotabs.this)
                  //      .navigate(R.id.action_placeholderFragment_to_SecondFragment);
            }
      //  });
 //   }

}