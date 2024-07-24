package equipamentos.digitalizadora;

public class Scanner implements Digitalizadora{


    @Override
    public void digitalizar() {
        System.out.println("Digitalizando através da Classe Scanner");
    }
}
