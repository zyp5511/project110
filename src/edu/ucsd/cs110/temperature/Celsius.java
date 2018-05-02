package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature {
    public Celsius(float t)
    {
        super(t);
    }
    public String toString()
    {
        // TODO: Complete this method

        return Float.toString(this.getValue()) + " C";
    }
    public Temperature toCelsius(){
        return this;
    }
    public Temperature toFahrenheit(){
        return new Fahrenheit(this.getValue()*9/5 + 32);
    }
}
