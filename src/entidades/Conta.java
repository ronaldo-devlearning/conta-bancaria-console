package entidades;

import java.util.Objects;

public class Conta {

    private String agencia;
    private String numero;
    private Cliente cliente;
    private Double saldo = 0.0D;
    private boolean ativo;

    public Conta() {

    }

    public Conta(String agencia, String numero, Cliente cliente, boolean status) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.ativo = status;
    }

    public void sacar(Double valor) {
        saldo -= valor;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getNomeCliente() {
        return cliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(agencia, conta.agencia) && Objects.equals(numero, conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numero);
    }

    private String mensagemCliente() {
        return "Olá " + cliente.getNome() + ", obrigado por criar uma conta em nosso banco" + ", sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + String.format("%.2f", saldo)
                + " já está disponível para saque";
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia='" + agencia +
                ", numero='" + numero +
                ", cliente: " + cliente +
                ", saldo=" + String.format("%.2f", saldo) +
                ", ativo=" + ativo +
                '}' + "\n\n"
                + mensagemCliente();
    }

}
