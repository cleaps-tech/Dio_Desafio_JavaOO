public class ContaPoupanca extends Conta{
   
    public ContaPoupanca( Cliente cliente){
        super(cliente);
    }
    @Override
    public void ImprimirExtrato(){
        System.out.println("=== Extrato conta corrente ===+");
        super.ImprimirInfo();
        
   }
}
