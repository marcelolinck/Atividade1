//3 FUNCOES
//PASSAGEM DE PARAMETROS
//FUNCOES SOBRECARREGADAS
//
public class Cliente {
    
    String nome = "Sem Nome";
    String logradouro = "Sem Rua/Avenida";
    String cidade = "Sem Cidade";
    String documento = "Sem CPF";
    Carro carro = new Carro();
    Regra regra = new Regra();
    

    
    void resumoLocacao(){
        System.out.println("O cliente "+ nome +" com cpf "+ documento +" . \r\n");
        carro.escreverCarro();
        regra.calcularLocacao();
        terminaLocacao();
    }

    void terminaLocacao(){
        System.out.println("\r\n\r\n ----------*********** Muito Obrigado e volte sempre ***********---------- \r\n\r\n");
    }

    
    
    
}