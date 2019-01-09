package com.absolutio.saavnuiasgn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RadioFragment extends Fragment {


    /*private static final String ARG_SECTION_NUMBER = "section_number";

    public RadioFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
   /* public static RadioFragment newInstance(int sectionNumber) {
        RadioFragment fragment = new RadioFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
*/


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_radio, container, false);
        TabLayout tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);

        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());

        final ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);
        // mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //mRecyclerView.setLayoutManager(mLayoutManager);
        viewPager.setAdapter(new PagerAdapter(getFragmentManager(), tabLayout.getTabCount()));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setupWithViewPager(viewPager);
        //tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        tabLayout.getTabAt(0).setText("FEATURED");
        tabLayout.getTabAt(1).setText("ARTISTS");
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




        return rootView;
    }

    public class PagerAdapter extends FragmentStatePagerAdapter {
        int mNumOfTabs;

        public PagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = NumOfTabs;
        }


        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new RadFeatFragment();
                case 1:
                    return new RadArtFragment();

                /*case 2:
                    return new HomeFragment();
                case 3:
                    return new HomeFragment();
                case 4:
                    return new HomeFragment();
                case 5:
                    return new HomeFragment();*/
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return mNumOfTabs;
        }
    }
}




    /*public class SectionsPagerAdapter extends FragmentPagerAdapter {

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
