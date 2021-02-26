public class Main {

    public static void main(String[] args) {

        int[] numeros;
        numeros = converteNumeros(args);

        numeros = calculaDigitos(numeros);
        imprimeCPF(numeros);

    }


    public static int[] converteNumeros(String[] numerosCPF) {
        int[] numerosInt;
        numerosInt = new int[11];

        for (int i = 0; i < numerosCPF[0].length(); i++) {
            char letraVez = numerosCPF[0].charAt(i);
            String str = String.valueOf(letraVez);
            int digitoNum = Integer.parseInt(str);
            numerosInt[i] = digitoNum;
        }

        return numerosInt;
    }

    public static int[] calculaDigitos(int[] numerosCPF) {

        int mult = 10;
        int soma = 0;
        int dig = 0;

        for (int i = 0; i < 9; i++) {
            soma = soma + (numerosCPF[i] * mult);
            mult--;
        }

        int resto = soma % 11;

        if (resto < 2) {
            numerosCPF[9] = 0;
        } else {
            numerosCPF[9] = 11 - resto;
        }

        mult = 11;
        soma = 0;

        for (int i = 0; i < 10; i++) {
            soma = soma + (numerosCPF[i] * mult);
            mult--;
        }

        resto = soma % 11;

        if (resto < 2) {
            numerosCPF[10] = 0;
        } else {
            numerosCPF[10] = 11 - resto;
        }

        return numerosCPF;

    }

    public static void imprimeCPF(int[] numerosCPF){

        for (int i=0; i<numerosCPF.length; i++){
            if ((i%3==0)&&(i>0)&&(i<9)){
                System.out.print(".");
            }
            if (i==9){
                System.out.print("-");
            }
            System.out.print(numerosCPF[i]);
        }

    }

}
