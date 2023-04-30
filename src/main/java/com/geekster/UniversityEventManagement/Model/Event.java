package com.geekster.UniversityEventManagement.Model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eventId;

    @NotNull
    private String eventName;

    @NotNull
    private String locationOfEvent;

    @NotNull
    @DateTimeFormat
    private LocalDate date;

    @NotNull
    private LocalTime startTime;

    @NotNull
    private LocalTime endTime;

    public Event(long eventId, String eventName, String locationOfEvent, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.locationOfEvent = locationOfEvent;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Event() {
    }
}
