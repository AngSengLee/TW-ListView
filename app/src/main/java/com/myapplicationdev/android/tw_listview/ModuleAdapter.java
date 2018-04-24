package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter{

    private ArrayList<Module> Mod;
    private Context context;
    private TextView tvmodcode;
    private ImageView ivMod;

    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        Mod = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvmodcode = (TextView) rowView.findViewById(R.id.textViewModCode);
        // Get the ImageView object
        ivMod = (ImageView) rowView.findViewById(R.id.imageViewMod);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Module currentMod = Mod.get(position);
        // Set the TextView to show the food

        tvmodcode.setText(currentMod.getName());
        // Set the image to star or nostar accordingly
        if(currentMod.isProgMod()) {
            ivMod.setImageResource(R.drawable.prog);
        }
        else {
            ivMod.setImageResource(R.drawable.nonprog);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}


