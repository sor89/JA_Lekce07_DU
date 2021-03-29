package com.company;

import com.sun.source.doctree.StartElementTree;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.regex.Pattern;

import static com.company.Kontakt.vyhledejCastKontaktu;


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
        Set<com.company.Kontakt> list = new HashSet<>();

        list.add(kontakt1);
        list.add(kontakt2);
        list.add(kontakt3);
        list.add(kontakt4);
        list.add(kontakt5);


        Map<String, com.company.Kontakt> mapaTel = new HashMap<>();
        mapaTel.put(kontakt1.telNumber, kontakt1);
        mapaTel.put(kontakt2.telNumber, kontakt2);
        mapaTel.put(kontakt3.telNumber, kontakt3);
        mapaTel.put(kontakt4.telNumber, kontakt4);
        mapaTel.put(kontakt5.telNumber, kontakt5);

        Map<String, com.company.Kontakt> mapaJmeno = new HashMap<>();
        mapaJmeno.put(kontakt1.jmeno, kontakt1);
        mapaJmeno.put(kontakt2.jmeno, kontakt2);
        mapaJmeno.put(kontakt3.jmeno, kontakt3);
        mapaJmeno.put(kontakt4.jmeno, kontakt4);
        mapaJmeno.put(kontakt5.jmeno, kontakt5);

        Map<String, com.company.Kontakt> mapaPrijmeni = new HashMap<>();
        mapaPrijmeni.put(kontakt1.prijmeni, kontakt1);
        mapaPrijmeni.put(kontakt2.prijmeni, kontakt2);
        mapaPrijmeni.put(kontakt3.prijmeni, kontakt3);
        mapaPrijmeni.put(kontakt4.prijmeni, kontakt4);
        mapaPrijmeni.put(kontakt5.prijmeni, kontakt5);

        Map<String, com.company.Kontakt> mapaKategorie = new HashMap<>();
        mapaKategorie.put(kontakt1.kategorie, kontakt1);
        mapaKategorie.put(kontakt2.kategorie, kontakt2);
        mapaKategorie.put(kontakt3.kategorie, kontakt3);
        mapaKategorie.put(kontakt4.kategorie, kontakt4);
        mapaKategorie.put(kontakt5.kategorie, kontakt5);


        //hledam kontakt s tel +420602111222
       String hledaneCislo = new String("+420602111222");
       String hledaneJmenoPrijmeni = new String("Zeleny");
       String hledanaCastTel = new String("+4206025532");

//        Pattern p = Pattern.compile(hledanaCastTel);
//
//        for (String key : mapaTel.keySet()) {
//            if(p.matcher(key).matches()) {
//                mapaTel.add(key);
//            }
//
//        }
//        System.out.println(mapaTel.get(p.key));

       //pomocné znázornění IF - zda mám dobře napsaný IF
//        if (mapa.containsKey(hledaneCislo)) {
//            System.out.println("Hledané tel. číslo " + hledaneCislo + " má přiřazený " + mapa.get(hledaneCislo));
//        } else {
//            System.out.println("Kontakt není v seznamu");
//        }

//metoda hledá telefoni cislo
       com.company.Kontakt.vyhledejKontakt(mapaTel,hledaneCislo);

//metoda hledá Jmeno nebo Prijmeni
        com.company.Kontakt.vyhledejJmenoPrijmeni(mapaJmeno, mapaPrijmeni, hledaneJmenoPrijmeni);

        com.company.Kontakt.vyhledejCastKontaktu(mapaTel, hledanaCastTel);


    }



}

