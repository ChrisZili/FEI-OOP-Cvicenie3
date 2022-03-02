package auto;

public class Auto {
    public double kapacitaNadrze;
    public double stavNadrze;

    public void jazdi(double vzdialenost){
        stavNadrze -= vzdialenost * 0.2;
        if(stavNadrze < 0){
            stavNadrze = 0;
        }
    }



}
