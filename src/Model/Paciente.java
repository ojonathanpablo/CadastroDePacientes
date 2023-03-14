package Model;

public class Paciente {

    private String nome;
    private String telefone;
    private String cpf;
    private String data;
    private String jaEPaciente;
    private String consultaRealizada;
    private String observacao;

    public Paciente() {
    }

    public Paciente(String nome, String telefone, String cpf, String data, String jaEPaciente,String consultaRealizada,String observacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data = data;
        this.jaEPaciente = jaEPaciente;
        this.consultaRealizada = consultaRealizada;
        this.observacao = observacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getJaEPaciente() {
        return jaEPaciente;
    }

    public void setJaEPaciente(String jaEPaciente) {
        this.jaEPaciente = jaEPaciente;
    }
        public String getConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(String consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
