package d3s;
//texto: 0000000100100011010001010110011110001001101010111100110111101111
//clave: 0001001100110100010101110111100110011011101111001101111111110001
import java.util.*;
public class mDes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el texto en binario a cifrar");
        String texto = scan.nextLine();
        System.out.println("Introduce la clave en binario");
        String clave = scan.nextLine();
        DatoDes obj = new DatoDes();
        obj.datoDes(clave, texto);
    }
}
