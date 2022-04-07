package ch.juventus.carrental.service;

import ch.juventus.carrental.persistance.HelloWorldDatabase;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    private final HelloWorldDatabase helloWorldDatabase;

    public HelloWorldService(HelloWorldDatabase helloWorldDatabase) {
        this.helloWorldDatabase = helloWorldDatabase;
    }


    public String getGreeting() {
        // implement business logic
        String greeting = helloWorldDatabase.loadGreeting();
        return greeting;
    }

}
