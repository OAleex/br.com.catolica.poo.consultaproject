package Model;

import Model.Psicologo.Psicologo;

public class Paciente extends Usuario {
    String supostoCaso;
    Endereco endereco1;
    boolean indicacao;
    String localDaConsulta;
    int classificar;
    double pagamento;

    public Paciente(String nomeCompleto, Endereco endereco, String sexo, int idade, String dataDeNascimento, String cpf, String telefone, String eMail, String supostoCaso, boolean indicacao, String localDaConsulta, int classificar, double pagamento) {
        super(nomeCompleto, endereco, sexo, idade, dataDeNascimento, cpf, telefone, eMail);
        this.supostoCaso = supostoCaso;
        this.indicacao = indicacao;
        this.localDaConsulta = localDaConsulta;
        this.classificar = classificar;
        this.pagamento = pagamento;
    }

    public String getSupostoCaso() {
        return supostoCaso;
    }

    public void setSupostoCaso(String supostoCaso) {
        this.supostoCaso = supostoCaso;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public boolean isIndicacao() {
        return indicacao;
    }

    public void setIndicacao(boolean indicacao) {
        this.indicacao = indicacao;
    }

    public String getLocalDaConsulta() {
        return localDaConsulta;
    }

    public void setLocalDaConsulta(String localDaConsulta) {
        this.localDaConsulta = localDaConsulta;
    }

    public int getClassificar() {
        return classificar;
    }

    public void setClassificar(int classificar) {
        this.classificar = classificar;
    }

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "[Paciente]\n" +
                "Nome Completo: " + nomeCompleto + "\n" +
                "Sexo: " + sexo + "\n" +
                "Idade: " + idade + "\n" +
                "Data de Nascimento: " + dataDeNascimento + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone: " + telefone + "\n" +
                "E-mail: " + eMail + "\n" +
                "Suposto Caso: " + supostoCaso + "\n" +
                "Indicacao: " + indicacao + "\n" +
                "Local da Consulta: " + localDaConsulta + "\n" +
                "Classificacao que o Paciente deu a consulta: " + classificar + "\n" +
                "Pagamento: " + pagamento;
    }
}