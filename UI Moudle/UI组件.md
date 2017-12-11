# UI组件
## 1.ListView的用法
### Ⅰ.主要代码
#### example.xml单行的布局
    <?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        >
        <TextView
            android:id="@+id/name"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="20sp"
            android:layout_centerVertical="true"
            />
        <ImageView
            android:id="@+id/head"
            android:layout_width="50dp"
            android:layout_height="50dp"
            android:layout_alignParentRight="true"/>
    </RelativeLayout>
#### activity.xml
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:orientation="horizontal"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <ListView
            android:id="@+id/listView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:listSelector="@color/back">
        </ListView>
    
    </LinearLayout>
#### MainActivity.java
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
### Ⅱ.运行结果截图
![image](https://note.youdao.com/yws/public/resource/08f28d4a66ea1f34839c570f214d4448/xmlnote/5A6BBB89205F4BC9B2ABB696A82E6915/345)

## 2.创建自定义布局的AlertDialog
### Ⅰ.主要代码
#### dialog.xml
    <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@+id/alert"
        android:orientation="vertical"
        android:layout_width="300dp"
        android:layout_height="250dp"
        android:background="@drawable/border"
        android:layout_centerVertical="true"
        android:layout_centerHorizontal="true">
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="10dp"
            android:background="@color/orange"
            android:text="@string/dialog_name"
            android:textSize="25sp"
            android:textStyle="italic"
            android:textColor="@color/white"
            android:textAlignment="center"/>
        <EditText
            android:layout_width="match_parent"
            android:text="Username"
            android:textColor="@color/lightgray"
            android:layout_margin="15dp"
            android:layout_height="50dp" />
        <EditText
            android:layout_width="match_parent"
            android:text="Password"
            android:textColor="@color/lightgray"
            android:layout_marginRight="15dp"
            android:layout_marginLeft="15dp"
            android:layout_height="50dp" />
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:layout_marginTop="10dp"
            android:orientation="horizontal">
            <TextView
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:text="@string/cancel"
                android:textSize="25sp"
                android:gravity="center"
                android:background="@drawable/border"
                />
            <TextView
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:text="@string/sign_in"
                android:textSize="25sp"
                android:gravity="center"
                android:background="@drawable/border"
                />
        </LinearLayout>
    </LinearLayout>
#### MainActivity.java
    package com.example.asus.alertdialog;
    
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.app.AlertDialog;
    import android.widget.LinearLayout;
    
    public class MainActivity extends AppCompatActivity {
    
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            AlertDialog.Builder  builder=new AlertDialog.Builder(this);
    
            LinearLayout loginform=(LinearLayout) getLayoutInflater().inflate(R.layout.dialog, null);
    
            builder.setView(loginform);
            AlertDialog viewdialog=builder.create();
            viewdialog.show();
        }
    }
### Ⅱ.实验结果截图
![image](https://note.youdao.com/yws/public/resource/08f28d4a66ea1f34839c570f214d4448/xmlnote/B7786190E8BC44E9B7909431A18A23F8/347)
## 3.使用XML定义菜单
### Ⅰ.主要代码
#### menu_main.xml
    <menu xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        tools:context="com.example.asus.menutest.MainActivity">
        <item
            android:id="@+id/action_textSize"
            android:title="@string/action_textSize"
            app:showAsAction="never" >
            <menu>
                <item
                    android:id="@+id/Size_ten"
                    android:title="@string/Size_ten"
                    app:showAsAction="never"/>
                <item
                    android:id="@+id/Size_sixteen"
                    android:title="@string/Size_sixteen"
                    app:showAsAction="never"/>
                <item
                    android:id="@+id/Size_twenty"
                    android:title="@string/Size_twenty"
                    app:showAsAction="never"/>
            </menu>
        </item>
        <item
            android:id="@+id/action_simple"
            android:title="@string/action_simple"
            app:showAsAction="never" />
        <item
            android:id="@+id/action_textColor"
            android:title="@string/action_textColor"
            app:showAsAction="never" >
            <menu>
                <item
                    android:id="@+id/Color_black"
                    android:title="@string/Color_black"
                    app:showAsAction="never"/>
                <item
                    android:id="@+id/Color_red"
                    android:title="@string/Color_red"
                    app:showAsAction="never"/>
            </menu>
        </item>
    </menu>
#### MainActivity.java
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
    
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
    
    
        }
    
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }
    
        public boolean onOptionsItemSelected(MenuItem item) {
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
    
            return super.onOptionsItemSelected(item);
        }
    }
### Ⅱ.实验结果截图
![image](https://note.youdao.com/yws/public/resource/08f28d4a66ea1f34839c570f214d4448/xmlnote/872246BF5AF44B5DB9C38858F0FB6CDB/349)
![image](https://note.youdao.com/yws/public/resource/08f28d4a66ea1f34839c570f214d4448/xmlnote/6BEC78245BF64E5FA41293C99C699F66/351)
![image](https://note.youdao.com/yws/public/resource/08f28d4a66ea1f34839c570f214d4448/xmlnote/C4B3F3726B964B298118372AC3B741E7/353)
![image](https://note.youdao.com/yws/public/resource/08f28d4a66ea1f34839c570f214d4448/xmlnote/1E9B0DF464F94E19A397ACFF07F08CB6/355)

