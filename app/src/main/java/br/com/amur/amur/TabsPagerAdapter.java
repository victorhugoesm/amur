package br.com.amur.amur;

/**
 * Created by victorhugoesm on 23/08/15.
 */

import br.com.amur.amur.ProductsFragment;
import br.com.amur.amur.CoursesFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter  {

    private String tabtitles[] = new String[] { "Products", "Courses" };

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new ProductsFragment();
            case 1:
                return new CoursesFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles[position];
    }
}
