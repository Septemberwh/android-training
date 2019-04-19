package com.example.septe.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.septe.myapplication.fragment.BlankFragment;
import com.example.septe.myapplication.fragment.BlankFragment2;
import com.example.septe.myapplication.fragment.BlankFragment3;
import com.example.septe.myapplication.fragment.BlankFragment4;
import com.example.septe.myapplication.fragment.BlankFragment5;
import com.example.septe.myapplication.fragment.BlankFragment6;
import com.example.septe.myapplication.fragment.BlankFragment7;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.test0) {
            // Handle the camera action
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        } else if (id == R.id.test1) {
            BlankFragment f1 = new BlankFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, f1).commit();
        } else if (id == R.id.test2) {
            BlankFragment2 f2 = new BlankFragment2();
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, f2).commit();
        } else if (id == R.id.test3) {
            BlankFragment3 f3 = new BlankFragment3();
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, f3).commit();
        } else if (id == R.id.test4) {
            BlankFragment4 f4 = new BlankFragment4();
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, f4).commit();
        } else if (id == R.id.test5) {
            BlankFragment5 f5 = new BlankFragment5();
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, f5).commit();
        } else if (id == R.id.test6) {
            BlankFragment6 f6 = new BlankFragment6();
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, f6).commit();
        } else if (id == R.id.test7) {
            BlankFragment7 f7 = new BlankFragment7();
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, f7).commit();
        } else if (id == R.id.test8) {

        } else if (id == R.id.test9) {

        } else if (id == R.id.test10) {
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
