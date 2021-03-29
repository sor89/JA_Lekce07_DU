package com.company;

import java.util.Map;
import java.util.Objects;

public class Kontakt {
    public String telNumber;
    public String jmeno;
    public String prijmeni;
    public String kategorie;

    enum Kategorie {
        RODINA, PRACE, OSTATNI
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kontakt kontakt = (Kontakt) o;
        return telNumber.equals(kontakt.telNumber) &&
                jmeno.equals(kontakt.jmeno) &&
                prijmeni.equals(kontakt.prijmeni) &&
                kategorie.equals(kontakt.kategorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telNumber, jmeno, prijmeni, kategorie);
    }

    @Override
    public String toString() {
        return "Kontakt{" +
                "telNumber='" + telNumber + '\'' +
                ", jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", kategorie='" + kategorie + '\'' +
                '}';
    }

    public Kontakt(String telNumber, String jmeno, String prijmeni, String kategorie) {
        this.telNumber = telNumber;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.kategorie = kategorie;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }


    public static void vyhledejKontakt(Map<String, com.company.Kontakt> mapa, String hledaneCislo) {

        if (mapa.containsKey(hledaneCislo)) {
            System.out.println("Hledané tel. číslo " + hledaneCislo + " má přiřazený " + mapa.get(hledaneCislo));
        } else {
            System.out.println("Kontakt není v seznamu");
        }
    }

    public static void vyhledejJmenoPrijmeni(Map<String, com.company.Kontakt> mapa1, Map<String, com.company.Kontakt> mapa2 , String hledaneJmenoPrijmeni) {

        if (mapa1.containsKey(hledaneJmenoPrijmeni)) {
            System.out.println("Hledané jmeno/přijmení " + hledaneJmenoPrijmeni + " má přiřazený " + mapa1.get(hledaneJmenoPrijmeni));
        }
        else if (mapa2.containsKey(hledaneJmenoPrijmeni)) {
            System.out.println("Hledané jméno/příjmení " + hledaneJmenoPrijmeni + " má přiřazený " + mapa2.get(hledaneJmenoPrijmeni));
        }
        else {
            System.out.println("Jméno či Příjmení "+hledaneJmenoPrijmeni+" není v seznamu");
        }
    }

    //metoda je blbe
    public static void vyhledejCastKontaktu(Map<String, com.company.Kontakt> mapa, String hledanaCastTel) {

        if (mapa.containsValue(hledanaCastTel)) {
            System.out.println("Hledané část tel. číslo " + hledanaCastTel + " odpovida " + mapa.get(hledanaCastTel));
        } else {
            System.out.println("Kontakt není v seznamu");
        }
    }

}
