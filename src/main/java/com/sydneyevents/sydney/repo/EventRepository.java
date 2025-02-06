package com.sydneyevents.sydney.repo;

import com.sydneyevents.sydney.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}
