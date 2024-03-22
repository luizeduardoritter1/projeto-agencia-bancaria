package utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

// Foi usado a função do java "NumberFormat para formatar os valores e logo após apresentado o modelo de como os valores serão mostrados "
public class Utils {
    static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");

    // Aqui convertemos os valores de double para String, que recebe como parametro
    // um valor double
    public static String doubleToString(Double valor) {
        return formatandoValores.format(valor);
    }

}
