package com.equilibrium.orientation;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private String getScreenOrientation(){
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            return "Портретная ориентация";
        else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            return "Альбомная ориентация";
        else
            return "";
    }

    public void orientationClick(View view){
        TextView orientView = (TextView)findViewById(R.id.textOrient);
        orientView.setText(getScreenOrientation());
    }


    //The second variant to orientation's definition
   /* private String mOrientation = "";
    private boolean isLandscapeMode(Activity acitivity)
    {
        int width =
                acitivity.getWindowManager().getDefaultDisplay().getWidth();
        int height =
                acitivity.getWindowManager().getDefaultDisplay().getHeight();

        boolean isLandscape = width > height;

        if(isLandscape)
            mOrientation = "Альбомная";
        else
            mOrientation = "Портретная";

        return isLandscape;
    }*/


    //Switch rotate, 0, 90, 180, 270 degrees
    /*private String getRotateOrientation() {
        int rotate = getWindowManager().getDefaultDisplay().getRotation();
        switch (rotate) {
            case Surface.ROTATION_0:
                return "Не поворачивали";
            case Surface.ROTATION_90:
                return "Повернули на 90 градусов по часовой стрелке";
            case Surface.ROTATION_180:
                return "Повернули на 180 градусов";
            case Surface.ROTATION_270:
                return "Повернули на 90 градусов по часовой стрелке";
            default:
                return "Не понятно";
        }
    }*/

}
