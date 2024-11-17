# Introdução ao Angular

Nessa disciplina de desenvolvimento mobile iremos abordar a construção de aplicativos com tecnologia híbrida, nesse tipo de tecnologia usamos de ferramentas web como html, Javascript e Typescript para construção do aplicativo, e convertemos ele no final para cada dispositivo, de forma a termos apenas uma única base de código para IOS e Android.

Uma abordagem diferente poderia ser a construção nativa em cada plataforma, utilizando-se de linguagens e dos recursos diferentes de cada plataforma. Cada abordagem tem suas vantagens e desvantagens, por exemplo, a construção híbrida é mais produtiva pois mantém uma mesma equipe com tecnologias que são usadas em desenvolvimento web em todas as plataformas (IOS, Android), já a abordagem nativa consegue extrair maior performance e tem visual mais consistente com o sistema operacional da plataforma utilizada. Hoje em dia existem abordagens híbridas que vão um pouco além, utilizando-se de tecnologias web ou linguagens comuns com C# para compilar o código em códigos nativos das plataformas, nesses casos a aparência e performance é similar a nativa. Exemplos de tecnologias que fazem isso são o Nativescript (que também pode utilizar o Angular) e o Xamarin (que usa C#).

Na disciplina iremos utilizar os frameworks Angular e o Ionic para construção de telas, o Ionic nos permite criar componentes com aparência mobile, acessar recursos nativos dos aparelhos e distribuir o aplicativo final para cada plataforma. Já o angular é a base do framework para construção tanto de aplicativos web, quanto mobile em conjunto com o Ionic

Podemos então dividir a disciplina em duas fases:
compi
1) Fundamentos de Angular - Nesses módulos iremos ter um bom fundamento do funcionamento e das funcionalidades principais do Angular, de forma a capacitar o aluno a construir aplicativos.

2) Adotando o Ionic do Aplicativo - Nesses módulos iremos converter o que foi feito em Angular, retendo todos os conhecimentos adquiridos, para usar componentes do Ionic e gerar um aplicativo que possamos simular a implantação em um dispositivo.

## O que é o Angular?

O Angular é um dos frameworks web mais consolidados no mercado, é construído em cima da linguagem de programação Typescript, o que adiciona muito mais segurança e robustez em comparação com a linguagem Javascript, principalmente para projetos grandes, pois introduz conceitos como classes, interfaces, tipagem opcional, checagem de erros pelo compilador, intelisense na IDE, além de uma série de recursos que só estarão presentes no Javascript daqui há alguns anos.

Também é uma vantagem do typescript ser totalmente compatível com o Javascript, sendo que códigos válidos na linguagem Javascript também são válidos em Typescript, as vezes não sendo a melhor maneira de se escrever por possuir a tipagem e outros recursos, mas é possível reaproveitar a sintaxe.

O Angular introduz conceitos como: componentes, módulos, rotas, injeção de dependência, validação de formulários, chamadas http com interceptadores, inputs, outputs para comunicação entre componentes, entre outros que facilitam a arquitetura de um aplicativo frontend ou mobile.

Na minha experiência, o Angular é o framework web com o maior número de recursos nativos sem precisar de extensões, que funcionam muito bem em conjunto. Também já traz consigo todo ferramental para fazer o build, minificando os itens e para trabalhar com SASS (compilação de CSS em uma linguagem inspirada nele mas com recursos mais voltados para reaproveitamento de funções e estilos). Porém tem a fama de ter uma curva de aprendizado maior que os outros concorrentes.

## Setup de Ambiente

Para o setup do ambiente pode-se utilizar qualquer sistema operacional principal, MacOs, Linux, Windows. As instruções específicas se encontram nos sites compartilhados, no entanto deixo aqui um overview com os passos necessários:

1. Instale o NodeJS, que trará consigo o NPM – O Angular não é um aplicativo node, mas assim como quase todos os outros frameworks web modernos, utiliza de ferramentas do node para fazer o build, servir os arquivos, baixar dependências, entre outras tarefas.

2. Instale o Angular CLI – Esse utilitário de linha de comando permite que você crie um projeto novo, adicione componentes, módulos, entre outras coisas. Particularmente, não utilizo muito além da criação do projeto inicial.

