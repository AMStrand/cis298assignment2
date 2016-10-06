// Alyssa Mahler
// CIS 298 Assignment 2
// This application allows a user to input a temperature and convert that temperature
// from a choice of four temperature types to another.

package edu.kvcc.cis298.cis298assignment2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

// Import widget control groups:
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class TemperatureConverter extends AppCompatActivity {

    private String savedBundle;

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

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient mClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);

        // Attach the widgets to their variables:
        mFromGroup = (RadioGroup) findViewById(R.id.from_temp_type_group);
        mFromCelsius = (RadioButton) findViewById(R.id.from_celsius);
        mFromFahrenheit = (RadioButton) findViewById(R.id.from_fahrenheit);
        mFromKelvin = (RadioButton) findViewById(R.id.from_kelvin);
        mFromRankine = (RadioButton) findViewById(R.id.from_rankine);

        mToGroup = (RadioGroup) findViewById(R.id.to_temp_type_group);
        mToCelsius = (RadioButton) findViewById(R.id.to_celsius);
        mToFahrenheit = (RadioButton) findViewById(R.id.to_fahrenheit);
        mToKelvin = (RadioButton) findViewById(R.id.to_kelvin);
        mToRankine = (RadioButton) findViewById(R.id.to_rankine);

        mConvertButton = (Button) findViewById(R.id.convert_button);
        mAnswerTextView = (TextView) findViewById(R.id.answer_text);
        mCalculationTextView = (TextView) findViewById(R.id.calculation_text);

            // When the convert button is clicked:
        mConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                        // Pull the text from the user input and attempt to convert to double:
                    mTemperature = Double.parseDouble(((EditText)(findViewById(R.id.temperature_input))).getText().toString());

                        // Set the temperature types to the string used:
                    String mFromTempType = (((RadioButton)findViewById(mFromGroup.getCheckedRadioButtonId())).getText().toString());
                    String mToTempType = (((RadioButton)findViewById(mToGroup.getCheckedRadioButtonId())).getText().toString());

                        // Instantiate a CalculateTemperature object and pass in the temperature information:
                    CalculateTemperature calculateTemperature = new CalculateTemperature(mTemperature, mFromTempType, mToTempType);

                        // Set the answer output:
                    mAnswerTextView.setText(Double.toString(calculateTemperature.getFinalTemperature()));

                        // Set the calculation output:
                    mCalculationTextView.setText(calculateTemperature.getCalculationUsed());
                }
                catch (Exception ex) {
                        // If any of the above fails, output an error message:
                    Toast.makeText(getApplicationContext(), getText(R.string.input_error_message), Toast.LENGTH_SHORT).show();
                }
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        mClient = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    // Save the input temperature and selected radio buttons on screen rotation:
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putAll(savedInstanceState);
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

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        mClient.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "TemperatureConverter Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://edu.kvcc.cis298.cis298assignment2/http/host/path")
        );
        AppIndex.AppIndexApi.start(mClient, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "TemperatureConverter Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://edu.kvcc.cis298.cis298assignment2/http/host/path")
        );
        AppIndex.AppIndexApi.end(mClient, viewAction);
        mClient.disconnect();
    }
}
