package com.example.rnrtask;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class MyPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 6;

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return Tab1.newInstance();
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return Tab2.newInstance();
            case 2: // Fragment # 1 - This will show SecondFragment
                return Tab3.newInstance();
            case 3: // Fragment # 1 - This will show SecondFragment
                return Tab4.newInstance();
            case 4: // Fragment # 1 - This will show SecondFragment
                return Tab5.newInstance();
            case 5: // Fragment # 1 - This will show SecondFragment
                return Tab6.newInstance();
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
   /* @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
*/
}


