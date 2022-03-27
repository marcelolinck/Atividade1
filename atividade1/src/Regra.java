public class Regra {

    int quantDias = 1;
    double valorLocacao = 100.00;
    String multa = "nao"; // sim ou nao
    double valorAvaria = 5.00;
    double total = 100.00;

    void calcularLocacao() {
        total = Double.valueOf(quantDias) * valorLocacao;

        if (multa != "nao") {
            calcularAvaria();
        }
        System.out.println(
                "Você ficou com o carro " + quantDias + " dia(s). \r\nA diária cobrada foi de: R$" + valorLocacao
                        + ".\r\nCom isso, o seu total ficou em: R$ " + total + ".\r\n");
    }

    void calcularAvaria() {

        this.total = valorAvaria + total;
        System.out.println("Possui avarias no valor de: R$ "+valorAvaria);
    }
    
}
