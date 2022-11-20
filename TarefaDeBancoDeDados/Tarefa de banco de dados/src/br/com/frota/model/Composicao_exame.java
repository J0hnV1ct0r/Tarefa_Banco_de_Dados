package br.com.frota.model;

public class Composicao_exame extends GenericModel{
    private String descricao;

    public Composicao_exame(String descricao){
        this.descricao = descricao;
    }

    public Composicao_exame(Integer id, String descricao){
        this.descricao = descricao;
        super.setId(id);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Composicao_exame {" +
                "id ='" + this.getId() + "\'" +
                "descricao ='" + descricao + "\'" +
                '}';
    }
}