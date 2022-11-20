package br.com.frota.model;

public class Unidade_medida extends GenericModel{
    private String descricao;

    public Unidade_medida(String descricao) {
        this.descricao = descricao;
    }


    public Unidade_medida(Integer id, String descricao){
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
        return "Unidade_medida {" +
                "id ='" + this.getId() + "\'" +
                "descricao ='" + descricao + "\'" +
                '}';
    }
}
