package br.edu.iff.pooa20162.contatoappnovo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.edu.iff.pooa20162.contatoappnovo.R;
import br.edu.iff.pooa20162.contatoappnovo.model.Contato;

public class ContatoActivity extends Activity {
    EditText nome, email, telefone;
    Button btsalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        btsalvar = (Button) findViewById(R.id.btSalvarContato);

        Intent intent = getIntent();
        String parametro = (String) intent.getSerializableExtra("nome");
        TextView nome = (TextView) findViewById(R.id.etNomeContato);
        nome.setText(parametro);

        btsalvar.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                salvar();
            }
        });
    }

    public void salvar() {

        nome = (EditText) findViewById(R.id.etNomeContato);
        email = (EditText) findViewById(R.id.etEmailContato);
        telefone = (EditText) findViewById(R.id.etTelefoneContato);

        Contato contato = new Contato(nome.getText().toString(),email.getText().toString(),telefone.getText().toString());
        contato.save();



    }
}
