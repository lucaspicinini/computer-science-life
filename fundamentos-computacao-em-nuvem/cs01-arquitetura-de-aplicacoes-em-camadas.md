# Arquitetura de aplicações em camadas

Nesta aula vamos fazer um alicerce para compreensão da arquitetura de camadas, com um viés claro nas aplicações cloud. Falaremos das evoluções das camadas, de seus números e de como esta implementação revolucionou o modelo base cliente servidor.

## Conceitos de arquitetura em camadas

Vamos começar tratando de compreender o que vem a ser arquitetar algo. Com isso, descobriremos que apesar do termo ter muita relação com a construção física das coisas, como todas as palavras do dicionário, carrega um conceito em seu significado, que passou a ser muito utilizado no universo da informática.

Bem, me considero jovem, mas pude testemunhar a informática dar os seus maiores passos saindo da arquitetura de 16 bits para 32. Isso representa, dentre outras mudanças, quantos endereços de memória um sistema suporta. Claro que hoje estamos vivendo a era dos 64 bits, temos registradores de memória morando dentro dos CPU's. Todo este papo de bits e evolução foi para compreender que a arquitetura representa um elemento muito importante na informática e sua evolução mexe (e muito) com a humanidade.

Vamos para algumas conceituações, começando com a concepção de Fowler (2007, p.23) para arquitetura. Mesmo com o autor acreditando que se trata de um termo que vem sendo usado de forma bastante ampla, (você percebeu isso com o que já falamos sobre a arquitetura dos computadores),

> "Arquitetura" é um termo que muita pessoas, com pouca concordância entre si, tentam definir. Existem dois elementos comuns: um é a decomposição em alto nível de um sistema em suas partes; o outro são decisões difíceis de alterar. [...] existem diversas arquiteturas em um sistema, e a visão do que é significativo em termos de arquitetura pode mudar durante o ciclo de vida de um sistema.

De acordo com as palavras de Fowler, podemos encaixar perfeitamente o que estamos aqui para discutir e compreender: os softwares são construções que podemos decompor em partes, e, assim como na construção civil, cada sistema tem uma arquitetura e segue uma filosofia que guia a abordagem de sua construção. Vamos tratar da construção da arquitetura em camadas. Embora existam diversas, são a base dos serviços de Cloud Computing.

Partindo então para as tais camadas na sistematização da arquitetura, os sistemas, podemos fazer um paralelo com a própria arquitetura de um computador pessoal. Quando um professor de ensino técnico tenta explicar aos seus estudantes a diferença entre hardware e software, uma das abordagens é a de mostrar o sistema operacional em relação aos periféricos e componentes como placas de sistema, placas mãe, memórias e discos.

Este professor vai tratar a interface gráfica do computador como uma camada intermediária entre os periféricos de entrada (mouse e teclado) e o software que o usuário desejar operar. Portanto temos, em um computador pessoal, os dispositivos de entrada, o sistema operacional, e os dispositivos de saída (monitor, caixas de som, impressoras) como camadas bem definidas.

Partindo para um detalhamento do que as camadas representam para um sistema, vamos encontrar a interface de usuário como a primeira camada. Isto é do ponto de vista do usuário, claro, afinal não seria nada prático usar um sistema direto em seu código fonte ou até mesmo em modo texto, como nos primórdios da era pré interface gráfica.

Com isso podemos definir melhor o que representa para a produção de software uma arquitetura em camadas. De acordo com Fowler (2007, p.37): ao pensar em um sistema em termos de camadas, você imagina os subsistemas principais no software dispostos de forma parecida com camadas de um bolo em que cada camada repousa sobre uma camada mais baixa.
