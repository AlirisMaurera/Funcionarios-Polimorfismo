public class Gerente extends Funcionario implements Autenticavel {

    private AutenticarUtil util;

    public Gerente(){
        util = new AutenticarUtil();
    }
    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        boolean aut = this.util.autentica(senha);
        return aut;
    }

    public double getBonificacao(){
        return super.getSalario();
    }



}
