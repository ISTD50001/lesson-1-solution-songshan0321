package com.example.norman_lee.lesson1cohort3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

//1.1 Put in the images in the drawables folder
//1.2 Go to activity_main.xml and put in the layout

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> images;
    Button charaButton;
    ImageView charaImage;
    Button resetButton;
    Random r;
    int count = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.3 Instantiate an ArrayList object
        images = new ArrayList<>();

        //1.4 Add the image IDs to the ArrayList
        images.add(R.drawable.ashketchum);
        images.add(R.drawable.bartsimpson);
        images.add(R.drawable.doraemon);
        images.add(R.drawable.dory);
        images.add(R.drawable.edogawaconan);
        images.add(R.drawable.garfield);
        images.add(R.drawable.judyhopps);
        images.add(R.drawable.nickwilde);
        images.add(R.drawable.pikachu);
        images.add(R.drawable.tomandjerry);
        images.add(R.drawable.totoro);
        images.add(R.drawable.yoda);
        images.add(R.drawable.wolverine);

        //Get references to charaButton and charaImage using findViewById
        charaButton = findViewById(R.id.charaButton);
        charaImage = findViewById(R.id.charaImage);
        resetButton = findViewById(R.id.resetButton);

        //For charaButton, invoke the setOnClickListenerMethod
        //Create an anonymous class which implements View.OnClickListener
        //Write code to randomly select an image ID from the ArrayList and display it in the ImageView
        charaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count ++;
                r = new Random();
                int index = r.nextInt(images.size());
                int id = images.get(index);
                charaImage.setImageResource(id);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                int index = 0;
                int id = images.get(index);
                charaImage.setImageResource(id);
            }
        });

    }
}
