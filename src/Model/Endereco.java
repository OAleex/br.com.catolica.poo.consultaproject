package Model;

public class Endereco {
    String pais;
    String rua;
    String complemento;
    int numero;
    String cidade;
    String estado;


    public Endereco(String pais, String rua, String complemento, int numero, String cidade, String estado) {
        this.pais = pais;
        this.rua = rua;
        this.complemento = complemento;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\n[Endereco]\n" +
                "Pais: " + pais + "\n" +
                "Rua: " + rua + "\n" +
                "Complemento: " + complemento + "\n" +
                "Numero: " + numero + "\n" +
                "Cidade: " + cidade + "\n" +
                "Estado: " + estado + "\n";
    }
}
