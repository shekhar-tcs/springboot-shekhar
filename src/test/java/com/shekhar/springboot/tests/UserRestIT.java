package com.shekhar.springboot.tests;


import com.shekhar.springboot.model.User;
import com.jayway.restassured.http.ContentType;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.http.HttpStatus;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRestIT {
    private static final String USER_ENDPOINT = "/users/";

    @Test
    public void testCreateUser() {
        User user = new User("Shekhar", "shekkharan@gmail.com", "123456");
        given().contentType(ContentType.JSON).body(user)
                .when().post(USER_ENDPOINT).then()
                .assertThat().statusCode(equalTo(HttpStatus.OK.value()));
    }
}



