package com.kodcu;

import javax.enterprise.event.Observes;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 3/19/13
 * Time: 7:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Maliye {

    public void yuzdeSekizKDV(@Observes @Sekiz Fatura fatura) {
        fatura.setToplamFiyat(fatura.getToplamFiyat() * 1.08);
    }

    public void yuzdeOnSekizKDV(@Observes @OnSekiz Fatura fatura) {
        fatura.setToplamFiyat(fatura.getToplamFiyat() * 1.18);
    }
}
