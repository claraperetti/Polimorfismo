public class ContaEspecial extends Conta {

    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public ContaEspecial(String agencia, String numero, float saldo, float limite) {
        super(agencia, numero, saldo);
        this.limite = limite;
    }

    @Override
    public void saque(float valor) {
        if (saldo + limite < valor ) {
            System.out.println("O saldo é insuficiente!");
        }
        else {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        }
    }
}
