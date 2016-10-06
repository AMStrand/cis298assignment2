// Alyssa Mahler
// This class receives a temperature and the types to convert from and to, and
// it does the work of deciding which calculation to use and saving that and the answer.

package edu.kvcc.cis298.cis298assignment2;

import android.widget.RadioButton;

/**
 * Created by amahler4096 on 10/5/2016.
 */
public class CalculateTemperature {

        // Declare private variables:
    private double mTemperature;
    private String mFromTempType;
    private String mToTempType;
    private double mFinalTemperature;
    private String mCalculationUsed;

        // Properties:
    public double getFinalTemperature() {
        return mFinalTemperature;
    }

    public void setFinalTemperature(double finalTemperature) {
        mFinalTemperature = finalTemperature;
    }

    public String getCalculationUsed() {
        return mCalculationUsed;
    }

    public void setCalculationUsed(String calculationUsed) {
        mCalculationUsed = calculationUsed;
    }

    public String getFromTempType() {
        return mFromTempType;
    }

    public void setFromTempType(String fromTempType) {
        mFromTempType = fromTempType;
    }

    public String getToTempType() {
        return mToTempType;
    }

    public void setToTempType(String toTempType) {
        mToTempType = toTempType;
    }

        // Constructor:
    public CalculateTemperature(double temperature, String fromTempType, String toTempType)
    {
            // Assign the passed parameters to the private variables:
        mTemperature = temperature;
        mFromTempType = fromTempType;
        mToTempType = toTempType;

            // Call the private Calculation method:
        Calculate();
    }

        // Private method to determine which calculation to use and save the results:
    private void Calculate()
    {
            // First test which temperature type they are converting from,
            // then within that, test which type they want to convert to.
            // Follow the assigned calculation and set the answer and calculation used:
        if (mFromTempType.equals("Celsius")) {

            if (mToTempType.equals("Fahrenheit")) {
                mFinalTemperature = mTemperature * 1.8 + 32;
                mCalculationUsed = "[F]=[C]*9/5+32";
            } else {
                if (mToTempType.equals("Kelvin")) {
                    mFinalTemperature = mTemperature + 273.15;
                    mCalculationUsed = "[K]=[C]+273.15";
                } else {
                    if (mToTempType.equals("Rankine")) {
                        mFinalTemperature = mTemperature * 1.8 + 32 + 459.67;
                        mCalculationUsed = "[R]=[C]*1.8+32+459.67";
                    }
                }
            }
        }

        if (mFromTempType.equals("Fahrenheit")) {
            if (mToTempType.equals("Celsius")) {
                mFinalTemperature = (mTemperature - 32) / 1.8;
                mCalculationUsed = "[C]=([F]-32)*5/9";
            } else {
                if (mToTempType.equals("Kelvin")) {
                    mFinalTemperature = ((mTemperature - 32) / 1.8) + 273.15;
                    mCalculationUsed = "[K]=([F]-32)/1.8+273.15";
                } else {
                    if (mToTempType.equals("Rankine")) {
                        mFinalTemperature = mTemperature + 459.67;
                        mCalculationUsed = "[R]=[F]+459.67";
                    }
                }
            }
        }

        if (mFromTempType.equals("Kelvin")) {
            if (mToTempType.equals("Celsius")) {
                mFinalTemperature = mTemperature - 273.15;
                mCalculationUsed = "[C]=[K]-273.15";
            } else {
                if (mToTempType.equals("Fahrenheit")) {
                    mFinalTemperature = (mTemperature - 273.15) * 1.8 + 32;
                    mCalculationUsed = "[F]=([K]-273.15)*1.8+32";
                } else {
                    if (mToTempType.equals("Rankine")) {
                        mFinalTemperature = mTemperature * 1.8;
                        mCalculationUsed = "[R]=[K]*1.8";
                    }
                }
            }
        }

        if (mFromTempType.equals("Rankine"))
        {
            if (mToTempType.equals("Celsius")) {
                mFinalTemperature = (mTemperature - 32 - 459.67) / 1.8;
                mCalculationUsed = "[C]=([R]-32-459.67)/1.8";
            }
            else {
                if (mToTempType.equals("Fahrenheit")) {
                    mFinalTemperature = mTemperature - 459.67;
                    mCalculationUsed = "[F]=[R]-459.67";
                }
                else {
                    if (mToTempType.equals("Kelvin")) {
                        mFinalTemperature = mTemperature / 1.8;
                        mCalculationUsed = "[K]=[R]/1.8";
                    }
                }
            }
        }

            // If they selected the same temperature type, output that no conversion was made:
        if (mFromTempType == mToTempType)
        {
            mFinalTemperature = mTemperature;
            mCalculationUsed = "No conversion used.";
        }

    }
}











