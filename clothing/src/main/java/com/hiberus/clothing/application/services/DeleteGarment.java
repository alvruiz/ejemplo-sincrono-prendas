package com.hiberus.clothing.application.services;

import com.hiberus.clothing.domain.model.Size;
import com.hiberus.clothing.domain.ports.in.DeleteGarmentUseCase;
import com.hiberus.clothing.domain.ports.out.GarmentPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class DeleteGarment implements DeleteGarmentUseCase {
    private final GarmentPort garmentPort;

    @Override
    public boolean deleteGarment(String name, Size size) {
        return garmentPort.deleteGarment(name,size);
    }
}
