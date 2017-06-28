package MetodoPontoFixo;

import Funcoes.Funcoes;

public class PontoFixo {
 
    public static void main(String[] args) {

        MetodoPontoFixo metodoPontoFixo = new MetodoPontoFixo();

        String s = "Método do Ponto Fixo\n";
        s += "Xn: " + metodoPontoFixo.pontoFixo(1.5, 0.001);

//        JOptionPane.showMessageDialog(null, s, s, 0);
    
}
    
}

class MetodoPontoFixo{
    
    public double pontoFixo(double pf, double tolerancia){
        
        //onde pf é o Ponto Fixo, de início do algoritmo.
        
        //Para usar deve-se mudar o sinal da segunda derivada (sinal_f2lxn)

        Funcoes funcoes = new Funcoes();
        Funcao funcao = new Funcao();

        int iteracoes = 0;
        double xn = pf;
        double xnmais1 = 0;
        double fxn;

        double erro = Double.NaN;
        
         do {

            iteracoes++;
            
            fxn = funcao.funcaoDeIteracaoExemplo(xn);
            xnmais1 = fxn;

            if (iteracoes > 1) {
                erro = Math.abs((xnmais1 - xn) / 2);
            } else erro = Double.POSITIVE_INFINITY;
            
            xn = xnmais1;
            
            System.out.println("\nIteração: " + iteracoes + "\nXn: " + xn + "\nF(Xn): " + fxn + "\nErro: " + erro);
            
         } while (erro >= tolerancia && iteracoes < 100);
        
        return xn;
        
    }

}

class Funcao {

    public double funcaoDeIteracaoExemplo(double x) {

        double fx;

        return fx = Math.sqrt((6 - x));

    }

}
