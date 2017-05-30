package com.may.android.norway;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Henrik on 29.05.2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CitiesFragment();
            case 1:
                return new HikesFragment();
            case 2:
                return new RoutesFragment();
            case 3:
                return new DayplansFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_cities);
            case 1:
                return mContext.getString(R.string.category_hikes);
            case 2:
                return mContext.getString(R.string.category_routes);
            case 3:
                return mContext.getString(R.string.category_dayplans);
            default:
                return null;
        }
    }
}