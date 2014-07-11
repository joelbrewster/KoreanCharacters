package com.happydad.koreancharacters;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.MenuInflater;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends FragmentActivity implements ActionBar.TabListener {

    ViewPager viewPager=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Show the actionmenu bar
        //TODO: add options and help page icons
        getActionBar().setDisplayShowHomeEnabled(false);
        getActionBar().setDisplayShowTitleEnabled(false);


        //Turn the phone on for testing
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON |
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON |
                WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD |
                WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);



        setContentView(R.layout.activity_main);

        viewPager= (ViewPager) findViewById(R.id.pager);

        final ActionBar actionBar=getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        addTabs(actionBar);


        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {


            @Override
            public void onPageScrolled(int i, float v, int i2) {
            }

            @Override
            public void onPageSelected(int i) {
                actionBar.setSelectedNavigationItem(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }


        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_help:

                openHelp();
                return true;

            case R.id.action_search:
                openSearch();
                return true;

            case R.id.action_settings:
                openSettings();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void openSearch() {
        Toast.makeText(this, "Search selected", Toast.LENGTH_SHORT)
                .show();
    }

    private void openAbout() {
        Toast.makeText(this, "About me selected", Toast.LENGTH_SHORT)
                .show();
    }

    private void openSettings() {
        Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT)
                .show();
    }


    private void openHelp() {

        //New
        Intent intent = new Intent();
        intent.setClassName("com.happydad.koreancharacters", "com.happydad.koreancharacters.OpenHelpPage");
        startActivity(intent);

        //old
        //Intent intent = new Intent(MainActivity.this, OpenHelpPage.class);

        //new variant
        //Intent intent = new Intent(getApplicationContext(),OpenHelpPage.class);
        //startActivity(intent);




    }




    private void addTabs(ActionBar actionBar)
    {
        //Name the tabs
        //TODO: condense

        ActionBar.Tab tab1=actionBar.newTab();
        tab1.setIcon(R.drawable.ic_action_help);
        tab1.setTabListener(this);


        //old
        //ActionBar.Tab tab1=actionBar.newTab();
        //tab1.setText(" ㄱ ");
        //tab1.setTabListener(this);


        ActionBar.Tab tab2=actionBar.newTab();
        tab2.setText(" ㄴ ");
        tab2.setTabListener(this);

        ActionBar.Tab tab3=actionBar.newTab();
        tab3.setText(" ㄷ ");
        tab3.setTabListener(this);

        ActionBar.Tab tab4=actionBar.newTab();
        tab4.setText(" ㄹ ");
        tab4.setTabListener(this);

        ActionBar.Tab tab5=actionBar.newTab();
        tab5.setText(" ㅁ ");
        tab5.setTabListener(this);

        ActionBar.Tab tab6=actionBar.newTab();
        tab6.setText(" ㅂ ");
        tab6.setTabListener(this);

        ActionBar.Tab tab7=actionBar.newTab();
        tab7.setText(" ㅅ ");
        tab7.setTabListener(this);

        ActionBar.Tab tab8=actionBar.newTab();
        tab8.setText(" ㅈ ");
        tab8.setTabListener(this);

        ActionBar.Tab tab9=actionBar.newTab();
        tab9.setText(" ㅊ ");
        tab9.setTabListener(this);

        ActionBar.Tab tab10=actionBar.newTab();
        tab10.setText(" ㅋ ");
        tab10.setTabListener(this);

        ActionBar.Tab tab11=actionBar.newTab();
        tab11.setText(" ㅌ ");
        tab11.setTabListener(this);

        ActionBar.Tab tab12=actionBar.newTab();
        tab12.setText(" ㅍ ");
        tab12.setTabListener(this);

        ActionBar.Tab tab13=actionBar.newTab();
        tab13.setText(" ㅎ ");
        tab13.setTabListener(this);


        //Add the tabs
        //TODO: condense
        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);
        actionBar.addTab(tab4);
        actionBar.addTab(tab5);
        actionBar.addTab(tab6);
        actionBar.addTab(tab7);
        actionBar.addTab(tab8);
        actionBar.addTab(tab9);
        actionBar.addTab(tab10);
        actionBar.addTab(tab11);
        actionBar.addTab(tab12);
        actionBar.addTab(tab13);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }
}

class MyAdapter extends FragmentStatePagerAdapter
{

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment=null;
        if(i==0)
        {
            fragment=new Fragment1();
        }
        if(i==1)
        {
            fragment=new Fragment2();
        }
        if(i==2)
        {
            fragment=new Fragment3();
        }
        if(i==3)
        {
            fragment=new Fragment4();
        }
        if(i==4)
        {
            fragment=new Fragment5();
        }
        if(i==5)
        {
            fragment=new Fragment6();
        }
        if(i==6)
        {
            fragment=new Fragment7();
        }
        if(i==7)
        {
            fragment=new Fragment8();
        }
        if(i==8)
        {
            fragment=new Fragment9();
        }
        if(i==9)
        {
            fragment=new Fragment10();
        }
        if(i==10)
        {
            fragment=new Fragment11();
        }
        if(i==11)
        {
            fragment=new Fragment12();
        }
        if(i==12)
        {
            fragment=new Fragment13();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 13;
    }
}