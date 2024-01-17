package org.planify.provider.domain.mapper;

import org.mapstruct.Mapper;
import org.planify.api.provider.dto.ClientDto;
import org.planify.client.domain.Client;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDto entityToDto(Client client);
}
