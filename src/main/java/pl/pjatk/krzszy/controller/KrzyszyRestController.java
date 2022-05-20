package pl.pjatk.krzszy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.krzszy.domain.Car;

import java.util.List;

@RestController
@RequestMapping("/test")
public class KrzyszyRestController {
    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        return ResponseEntity.ok(new Car("abc", "abc"));
    }

    @GetMapping("/hello/{value}")
    public ResponseEntity<String> getCustomHello(@PathVariable String value) {
        return ResponseEntity.ok("Hello " + value);
    }

    @GetMapping("/hellowithvalue")
    public ResponseEntity<List<String>> getSomeValue(@RequestParam List<String> values) {
        return ResponseEntity.ok(values);
    }

    @PostMapping("/model2")
    public ResponseEntity<Car> getModel(@RequestBody Car newCar) {
        return ResponseEntity.ok(newCar);
    }
}
