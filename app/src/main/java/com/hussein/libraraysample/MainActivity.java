package com.hussein.libraraysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hussein.librarysample.Sample;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show();
        Sample sample=new Sample("Hussein","147258369");
        Toast.makeText(this,sample.getName()+"\n"+sample.getPhone(),Toast.LENGTH_SHORT).show();
    }
}
