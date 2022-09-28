package Model;

public class Usuario {
    String nomeCompleto;
    Endereco endereco;
    String sexo;
    int idade;
    String dataDeNascimento;
    String cpf;
    String telefone;
    String eMail;

    public Usuario(String nomeCompleto, Endereco endereco, String sexo, int idade, String dataDeNascimento, String cpf, String telefone, String eMail) {
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.sexo = sexo;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.eMail = eMail;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "[Usuario]\n" +
                "Nome completo: " + nomeCompleto + "\n" +
                "Sexo: " + sexo + "\n" +
                "Idade: " + idade + "\n" +
                "Data de Nascimento: " + dataDeNascimento + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone: " + telefone + "\n" +
                "E-mail: " + eMail + "\n" +
                "Endereço:" + endereco;
    }
}
