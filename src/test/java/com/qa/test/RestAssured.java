package com.qa.test;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.codehaus.groovy.tools.shell.util.Logger.io;
import static org.hamcrest.Matchers.*;

public class RestAssured {

    @Test
    public void test_numberofCircutes07(){
        given().
when().
                get("http://ergast.com/api/f1/2017/circuits.jason").
        then().
                assertThat().
                body("MRData.CircutTable.Circuits.circuitId",hasSize(20) );



    }
}
