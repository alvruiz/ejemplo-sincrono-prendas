package com.hiberus.clothing.domain.ports.in;

import com.hiberus.clothing.domain.model.Size;

public interface DeleteGarmentUseCase {

    boolean deleteGarment(String name, Size size);
}
