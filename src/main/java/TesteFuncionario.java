public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente ali = new Gerente();
        ali.setNome("Aliris");
        ali.setCpf("2222555455-25");
        ali.setSalario(2600.0);

        System.out.println(ali.getNome());
        System.out.println(ali.getBonificacao());

    }
}
