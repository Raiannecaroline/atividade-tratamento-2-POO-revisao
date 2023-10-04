# Atividade de Fixação - POO

1 - Lista cinco exemplos de exceções comuns:

- IOException
- ArrayIndexOutOfBoundsException
- NullPointerException
- FileNotFoundException
- OutOfMemoryError

----------------------------------------------------------

2 - Por que as técnicas de tratamento de exceções não devem ser utilizadas
para controle convencional de programação?

<b>R: </b>Porque tratamento de exceções não devem ser usados em um fluxo normal do programa, 
o uso pode prejudir e até deixar o código mais difícil.
Além disso, exceções lidam apenas com coisas inesperadas no programa e devem ser usados em casos excepcionais.

----------------------------------------------------------

3 - Se nenhuma exceção for disparada em um bloco try, para onde segue o
controle quando o bloco try completa a execução?

<b>R: </b> O código segue para o finally, que fechará o tratamento de exceções.

----------------------------------------------------------

4 - O que acontece se ocorrer uma exceção e um tratador de exceções
apropriado não puder ser localizado?

<b>R: </b> Se o tratador de exceções não puder ser encontrado, a exceção vai se propagar no método pai. 
Repetindo o processo até que o tratador de exceções seja encontrado ou o método main alcançado.

Ou caso não for tratado no método main, a aplicação vai se encerrar abruptamente.

----------------------------------------------------------

5 - O que acontece se vários tratadores correspondem ao tipo de objeto
disparado?

<b>R: </b> O primeiro na ordem vai ser disparado.

----------------------------------------------------------

6 - Qual é a razão fundamental para utilizar blocos finally?

<b>R: </b> Os blocos finally servem para dar um close no tratamento da execução, 
assim que passar tanto no try quanto no catch, mesmo que algo dê errado.

----------------------------------------------------------

7 - O que acontece quando um tratador catch dispara uma Exception?

<b>R: </b> Ele vai pegar a mensagem do erro e passar ao desenvolvedor.

----------------------------------------------------------

8 - O que acontece com uma referência local em um bloco try quando esse
bloco dispara uma Exception?

<b>R: </b> A referência local é recolhida pelo garbage collector e não pode ser mais acessada após a execução ser lançada.

