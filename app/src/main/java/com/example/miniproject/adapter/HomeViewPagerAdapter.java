package com.example.miniproject.adapter;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.miniproject.activity.ExpenseFragment;
import com.example.miniproject.activity.TodaysExpenseFragment;

public class HomeViewPagerAdapter extends FragmentStatePagerAdapter {
    public HomeViewPagerAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ExpenseFragment();
            case 1:
                return new TodaysExpenseFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
