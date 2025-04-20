package de.htwberlin.webtech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    @GetMapping("/todos")
    public List<ToDo> getAllToDos() {
        return List.of(
                new ToDo("Projekt abgeben", "Abgabe bis Sonntag 23:59 Uhr."),
                new ToDo("Mail schreiben", "Dozenten zur Abgabe benachrichtigen."),
                new ToDo("entspannen", "Pause nach dem Coden.")
        );
    }
}
