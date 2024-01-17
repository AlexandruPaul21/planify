package org.planify.provider.domain.mapper;

import org.mapstruct.Mapper;
import org.planify.api.provider.dto.EventDto;
import org.planify.event.domain.Event;

@Mapper(componentModel = "spring")
public interface EventMapper {
    EventDto entityToDto(Event event);
}
