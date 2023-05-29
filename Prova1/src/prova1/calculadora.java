package prova1;

import java.util.Scanner;

public class calculadora {

    private int n1, n2, opc, res, n3, n4, n5, n6, n7, n8;

    Scanner entrada = new Scanner(System.in);

    //coletar o N1
    public void SetBase() {
        System.out.println("Informe a Base: ");
        this.n1 = this.entrada.nextInt();

    }

    public int GetBase() {
        return this.n1;
    }

    //coletar o N2
    public void SetExpoente() {
        System.out.println("Informe o expoente: ");
        this.n2 = this.entrada.nextInt();

    }

    public int GetExpoente() {
        return this.n2;

    }

    public void CalcPotencia(int n1, int n2) {
        this.res = (int) Math.pow(n1, n2);
        System.out.println(n1 + " ^ " + n2 + " = " + this.res);
    }

    //coleta a opção do usuario
    public void SetOPC() {
        System.out.println("Digite a Opção Desejada: ");
        this.opc = this.entrada.nextInt();
    }

    public int GetOPC() {
        return this.opc;
    }

    //recebe o valor fatorial
    public void SetFatorial() {
        System.out.println("Informe o numero: ");
        this.n1 = this.entrada.nextInt();
    }

    public int GetFatorial() {
        return this.n1;
    }

    //CALCULANDO FATORIAL DE UM NUMERO
    public void CalcFatorial(int n1) {

        int mult = 1;

        for (int i = 1; i <= n1; i++) {
            mult = mult * i;
        }
        System.out.println("Calculando o Fatorial de: " + this.n1 + " = " + mult);
    }

    //receber valor porcentagem
    public void SetPorcentagem() {
        System.out.println("Digite o Valor Total: ");
        this.n3 = this.entrada.nextInt();
    }

    public int GetPorcentagem() {
        return this.n3;
    }

    //receber valor da taxa
    public void SetTaxa() {
        System.out.println("Digite a taxa da Porcentagem: ");
        this.n4 = this.entrada.nextInt();
    }

    public int GetTaxa() {
        return this.n4;
    }

    //calculando a porcentagem em cima do valor
    public void CalcPorcentagem(double n3, double n4) {

        this.res = (int) ((int) n3 * (n4 / 100));

        System.out.println("" + n4 + "% de " + n3 + " = " + this.res);
    }

    //Calculando Acrescimo
    public void CalcAcrescimo(double n5, double n6) {
        this.res = (int) ((int) n5 * (n6 / 100));
        System.out.println("" + n5 + "% de " + n6 + " =  de Juros " + (this.res + n5));
    }

    //calculando desconto
    public void CalcDesconto(double n7, double n8) {
        this.res = (int) ((int) n7 * (n8 / 100));
        System.out.println("" + n7 + "% de " + n8 + " = de Desconto " + (this.res - n7));
    }

    //Menu que vai Exibir na tela
    public void ExibirMenu() {
        System.out.println("*******MENU CALCULADORA**************");
        System.out.println("* 1 - Cálculo de Potência           *");
        System.out.println("* 2 - Cálculo de Fatorial           *");
        System.out.println("* 3 - Cálculo de Porcentagem        *");
        System.out.println("* 4 - Cálculo de Acréscimo de %     *");
        System.out.println("* 5 - Cálculo de Desconto de %      *");
        System.out.println("* 6 - Identificar Par/Impar         *");
        System.out.println("* 7 - Sair do Sistema               *");
        System.out.println("*************************************");

    }

    //Menssagens Exibidas
    public void MsgInvalida() {
        System.out.println("Opção Inválida!");
    }

    public void MsgNegativos() {
        System.out.println("Números negativos não são aceitos");
    }

    //metodo de Sair
    public void Sair() {
        System.out.println("Sistema Encerrrado!");
        System.exit(0);
    }

}
