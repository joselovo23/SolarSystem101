package com.syntax;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SolarSystem FactorX = new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Stars="1000";

        //adding features to our sun
        FeatureSun Xfact = new FeatureSun();
        Xfact.color="green";
        Xfact.radius="1000000000000km";
        Xfact.heat="30932496541565446k";
    }
}
