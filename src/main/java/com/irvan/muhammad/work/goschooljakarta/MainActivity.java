package com.irvan.muhammad.work.goschooljakarta;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    Button jenjang;
    databaseHelper dbh;
    ListView list;
    customListAdapter adapter;
    EditText editCari;
    public MainActivity CustomListView = null;
    public ArrayList<DataSekolah> CustomListViewValuesArr = new ArrayList<DataSekolah>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        CustomListView = this;
        setContentView(R.layout.activity_main);
        changeStatusBarColor();
        dbh = new databaseHelper(MainActivity.this);
        Resources res = getResources();
        list=(ListView)findViewById(R.id.listSekolah);

        adapter = new customListAdapter(CustomListView, CustomListViewValuesArr, res);
        list.setAdapter(adapter);

        editCari = (EditText)findViewById(R.id.editCari);
        editCari.addTextChangedListener(this);

        setList();

    }
    private void setList(){
        try{
            Cursor ambildata = dbh.get_sekolah();
            CustomListViewValuesArr.clear();
            int i = 1;
            while(ambildata.moveToNext()){
                final DataSekolah sched = new DataSekolah();
                sched.setNomor(String.valueOf(i));
                sched.setNamaSekolah(ambildata.getString(0));
                sched.setAlamat(ambildata.getString(1));
                sched.setTelepon(ambildata.getString(3));
                CustomListViewValuesArr.add(sched);
                i++;
            }
            adapter.notifyDataSetChanged();
            list.setAdapter(adapter);
        }catch (Exception e){
            Log.d("msg", e.getMessage());
        }

    }
    private void setList(String search){
        try{
            Cursor ambildata = dbh.get_sekolah(search);
            CustomListViewValuesArr.clear();
            int i = 1;
            while(ambildata.moveToNext()){
                final DataSekolah sched = new DataSekolah();
                sched.setNomor(String.valueOf(i));
                sched.setNamaSekolah(ambildata.getString(0));
                sched.setAlamat(ambildata.getString(1));
                sched.setTelepon(ambildata.getString(3));
                CustomListViewValuesArr.add(sched);
                i++;
            }
            adapter.notifyDataSetChanged();
            list.setAdapter(adapter);
        }catch (Exception e){

        }

    }
    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()){
            case R.id.action_info:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Info Aplikasi");
                builder.setMessage("Muhammad Irvan\nwork.irvan@gmail.com \n\nData from http://data.go.id/dataset/data-smp-sma-dan-smk-di-dki-jakarta");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void onItemClick(final int mPosition)
    {

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if(s.length() > 0 ){
            setList(s.toString());
        }else{
            setList();
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
