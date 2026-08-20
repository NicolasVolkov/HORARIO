package Consulta;

public class Principal {
    static void main(String[] args) {
        Paciente paciente = new Paciente("Mandela", 17, "11552911900");
        Medico medico = new Medico("Jonathan", "Raio-x", "Admin");
        System.out.println("Dados do Paciente:");
        paciente.apresentarPaciente();
        System.out.println("Dados do Médico:");
        medico.apresentarMedico();
        paciente.realizarConsulta(medico);
        System.out.println("Dados do paciente após consulta: ");
        paciente.apresentarPaciente();
        System.out.println("Dados do Médico após consulta:");
        medico.apresentarMedico();
    }
}
