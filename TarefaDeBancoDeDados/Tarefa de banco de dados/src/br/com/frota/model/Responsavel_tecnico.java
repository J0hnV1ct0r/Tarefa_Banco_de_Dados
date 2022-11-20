package br.com.frota.model;

public class Responsavel_tecnico extends GenericModel{
    private String nome;
    private String conselho;
    private String formacao;
    private String sigla_formacao;

    public Responsavel_tecnico(String nome, String conselho, String formacao, String sigla_formacao){
        this.nome = nome;
        this.conselho = conselho;
        this.formacao = formacao;
        this.sigla_formacao =  sigla_formacao;
    }

    public Responsavel_tecnico(Integer id, String nome, String conselho, String formacao, String sigla_formacao){
        this.nome = nome;
        this.conselho = conselho;
        this.formacao = formacao;
        this.sigla_formacao =  sigla_formacao;
        super.setId(id);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setConselho(String conselho){
        this.conselho;
    }

    public void setFormacao(String formacao){
        this.formacao = formacao;
    }

    public void setSigla_formacao(String sigla_formacao){
        this.sigla_formacao = sigla_formacao;
    }

    //
    public String getConselho() {
        return conselho;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla_formacao() {
        return sigla_formacao;
    }

    @Override
    public String toString() {
        return "Contato {" +
                "id='" + this.getId() + "\'" +
                "nome ='" + nome  + "\'" +
                "conselho ='" + conselho  + "\'" +
                "formacao ='" + formacao  + "\'" +
                "sigla_formacao ='" + sigla_formacao  + "\'" +
                '}';
    }
}