package com.hiberus.clothing.domain.ports.in;

import com.hiberus.clothing.domain.model.Garment;

public interface UpgradeDowngradeQuantityUseCase {

    boolean upgrade(Garment garment);
    boolean downgrade(Garment garment);
}
