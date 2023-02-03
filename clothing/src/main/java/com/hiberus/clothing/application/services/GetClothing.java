package com.hiberus.clothing.application.services;

import com.hiberus.clothing.domain.model.Garment;
import com.hiberus.clothing.domain.ports.in.GetClothingUseCase;
import com.hiberus.clothing.domain.ports.out.GarmentPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class GetClothing implements GetClothingUseCase {
    private final GarmentPort garmentPort;

    @Override
    public List<Garment> getClothing() {
        return garmentPort.getListClothing();
    }
}
