package com.hiberus.clothing.infrastructure.DTO;

import com.hiberus.clothing.domain.model.Size;
import lombok.Getter;

@Getter
public class GarmentIdentifierDTO {
    private String name;
    private Size size;
}
