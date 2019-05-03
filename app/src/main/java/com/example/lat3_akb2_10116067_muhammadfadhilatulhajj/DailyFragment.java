package com.example.lat3_akb2_10116067_muhammadfadhilatulhajj;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DailyFragment extends Fragment{
    private TabLayout tabLayout;

    private ViewPager viewPager;
    public static DailyFragment newInstance(){
        DailyFragment fa = new DailyFragment();
        return fa;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_daily, container, false);

        //Initializing the tablayout
        tabLayout = (TabLayout) v.findViewById(R.id.tabLayout);
        //Initializing viewPager
        viewPager = (ViewPager) v.findViewById(R.id.pager);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    return v;
    }
    private void setupViewPager(ViewPager viewPager) {
        DailyPager adapter = new DailyPager(getFragmentManager());
        adapter.addFragment(new DailyActivityFragment(), "Daily Activity");
        adapter.addFragment(new DailyActivityFragment(), "Friend List");
        viewPager.setAdapter(adapter);
    }
}
