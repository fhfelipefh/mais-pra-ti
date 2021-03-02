public class DeptEstadual extends Candidato{
    private int NumVotos;
    private int CodCandidato;

    public int getCodCandidato() {
        return CodCandidato;
    }

    public void setCodCandidato(int codCandidato) {
        CodCandidato = codCandidato;
    }

    public DeptEstadual(String nome, int CodCandidato){
        super(nome);
        this.CodCandidato = CodCandidato;
        this.NumVotos = 0;
    }

    @Override
    public String Info(){
        return "Candidato a Deputado Estadual";
    }


    private void setNumVotos(int NumVotos){
        this.NumVotos=NumVotos;
    }
    public void recebendoVotos(){
        this.NumVotos ++;
    }
    public int getNumVotos(){
        return NumVotos;
    }

}
