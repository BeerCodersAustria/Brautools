package at.brautools.brautools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AlkoholBerechnenPlato extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alkohol_berechnen_plato);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText anfang = (EditText) findViewById(R.id.editText4);
        EditText ende = (EditText) findViewById(R.id.editText5);
        TextView alkohol = (TextView) findViewById(R.id.textView14);

        // check if both values are entered
        if (anfang.getText().length()!=0 && ende.getText().length()!=0) {
            // with * 4.13 + 997 transform degrees plato into gravity
            double valueAnfang = ((Double.parseDouble(anfang.getText().toString())) * 4.13 + 997)/1000;
            double valueEnde = ((Double.parseDouble(ende.getText().toString())) * 4.13 + 997)/1000;
            // constant of 131.25 is the product of 105x1.25 which is used to determine the vol.%
            double solution = (valueAnfang-valueEnde)*131.25;
            alkohol.setText(String.format("%.1f", solution));
        }
    }
}
