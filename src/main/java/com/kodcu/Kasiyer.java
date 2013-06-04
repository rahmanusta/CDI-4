package com.kodcu;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 3/19/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
@Named("kasiyer")
@SessionScoped
public class Kasiyer implements Serializable {

    @Inject
    @OnSekiz
    private Event<Fatura> yuzdeOnSekiz;

    @Inject
    @Sekiz
    private Event<Fatura> yuzdeSekiz;

    @Inject
    private Fatura fatura;

    private String kdvOrani="";

    public void hesapla() {
       switch (kdvOrani)
       {
           case "%18":
               yuzdeOnSekiz.fire(fatura); break;
           case "%08":
               yuzdeSekiz.fire(fatura); break;
           default:
               yuzdeOnSekiz.fire(fatura);
       }
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public String getKdvOrani() {
        return kdvOrani;
    }

    public void setKdvOrani(String kdvOrani) {
        this.kdvOrani = kdvOrani;
    }
}
