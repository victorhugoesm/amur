package br.com.amur.amur;

import br.com.amur.amur.TabsPagerAdapter;
import br.com.amur.amur.R;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;

public class MainActivity extends FragmentActivity {

    private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());
        viewPager = (ViewPager)findViewById(R.id.pager);
        viewPager.setAdapter(mAdapter);

    }

    /*
    private void setFloatingActionButtonForProducts() {
        floatingActionButton.setBackgroundTintList(getResources().getColorStateList(R.color.purple));
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    */
}
