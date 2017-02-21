package br.edu.iff.pooa20162.contatoappnovo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.contatoappnovo.R;
import br.edu.iff.pooa20162.contatoappnovo.adapter.ContatosAdapter;
import br.edu.iff.pooa20162.contatoappnovo.model.Contato;

public class ContatoListaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato_lista);
        ListView lista = (ListView) findViewById(R.id.lvContatos);

        final ArrayList<Contato> contatos = (ArrayList<Contato>)
                Contato.listAll(Contato.class);

        ArrayAdapter adapter = new ContatosAdapter(this, contatos);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ContatoListaActivity.this,ContatoActivity.class);

                intent.putExtra("nome",contatos.get(i).getNome());
                intent.putExtra("email",contatos.get(i).getEmail());
                intent.putExtra("telefone",contatos.get(i).getTelefone());

                startActivity(intent);

            }
        });
    }

}
