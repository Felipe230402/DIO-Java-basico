# DIO-Java-basico
Anotações e atividades realizadas durante o curso de Java básico na DIO

# Primeira semana 
- Sintaxe
    # Anatomia de classe: 
    A escrita de um programa é feita através da composição de palavras pré-definidas 
    pela linguagem com as expressões que utilizamos para determinar o nome dos nossos
    arquivos, classes, atributos e métodos. É muito comum mesclarmos expressões no 
    idioma americano (inglês) com o nosso vocabulário. Existem projetos que recomendam 
    que toda a implementação do seu programa seja escrita na língua inglesa.

    # Classes: 
    - Toda classe precisa existir dentro do diretório "src" do projeto;
    - O nome precisa ter inicial maiúscula;
    - Se houver palavras compostas, cada inicial deve ser maiúscula;
    - A classe deve possuir o mesmo nome do arquivo .java.
    <!--
    Exemplo:
    //arquivo: Calculadora.java
    public class Calculadora{
    }
    -->

    # Variáveis:
    Toda variável deve ser declarada com letra minúscula, porém se a palavra for composta,
    a primeira letra da segunda palavra deverá ser maiúscula. O nome dessa prática para 
    nomear variáveis dessa forma se chama "camelCase".
    Existe uma regra adicional para variáveis quando na mesma queremos identificar que ela
    não sofrerá alteração de valor.
    <!-- 
    Exemplo: 
    String BR = "Brasil"
    double PI = 3.14
    int ESTADOS_BRASILEIROS = 27
    int ANO_2000 = 2000
    -->
    Se eu quiser criar uma variável imutável, posso colocar a palavra "final" antes do tipo
    de variável.
    <!--
    Exemplo
    final String BR = "Brasil"
    -->
    Dessa forma, se eu tentar reatribuir outro valor a essa variável, o compilador emitirá 
    um erro. 
    CONVENÇÃO: em constantes, geralmente usamos "static final" e o nome em CAIXA_ALTA.

    # Declaração de variáveis: 
    - Deve conter apenas letras, _ (underline), $ ou números de 1 a 9; 
    - Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ (underline) ou $, JAMAIS números;
    - Deve se iniciar com letras minúsculas (boa prática);
    - Não pode conter espaços;
    - Não pode usar palavras-chave da linguagem;
    - O nome deve ser único entro de um espaço.

    # Métodos: 
    A declaração de métodos em Java segue uma estrutura bem simples:
    <!--
    TipoRetorno NomeObjjetivoNoInfinitivo Parametro(s)
    Exemplo: 
    Int somar(int num1, int num2)
    -->

    # Identação: 
    Basicamente indetar é um termo utilizado para escrever o código de um programa de forma hierárquica,
    facilitando assim a visualização e o entendimento do programa. 

    # Organizando arquivos: 
    À medida em que o sistema vai evoluindo, surgem novos arquivos (código fonte) na estrutura de 
    arquivos do projeto. Isso exige que seja realizado uma organização destes arquivos através de 
    pacotes (packages).
    * As empresas costumam ter segmentos:
    - Comercial => com;
    - Organizacional => org;
    - Opensource => Opensource ou org.

    # Java Beans: 
    Uma das maiores dificuldades na programação é escrever algoritmos legíveis a níveis que sejam 
    compreendidos por todo o time ou pelo próprio programdador que o escreveu, no futuro. Para isso
    a linguagem Java sugere, através de convenções, formas de escrita universal para as classes, 
    atributos, métodos e pacotes.    