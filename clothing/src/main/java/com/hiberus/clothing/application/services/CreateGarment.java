package com.hiberus.clothing.application.services;

import com.hiberus.clothing.domain.model.Garment;
import com.hiberus.clothing.domain.ports.in.CreateGarmentUseCase;
import com.hiberus.clothing.domain.ports.out.GarmentPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class CreateGarment implements CreateGarmentUseCase {
    private final GarmentPort garmentPort;

    @Override
    public boolean createGarment(Garment garment){
        return garmentPort.createGarment(garment);
    }
}
