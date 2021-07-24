package com.jiangrzc;

import com.jiangrzc.intef.ExpireDateMerchandise;
import com.jiangrzc.intef.VirtualMerchandise;
import com.jiangrzc.supermarket.MerchandiseV2;

import java.util.Date;

public class TestInterface extends MerchandiseV2 implements ExpireDateMerchandise , VirtualMerchandise {
    @Override
    public boolean notExpireInDays(int days) {
        return false;
    }

    @Override
    public Date getProduceDate() {
        return null;
    }

    @Override
    public Date getExpireDate() {
        return null;
    }

    @Override
    public double leftDatePrecentage() {
        return 0;
    }

    @Override
    public double actualValueNow(double leftDatePercentage) {
        return 0;
    }
}
