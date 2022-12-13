package com.cydeo.centrilli.apachePOI;

import com.cydeo.centrilli.utilities.ConfigurationReader;

public class ABC {
    public static void main(String[] args) {

       String stsr= ConfigurationReader.getProperty("email").toUpperCase();
        System.out.println(stsr);
    }


}
