package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        if(args.length != 2) exit();
        double value = Double.parseDouble(args[0]);
        char scale = Character.toUpperCase(args[1].charAt(0));
        if (scale != 'C' && scale != 'F') exit();
        Temperature temperature = new MyTemperature(value, scale);
        System.out.println(temperature);
    }

    private static void exit()
    {
        System.out.println(
                "Usage: java Covert <temperature> <scale>"
                + "\nwhere:"
                +"\t<temperature> is the temperature that you want to convert"
                +"\n\t<scale> is either \"C\" or \"F\"."
                +"\nExample: java Convert 67 F"
        );
        System.exit(0);
    }
}
