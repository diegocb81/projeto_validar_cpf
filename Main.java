public class Main {

    public static void main(String[] args) {

        int[] numeros;
        numeros = converteNumeros(args);
        System.out.println(numeros[0]);

    }

    public static int[] converteNumeros(String[] numerosCPF){
        int[] numerosInt;
        numerosInt = new int[11];

        for (int i=0; i<numerosCPF[0].length(); i++){
            char letraVez = numerosCPF[0].charAt(i);
            String str = String.valueOf(letraVez);
            int digitoNum = Integer.parseInt(str);
            numerosInt[i] = digitoNum;
        }

        return numerosInt;
    }

}