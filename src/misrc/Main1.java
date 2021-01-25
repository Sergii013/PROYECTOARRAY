package misrc;

public class Main1 {

    
    public static void main(String[] args) {
        //Declaración array
        String[] nombre = {"Luis", "Miguel","Carlos"};
        //Recorrer array
        for(int i=0; i<nombre.length; i++) {
            System.out.println(nombre[i]);
        }
        //Declaración Array tipo DOUBLE
        double[] estatura = {1.72, 1.75, 1.65};
        //Recorrer el array
        for(int i=0; i<estatura.length; i++){
            System.out.println(estatura[i]);
        }
    }
    
}
