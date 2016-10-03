package edu.kvcc.cis298.cis298assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

// Import widget control groups:
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class TemperatureConverter extends AppCompatActivity {

    // Variable declarations for widget controls:

    private RadioButton mFromCelsius;
    private RadioButton mFromFahrenheit;
    private RadioButton mFromKelvin;
    private RadioButton mFromRankine;

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

        // Attach the widgets to their variables:
        mFromCelsius = (RadioButton) findViewById(R.id.from_celsius);
        mFromFahrenheit = (RadioButton) findViewById(R.id.from_fahrenheit);
        mFromKelvin = (RadioButton) findViewById(R.id.from_kelvin);
        mFromRankine = (RadioButton) findViewById(R.id.from_rankine);

        mToCelsius = (RadioButton) findViewById(R.id.to_celsius);
        mToFahrenheit = (RadioButton) findViewById(R.id.to_fahrenheit);
        mToKelvin = (RadioButton) findViewById(R.id.to_kelvin);
        mToRankine = (RadioButton) findViewById(R.id.to_rankine);

        mConvertButton = (Button) findViewById(R.id.convert_button);
        mAnswerTextView = (TextView) findViewById(R.id.answer_text);
        mCalculationTextView = (TextView) findViewById(R.id.calculation_text);

        mConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mTemperature = (double) R.id.temperature_input;
                }
                catch (Exception ex) {

                }
            }
        });


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
