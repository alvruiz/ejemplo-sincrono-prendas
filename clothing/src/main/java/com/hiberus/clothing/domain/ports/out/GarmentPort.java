package com.hiberus.clothing.domain.ports.out;

import com.hiberus.clothing.domain.model.Garment;
import com.hiberus.clothing.domain.model.Size;

import java.util.List;

public interface GarmentPort {



    boolean createGarment(Garment garment);

    boolean deleteGarment(String name, Size size);

    List<Garment> getListClothing();

    Garment getGarment(String id);
}
