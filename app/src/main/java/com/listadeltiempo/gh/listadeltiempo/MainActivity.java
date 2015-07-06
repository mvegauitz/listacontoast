package com.listadeltiempo.gh.listadeltiempo;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    ListView lista;
    ArrayList<informacion> listainfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.listView);
        listainfo = new ArrayList<informacion>();
        listainfo.add(new informacion(R.drawable.ic_launcher, "Lunes", "45f"));
        listainfo.add(new informacion(R.drawable.ic_launcher, "Martes", "50f"));
        listainfo.add(new informacion(R.drawable.ic_launcher, "Miercoles", "50f"));
        listainfo.add(new informacion(R.drawable.ic_launcher, "Jueves", "30f"));
        listainfo.add(new informacion(R.drawable.ic_launcher, "Viernes", "50f"));
        listainfo.add(new informacion(R.drawable.ic_launcher, "Sabado", "40f"));
        listainfo.add(new informacion(R.drawable.ic_launcher, "Domingo", "50f"));
        listainfo.add(new informacion(R.drawable.ic_launcher, "Lunes", "50f"));
        listainfo.add(new informacion(R.drawable.ic_launcher, "Martes", "30f"));
        listainfo.add(new informacion(R.drawable.ic_launcher, "Miercoles", "60f"));
        listainfo.add(new informacion(R.drawable.ic_launcher, "Jueves", "50f"));
        listainfo.add(new informacion(R.drawable.ic_launcher, "Viernes", "55f"));

        listadaptador listadapter = new listadaptador(listainfo, MainActivity.this.getApplicationContext());
        lista.setAdapter(listadapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                         @Override
                                         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                             informacion infor = listainfo.get(position);
                                             Toast.makeText(getApplicationContext(), "Usted Selecciono: " + infor.getDiasemana(), Toast.LENGTH_LONG).show();


                                         }


                                     }


        );



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