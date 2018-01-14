package com.shekhar.springboot.tests;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestIT {

    @Test
    public void firstTest() {
        get("/echo/hello").then().assertThat().body("message", equalTo("hello"));
    }
}

