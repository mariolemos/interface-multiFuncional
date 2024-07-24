package equipamentos.multiFuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Impressora, Copiadora, Digitalizadora {
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via Equipamento multifuncional");

    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via Equipamento multifuncional");

    }

    @Override
    public void copiar() {
        System.out.println("Copiando via Equipamento multifuncional");

    }
}
