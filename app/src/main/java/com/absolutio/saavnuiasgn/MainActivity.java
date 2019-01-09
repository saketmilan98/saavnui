package com.absolutio.saavnuiasgn;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        actionBar = (ActionBar)getSupportActionBar();
        actionBar.setTitle("MENU");

        //actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME|ActionBar.D|ActionBar.DISPLAY_SHOW_TITLE);

        //actionBar.setDisplayHomeAsUpEnabled(true)|actionBar.DISPLAY_USE_LOGO;
        //actionBar.DISPLAY_USE_LOGO
        //actionBar.setIcon(R.drawable.ic_menu_black_24dp);




        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
        }
    }




    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            actionBar.setTitle("MENU");
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_radio:
                            actionBar.setTitle("RADIO");
                            selectedFragment = new RadioFragment();
                            break;
                        case R.id.nav_browse:
                            actionBar.setTitle("MENU");
                            selectedFragment = new HomeFragment();
                            Toast.makeText(MainActivity.this, "Clicked on Browse bottom navigation button.Back to HOME.", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.nav_mymusic:
                            actionBar.setTitle("MENU");
                            Toast.makeText(MainActivity.this, "Clicked on My Music bottom navigation button.Back to HOME", Toast.LENGTH_SHORT).show();
                            selectedFragment = new HomeFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.actionbarmenu,menu);
        return true;
    }






/*
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return RadioFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }*/
}