package com.peeko32213.unusualfishmod.common.entity.util;

public interface SemiAquatic {

    boolean shouldEnterWater();

    boolean shouldLeaveWater();

    boolean shouldStopMoving();

    int getWaterSearchRange();
}
