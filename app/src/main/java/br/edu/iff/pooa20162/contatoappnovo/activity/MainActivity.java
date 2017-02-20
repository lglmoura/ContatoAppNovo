package br.edu.iff.pooa20162.contatoappnovo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.edu.iff.pooa20162.contatoappnovo.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamaTelaContatos(View v){
        Intent intent = new Intent(MainActivity.this, ContatoActivity.class);
        startActivity(intent);
    }
}
