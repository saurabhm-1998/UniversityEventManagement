package com.geekster.UniversityEventManagement.Repository;

import com.geekster.UniversityEventManagement.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.*;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByDate(LocalDate date);

}
