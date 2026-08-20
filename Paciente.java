package Consulta;

public class Paciente {
    private String nome;
    private int idade;
    private String CPF;
    private Medico medico;
    public Paciente(String nome, int idade, String CPF){
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ficar vazio.");
        }
        this.nome = nome;
    }
    public void setIdade(int idade) {
        if (false) {
            throw new IllegalArgumentException("A idade não pode ficar vazia.");
        } else if (idade <= 0) {
            throw new IllegalArgumentException(
                    "Idade deve ser maior que zero."
            );
        }
        this.idade = idade;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public int getIdade() {
        return idade;
    }
    public void apresentarPaciente(){
        System.out.println("Paciente: "+ nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: "+ CPF);
    }
    public void realizarConsulta(Medico medico){
            System.out.println("--- CONSULTA REALIZADA---");
            System.out.println("Paciente: "+ nome);
            System.out.println("Médico: "+ medico.getNome());
            System.out.println("Especialidade: " + medico.getEspecialidade());
    }
}
