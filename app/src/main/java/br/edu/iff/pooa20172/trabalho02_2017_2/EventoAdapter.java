package br.edu.iff.pooa20172.trabalho02_2017_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EventoAdapter extends android.widget.ArrayAdapter<Evento>{

    private final Context context;
    private final ArrayList<Evento> elementos;

    public EventoAdapter(Context context, ArrayList<Evento> elementos) {
        super(context, R.layout.novo_layout,elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.novo_layout,parent,false);
        TextView nomeEvento = (TextView) rowView.findViewById(R.id.id_nome);
        TextView data = (TextView) rowView.findViewById(R.id.id_data);
        TextView local = (TextView) rowView.findViewById(R.id.id_local);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.id_imagem);

        nomeEvento.setText(elementos.get(position).getNome());
        data.setText(elementos.get(position).getData());
        imagem.setImageResource(elementos.get(position).getImagem());
        local.setText(elementos.get(position).getLocal());

        return rowView;
    }


}
