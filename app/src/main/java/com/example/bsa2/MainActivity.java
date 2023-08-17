package com.example.bsa2;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.bsa2.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    //add bntCnt varibale
    private Button bntCnt;

    private Button btnrst;
    private Button btnrest;

    //add cnt variable
    private int cnt=0;

    //add bnt txt variable
    private Integer contador=0;

    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

     //   setSupportActionBar(binding.toolbar);

        bntCnt = findViewById(R.id.button_xml);
        btnrst = findViewById(R.id.reset);
        btnrest = findViewById(R.id.restar);
        bntCnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt = cnt+1;
                contador = contador +1;
                TextView mShowCount = (TextView) findViewById(R.id.cnttxt);
                mShowCount.setText(contador.toString());

                Toast.makeText(MainActivity.this,"Cuenta en: " + cnt,Toast.LENGTH_SHORT).show();
            }
        });

        btnrest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cnt > 0 && contador>0){
                    cnt = cnt-1;
                    contador = contador-1;
                    TextView mShowCount = (TextView) findViewById(R.id.cnttxt);
                    mShowCount.setText(contador.toString());
                    Toast.makeText(MainActivity.this,"Cuenta en: " + cnt,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"Number can't be negative",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnrst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt = 0;
                contador = 0;
                TextView mShowCount = (TextView) findViewById(R.id.cnttxt);
                mShowCount.setText(contador.toString());

                Toast.makeText(MainActivity.this,"Cuenta en: " + cnt,Toast.LENGTH_SHORT).show();
            }
        });


        /*NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });
    */
    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   /* @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }*/
}