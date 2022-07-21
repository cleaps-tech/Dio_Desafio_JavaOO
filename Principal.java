public class Principal {
    public static void main(String[] args) {
        Cliente fregues = new Cliente();
        fregues.setNome("Andre Pereira da Silva");



        Conta cc = new ContaCorrente(fregues);
        cc.depositar(600);
        
        Conta cp = new ContaPoupanca(fregues);
        cc.transferir(100, cp);

        cc.ImprimirExtrato();
        cp.ImprimirExtrato();
    }
}
