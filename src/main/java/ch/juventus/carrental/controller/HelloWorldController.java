package ch.juventus.carrental.controller;

import ch.juventus.carrental.service.HelloWorldService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200")
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

//    @GetMapping("/api/v1/helloworld")
//    public ResponseEntity<String> helloWorld() {
//        return new ResponseEntity<>("Hello rtzrthrthzWorld", HttpStatus.OK);
//    }

    @GetMapping("/api/v1/helloworld/{id}")
    public ResponseEntity<String> helloWorldWithPathVariable(@PathVariable(value = "id") Long id) {
        String returnValue = "Hello world, id = " + id;
        return new ResponseEntity<>(returnValue, HttpStatus.OK);
    }

    @GetMapping("/api/v1/helloworld")
    public ResponseEntity<String> helloWorldWithRequestParam(@RequestParam(value = "test", required = false) Integer myParam) {
        String returnValue = helloWorldService.getGreeting();
        return new ResponseEntity<>(returnValue, HttpStatus.OK);
    }

//    @PostMapping("/api/v1/mydataclass")
//    public ResponseEntity<String> foo (@RequestBody MyDataClass myDataClass) {
//        return new ResponseEntity<>("", HttpStatus.OK);
//    }

}
