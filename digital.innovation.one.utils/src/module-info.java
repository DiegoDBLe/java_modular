module digital.innovation.one.utils {
    exports digital.innovation.one.utils.operacao to digital.innovation.one.module;
    //Aqui eu digo que estou exportando meu modulo para o pacote digital.innovation.one.module;
    // ou seja somente ele consegue ter acesso ao meu modulo> digital.innovation.one.utils.operacao minha
    // classe Calculadora. Ou seja não tem acesso ao meu pacote interno onde esta minhas classes de operações.
    // Se eu tirar o "to" qualquer outro pacote modulo pode ter acesso ao pacote digital.innovation.one.utils.operacao
    // A modulação  Melhorar a organização e desempenho restringindo o acesso as classe e projetos.
}