public class TesteReferencias {

    public static void main(String[] args) {


        Gerente gerente = new Gerente();
        gerente.setNome("Aliris");
        gerente.setSalario(2000.0);

        ControllerBonificacao co = new ControllerBonificacao();
        co.registra(gerente);


        System.out.println(co.getSoma());
    }
}
