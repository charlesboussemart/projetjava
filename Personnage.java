/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naruto;

/**
 *
 * @author charl
 */
public abstract class Personnage {
    protected String Nom;
    protected VillageCache Village;
    protected int Puissance;
    protected boolean EnVie;
    
    public Personnage(String nom, VillageCache village, int puissance){
        this.Nom=nom;
        this.Village=village;
        this.Puissance=puissance;
        this.EnVie=true;
    }
    
    public void Parle(String say){
        System.out.println(this.Nom + " : '" + say + "'");
    }
    
    public void SePresente(){
        Parle("Hey ! je suis " + this.Nom + " et je viens de " + this.Village.Nom);
    }
    
    public String GetVillage(){
        return this.Village.Nom;
    }
    
    public boolean EstEnVie(){
        return this.EnVie;
    }
    
    public void attaque(String nom){
        
    }
    
    public void SeFaitTuer(){
       Parle("Je suis vaincu !"); 
    }
   
}
