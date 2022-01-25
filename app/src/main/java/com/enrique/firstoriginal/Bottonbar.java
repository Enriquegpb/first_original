package com.enrique.firstoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomappbar.BottomAppBar;

public class Bottonbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottonbar);
        BottomAppBar bottomAppBar = findViewById(R.id.botton_app_bar);

        //click event en el  FAB
        /*findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bottonbar.this, "FAB Clicked.", Toast.LENGTH_SHORT).show();
            }
        });*/

        //click event en el Hamburguer menu
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bottonbar.this, "Menu clicked!", Toast.LENGTH_SHORT).show();
//                sheetBehavior = BottomSheetBehavior.from(sheet);
            }


        });

        //click event en el Bottom bar menu item
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.add:
                        Toast.makeText(Bottonbar.this, "added to favourites", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.browse:
                        Toast.makeText(Bottonbar.this, "beginning search", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

    }
}