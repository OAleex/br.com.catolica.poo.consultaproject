package Model;

public class Diagnostico {

    String diagnostico;
    String historicoFamiliar;

    public Diagnostico(String diagnostico, String historicoFamiliar) {
        this.diagnostico = diagnostico;
        this.historicoFamiliar = historicoFamiliar;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getHistoricoFamiliar() {
        return historicoFamiliar;
    }

    public void setHistoricoFamiliar(String historicoFamiliar) {
        this.historicoFamiliar = historicoFamiliar;
    }

    @Override
    public String toString() {
        return "\n[Diagnostico]\n" +
                "Diagnostico: " + diagnostico + "\n" +
                "Historico familiar: " + historicoFamiliar;
    }
}
