package com.logixspace.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Division extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_division);
        ed1=(EditText) findViewById(R.id.numm1);
        ed2=(EditText) findViewById(R.id.numm2);
        b1=(AppCompatButton) findViewById(R.id.div);
        b2=(AppCompatButton) findViewById(R.id.backtobtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String nn1=ed1.getText().toString();
                    String nn2=ed2.getText().toString();
                    int n1=Integer.parseInt(nn1);
                    int n2=Integer.parseInt(nn2);
                    int r=n1/n2;
                    String result=String.valueOf(r);
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(e2);
            }
        });
    }
}