3. Instale um editor de código compatível – Recomendo o uso do Visual Studio Code (VSCode) por ser gratuito e ter um suporte a typescript com Angular muito robusto. Outra opção excelente é o Intellij, ou Webstorm (são a mesma ferramenta em versões diferentes). Não recomendo o uso de eclipse por dois motivos: O suporte a Typescript, Javascript, HTML e CSS é maçante, e é uma IDE muito pesada com diversos pontos que não funcionam corretamente na minha experiência.

Obs.: É interessante instalar o NodeJs como usuário sem permissões de administrador para que comandos que instalam módulos ou linhas de comando globais funcionem sem dores de cabeça, mas não é um requisito obrigatório. Por isso vou deixar links para instalações alternativas além das oficiais.

Após instalar o NodeJS instale o Angular CLI abrindo um prompt de comando e digitando:

> npm install -g @angular/cli

Se estiver usando Windows, antes precisará habilitar a execução de scripts que é necessário para instalar binários globais do NPM. Rode o comando:

Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy RemoteSigned

Links:

NodeJS: https://nodejs.org/en/

Vscode: https://code.visualstudio.com/

Intellij/WebStorm: https://www.jetbrains.com/pt-br/webstorm/

Instalação alternativa do NodeJS

Windows: https://scoop.sh/

Após instalar o scoop você pode instar diversas outras ferramentas de desenvolvimento sem necessidade de ser administrador:

> scoop bucket add main

> scoop install nodejs

Ou

> scoop install nodejs-lts

Lts é uma versão estável de longa duração.

Linux e Mac: https://github.com/nvm-sh/nvm

Ferramenta para gerenciar várias instalações do nodejs em versões diferentes

​

## Criando o projeto

Essa etapa é muito simples. Na linha de comando entre em uma pasta que deseje guardar seus projetos, recomendo uma pasta projetos na sua home de usuário (não coloque em pastas que sincronizam com sistemas online como pastas do OneDrive).

Comandos:

> mkdir Projetos

> cd Projetos

> ng new primeiro-angular-app

Após responder algumas perguntas:

Gostaria de adicionar rotas no angular? Sim

Selecione um formato de estilo: css

Ele irá criar o projeto e já baixar as dependências para o mesmo.

Para baixar as dependências de bibliotecas do NPM o angular entra na pasta do projeto e roda o comando:

> npm install

Entre na pasta do projeto e rode-o com o comando:

> cd meu-primeiro-angular-app

> npm run start

Abra um navegador na url informada pelo angular que ficará acessível somente na sua máquina: http://localhost:4200/

Vai mostrar uma página inicial do tipo:

Figura 1, aplicação angular.


Fonte: Elaborado pelo autor, 2023.

Pronto, criamos o ambiente, agora vamos abordar sobre a organização das pastas.


## Organização das Pastas

Quando abrir o projeto na sua IDE irá ver a seguinte estrutura:

Figura 2, Organização de pastas.




Fonte: Elaborado pelo autor, 2023.

Na pasta raiz temos:

• .angular – caches e informações de build, não se preocupe com ela, deve estar ignorada no git.

• .vscode – como usei o vscode no exemplo ele cria essa pasta.

• node_modules – pasta importante mas que deve ser ignorada no controle de versão, nessa pasta tem todas as dependências baixadas com o comando npm install.

• src – aqui fica o código fonte da nossa aplicação.

• .editorconfig – arquivo com seta configurações de estilo padrão que serão respeitadas pelos editores de IDE compatíveis.

• angular.json – arquivo contendo configurações sobre como o projeto terá seu build feito, que pode ter configurações de ambientes distintos (exemplo homologação, produção, local).

• package-lock.json – arquivo criado pelo npm install com o objetivo de gerenciar as versões instaladas e não permitir que atualizações para versões diferentes quebrem a aplicação. É como se fosse um cache.

• package.json – arquivo onde são declaradas todas as dependências que a aplicação possui.

• README.md – esse arquivo é geralmente usado para dar instruções de como iniciar com um projeto.

• tsconfig.app.json – uma configuração do typescript específica para angular. Não precisa se preocupar com esse arquivo, o angular cli gerência para nós.

