package com.pablohenao.practica5punto2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount()==0)
        {
            this.finish();
        }else{
            getFragmentManager().popBackStack();
        }

    }
}