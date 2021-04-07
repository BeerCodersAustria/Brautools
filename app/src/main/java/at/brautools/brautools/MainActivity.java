package at.brautools.brautools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plato = (Button) findViewById(R.id.button1);
        Button alkohol = (Button) findViewById(R.id.button3);
        Button dichte = (Button) findViewById(R.id.button4);
        Button about = (Button) findViewById(R.id.button5);
        Button alkoholPlato = (Button) findViewById(R.id.button6);

        plato.setOnClickListener(this);
        alkohol.setOnClickListener(this);
        dichte.setOnClickListener(this);
        about.setOnClickListener(this);
        alkoholPlato.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent intent1 = new Intent(this, DichtePlato.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(this, AlkoholBerechnen.class);
                startActivity(intent2);
                break;
            case R.id.button4:
                Intent intent3 = new Intent(this, PlatoDichte.class);
                startActivity(intent3);
                break;
            case R.id.button5:
                Intent intent4 = new Intent(this, About.class);
                startActivity(intent4);
                break;
            case R.id.button6:
                Intent intent5 = new Intent(this, AlkoholBerechnenPlato.class);
                startActivity(intent5);
                break;
            default:
                break;
        }
    }
}
