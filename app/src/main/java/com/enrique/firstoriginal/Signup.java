package com.enrique.firstoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ImageView fan2 = (ImageView) findViewById(R.id.logosignup);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.fadein_login);
        fan2.startAnimation(myanim2);

        ImageView mGirl = findViewById(R.id.girl);

        Glide.with(this)
                //.load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
                .load(R.drawable.registergym)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                //.placeholder(new ColorDrawable(this.getResources().getColor(R.color.fucsia_200)))
                //.circleCrop()
                .into(mGirl);
    }


    public void onClick(View v) {
        Intent intent=new Intent (Signup.this, MainActivity.class);
        startActivity(intent);
    }
    public void openMain2(View v){
        Intent intent=new Intent(Signup.this,MainActivity.class);
        startActivity(intent);
    }


}