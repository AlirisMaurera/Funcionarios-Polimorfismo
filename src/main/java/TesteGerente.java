public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Aliris");
        g1.setCpf("6665555");
        g1.setSalario(5000.0);
        g1.setSenha(222);
        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

//        boolean aut = g1.autenticacao(222);
//        System.out.println(aut);
        System.out.println(g1.getBonificacao());


    }
}
