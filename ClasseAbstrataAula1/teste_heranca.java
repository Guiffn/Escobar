public class teste_heranca {

public static void main(String[] args) {
    estudante estudante = new estudante();
    estudante.cpf = "33";
 
    professor prof = new professor();
    prof.cpf = "818"; 
    faculdade up =  new faculdade();
    up.processar(estudante); //Deve imprimir "Salvando na tabela de professores"
}
}
