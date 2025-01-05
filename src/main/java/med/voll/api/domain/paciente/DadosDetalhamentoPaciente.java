package med.voll.api.domain.paciente;

public record DadosDetalhamentoPaciente(Long id,
                                        String nome,
                                        String cpf,
                                        String telefone) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getCpf(), paciente.getTelefone());
    }
}

