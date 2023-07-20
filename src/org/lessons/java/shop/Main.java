package org.lessons.java.shop;


public class Main {
    public static void main(String[] args) {

Product smartphone= new Product("iphone","smartphone",300, 0.2);

        System.out.println(smartphone.toString());

        System.out.println();
        System.out.println("PRODOTTO: " + smartphone.getCompleteName());
        System.out.println();
        System.out.println("SPECIFICHE PRODOTTO:");
        System.out.println("CODICE: " +smartphone.getCode());
        System.out.println("NOME: " + smartphone.getName());
        System.out.println("DESCRIZIONE: " + smartphone.getDescription());
        System.out.println("PREZZO: " + smartphone.getPrice());
        System.out.println("PREZZO COMPRENSIVO DI IVA: " + smartphone.getPriceIva());

    }
}
