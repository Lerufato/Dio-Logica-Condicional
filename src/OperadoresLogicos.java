public class OperadoresLogicos {
    
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2)); //conjunção
        System.out.println("b1 && b3 " + (b1 && b3));

        System.out.println("b2 || b3 " + (b2 || b3)); //disjunção
        System.out.println("b2 || b4 " + (b2 || b4));

        System.out.println("b1 ^ b3 " + (b1 ^ b3)); //disjunção exclusiva
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        System.out.println(!b1); //negação
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true)); //expressão verdadeira
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1))); //expressão verdadeira

        double salarioMensal = 11893.58;
        double mediaSalario = 10500;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)); //será falso porque salarioMensal é maior que mediaSalario

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes)); //será falso porque salarioBaixo é falso, apenas muitosDependentes é verdadeiro

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes); 

        System.out.println("recebeAuxilio " + recebeAuxilio); //será falso porque recebeAuxilio é falso, pois salarioBaixo é falso

    }
}
