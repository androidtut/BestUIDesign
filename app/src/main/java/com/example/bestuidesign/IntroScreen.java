package com.example.bestuidesign;

import android.os.Bundle;

import androidx.annotation.Nullable;

import io.github.dreierf.materialintroscreen.MaterialIntroActivity;
import io.github.dreierf.materialintroscreen.SlideFragmentBuilder;

public class IntroScreen extends MaterialIntroActivity {
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addSlide(new SlideFragmentBuilder()
                    .backgroundColor(R.color.purple_200)
                    .buttonsColor(R.color.purple_700)
                    .image(R.drawable.schedule)
                    .title("Welcome to our app")
                    .description("Hello Guyz I am krish kharal from Bayatari i am a computer Engineer")
                    .build());


            addSlide(new SlideFragmentBuilder()
                    .backgroundColor(R.color.purple_200)
                    .buttonsColor(R.color.purple_500)
                    .image(R.drawable.schedule)
                    .title("title 3")
                    .description("Description 3")
                    .build());



            addSlide(new SlideFragmentBuilder()
                    .backgroundColor(R.color.purple_200)
                    .buttonsColor(R.color.purple_500)
                    .image(R.drawable.schedule)
                    .title("title 3")
                    .description("Description 3")
                    .build());
        }
    }
