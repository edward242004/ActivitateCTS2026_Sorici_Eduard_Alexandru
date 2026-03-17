package ro.ase.cts.Prototype.Clase;

public class InternareBuilderAlternativ implements InternareBuilderAbstractA{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;
    private String numePacient;

    public InternareBuilderAlternativ() {
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuci = false;
        this.halat = false;
        this.numePacient = "-";
    }
    public InternareBuilderAlternativ setPat(boolean arePat){
        this.patRabatabil=arePat;
        return this;
    }
    public InternareBuilderAlternativ setHalat(boolean areHalat){
        this.halat = areHalat;
        return this;
    }
    public InternareBuilderAlternativ setMic(boolean areMic){
        this.micDejun=areMic;
        return this;
    }
    public InternareBuilderAlternativ setPapuci(boolean arePapuci){
        this.papuci = arePapuci;
        return this;
    }
    public InternareBuilderAlternativ setNume(String nume){
        this.numePacient = nume;
        return this;
    }



    @Override
    public Internare build(String nume) {
        Internare internare = new Internare(this.patRabatabil,this.micDejun,this.papuci,this.halat,nume);
        return internare;
    }
}
