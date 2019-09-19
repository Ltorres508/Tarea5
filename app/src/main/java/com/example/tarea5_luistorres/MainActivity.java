package com.example.tarea5_luistorres;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

SeekBar Rcolor, Gcolor, Bcolor;
TextView textView, RtextView, GtextView, BtextView;
View color;
String codigo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rcolor = findViewById(R.id.Rcolor);
        Gcolor = findViewById(R.id.Gcolor);
        Bcolor = findViewById(R.id.Bcolor);
        textView = findViewById(R.id.textViewColor);
        RtextView = findViewById(R.id.RtextView);
        GtextView = findViewById(R.id.GtextView);
        BtextView = findViewById(R.id.BtextView);
        color = findViewById(R.id.view1);

        Rcolor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresoR, boolean b) {
                    RtextView.setText("R: " + progresoR);
                     String hex = "#" + ColorUtils.decimalToHex(Rcolor.getProgress()) + ColorUtils.decimalToHex(Gcolor.getProgress()) + ColorUtils.decimalToHex(Bcolor.getProgress());
                     color.setBackgroundColor(Color.parseColor(hex));
                     textView.setText(hex);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Gcolor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresoG, boolean b) {
                        GtextView.setText("G: " + progresoG);
                        String codigo = "#" + ColorUtils.decimalToHex(Gcolor.getProgress()) + ColorUtils.decimalToHex(Rcolor.getProgress()) + ColorUtils.decimalToHex(Bcolor.getProgress());
                color.setBackgroundColor(Color.parseColor(codigo));
                textView.setText(codigo);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Bcolor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresoB, boolean b) {
                BtextView.setText("B: " + progresoB);
                String codigo = "#" +ColorUtils.decimalToHex(Bcolor.getProgress()) + ColorUtils.decimalToHex(Gcolor.getProgress()) + ColorUtils.decimalToHex(Rcolor.getProgress());
                color.setBackgroundColor(Color.parseColor(codigo));
                textView.setText(codigo);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
