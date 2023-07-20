package org.lessons.java.shop;

import java.util.Random;

public class Product {
    /*
    Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva

fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- Il codice prodotto sia accessibile solo in lettura
- Gli altri attributi siano accessibili sia in lettura che in scrittura
- Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
- Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome: il codice deve avere un pad left di zeri per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
     */

    // CAMPI
private int code;
private String name;
private String description;
private double price;
private double iva;


    // COSTRUTTORI

    public Product(String name, String description, double price, double iva) {
       Random casuale = new Random();
        this.code = casuale.nextInt(10000000, 99999999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }


    //GETTERS E SETTERS
// getter solo codice prodotto

    public int getCode() {
        return code;
    }

    // getter + setter per tutti gli altri

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


    // METODI


    //3. prezzo con iva

    //4. concatenazione nome e codice prodotto

}
