package com.listadeltiempo.gh.listadeltiempo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gh on 05/07/2015.
 */
public class listadaptador extends BaseAdapter {

    private  ArrayList<informacion> info;
    private LayoutInflater inflador;
    private Context con;


    public listadaptador(ArrayList<informacion> info, Context con) {
        this.info = info;
        inflador = LayoutInflater.from(con);
        this.con= con;
    }

    @Override
    public int getCount() {
        return  info.size();
    }

    @Override
    public Object getItem(int position) {
        return info.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=inflador.inflate(R.layout.layout_personalizado,null);
        informacion informacion = info.get(position);

        ImageView imagen = (ImageView)convertView.findViewById(R.id.imgclima);
        TextView diasemana =(TextView)convertView.findViewById(R.id.diasemana);
        TextView temperatura=(TextView)convertView.findViewById(R.id.temperatura);

        imagen.setImageDrawable(con.getResources().getDrawable(informacion.getImgview()));
        diasemana.setText(informacion.getDiasemana());
        temperatura.setText(informacion.getTemperatura());


        return convertView;
    }
}
