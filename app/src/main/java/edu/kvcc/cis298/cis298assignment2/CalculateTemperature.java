package edu.kvcc.cis298.cis298assignment2;

import android.widget.RadioButton;

/**
 * Created by amahler4096 on 10/5/2016.
 */
public class CalculateTemperature {

    private double mTemperature;
    private int mFromTempType;
    private int mToTempType;
    private double mFinalTemperature;
    private String mCalculationUsed;

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

    public int getFromTempType() {
        return mFromTempType;
    }

    public void setFromTempType(int fromTempType) {
        mFromTempType = fromTempType;
    }

    public int getToTempType() {
        return mToTempType;
    }

    public void setToTempType(int toTempType) {
        mToTempType = toTempType;
    }

    public CalculateTemperature(double temperature, int fromTempType, int toTempType)
    {
        mTemperature = temperature;
        mFromTempType = fromTempType;
        mToTempType = toTempType;

        if (fromTempType == 1 && toTempType == 2)
        {
            mFinalTemperature = mTemperature * 1.8 + 32;
            mCalculationUsed = "[F] = [C] * 9/5 + 32";
        }

        if (fromTempType == 1 && toTempType == 3)
        {
            mFinalTemperature = mTemperature + 273.15;
            mCalculationUsed = "[K] = [C] + 273.15";
        }

        if (fromTempType == 1 && toTempType == 4)
        {
            mFinalTemperature = mTemperature * 1.8 + 32 + 459.67;
            mCalculationUsed = "[R] = [C] * 1.8 + 32 + 459.67";
        }

        if (fromTempType == 2 && toTempType == 1)
        {
            mFinalTemperature = (mTemperature - 32) / 1.8;
            mCalculationUsed = "[C] = ([F] - 32) * 5/9";
        }

        if (fromTempType == 2 && toTempType == 3)
        {
            mFinalTemperature = ((mTemperature - 32) / 1.8) + 273.15;
            mCalculationUsed = "[K] = ([F] - 32) / 1.8 + 273.15";
        }

        if (fromTempType == 2 && toTempType == 4)
        {
            mFinalTemperature = mTemperature + 459.67;
            mCalculationUsed = "[R] = [F] + 459.67";
        }

        if (fromTempType == 3 && toTempType == 1)
        {
            mFinalTemperature = mTemperature - 273.15;
            mCalculationUsed = "[C] = [K] - 273.15";
        }

        if (fromTempType == 3 && toTempType == 2)
        {
            mFinalTemperature = (mTemperature - 273.15) * 1.8 + 32;
            mCalculationUsed = "[F] = ([K] - 273.15) * 1.8 + 32";
        }

        if (fromTempType == 3 && toTempType == 4)
        {
            mFinalTemperature = mTemperature * 1.8;
            mCalculationUsed = "[R] = [K] * 1.8";
        }

        if (fromTempType == 4 && toTempType == 1)
        {
            mFinalTemperature = (mTemperature - 32 - 459.67) / 1.8;
            mCalculationUsed = "[C] = ([R] - 32 - 459.67) / 1.8";
        }

        if (fromTempType == 4 && toTempType == 2)
        {
            mFinalTemperature = mTemperature - 459.67;
            mCalculationUsed = "[F] = [R] - 459.67";
        }

        if (fromTempType == 4 && toTempType == 3)
        {
            mFinalTemperature = mTemperature / 1.8;
            mCalculationUsed = "[K] = [R] / 1.8";
        }

        if (fromTempType == toTempType)
        {
            mFinalTemperature = mTemperature;
            mCalculationUsed = "No conversion used.";
        }

    }

}











