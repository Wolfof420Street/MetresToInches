package com.wolf.metrestoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterMetres;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMetres = (EditText) findViewById(R.id.metresEditText);
        convertButton = (Button) findViewById(R.id.convertButtonId);
        resultTextView = (TextView) findViewById(R.id.resultId);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier = 39.37;
                double result = 0.0;

                double meterValue = Double.parseDouble(enterMetres.getText().toString());
                result = meterValue*multiplier;

                resultTextView.setText(Double.toString(result) + "inches");
            }
        });
    }
}
