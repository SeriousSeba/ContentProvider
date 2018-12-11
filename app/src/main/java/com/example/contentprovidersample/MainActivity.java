package com.example.contentprovidersample;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;

import android.content.ContentValues;
import android.content.CursorLoader;

import android.database.Cursor;

import android.view.Menu;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickAddName(View view) {
        ContentValues values = new ContentValues();
        ContentResolver contentResolver = getContentResolver();
        /**
         * Dodac wartosci do values na podstawie nazw kolumn w tablicy
         * Wywołac metode insert przy pomocy ContentResolver
         */
    }
    public void onClickRetrieveStudents(View view) {
        String URL = "content://com.example.MyApplication.StudentsProvider";

        Uri students = Uri.parse(URL);
        Toast.makeText(getApplicationContext(), "elo", Toast.LENGTH_LONG).show();
        /**
         * Uzyc metody managedQuery wyowlywanej z kontekstu
         * Za pomoca Cursor iterowac po wydobytych danych
         */
    }
}