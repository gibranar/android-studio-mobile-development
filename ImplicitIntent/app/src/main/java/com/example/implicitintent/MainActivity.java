package com.example.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private EditText mLocationEditText;

    public static final int TEXT_REQUEST = 1;
    private ShopList items = new ShopList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLocationEditText = findViewById(R.id.location_edittext);
        Intent intent = getIntent();
        if ((savedInstanceState != null) && (savedInstanceState.getSerializable("list") != null)) {
            HashMap<String, Integer> l = (HashMap<String, Integer>) savedInstanceState.getSerializable("list");
            TextView tv = findViewById(R.id.textView);
            tv.setText("");
            for (String k : l.keySet()) {
                String s = l.get(k).toString() + " " + k + "\n";
                tv.setText(tv.getText() + s);
                for (int i = 0; i < l.get(k); i++) {
                    items.addItem(k);
                }
            }
        }
    }

    public void openLocation(View view) {
        String loc = mLocationEditText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        startActivity(intent);
        if (intent.resolveActivity(getPackageManager()) != null) {
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void launchSecondActivity(View view) {

        Intent intent = new Intent(this, SecondActivity.class);

        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putSerializable("list", items.getItems());
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String item = data.getStringExtra(SecondActivity.EXTRA_MESSAGE);
                items.addItem(item);
            }
            drawView();
        }
    }

    public void drawView() {
        HashMap<String, Integer> l = items.getItems();
        TextView tv = findViewById(R.id.textView);
        tv.setText("");
        for (String k : l.keySet()) {
            String s = l.get(k).toString() + " " + k + "\n";
            tv.setText(tv.getText() + s);
        }
    }
}