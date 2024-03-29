package skiti.cfwz.mareu.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import skiti.cfwz.mareu.controller.MeetingFragment;

public class ListMeetingPagerAdapter extends FragmentPagerAdapter {

    public ListMeetingPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
            return MeetingFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 1;
    }
}