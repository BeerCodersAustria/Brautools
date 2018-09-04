package at.brautools.brautools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DichtePlato extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dichte_plato);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView plato = (TextView) findViewById(R.id.textView4);
        EditText input = (EditText) findViewById(R.id.editText2);
        double solution = (Double.parseDouble(input.getText().toString())-1)*1000/4;
        String printablesolution = new Double(solution).toString();

        plato.setText(printablesolution);
    }
}