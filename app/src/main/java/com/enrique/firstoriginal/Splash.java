package com.enrique.firstoriginal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openApp(true);

        //implements and starts animation
        ImageView fan = findViewById(R.id.logo);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        fan.startAnimation(myanim);


        //    Glide for loading girls
        ImageView mSea = findViewById(R.id.girl);

        Glide.with(this)
                //.load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
                .load(R.drawable.splashimage)
                .transition(DrawableTransitionOptions.withCrossFade(10))
                .centerCrop()
//                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.fucsia_200)))
//                .circleCrop()
                .into(mSea);
    }
    private void openApp(boolean locationPermission){
        //Handler: hace q1ue se retrase una accion
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent intent = new Intent(Splash.this, MainLogin.class);
                startActivity(intent);
            }
        }, 2000);
    }
}
