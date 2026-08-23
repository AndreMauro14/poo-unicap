package Circle;

public class Circulo {
    double raio;

    Circulo(double r){
        raio = r;
    }

    double area(){
        double PI = 3.14;
        double calc = PI*(raio*raio);
        return calc;
    }

    double comprimento(){
        double PI = 3.14;
        double calc = 2*PI*raio;
        return calc;
    }

}
