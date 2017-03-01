package com.blogspot.fitrisyukriasari.kalkulatorbangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by 7 on 23/09/2015.
 */
public class Trapesium  extends AppCompatActivity {

    private EditText ealasa, ealasb, etinggi;
    private Button bhitung;
    private TextView tluas,tkel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trapesium);

        getSupportActionBar().setTitle("Hitung Persegi Panjang");
        ealasa = (EditText)findViewById(R.id.edit_alasa);
        ealasb = (EditText)findViewById(R.id.edit_alasb);
        etinggi = (EditText)findViewById(R.id.edit_tinggi);
        bhitung = (Button)findViewById(R.id.hitung);
        tluas = (TextView)findViewById(R.id.txt_luas);
        tkel = (TextView)findViewById(R.id.txt_keliling);
        bhitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String alasa = ealasa.getText().toString().trim();
                String alasb = ealasb.getText().toString().trim();
                String tinggi = etinggi.getText().toString().trim();

                double a = Double.parseDouble(alasa);
                double b = Double.parseDouble(alasb);
                double t = Double.parseDouble(tinggi);


                double luas = 0.5*(a+b) * t;

                double x = b-a;
                double y = x/2;
                double z = (y*y)+(t*t);
                double c = Math.sqrt(z);

                double kel = ((a+b)+(c+c));

                tluas.setText("Luas = " + luas);
                tkel.setText("Keliling = " + kel);
            }
        });
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
        if (id == R.id.action_about) {
            Intent panggil_class = new Intent(this, About.class);
            startActivity(panggil_class);
            return true;
        }
        if (id == R.id.action_help) {
            Intent panggil_class = new Intent(this, Help.class);
            startActivity(panggil_class);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
