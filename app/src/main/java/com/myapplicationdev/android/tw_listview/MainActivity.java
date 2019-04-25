package com.myapplicationdev.android.tw_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<ModuleCode> moduleCodes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = this.findViewById(R.id.lvProgram);

        // Create a few food objects in Food array
        moduleCodes = new ArrayList<ModuleCode>();
        moduleCodes.add(new ModuleCode("C208", true));
        moduleCodes.add(new ModuleCode("C200", false));
        moduleCodes.add(new ModuleCode("C346", true));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new ModuleCodeAdapter(this, R.layout.row, moduleCodes);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ModuleCode selectedModuleCode = moduleCodes.get(position);

                Toast.makeText(MainActivity.this, selectedFood.getModuleCode()
                                + " Module Code: " + selectedModuleCode.isStar(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
