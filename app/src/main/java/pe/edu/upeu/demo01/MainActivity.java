package pe.edu.upeu.demo01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private String TAG_LIFE = "CICLO DE VIDA";

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG_LIFE, "ON RESUME");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG_LIFE, "ON, PAUSA");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG_LIFE, "SE PARA");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG_LIFE, "SE DESTRUYE");
        Intent intentService = new Intent(getApplicationContext(),ServiceExample.class);
        startService(intentService);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
