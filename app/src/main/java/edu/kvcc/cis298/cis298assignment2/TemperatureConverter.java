package edu.kvcc.cis298.cis298assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

// Import widget control groups:
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class TemperatureConverter extends AppCompatActivity {

    // Variable declarations for widget controls:

    private RadioGroup mFromGroup;
    private RadioButton mFromCelsius;
    private RadioButton mFromFahrenheit;
    private RadioButton mFromKelvin;
    private RadioButton mFromRankine;

    private RadioGroup mToGroup;
    private RadioButton mToCelsius;
    private RadioButton mToFahrenheit;
    private RadioButton mToKelvin;
    private RadioButton mToRankine;

    private Button mConvertButton;
    private TextView mAnswerTextView;
    private TextView mCalculationTextView;

    // Variable declarations:
    private double mTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_temperature_converter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
