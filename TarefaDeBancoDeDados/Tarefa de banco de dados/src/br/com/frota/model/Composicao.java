package br.com.frota.model;

public class Composicao extends GenericModel{

    public Composicao(Integer id){
        super.setId(id);
    }

    @Override
    public String toString() {
        return "Composicao {" +
                "id ='" + this.getId() + "\'" +
                '}';
    }
}