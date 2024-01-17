package org.planify.provider.service;

import org.planify.event.domain.Event;

import java.util.List;

public interface EventService {
    List<Event> findAll();
}
