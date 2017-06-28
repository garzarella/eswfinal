package MetodoBisseccao;

import Funcoes.Funcoes;
import javax.swing.JOptionPane;

public class Bisseccao {

    public static void main(String[] args) {

        MetodoBisseccao metodoBisseccao = new MetodoBisseccao();

        String s = "Método da Bissecção\n";
        s += "Xn: " + metodoBisseccao.bisseccao(1, 2, 0.01);

        JOptionPane.showMessageDialog(null, s, s, 0);

    }
}

class MetodoBisseccao {

    public double bisseccao(double a, double b, double tolerancia) {
        //onde A é o início do intervalo e B o final do intervalo a ser avaliado

        Funcoes funcoes = new Funcoes();

        int iteracoes = 0;
        double xn;
        double fxn;
        double fa;
        double erro = Math.abs((b - a) / 2);

        do {

            iteracoes++;

            if (iteracoes > 1) {
                erro = Math.abs((b - a) / 2);
            }

            xn = (a + b) / 2;
            fxn = funcoes.funcaoL2Q1(xn);
            fa = funcoes.funcaoL2Q1(a);

            System.out.println("\nIteração: " + iteracoes + "\nA: " + a + "\nB: " + b + "\nXn: " + xn + "\nF(Xn): " + fxn + "\nErro: " + erro);

            if (fxn * fa > 0) {
                a = xn;
            } else {
                b = xn;
            }

         } while (erro >= tolerancia && iteracoes < 100);

        return xn;

    }

}