package com.example.mrpotatohead;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageHair;
    ImageView imageMoustache;
    ImageView imageEyebrow;
    ImageView imageBeard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageHair = (ImageView) findViewById(R.id.hair);
        imageMoustache = (ImageView) findViewById(R.id.moustache);
        imageEyebrow = (ImageView) findViewById(R.id.eyebrow);
        imageBeard = (ImageView) findViewById(R.id.beard);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("Hair", imageHair.getVisibility());
        outState.putInt("Moustache", imageMoustache.getVisibility());
        outState.putInt("Eyebrow", imageEyebrow.getVisibility());
        outState.putInt("Beard", imageBeard.getVisibility());
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        imageHair.setVisibility(inState.getInt("Hair"));
        imageMoustache.setVisibility(inState.getInt("Moustache"));
        imageEyebrow.setVisibility(inState.getInt("Eyebrow"));
        imageBeard.setVisibility(inState.getInt("Beard"));
    }

    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        String text = checkbox.getText().toString();
        boolean checked = checkbox.isChecked();

        String hair = "Rambut";
        if (text.equals(hair)) {
            if (checked) {
                imageHair.setVisibility(View.VISIBLE);
            } else {
                imageHair.setVisibility(View.INVISIBLE);
            }
        }

        String moustache = "Kumis";
        if (text.equals(moustache)) {
            if (checked) {
                imageMoustache.setVisibility(View.VISIBLE);
            } else {
                imageMoustache.setVisibility(View.INVISIBLE);
            }
        }

        String eyebrow = "Alis";
        if (text.equals(eyebrow)) {
            if (checked) {
                imageEyebrow.setVisibility(View.VISIBLE);
            } else {
                imageEyebrow.setVisibility(View.INVISIBLE);
            }
        }

        String beard = "Janggut";
        if (text.equals(beard)) {
            if (checked) {
                imageBeard.setVisibility(View.VISIBLE);
            } else {
                imageBeard.setVisibility(View.INVISIBLE);
            }
        }
    }
}