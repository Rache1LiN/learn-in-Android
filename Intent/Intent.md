# Intent
## 1.自定义WebView验证隐式Intent的使用
    本实验通过自定义WebView加载URL来验证隐式Intent的使用。
    实验包含两个应用：
        第一个应用：获取URL地址并启动隐式Intent的调用。
        第二个应用：自定义WebView来加载URL
### Ⅰ.主要代码
#### a.第一个应用
##### java代码
        public class MainActivity extends AppCompatActivity {
    
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button btn=(Button)findViewById(R.id.btn);
    
    
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText editText=(EditText)findViewById(R.id.url);
                    String url=editText.getText().toString();
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            });
        }
    }
##### xml
        <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:gravity="center_horizontal">
    
        <EditText
            android:id="@+id/url"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="70dp"
            android:textSize="15sp"
    
            />
        <Button
            android:id="@+id/btn"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/btn_name"
            android:layout_centerHorizontal="true"
            />
    
    
    
    </LinearLayout>
#### b.第二个应用
##### java代码
        public class MainActivity extends AppCompatActivity {
    
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Intent intent = getIntent();
    
            Uri data = intent.getData();
            URL url = null;
    
            try {
                url = new URL(data.getScheme(), data.getHost(),
                        data.getPath());
            } catch (Exception e) {
                e.printStackTrace();
            }
    
            WebView webView = (WebView) findViewById(R.id.webView);
            //WebView加载web资源
            webView.loadUrl(url.toString());
            //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
            webView.setWebViewClient(new WebViewClient(){
                @Override
               /* public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    // TODO Auto-generated method stub
                    //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                    view.loadUrl(request.toString());
                    return true;
                }*/
                public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                    handler.proceed();
                }
            });
        }
    }
##### xml
        <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context="com.example.asus.mybrowser.MainActivity">
    
        <WebView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:id="@+id/webView"
            />
    
    </RelativeLayout>
##### AndroidManifest.xml
        <manifest xmlns:android="http://schemas.android.com/apk/res/android"
        package="com.example.asus.mybrowser">
    
        <application
            android:allowBackup="true"
            android:icon="@mipmap/ic_launcher"
            android:label="@string/app_name"
            android:roundIcon="@mipmap/ic_launcher_round"
            android:supportsRtl="true"
            android:theme="@style/AppTheme">
            <activity android:name=".MainActivity">
                <intent-filter>
                    <action android:name="android.intent.action.VIEW" />
                    <data android:scheme="http" />
                    <data android:scheme="https" />
                    <category android:name="android.intent.category.DEFAULT" />
                </intent-filter>
            </activity>
        </application>
        <uses-permission android:name="android.permission.INTERNET" />
    </manifest>
    
### Ⅱ.实验结果截图
![image](https://note.youdao.com/yws/public/resource/77228b63ac43ca5ebf978fa750591ace/xmlnote/B0A4E9979CDB4670B2CB488A38C15B1A/375)
![image](https://note.youdao.com/yws/public/resource/77228b63ac43ca5ebf978fa750591ace/xmlnote/BACC6DF549074EADA79E31D5B31FDDCD/377)

![image](https://note.youdao.com/yws/public/resource/77228b63ac43ca5ebf978fa750591ace/xmlnote/BD098773A9814AAA9C2575E575AF068B/422)