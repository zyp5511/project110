package edu.ucsd.cs110.temperature;

public abstract class Temperature {

    private float value;

    public  Temperature(float v)
    {
         value = v;
    }
    public float getValue()
    {
        return value;
    }
    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}



