package com.example.asus.listview;

import java.util.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    private ListView listView;
    private String [] names={"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int [] images={R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    private List<Map<String,Object>> listMap= new ArrayList<Map<String,Object>>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);
        for(int i=0;i<names.length;i++)
        {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put("name",names[i]);
            item.put("head",images[i]);
            listMap.add(item);


        }
        SimpleAdapter sa=new SimpleAdapter(this,listMap,R.layout.example,new String[]{"name","head"},new int []{R.id.name,R.id.head});
        listView.setAdapter(sa);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> adapter, View v, int position,long id) {
                TextView text=(TextView)v.findViewById(R.id.name);
                Toast.makeText(getApplicationContext(),text.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}

