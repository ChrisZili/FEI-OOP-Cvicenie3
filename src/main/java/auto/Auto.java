package auto;

public class Auto {
    public static final double PALIVO_NA_KM = 0.2;
    private double kapacitaNadrze;
    private double stavNadrze;

    public void jazdi(double vzdialenost){
        stavNadrze -= vzdialenost * PALIVO_NA_KM;
        if(stavNadrze < 0){
            stavNadrze = 0;
        }
    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }

    public double getKapacitaNadrze() {
        return kapacitaNadrze;
    }

    public void setKapacitaNadrze(double kapacitaNadrze) {
        this.kapacitaNadrze = kapacitaNadrze;
    }
}
