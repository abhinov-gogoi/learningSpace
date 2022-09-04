package com.learning.microservice.microservice.API;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class MyErrorController implements ErrorController {

    Logger logger = LoggerFactory.getLogger(MyErrorController.class);

    @RequestMapping("/error")
    public String handleError() {
        logger.error("API ERROR " + new Timestamp(System.currentTimeMillis()));
        return """
                                
                <!DOCTYPE html>
                <html>
                <body>
                <h1>Something went wrong! </h1>
                <h2>Our Engineers are on it</h2>
                <p>URL Mapping not found</p>
                <a href="/">Go Home</a>
                </body>
                </html>
                                
                """;
    }
}
