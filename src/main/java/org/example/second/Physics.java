package org.example.second;

public class Physics {
    private float fahrenheit;
    private float centimeter;

    public void inputFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void inputCentimeter(int centimeter) {
        this.centimeter = centimeter;
    }

    public float getCelcius() {
        float inCelcius = (this.fahrenheit - 32f) * (5f/9f);
        return inCelcius;
    }

    public float getKilometer() {
        return this.centimeter/100000f;
    }
}
