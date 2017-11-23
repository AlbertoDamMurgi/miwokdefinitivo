package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by usuario on 20/11/17.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public TabsPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new ColorsFragment();
            case 1:
                return new FamlilyFragment();
            case 2:
                return new FrasesFragment();
            case 3:
                return new NumbersFragment();


        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {



        switch (position){

            case 0:
                return  context.getString(R.string.category_colors);
            case 1:
                return context.getString(R.string.category_family);

            case 2:
                return context.getString(R.string.category_phrases);
            case 3:
                return context.getString(R.string.category_numbers);

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
