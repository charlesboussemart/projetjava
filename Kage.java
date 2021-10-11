package naruto;

public class Kage extends Ninja{
    private int NumeroKage;
    
    public Kage(String nom, VillageCache village, int puissance, boolean EnVie, Element Myelement, int NbKunai, int NumeroKage){
        super(nom, village, puissance, EnVie, Myelement, NbKunai);
        this.NumeroKage = NumeroKage;
        //SePresenter();
    }
    public int getNumeroKage() { return this.NumeroKage; }
}
