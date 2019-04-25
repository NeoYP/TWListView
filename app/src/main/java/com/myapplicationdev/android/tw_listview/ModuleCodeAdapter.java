package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleCodeAdapter {
    private ArrayList<ModuleCode> modulecode;
    private Context context;
    private TextView tvModuleCode;
    private ImageView ivPicture;

    public ModuleCodeAdapter(Context context, int resource, ArrayList<Food> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        modulecode = objects;
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
        tvModuleCode =         rowView.findViewById(R.id.tvModuleCode);
        // Get the ImageView object
        ivPicture =             rowView.findViewById(R.id.ivPicture);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        ModuleCode currentModuleCode = modulecode.get(position);
        // Set the TextView to show the food

        tvModuleCode.setText(currentModuleCode.getName());
        // Set the image to star or nostar accordingly
        if(currentModuleCode.isPicture()) {
            ivPicture.setImageResource(R.drawable.star);
        }
        else {
            ivPicture.setImageResource(R.drawable.nostar);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }

}
