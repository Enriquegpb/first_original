package com.enrique.firstoriginal;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Signup extends AppCompatActivity {
Button btnsumit;
EditText correo,usuario,contraseña;
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
         btnsumit=(Button) findViewById(R.id.enviaregistro);
         correo=(EditText) findViewById(R.id.regcorreo);
         usuario=(EditText) findViewById(R.id.reguser);
         contraseña=(EditText) findViewById(R.id.regpwd);

         btnsumit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast t;
                 t = Toast.makeText(getApplicationContext(),
                         "Registro completado", Toast.LENGTH_SHORT);
                 t.show();
                 correo.setText("");
                 usuario.setText("");
                 contraseña.setText("");
                 openLogin(view);
             }
         });
    }
    public void openLogin(View view){
        Intent intent=new Intent(Signup.this, MainLogin.class);
        startActivity(intent);
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