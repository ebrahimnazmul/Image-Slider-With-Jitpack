package com.example.imagesliderwithjitpack;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageSlider imageSlider;

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



        imageSlider=findViewById(R.id.imageSlider);

        ArrayList<SlideModel> slideImageList=new ArrayList<>();


        slideImageList.add(new SlideModel(R.drawable.aaaa,ScaleTypes.FIT));
        slideImageList.add(new SlideModel(R.drawable.bbbb, ScaleTypes.FIT));
        slideImageList.add(new SlideModel(R.drawable.cccc, ScaleTypes.FIT));

        imageSlider.setImageList(slideImageList,ScaleTypes.FIT);




    }
}