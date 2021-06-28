package digital.innovation.one.utils.operacao;

import digital.innovation.one.utils.operacao.interno.DivHelp;
import digital.innovation.one.utils.operacao.interno.MultHelp;
import digital.innovation.one.utils.operacao.interno.SubHelp;
import digital.innovation.one.utils.operacao.interno.SumHelp;

public class Calculadora {

    //Atributos
    private DivHelp divHelp;
    private MultHelp multHelp;
    private SubHelp subHelp;
    private SumHelp sumHelp;


    //Construtor
    public Calculadora(){
        divHelp = new DivHelp();
        multHelp = new MultHelp();
        subHelp = new SubHelp();
        sumHelp = new SumHelp();
    }

    //Métodos
    public int sum (int a, int b){
        return sumHelp.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelp.execute(a,b);
    }
    public int mult(int a, int b){
        return multHelp.execute(a,b);
    }
    public int div(int a, int b){
        return divHelp.execute(a,b);
    }
}
