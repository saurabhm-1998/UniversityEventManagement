package com.geekster.UniversityEventManagement.Service;

import com.geekster.UniversityEventManagement.Model.Event;
import com.geekster.UniversityEventManagement.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(long eventId, Event event) {
        return eventRepository.save(event);
    }

    public void deleteEvent(long eventId) {
        eventRepository.deleteById(eventId);
    }

    public List<Event> getAllEventsByDate(LocalDate date) {
        return eventRepository.findByDate(date);
    }
}
