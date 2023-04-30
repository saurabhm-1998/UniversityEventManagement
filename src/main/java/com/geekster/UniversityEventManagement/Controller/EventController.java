package com.geekster.UniversityEventManagement.Controller;

import com.geekster.UniversityEventManagement.Model.Event;
import com.geekster.UniversityEventManagement.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<Event> addEvent(@RequestBody @Valid Event event) {
        Event savedEvent = eventService.addEvent(event);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEvent);
    }

    @PutMapping("/{eventId}")
    public ResponseEntity<Event> updateEvent(@PathVariable long eventId, @RequestBody @Valid Event event) {
        Event updatedEvent = eventService.updateEvent(eventId, event);
        return ResponseEntity.ok(updatedEvent);
    }

    @DeleteMapping("/{eventId}")
    public ResponseEntity<Void> deleteEvent(@PathVariable long eventId) {
        eventService.deleteEvent(eventId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Event>> getAllEventsByDate(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        List<Event> events = eventService.getAllEventsByDate(date);
        return ResponseEntity.ok(events);
    }
}
