package at.brautools.brautools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PlatoDichte extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plato_dichte);
        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView dichte = (TextView) findViewById(R.id.textView18);
        EditText input = (EditText) findViewById(R.id.editText6);

        // check if user entered a value, otherwise do nothing
        if (input.getText().length()!=0) {
            double solution = (Double.parseDouble(input.getText().toString()) * 4.13 + 997);
            //String printablesolution = new Double(solution).toString();
            dichte.setText(String.format("%.1f", solution));
        }
    }
}