package com.hiberus.clothing.domain.ports.in;

import com.hiberus.clothing.domain.model.Garment;

import java.util.List;

public interface GetClothingUseCase {
    List<Garment> getClothing();
}
