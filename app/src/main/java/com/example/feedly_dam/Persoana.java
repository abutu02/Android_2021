package com.example.feedly_dam;

import java.io.Serializable;


public class Persoana implements Serializable {
    private String nume;
    private String prenume;
    private String dataNasterii;
    private String mail;
    private String user;
    private String parola;

    public Persoana(String nume, String prenume, String dataNasterii, String mail, String user, String parola) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = dataNasterii;
        this.mail = mail;
        this.user = user;
        this.parola = parola;
    }

    public Persoana() {
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setDataNasterii(String dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getDataNasterii() {
        return dataNasterii;
    }

    public String getMail() {
        return mail;
    }

    public String getUser() {
        return user;
    }

    public String getParola() {
        return parola;
    }



    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", dataNasterii='" + dataNasterii + '\'' +
                ", mail='" + mail + '\'' +
                ", user='" + user + '\'' +
                ", parola='" + parola + '\'' +
                '}';
    }
}
