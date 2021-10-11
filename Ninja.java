package naruto;

public class Ninja extends Personnage{
    protected element Myelement;
    protected int NbKunai;
    
    public Ninja(String Nom, VillageCache village, int Puissance, boolean EnVie, element Myelement, int NbKunai){
        super(Nom, Village, Puissance, EnVie);
        this.Myelement = Myelement;
        this.NbKunai = 10;
        SePresenter();
    }
    public float getMyelement() { return this.Myelement; }
    public void Ravitaillement(int value) { this.NbKunai = value + this.NbKunai; }
}
