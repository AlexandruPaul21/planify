package org.planify.provider.domain.mapper;

import org.mapstruct.Mapper;
import org.planify.api.provider.dto.ProviderDto;
import org.planify.provider.domain.Provider;

@Mapper(componentModel = "spring")
public interface ProviderMapper {
    ProviderDto entityToDto(Provider provider);
}
