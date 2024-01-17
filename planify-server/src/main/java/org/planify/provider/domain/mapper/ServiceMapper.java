package org.planify.provider.domain.mapper;

import org.mapstruct.Mapper;
import org.planify.api.provider.dto.ServiceDto;
import org.planify.service.domain.Service;

@Mapper(componentModel = "spring")
public interface ServiceMapper {
    ServiceDto entityToDto(Service service);
}