• tsconfig.json – configurações de como o typescript irá se comportar, como qual versão do Javascript ele irá compilar, se irá gerar o sourcemapping (para debugar o código real ao invés do compilado), restrições de linguagem, entre outros. Geralmente não modificamos esse arquivo a não ser que seja preciso mudar algum comportamento específico de linguagem.

• tsconfig.spec.json – mesmo princípio do tsconfig.app.json, porém para os testes unitários.

Geralmente esses arquivos citados não são modificados.

Agora vamos ver qual a estrutura do código fonte.

Figura 3, Pasta src.

Fonte: Elaborado pelo autor, 2023.

Dentro da pasta src, temos:

• favicon.ico – apenas um ícone da página.

• index.html – Ponto de entrada da aplicação.

• main.ts – faz o bootstrap do framework angular, geralmente não modificamos esse arquivo.

• styles.css – Arquivos css para nossa aplicação.


Dentro do arquivo index.html temos uma tag:

> <app-root></app-root>

Essa tag irá instanciar um componente customizado do angular, no caso o app.component.ts.

Vamos ver a estrutura da pasta app:

• app-routing.module.ts – configurações de rota do angular. Iremos abordar sobre rotas em outros módulos, mas tenha em mente que é uma forma de navegar pela aplicação instanciando componentes e páginas sem recarregar a página principal (single page application).

• app.component.ts – nosso único componente criado como componente principal.

• app.component.html – o HTML do componente app.component.ts.

• app.component.css – o CSS do componente app.component.ts.

• app.module.ts – arquivo importante que configura como as coisas devem instanciar. Iremos abordar sobre módulos mais tarde, mas tenha em mente que o angular é modular e pode ter conjuntos de componentes e serviços em módulos distintos que podem ser reutilizados.

Como podem ver, a maior parte do tempo estaremos trabalhando dentro da pasta src/app.

Pasta de componentes e pasta de pages

Podemos organizar nosso aplicativo angular de diversas maneiras, uma maneira simples é separar o que é página do que é componente.

• Como página temos o que será instanciado pelas rotas ao navegar pelo aplicativo, por exemplo: podemos ter uma página de cadastro de clientes.

• Como componentes teremos os blocos de código reutilizáveis que criarmos, por exemplo: a página de clientes pode ter um cabeçalho, um rodapé e um menu, todos componentes auto contidos.


### Componente Header

Conforme é citado, um componente é um bloco de códigos reutilizáveis em angular, seria como criar legos e montar o nosso aplicativo com eles. Um componente pode vir de uma biblioteca instalada, como o angular material-ui, ou pode ser criado no aplicativo mesmo.

É um dos conceitos fundamentais do angular. Por debaixo dos panos, o angular utiliza uma especificação chamada Web Componentes, que é uma forma de isolar componentes nas páginas web. Mais informações sobre web componentes podem ser vistos neste link: https://developer.mozilla.org/en-US/docs/Web/Web_Components
Para finalizar nosso primeiro módulo vamos criar um componente simples de cabeçalho que iremos reutilizar no app.componet.html, nos próximos módulos vamos criar páginas, rotas para páginas e alguns outros conceitos básicos do angular.

Para isso, siga os passos:

1. Crie uma pasta componentes.

2. Crie o arquivo header.component.ts.

3. Crie o arquivo header.component.html.

Nota: Seguindo as convenções do angular, o arquivo deve-se chamar nomearquivo.tipo.extensão (tipos podem ser service, component, pipe, entre outros).

Na arquivo header.component.ts adicione o seguinte código:


O código acima usa anotações para configurar a nossa classe de componente, no caso, usa o @Component com duas configurações:

• selector – diz ao angular qual a diretiva html que será usada para instanciar o componente, no caso será <app-header></app-header>.

• templateUrl – diz ao angular onde está o html associado ao componente. Outra diretiva possível é o template que traz o conteúdo html como string.

Para o arquivo header.component.html adicione o seguinte código:


Agora edite o arquivo app.component.html, remova tudo que possui lá e adicione algo do tipo:


Precisamos registrar o componente no módulo, para isso edite o arquivo app.module.ts e adicione no array de declarations o componente:


Veremos mais informações sobre módulos em outras documentações, por agora basta saber que o componente deve ser declarado. No final teremos uma página conforme o print screen:

Figura 4, Componente cabeçalho.


Fonte: Elaborado pelo autor, 2023.
