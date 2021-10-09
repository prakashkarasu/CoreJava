package com.company;

/**
 * An interface for representing tempratures, with functionality
 * for converting their values between Celsius and Fahrenheit.
 * @author Prakash Thirunavukarasu
 * @see MyTemperature
 */
public interface Temperature {
     double getCelsius();

     double getFahrenheit();

     void setCelsius(double celsius);

     void setFahrenheit(double fahrenheit);

}
