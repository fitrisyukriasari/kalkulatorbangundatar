package com.blogspot.fitrisyukriasari.kalkulatorbangundatar;


import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void b_persegipanjang_click(View v) {
        Intent panggil_class = new Intent(this, PersegiPanjang.class);
        startActivity(panggil_class);
    }

    public void b_persegi_click(View v) {
        Intent panggil_class = new Intent(this, Persegi.class);
        startActivity(panggil_class);
    }

    public void b_segitiga_click(View v) {
        Intent panggil_class = new Intent(this, Segitiga.class);
        startActivity(panggil_class);
    }

    public void b_jajargenjang_click(View v) {
        Intent panggil_class = new Intent(this, JajarGenjang.class);
        startActivity(panggil_class);
    }

    public void b_trapesium_click(View v) {
        Intent panggil_class = new Intent(this, Trapesium.class);
        startActivity(panggil_class);
    }

    public void b_lingkaran_click(View v) {
        Intent panggil_class = new Intent(this, Lingkaran.class);
        startActivity(panggil_class);
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

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Tutup Aplikasi ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Intent keluar = new Intent(Intent.ACTION_MAIN);
                        keluar.addCategory(Intent.CATEGORY_HOME);
                        keluar.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        finish();
                        startActivity(keluar);
                    }
                })
                .setNegativeButton("Tidak",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        }).show();
    }

}
