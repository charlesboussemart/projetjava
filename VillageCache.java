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
public class VillageCache{
    protected String Nom;
    protected boolean EstAttaque;
    
    private VillageCache(String nom){
        this.EstAttaque=false;
        this.Nom=nom;
    }
    
    VillageCache Konoha = new VillageCache("Konoha");
    VillageCache Suna = new VillageCache("Suna");
    VillageCache Kumo = new VillageCache("Kumo");
    VillageCache Kiri = new VillageCache("Kiri");
    VillageCache Iwa = new VillageCache("Iwa");
    
    public void SeFaitAttaque(){
        this.EstAttaque=true;
    }
    
    public void EstSauve(){
        this.EstAttaque=false;
    }
    
    public boolean EstAttaque(){
        return this.EstAttaque;
    }
    
}
