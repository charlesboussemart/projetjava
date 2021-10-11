package naruto;

public class Ninja extends Personnage{
    protected Element Myelement;
    protected int NbKunai;
    
    public Ninja(String nom, VillageCache village, int puissance, boolean EnVie, Element Myelement, int NbKunai){
        super(nom, village, puissance);
        this.Myelement = Myelement;
        this.NbKunai = 10;
        //SePresenter();
    }
    public Element getMyelement() { return this.Myelement; }
    public void Ravitaillement(int value) { this.NbKunai = value + this.NbKunai; }
}
