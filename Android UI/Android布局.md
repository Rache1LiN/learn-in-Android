# Android布局
## 1.线性布局
### Ⅰ.主要代码
    <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    
        android:layout_width="match_parent"
        android:layout_height="200dp"
        android:orientation="vertical"
        android:background="#000"
        >
    
    
    
    
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:orientation="horizontal"
    
            >
    
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/one_one"
                android:textColor="@color/white"
    
                android:textSize="15sp"
    
                android:gravity="center_horizontal|center_vertical"></TextView>
    
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/one_two"
                android:textColor="@color/white"
                android:textSize="15sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/one_three"
                android:textColor="@color/white"
                android:textSize="15sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/one_four"
                android:textColor="@color/white"
                android:textSize="15sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
        </LinearLayout>
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:orientation="horizontal"
            >
    
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/two_one"
                android:textColor="@color/white"
                android:textSize="15sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/two_two"
                android:textColor="@color/white"
                android:textSize="15sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/two_three"
                android:textColor="@color/white"
                android:textSize="15sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/two_four"
                android:textColor="@color/white"
                android:textSize="15sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
        </LinearLayout>
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:orientation="horizontal"
            >
    
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/three_one"
                android:textColor="@color/white"
                android:textSize="14sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
            <TextView
                android:layout_width="110dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/three_two"
                android:textColor="@color/white"
                android:textSize="14sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/three_three"
                android:textColor="@color/white"
                android:textSize="14sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/three_four"
                android:textColor="@color/white"
                android:textSize="14sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
        </LinearLayout>
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:orientation="horizontal"
            >
    
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/four_one"
                android:textColor="@color/white"
                android:textSize="15sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/four_two"
                android:textColor="@color/white"
                android:textSize="15sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/four_three"
                android:textColor="@color/white"
                android:textSize="5sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:layout_margin="4dp"
                android:background="@drawable/border"
                android:text="@string/four_four"
                android:textColor="@color/white"
                android:textSize="15sp"
                android:gravity="center_horizontal|center_vertical"></TextView>
        </LinearLayout>

    </LinearLayout>


### Ⅱ.实验结果截图
![image](https://note.youdao.com/yws/public/resource/1977608f3670ebcf2da74beb76f55b62/xmlnote/7678420C358643A0BAD994FC3B0957A5/247)

## 2.相对布局
### Ⅰ.主要代码
    <?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        android:background="#000"
        >
        <TextView
            android:id="@+id/red"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:padding="15dp"
            android:text="RED"
            android:textSize="15dp"
            android:textColor="#000"
            android:background="@color/red"
            android:layout_alignParentLeft="true"
            />
        <TextView
            android:id="@+id/yellow"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:padding="15dp"
            android:text="YELLOW"
            android:textSize="15dp"
            android:textColor="#000"
            android:background="@color/yellow"
            android:layout_alignParentRight="true"
            />
    
        <TextView
            android:id="@+id/orange"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:padding="15dp"
            android:text="ORANGE"
            android:textSize="15dp"
            android:textColor="#000"
            android:background="@color/orange"
            android:layout_alignParentTop="true"
            android:layout_centerHorizontal="true"
            />
        <TextView
            android:id="@+id/blue"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:padding="15dp"
            android:layout_marginTop="25dp"
            android:text="BLUE"
            android:textSize="15dp"
            android:textColor="#000"
            android:background="@color/blue"
            android:layout_centerInParent="true"
            />
        <TextView
            android:id="@+id/green"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:padding="15dp"
            android:layout_marginRight="15dp"
            android:text="GREEN"
            android:textSize="15dp"
            android:textColor="#000"
            android:background="@color/green"
            android:layout_centerVertical="true"
            android:layout_toLeftOf="@id/blue"
    
            />
        <TextView
            android:id="@+id/indigo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:padding="15dp"
            android:layout_marginLeft="15dp"
            android:text="INDIGO"
            android:textSize="15dp"
            android:textColor="#000"
            android:background="@color/indigo"
            android:layout_centerVertical="true"
            android:layout_toRightOf="@id/blue"
    
            />
        <TextView
            android:id="@+id/violet"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:paddingTop="15dp"
            android:paddingBottom="15dp"
            android:gravity="center"
            android:text="VIOLET"
            android:textSize="15dp"
            android:textColor="#000"
            android:background="@color/violet"
            android:layout_alignParentBottom="true"
            android:layout_centerHorizontal="true"
            />
    
    </RelativeLayout>

### Ⅱ.实验结果截图
![image](https://note.youdao.com/yws/public/resource/1977608f3670ebcf2da74beb76f55b62/xmlnote/48B0E4EC38BB4FFCB231706F80FC33BD/249)

## 3.表格布局
### Ⅰ.主要代码
    <?xml version="1.0" encoding="utf-8"?>
    <TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/black"
        android:stretchColumns="1">
        <TableRow>
            <TextView
                android:textColor="@color/white"
                android:text="@string/open"
                android:textSize="20dp"
                android:paddingLeft="20dp"/>
            <TextView
                android:textColor="@color/white"
                android:text="@string/open_shortcut"
                android:textSize="20dp"
                android:gravity="right"
                android:padding="3dp"/>
        </TableRow>
        <TableRow>
            <TextView
                android:textColor="@color/white"
                android:text="@string/save"
                android:textSize="20dp"
                android:paddingLeft="20dp"/>
            <TextView
                android:textColor="@color/white"
                android:text="@string/save_shortcut"
                android:textSize="20dp"
                android:gravity="right"
                android:padding="3dp"/>
        </TableRow>
        <TableRow
            android:background="@drawable/border">
            <TextView
                android:textColor="@color/white"
                android:text="@string/save_as"
    
    
                android:textSize="20dp"
                android:paddingLeft="20dp"/>
            <TextView
                android:textColor="@color/white"
                android:text="@string/save_as_shortcut"
                android:textSize="20dp"
                android:gravity="right"
                android:padding="3dp"/>
        </TableRow>
        <TableRow>
            <TextView
                android:textColor="@color/white"
                android:text="@string/imp"
                android:textSize="20dp"
                android:padding="3dp"/>
        </TableRow>
        <TableRow
            android:background="@drawable/border">
            <TextView
                android:textColor="@color/white"
                android:text="@string/exp"
                android:textSize="20dp"
                android:padding="3dp"/>
            <TextView
                android:textColor="@color/white"
                android:text="@string/exp_shortcut"
                android:textSize="20dp"
                android:gravity="right"
                android:padding="3dp"/>
        </TableRow>
        <TableRow>
            <TextView
                android:textColor="@color/white"
                android:text="@string/quit"
                android:textSize="20dp"
                android:paddingLeft="20dp"/>
    
        </TableRow>
    
    </TableLayout>

### Ⅱ.实验结果截图
![image](https://note.youdao.com/yws/public/resource/1977608f3670ebcf2da74beb76f55b62/xmlnote/F877C967C3B6407BA4BC4765F47A907F/253)