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
public class PersegiPanjang  extends AppCompatActivity {

    private EditText epanjang, elebar;
    private Button bhitung;
    private TextView tluas,tkel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegipanjang);

        getSupportActionBar().setTitle("Hitung Persegi Panjang");
        epanjang = (EditText)findViewById(R.id.edit_pjg);
        elebar = (EditText)findViewById(R.id.edit_lbr);
        bhitung = (Button)findViewById(R.id.hitung);
        tluas = (TextView)findViewById(R.id.txt_luas);
        tkel = (TextView)findViewById(R.id.txt_keliling);
        bhitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String panjang = epanjang.getText().toString().trim();
                String lebar = elebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p * l;
                double kel = ((2*p)+(2*l));

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
