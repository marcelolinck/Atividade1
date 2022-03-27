public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro();
        Cliente cliente = new Cliente();
   
        System.out.println("LOCACAO DE CARROS - FACA SUA COTACAO \r\n");

//        String multa = "nao";
        cliente.nome = "MARIO KART";
        cliente.documento = "829.655.440-20";
        cliente.carro.marca = "HONDA";
        cliente.carro.modelo = "CIVIC TOP";
        cliente.carro.placa = "XPT-5566";
        cliente.regra.quantDias = 2;
        cliente.regra.valorLocacao = 120.00;
        cliente.regra.multa = "sim";
              
        
        cliente.resumoLocacao();
        
    }
}
