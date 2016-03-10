package com.example.aokly.myapplication2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    final String SAVED_TEXT = "TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    void saveData(String s) {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SAVED_TEXT, s);
        editor.commit();
    }
    String loadData() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        return sharedPreferences.getString(SAVED_TEXT, "");
    }
}
