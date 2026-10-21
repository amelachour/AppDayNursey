package com.example.appdaynursey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    private Button AddChild ;
    private Button FillDay ;
    private Button ExportInto ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        AddChild=findViewById(R.id.addChild);
        AddChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(menu.this, AddAChild.class);
                startActivity(intent);
            }
        });
        FillDay=findViewById(R.id.fillDay);
        FillDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(menu.this, FillInChildDay.class);
                startActivity(intent);
            }
        });
        ExportInto=findViewById(R.id.export);
        ExportInto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(menu.this, ExportInto.class);
                startActivity(intent);
            }
        });

    }


}