package com.example.asus.menutest;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        TextView textView=(TextView)findViewById(R.id.test);
        switch(item.getItemId())
        {
            case R.id.Size_ten:
                textView.setTextSize(textView.getResources().getDimension(R.dimen.Size_ten));
                break;
            case R.id.Size_sixteen:
                textView.setTextSize(textView.getResources().getDimension(R.dimen.Size_sixteen));
                break;
            case R.id.Size_twenty:
                textView.setTextSize(textView.getResources().getDimension(R.dimen.Size_twenty));
                break;
            case R.id.action_simple:
                textView.setTextColor(ContextCompat.getColor(this,R.color.normal));
                textView.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.normal));
                Toast.makeText(this, "普通菜单项", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Color_black:
                textView.setTextColor(ContextCompat.getColor(this,R.color.black));
                break;
            case R.id.Color_red:
                textView.setTextColor(ContextCompat.getColor(this,R.color.red));
                break;
        }

        //noinspection SimplifiableIfStatement
        return super.onOptionsItemSelected(item);
    }
}
