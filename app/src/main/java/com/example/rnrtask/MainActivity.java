package com.example.rnrtask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

   // private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }*/
        //getActionBar().hide();
        //toolbar = getSupportActionBar();
        loadFragment(DashBoardFragment.newInstance());
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.btmNavigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

       // toolbar.setTitle("Home");
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                   // toolbar.setTitle("Home");
                    loadFragment(DashBoardFragment.newInstance());
                    return true;
                case R.id.navigation_profile:
                    //toolbar.setTitle("Profile");
                    Toast.makeText(MainActivity.this, "Not required", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.navigation_leaderboard:
                   // toolbar.setTitle("LeaderBoard");
                    loadFragment(LeaderBoard.newInstance());
                    return true;
                case R.id.navigation_explore:
                   // toolbar.setTitle("Explore");
                    Toast.makeText(MainActivity.this, "Not required", Toast.LENGTH_SHORT).show();

                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}