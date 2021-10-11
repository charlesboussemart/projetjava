package naruto;

public class Kage extends Ninja{
    private int NumeroKage;
    
    public Kage(String Nom, VillageCache village, int Puissance, boolean EnVie, element Myelement, int NbKunai, int NumeroKage, ){
        super(Nom, Village, Puissance, EnVie, Myelement, NbKunai);
        this.NumeroKage = NumeroKage;
        SePresenter();
    }
    public int getNumeroKage() { return this.NumeroKage; }
}
