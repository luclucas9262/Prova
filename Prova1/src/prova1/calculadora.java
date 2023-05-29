
package prova1;

import java.util.Scanner;


public class calculadora {
    
    private int n1, n2,opc,res,n3,n4;
    
    private Scanner entrada = new Scanner(System.in);
    
    
    
    
    
     //coletar o N1
    public void SetBase(){
        System.out.println("Informe a Base: ");
        this.n1 = entrada.nextInt();
        
    }
    public int GetBase(){
        return this.n1;
    }
    
    //coletar o N2
    public void SetExpoente(){
        System.out.println("Informe o expoente: ");
        this.n2 = entrada.nextInt();
        
    }
    public int GetExpoente(){
        return this.n2;
    
    }
    
    public void CalcPotencia(int n1,int n2){
        res = (int) Math.pow(n1, n2);
        System.out.println(n1+" ^ "+n2+" = "+res);
    }
    
    
    
    
    
    //coleta a opção do usuario
    public void SetOPC(){
        System.out.println("Digite a Opção Desejada: ");
        this.opc = entrada.nextInt();
    }
    
    public int GetOPC(){
        return this.opc;
    }
    
    
    
    
    //recebe o valor fatorial
    public void SetFatorial(){
        System.out.println("Informe o numero: ");
        this.n1 = entrada.nextInt();
    }
    
    public int GetFatorial(){
        return this.n1;
    }
    
    
    //CALCULANDO FATORIAL DE UM NUMERO
    public void CalcFatorial(int n1){
        
      int mult=1; 
      
      for(int i=1; i<=n1; i++){
          mult=mult*i; 
      }   
        System.out.println("Calculando o Fatorial de: "+ this.n1 + " = "+ mult);
    }
    
    
 
    
    //receber valor porcentagem
    public void SetPorcentagem(){
        System.out.println("Digite o Valor Total: ");
        this.n3 = entrada.nextInt();
    }
    public int GetPorcentagem(){
        return this.n3;
    }
    
    
    
    
    //receber valor da taxa
    public void SetTaxa(){
        System.out.println("Digite a taxa da Porcentagem: ");
        this.n4 = entrada.nextInt();
    }
    public int GetTaxa(){
        return this.n4;
    }

    
    
    //calculando a porcentagem em cima do valor
    public void CalcPorcentagem (int n3, int n4){
        
        res =  (n3 * (100/n4));

         System.out.println(""+n3+"% de "+n4+" = "+res);
    }
    
    
    
    
    //Calculando Acrescimo
    public void CalcAcrescimo(int n3, int n4){
       res = (((n3 * 100)/n4)+res) ; 
        System.out.println(""+n3+"% de "+n4+" = "+res);
    }
    
    
    
    
    //calculando desconto
    public void CalcDesconto(int n3, int n4){
       res = (((n3 * 100)/n4)-res) ; 
        System.out.println(""+n3+"% de "+n4+" = "+res);
    }
    
    
    
    
    //Menu que vai Exibir na tela
    public void ExibirMenu(){
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
    public void MsgInvalida(){
        System.out.println("Opção Inválida!");
    }
    
    public void MsgNegativos(){
        System.out.println("Números negativos não são aceitos");
    }
    
    
    //metodo de Sair
    public void Sair (){
        System.out.println("Sistema Encerrrado!");
        System.exit(0);
    }
    
    
}
