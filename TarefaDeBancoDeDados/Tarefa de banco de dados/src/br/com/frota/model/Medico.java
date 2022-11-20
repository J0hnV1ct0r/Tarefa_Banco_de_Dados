package br.com.frota.model;

public class Medico extends GenericModel{
    private Strring nome;
    private String crm;

    public Medico(String nome, String crm){
        this.nome = nome;
        this.crm = crm;
    }

    public Medico(integer id,String nome, String crm){
        this.nome = nome;
        this.crm = crm;
        super.setId(id);
    }

    public void setNome(Strring nome) {
        this.nome = nome;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    //


    public Strring getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;

    }

    @Override
    public String toString() {
        return "Contato {" +
                "id='" + this.getId() + "\'" +
                "nome ='" + nome  + "\'" +
                "crm ='" + crm  + "\'" +
                '}';
    }
}