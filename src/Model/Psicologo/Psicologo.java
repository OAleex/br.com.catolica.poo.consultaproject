package Model.Psicologo;

import Model.Endereco;
import Model.Usuario;

import java.util.Calendar;


public class Psicologo extends Usuario {

    String topicosDeAtendimento;
    String areasDePesquisa;
    String modoDeConsulta;
    String formacaoAcademica;
    String curso;
    String instituicaoDeEnsino;
    String periodo;
    String descricao;
    String data;

    public Psicologo(String nomeCompleto, Endereco endereco, String sexo, int idade, String dataDeNascimento, String cpf, String telefone, String eMail, String topicosDeAtendimento, String areasDePesquisa, String modoDeConsulta, String formacaoAcademica, String curso, String instituicaoDeEnsino, String periodo, String descricao, String data) {
        super(nomeCompleto, endereco, sexo, idade, dataDeNascimento, cpf, telefone, eMail);
        this.topicosDeAtendimento = topicosDeAtendimento;
        this.areasDePesquisa = areasDePesquisa;
        this.modoDeConsulta = modoDeConsulta;
        this.formacaoAcademica = formacaoAcademica;
        this.curso = curso;
        this.instituicaoDeEnsino = instituicaoDeEnsino;
        this.periodo = periodo;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTopicosDeAtendimento() {
        return topicosDeAtendimento;
    }

    public void setTopicosDeAtendimento(String topicosDeAtendimento) {
        this.topicosDeAtendimento = topicosDeAtendimento;
    }

    public String getAreasDePesquisa() {
        return areasDePesquisa;
    }

    public void setAreasDePesquisa(String areasDePesquisa) {
        this.areasDePesquisa = areasDePesquisa;
    }

    public String getModoDeConsulta() {
        return modoDeConsulta;
    }

    public void setModoDeConsulta(String modoDeConsulta) {
        this.modoDeConsulta = modoDeConsulta;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituicaoDeEnsino() {
        return instituicaoDeEnsino;
    }

    public void setInstituicaoDeEnsino(String instituicaoDeEnsino) {
        this.instituicaoDeEnsino = instituicaoDeEnsino;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n[Psicologo]\n" +
                "Topicos de Atendimento: " + topicosDeAtendimento + "\n" +
                "Areas de Pesquisa: " + areasDePesquisa + "\n" +
                "Modo de Consulta: " + modoDeConsulta + "\n" +
                "Formacao Academica: " + formacaoAcademica + "\n" +
                "Curso: " + curso + "\n" +
                "InstituicaoDeEnsino: " + instituicaoDeEnsino + "\n" +
                "Periodo: " + periodo + "\n" +
                "Descricao: " + descricao + "\n" +
                "Aniversario: " + data;
    }
}
