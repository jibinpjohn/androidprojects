package com.example.comnets.sdso1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    Button XMLButton, perfomanceButton;
    EditText XMLText,perfomanceText;
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);

        XMLButton = (Button) findViewById(R.id.button2);
        perfomanceButton= (Button) findViewById(R.id.button1);

        XMLText = (EditText) findViewById(R.id.editText2);
        perfomanceText = (EditText) findViewById(R.id.editText1);


    }


    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };





    public void onClickPerfomance(View view) {

        setContentView(R.layout.graph);
        Intent intentMain = new Intent(MainActivity.this ,
                graphs.class);
        MainActivity.this.startActivity(intentMain);
    }

    public void onClickXML(View view) {

        setContentView(R.layout.configxml);

    }
}
