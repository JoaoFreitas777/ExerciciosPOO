//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, "Prata");
        Carro carro2 = new Carro("Ford", "Mustang", 2021, "Vermelho");

        System.out.println("Informações do Carro 1:");
        carro1.exibirInformacoes();
        System.out.println();

        System.out.println("Informações do Carro 2:");
        carro2.exibirInformacoes();
        System.out.println();

        carro1.setAno(2023);
        carro1.setCor("Azul");
        
        System.out.println("Informações atualizadas do Carro 1:");
        carro1.exibirInformacoes();
    }
}