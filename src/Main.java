import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multiFuncional.EquipamentoMultiFuncional;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Impressora impressora = new Deskjet();

        impressora.imprimir();

        EquipamentoMultiFuncional equipamentoMultiFuncional = new EquipamentoMultiFuncional();
        Impressora impressora1 = equipamentoMultiFuncional;
        Digitalizadora  digitalizadora = equipamentoMultiFuncional;
        Copiadora copiadora = equipamentoMultiFuncional;


        impressora1.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();


    }
}