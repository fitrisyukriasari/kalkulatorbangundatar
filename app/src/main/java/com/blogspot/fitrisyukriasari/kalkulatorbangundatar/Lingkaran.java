package com.blogspot.fitrisyukriasari.kalkulatorbangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {

    private EditText ejari;
    private Button bhitung;
    private TextView tluas, tkel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);

        getSupportActionBar().setTitle("Hitung Persegi");
        ejari = (EditText)findViewById(R.id.edit_jari);
        bhitung = (Button)findViewById(R.id.hitung);
        tluas = (TextView)findViewById(R.id.txt_luas);
        tkel = (TextView)findViewById(R.id.txt_keliling);
        bhitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String sisi = ejari.getText().toString().trim();

                double r = Double.parseDouble(sisi);

                double luas = 3.14*r*r;
                double kel = 2*3.14*r;

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
