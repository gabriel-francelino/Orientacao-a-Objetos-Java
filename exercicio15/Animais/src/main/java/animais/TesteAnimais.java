package animais;

public class TesteAnimais {
    public static void main(String[] args) {
        TesteAnimais test = new TesteAnimais();
        Peixe p = new Peixe("Nemo");
        Gato g = new Gato("Tom");
        Animal a = new Peixe("Peixoto");
        Animal ab = new Aranha("Aracnilda");
        AnimalDeEstimacao ae = new Gato("Pudim");

        test.numeroPernas(p);
        p.caminhar();
        p.brincar();
        p.comer();
        System.out.println();

        test.numeroPernas(g);
        g.caminhar();
        g.brincar();
        g.comer();
        System.out.println();

        Peixe a1 = (Peixe)a;
        test.numeroPernas(a1);
        a1.caminhar();
        a1.brincar();
        a1.comer();
        System.out.println();

        test.numeroPernas(ab);
        ab.caminhar();
        ab.comer();
        System.out.println();

        ae.brincar();
        if (ae instanceof Gato){
            Gato ae1 = (Gato)ae;
            test.numeroPernas(ae1);
            ae1.caminhar();
            ae1.comer();
        }
        System.out.println();
    }

    public void numeroPernas(Animal a){
        System.out.println("O peixe " + a.getNome() + " possui " + a.getNumeroDePernas() + " pernas");
    }
}
