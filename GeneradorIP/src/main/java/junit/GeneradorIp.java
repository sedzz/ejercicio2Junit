package junit;

import java.util.Random;

public class GeneradorIp {

    public int generarNumero(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(max+1);
    }

    public String generarIp() {
        int octeto1 = generarNumero(0, 255);
        int octeto2 = generarNumero(0, 255);
        int octeto3 = generarNumero(0, 255);
        int octeto4 = generarNumero(0, 255);

        return octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4;
    }
}