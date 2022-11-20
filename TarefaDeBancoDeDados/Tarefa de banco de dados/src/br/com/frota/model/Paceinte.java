package br.com.frota.model;

public class Paciente extends GenericModel{
    private String nome;
    private Date dt_nascimento;

    public Paciente(String nome, Date dt_nascimento){
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
    }

    public Paciente(Integer id, String nome, Date dt_nascimento){
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        super.setId(id);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    @Override
    public String toString() {
        return "Paceiente {" +
                "id ='" + this.getId() + "\'" +
                "nome ='" + nome + "\'" +
                "dt_nascimento =" + dt_nascimento + "\'" +
                '}';
    }
}