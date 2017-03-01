package com.blogspot.fitrisyukriasari.kalkulatorbangundatar;

        import android.content.Intent;
        import android.os.Bundle;
        import android.app.Activity;
        import android.content.pm.ActivityInfo;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class About extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        getSupportActionBar().setTitle("About");
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


