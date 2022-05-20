package pl.pjatk.krzszy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.krzszy.domain.Homework;
import pl.pjatk.krzszy.service.NowyService;

@RestController
@RequestMapping("/homework")
public class NowyRestController {
    private final NowyService nowyService;

    public NowyRestController(NowyService nowyService) {
        this.nowyService = nowyService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> getHomeworkVariable(@PathVariable("id") int id) {
        return ResponseEntity.ok(nowyService.getHomeworkForVariable(id));
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getHomeworkParam(@RequestParam("id") int id) {
        return ResponseEntity.ok(nowyService.getHomeworkForParam(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> createHomework(@RequestBody Homework homework) {
        return ResponseEntity.ok(nowyService.makeHomework(homework));
    }

    @RequestMapping(value = "put/{id}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateHomework(@PathVariable("id") int id, @RequestBody Homework homework) {
        return ResponseEntity.ok(nowyService.changeHomework(id, homework));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteHomework() {
        return ResponseEntity.ok().build();
    }

    @RequestMapping("/exception")
    public ResponseEntity<Exception> throwException() {
        throw new RuntimeException("message");
    }
}
