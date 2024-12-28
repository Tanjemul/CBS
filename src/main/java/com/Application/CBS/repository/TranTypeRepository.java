package com.Application.CBS.repository;

import com.Application.CBS.model.TranType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TranTypeRepository extends JpaRepository<TranType, Integer> {
    Optional<TranType> findByTypeCode(Enum<TranType.TypeCode> typeCode);
}
