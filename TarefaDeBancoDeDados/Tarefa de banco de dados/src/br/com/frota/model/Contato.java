package br.com.frota.model;

public class Contato extends GenericModel{
    private String telefone;

    public Contato(Integer id, String telefone){
        this.telefone = telefone;
        super.setId(id);
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Contato {" +
                "id='" + this.getId() + "\'" +
                "telefone ='" + telefone  + "\'" +
                '}';
    }
}
