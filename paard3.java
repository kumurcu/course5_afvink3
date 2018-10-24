/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paard_en_race;

/**
 *
 * @author Administrator
 */

import java.util.Random;
import java.awt.*;
        
public class paard3 {
    private int afstand, paardNummer;
    private static int aantal = 0;
    private final String naam;
    private final Color kleur;
    Random random = new Random();
    
    /* Consructor voor Paard */
    paard3(String name, Color kl){
        this.naam = name;
        this.kleur = kl;
        this.afstand = 0;
        paardNummer = ++aantal;
    }
    
    public String getNaam(){
        return this.naam;
    }
    
    public int getAfstand(){
        return this.afstand;
    }
    
    public int getPaardNummer(){
        return paardNummer;
    }
    
    public Color getKleur(){
        return kleur;
    }
    
    public void run(){
        afstand = afstand + random.nextInt(11);
        System.out.println(naam + "is op positie " + afstand);
    }
}
