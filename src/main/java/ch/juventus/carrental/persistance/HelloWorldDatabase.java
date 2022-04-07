package ch.juventus.carrental.persistance;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldDatabase {

    public String loadGreeting() {
        return "HelloWorld";
    }

    public Car getCarById(Long id) {
        new Car(....)
    }
}
