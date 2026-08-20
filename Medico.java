package Consulta;

public class Medico {
    private String nome;
    private String especialidade;
    private String CRM;
    public Medico(String nome, String especialidade, String CRM){
        this.nome = nome;
        this.especialidade = especialidade;
        this.CRM = CRM;
    }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ficar vazio.");
        }
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setCRM(String CRM) {
        if (CRM == null || CRM.trim().isEmpty()) {
            throw new IllegalArgumentException("O CRM não pode ficar vazio.");
        }
        this.CRM = CRM;
    }
    public String getNome() {
        return nome;
    }
    public String getCRM() {
        return CRM;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void apresentarMedico(){
        System.out.println("Médico: "+ nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CRM: "+ CRM);
    }
}
