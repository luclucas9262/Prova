package prova1;

public class Prova1 {

    public static void main(String[] args) {

        calculadora c = new calculadora();

        do {
            c.ExibirMenu();
            c.SetOPC();

            if (c.GetOPC() == 0) {
                c.MsgInvalida();

            }
            
            
            if (c.GetOPC() == 1) {
                c.SetBase();
                c.SetExpoente();
                if (c.GetBase() <= 0 || c.GetExpoente() <= 0) {
                    c.MsgNegativos();

                } else {
                    c.CalcPotencia(c.GetBase(), c.GetExpoente());
                }

            }
            
            
            if (c.GetOPC() == 2) {
                c.SetFatorial();
                c.CalcFatorial(c.GetFatorial());

            }

            if (c.GetOPC() == 3) {
                c.SetPorcentagem();
                c.SetTaxa();
                c.CalcPorcentagem(c.GetPorcentagem(), c.GetTaxa());
            }

        } while (c.GetOPC() >= 1 && c.GetOPC() <= 6);

    }

}
