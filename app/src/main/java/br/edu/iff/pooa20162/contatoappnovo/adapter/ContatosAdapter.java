package br.edu.iff.pooa20162.contatoappnovo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.iff.pooa20162.contatoappnovo.R;
import br.edu.iff.pooa20162.contatoappnovo.model.Contato;

/**
 * Created by lglmoura on 09/09/16.
 */

public class ContatosAdapter extends ArrayAdapter<Contato> {

    private Context context = null;
    private ArrayList<Contato> contatos = null;


    public ContatosAdapter(Context context, ArrayList<Contato> contatos) {
        super(context, R.layout.linhacontato,contatos);
        this.context = context;
        this.contatos = contatos;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linhacontato, parent, false);

        TextView nome = (TextView) rowView.findViewById(R.id.iNome);
        TextView email = (TextView) rowView.findViewById(R.id.iEmail);


        nome.setText(contatos.get(position).getNome());
        email.setText(contatos.get(position).getEmail());

        return rowView;
    }
}
