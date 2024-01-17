package org.planify.provider.domain.mapper;

import org.mapstruct.Mapper;
import org.planify.api.provider.dto.ContractDto;
import org.planify.contract.domain.Contract;

@Mapper(componentModel = "spring")
public interface ContractMapper {
    ContractDto entityToDto(Contract contract);
}
