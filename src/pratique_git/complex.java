/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratique_git;

/**
 *
 * @author ACOLATSE Innocent
 */
public class complex {
    
    private double reel;
    private double imaginaire;

    public complex(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public complex() {
    }
    public double getReel() {
        return reel;
    }

    public void setReel(double reel) {
        this.reel = reel;
    }

    public double getImaginaire() {
        return imaginaire;
    }


    @Override
    public String toString() {
        return "complex{" + "reel=" + reel + ", imaginaire=" + imaginaire + '}';
    }

    public complex opposer(complex z){
        
        return new complex(-z.reel, -z.imaginaire) ;        
    }
    
    public complex addition( complex a1, complex a2){
        return new complex(a1.reel+a2.reel, a1.imaginaire+a2.imaginaire);
    }
}
