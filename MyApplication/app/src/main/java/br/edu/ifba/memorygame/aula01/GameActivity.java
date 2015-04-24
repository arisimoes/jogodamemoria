package br.edu.ifba.memorygame.aula01;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class GameActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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
    public void abrir(View view){
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int N = letras.length();
        Random gerador = new Random();
        Button aux = (Button) findViewById(R.id.btn00);
        String value = String.valueOf(letras.charAt((gerador.nextInt(N))));
        // String value = "id = "+ aux.getId() + "text = "+aux.getText ();
        aux.setText((CharSequence) value);
    }
}
