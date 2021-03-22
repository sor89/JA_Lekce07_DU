package com.company;

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
}
