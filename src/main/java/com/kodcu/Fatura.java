package com.kodcu;

import javax.enterprise.context.Dependent;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 3/19/13
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
@Dependent
public class Fatura implements Serializable {

    private double toplamFiyat;

    public Double getToplamFiyat() {
        return toplamFiyat;
    }

    public void setToplamFiyat(Double toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }
}
