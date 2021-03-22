package com.company;

import com.sun.source.doctree.StartElementTree;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.Arrays;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {


//naliti dat
        Kontakt kontakt1 = new Kontakt("+420602111222", "Jan", "Novak", "PRACE");
        Kontakt kontakt2 = new Kontakt("+420212342143", "Tomas", "Zeleny", "PRACE");
        Kontakt kontakt3 = new Kontakt("+420602222345", "Jana", "Novakova", "OSTANI");
        Kontakt kontakt4 = new Kontakt("+420602553233", "Sef", "", "PRACE");
        Kontakt kontakt5 = new Kontakt("+420612533434", "Rodice - pevna", "", "RODINA");


//definice seznamu
        //  List<Kontakt> list = new ArrayList<>();
        Set<Kontakt> list = new HashSet<>();

        list.add(kontakt1);
        list.add(kontakt2);
        list.add(kontakt3);
        list.add(kontakt4);
        list.add(kontakt5);

//pridani kontaktu do listu
//        pridejDoSeznamu(list, kontakt1);
//        pridejDoSeznamu(list, kontakt2);
//        pridejDoSeznamu(list, kontakt3);
//        pridejDoSeznamu(list, kontakt4);
//        pridejDoSeznamu(list, kontakt5);

        Map<String, Kontakt> mapa = new HashMap<>();
        mapa.put(kontakt1.telNumber, kontakt1);
        mapa.put(kontakt2.telNumber, kontakt2);
        mapa.put(kontakt3.telNumber, kontakt3);
        mapa.put(kontakt4.telNumber, kontakt4);
        mapa.put(kontakt5.telNumber, kontakt5);


        //hledam kontakt s tel +420602111222
       String hledaneCislo = new String("+420602222345");

       //pomocné znázornění IF - zda mám dobře napsaný IF
        if (mapa.containsKey(hledaneCislo)) {
            System.out.println("Hledané tel. číslo " + hledaneCislo + " má přiřazený " + mapa.get(hledaneCislo));
        } else {
            System.out.println("Kontakt není v seznamu");
        }

//metoda volaná pro hledání tel. čísla
        vyhledejKontakt(hledaneCislo);



    }

    //metoda na hledani kontaktu podle promenené hledaneCislo
    //nefunguje!
    public  static void vyhledejKontakt(Map<String, Kontakt> mapa, String hledaneCislo) {

        if (mapa.containsKey(hledaneCislo)) {
            System.out.println("Hledané tel. číslo " + hledaneCislo + " má přiřazený " + mapa.get(hledaneCislo));
        } else {
            System.out.println("Kontakt není v seznamu");
        }
    }


}

