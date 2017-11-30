package br.edu.iff.pooa20172.trabalho02_2017_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class principal_activity extends AppCompatActivity {

    private ArrayList<Evento> eventos;
    private ArrayAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_activity);

        ListView lista = (ListView) findViewById(R.id.id_lista);
        final ArrayList<Evento> eventos = adicionarEventos();
        listAdapter = new EventoAdapter(this, eventos);
        lista.setAdapter(listAdapter);
    }

    private ArrayList<Evento> adicionarEventos(){
        eventos = new ArrayList<Evento>();
        Evento e = new Evento("Testando", R.drawable.dilminha,"Rua testada","20 cabeça","Testador","Pesa boi", "Guaravita", "1/1");
        eventos.add(e);

        return eventos;
    }
}
