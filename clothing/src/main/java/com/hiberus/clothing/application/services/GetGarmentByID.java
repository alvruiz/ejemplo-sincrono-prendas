package com.hiberus.clothing.application.services;

import com.hiberus.clothing.domain.model.Garment;
import com.hiberus.clothing.domain.ports.in.GetGarmentByIDUseCase;
import com.hiberus.clothing.domain.ports.out.GarmentPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class GetGarmentByID implements GetGarmentByIDUseCase {
    private final GarmentPort garmentPort;

    @Override
    public Garment getGarment(String id) {
        return garmentPort.getGarment(id);
    }
}
