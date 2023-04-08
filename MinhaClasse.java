package edu.Felipe.primeirasemana;


public class MinhaClasse {

    public static void main(String[] args) {
        System.out.print ("ola turma, sejam bem vindos ");        

        String primeiroNome = "Felipe ";
        String segundoNome = " Oliveira";

        String nomecompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomecompleto);
    }

    public static String nomeCompleto (String primeiroNome,String segundoNome) {
        return"Resultado do método " + primeiroNome.concat("").concat(segundoNome);

    }
}
