package com.example.bestuidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TaskStackBuilder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        SharedPreferences preferences = this.getSharedPreferences("Splash",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                if(preferences.getBoolean("isMain",false)){
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    finish();
                }else{
                   editor.putBoolean("isMain",true);
                   editor.apply();

                    TaskStackBuilder.create(SplashScreen.this).addNextIntentWithParentStack(
                            new Intent(SplashScreen.this,MainActivity.class))
                            .addNextIntent(new Intent(SplashScreen.this,IntroScreen.class))
                            .startActivities();
                    }
            }
        };thread.start();

         }
}