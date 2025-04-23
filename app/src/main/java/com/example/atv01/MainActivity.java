package com.example.atv01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxArroz, checkBoxLeite, checkBoxCarne, checkBoxFeijao, checkBoxRefri;
    Button buttonCalcular;
    TextView textViewTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxArroz = findViewById(R.id.checkBoxArroz);
        checkBoxLeite = findViewById(R.id.checkBoxLeite);
        checkBoxCarne = findViewById(R.id.checkBoxCarne);
        checkBoxFeijao = findViewById(R.id.checkBoxFeijao);
        checkBoxRefri = findViewById(R.id.checkBoxRefri);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        textViewTotal = findViewById(R.id.textViewTotal);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularTotal();
            }
        });
    }

    private void calcularTotal() {
        double total = 0.0;

        if (checkBoxArroz.isChecked()) {
            total += 4.0;
        }
        if (checkBoxLeite.isChecked()) {
            total += 5.00;
        }
        if (checkBoxCarne.isChecked()) {
            total += 49.00;
        }
        if (checkBoxFeijao.isChecked()) {
            total += 9.00;
        }
        if (checkBoxRefri.isChecked()) {
            total += 8.00;
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String totalFormatado = decimalFormat.format(total);

        textViewTotal.setText("Total: R$ " + totalFormatado);
    }
}