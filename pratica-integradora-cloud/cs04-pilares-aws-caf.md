# Pilares do AWS Well-Architected Framework

## Pilar de excelência operacional

Dizer que algo representa um pilar é o mesmo que dizer que este fato ou elemento faz parte da estrutura fundamental que dá sustentação a algo maior, ao seu todo. Um conceito portado da construção covil que representa as bases de sustentação do AWS Well-Architected Framework e desta forma apresentam os Pilares da excelência operacional, da segurança, da confiabilidade, da eficiência, performance e por fim, da otimização de recursos.

Vamos começar definindo o Pilar da excelência operacional que aborda a estrutura de suporte ao processo de desenvolvimento e execução das cargas de trabalho de forma eficiente e eficaz. Neste pilar são obtidos diversos insights que auxiliam na melhoria dos processos envolvidos. Aqui é construída uma visão global das melhores práticas dentro do framework. Neste pilar, a excelência é orientada através de 5 princípios de design, conforme o quadro a seguir?

| Princípios   | Descrição    |
|--------------- | --------------- |
| Execução das operações como códigos   | É possível definir toda a sua carga de trabalho (aplicativos, infraestrutura) como código e atualizá-la com código. Você pode implementar seus procedimentos de operações como código e automatizar sua execução acionando-os em resposta a eventos. Ao executar operações como código, você limita o erro humano e permite respostas consistentes aos eventos.   |
| Promoção de modificações gradativas e constantes, reversíveis   | Projete cargas de trabalho para permitir que os componentes sejam atualizados regularmente. Faça alterações em pequenos incrementos que possam ser revertidas em caso de falha (sem afetar os clientes quando possível).   |
| Constante refinamento dos processos operacionais   | Ao usar os procedimentos de operação, procure oportunidades para melhorá-los. Conforme você evolui sua carga de trabalho, evolua seus procedimentos adequadamente. Organize dias de jogo regularmente para analisar e validar se todos os procedimentos são eficazes e se as equipes estão familiarizadas com eles.   |
| Antecipação de falhas   | Execute exercícios "pré-mortem" para identificar as potenciais origens de falhas, para que assim elas possam ser removidas ou mitigadas. Testar cenários de falha e validar como você compreende o impacto deles. Teste seus procedimentos de resposta para garantir que eles são eficazes e que as equipes estão familiarizadas com a execução deles. Organize dias de jogo regularmente para testar cargas de trabalho e respostas da equipe a eventos simulados.   |
| Aprendizado constante com falhas e novos processos   | Promova melhorias com as lições aprendidas em todos os eventos e falhas operacionais. Compartilhe o que foi aprendido com as equipes e a organização inteira.   |


O tratamento da carga de trabalho é o ponto central deste princípio e significa que a gestão do projeto, seja de implantação da migração para a nuvem ou do desenvolvimento de alguma aplicação, deve buscar grande fonte de informações capazes de oferecer um cenário interno preciso, com suas métricas, logs e eventos que permitam seu rastreamento.

Desta forma, são oferecidas formas de se construir os processos destinados a oferecer a telemetria vital para o monitoramento da integridade da carga de trabalho, emitindo alertas quando esta carga de trabalho alcança níveis críticos para que as respostas sejam ágeis e assertivas. Pois de acordo com AWS (2020), com uma carga de trabalho instrumentada, um robusto conjunto de informações deve ser coletado de forma a permitir a construção de uma precisa percepção situacional, com suas possíveis alterações de estado, as atividades dos usuários, os acessos aos privilégios e por fim, os contadores de uso.

## Pilar de segurança

A proteção de dados é um aspecto do desenvolvimento de aplicações que sempre demanda grande atenção, e ao se tornar um pilar do AWS Well-Architected Framework, representa guias e boas práticas destinadas a proteger com eficiência e eficácia os dados da empresa na nuvem. Desta forma, este princípio apresenta sua forma própria design, as melhores práticas e perguntas para que a empresa aplique sempre as melhores tecnologias na proteção dos dados.

O primeiro aspecto deste princípio diz respeito a implementação de uma base de identidade forte onde o primeiro passo está em criar o privilégio mínimo e promover autorizações específicas a cada recurso AWS que a empresa utilizar. Em seguida, deve-se monitorar, criar alertas e auditar todas as ações no ambiente, algo que pode ser conquistado com o uso de logs e métricas do sistema, inclusive com ações automatizadas.

O princípio da segurança determina que vários controles de segurança devem ser implementados em todas as camadas, como na borda de rede, no VPC, no processo de balanceamento de carga de trabalho, em cada instância, etc... Reforçando o conceito, temos que as melhores práticas de segurança devem ser automatizadas para que sejam mais responsivas e que gerem um menor custo ao projeto, onde a AWS (2020,p.14), recomenda a criação de "[...]arquiteturas seguras, incluindo a implementação de controles definidos e gerenciados como códigos em modelos controlados por versão."

Um detalhe importante, e que a primeira vista soa exótico, diz respeito a criação de mecanismos como criptografia e a criação de tokens como forma de manter, ao menos parcialmente, uma separação entre o usuário e seus dados, evitando seu acesso direto.

## Pilar de confiabilidade

Este pilar se destina a oferecer as condições para que a carga de trabalho desenhada possa realizar as tarefas cabíveis e de forma constante, esperada. Dentro de seu escopo, este pilar auxilia a empresa a estabelecer a forma de operação e teste desta carga de trabalho dentro de seu ciclo de vida e apresenta 5 princípios de design:

- **Recuperação automática de falhas**: Ao monitorar indicadores-chave de performance (KPIs) de uma carga de trabalho, você pode acionar a automação quando um limite é ultrapassado. Esses KPIs devem ser uma medida do valor empresarial, não dos aspectos técnicos da operação do serviço. Isso permite a notificação automática e o rastreamento de falhas, além de processos de recuperação automatizados que solucionam ou reparam a falha.

- **Testar os procedimentos de recuperação**: Em um ambiente on-premises, geralmente realiza-se o teste para provar que a carga de trabalho funciona em um cenário específico. Normalmente, o teste não é usado para validar estratégias de recuperação.

- **Escale horizontalmente para aumentar a disponibilidade agregada da carga de trabalho**: Substitua um recurso grande por vários recursos pequenos para reduzir o impacto de uma única falha na carga de trabalho geral. Distribua as solicitações por vários recursos menores para garantir que elas não compartilhem um ponto de falha em comum.

- **Parar de tentar adivinhar a capacidade**: Uma causa comum de falha nas cargas de trabalho on-premises é a saturação de recursos, quando as demandas impostas a uma carga de trabalho excedem a capacidade dela. Geralmente, esse é o objetivo dos ataques de negação de serviço.

- **Gerencie as alterações na automação**: Alterações na sua infraestrutura devem ser feitas por meio de automação. Dentre aquelas que precisam ser gerenciadas estão as alterações na automação, que podem ser acompanhadas e analisadas. (AWS 2020,p.20).

Embora a codificação seja o coração de um sistema na nuvem, garantir sua carga de trabalho é vital para que o usuário do sistema tenha uma experiência de qualidade, o que justifica a aplicação deste pilar de confiabilidade.

## Pilar de eficiência de performance

Mesmo que provedores como a AWS possuam uma gigantesca capacidade operacional, mecanismos de controle e confiabilidade, o uso indiscriminado e sem estrutura de seus recursos não deve garantir eficiência ou performance adequadas, isso demanda uma construção consciente, tal como determina seu pilar de eficiência de performance.

Este pilar atua também na garantia de que os requisitos do sistema estão sendo atendidos, inclusive com a contínua mudança desta demanda com o tempo e apresenta 5 princípios de design, começando pela democratização das tecnologias avançadas. Neste primeiro princípio de design a aplicação de tecnologias inovadoras e avançadas deve ficar a cargo do provedor, que possui expertise no assunto, onde o foco é evitar que a equipe interna da empresa tenha que buscar tal implementação.

O passo seguinte, o segundo princípio de design, diz respeito ao uso das diversas zonas de disponibilidade para a conquista da menor latência possível resultado em aplicações mais responsivas com melhor experiência de usuário a um custo modesto. O terceiro elemento deste princípio diz respeito ao design de uso do sistema com a arquitetura serverless e como tal arquitetura pode auxiliar a empresa a executar suas aplicações com maior agilidade, uma vez que no modelo serverless o gerenciamento dos containers fica a cargo do sistema operacional do provedor, onde somente seu núcleo é compartilhado.

Por fim, este princípio recomenda que a empresa experimente os diversos recursos virtuais automatizáveis, pois permitem diversos testes comparativos que podem levar a mudanças que aprimorem a performance da aplicação. Considerar a afinidade mecânica é o último princípio de design: a busca pela compreensão do funcionamento dos serviços do provedor na busca pelos que se enquadram melhor nas necessidades da empresa.

## Pilar de otimização de custos

Embora a busca pelo lucro do provedor seja algo básico, fundamental, como resultado da relação comercial entre provedor e cliente dos serviços em nuvem, frameworks, como o AWS Well-Architected Framework, são construídos sob a perspectiva do ganha-ganha, pois promovem o melhor uso da plataforma AWS com o menor custo ao cliente.

A essência deste pilar está em melhorar o desempenho do que a empresa usa, dentro da infraestrutura da AWS, buscando reduzir, sempre que possível, seu custo através dos seus princípios de design de otimização:

- **Implemente o gerenciamento financeiro na nuvem**: para obter sucesso financeiro e acelerar a realização de valor empresarial na nuvem, você precisa investir em gerenciamento financeiro na nuvem/otimização de custos. Sua organização precisa dedicar o tempo e recursos para criar aptidão nesse novo domínio de tecnologia e gerenciamento de uso.

- **Adote um modelo de consumo**: Pague somente pelos recursos de computação necessários e aumente ou reduza o uso dependendo dos requisitos comerciais, sem usar previsões elaboradas. Por exemplo, ambientes de desenvolvimento e teste são geralmente usados apenas por 8 horas ao dia durante a semana de trabalho.

- **Avalie a eficiência geral**: Meça o resultado comercial da carga de trabalho e os custos associados com sua entrega. Use essa medida para saber os ganhos obtidos com o aumento da saída e a redução de custos.

- **Pare de gastar dinheiro em taregas pesadas genéricas**: A AWS faz o trabalho pesado das operações de datacenter, como o armazenamento em rack, o empilhamento e a alimentação de servidores. Ele também elimina a sobrecarga operacional do gerenciamento de sistemas operacionais e aplicativos com serviços gerenciados. Isso permite que você mantenha o foco em seus clientes e projetos de negócios e não na infraestrutura de TI.

- **Analise e atribua despesas**: A nuvem facilita a identificação precisa do uso e do custo dos sistemas, o que permite a atribuição transparente de custos de TI a proprietários de cargas de trabalho individuais. (AWS 2020, p.33)

O volume de requisições de uma aplicação pode ser previsto na sua fase de projeto e implementação, mas os esforços da equipe de marketing da empresa, ou o simples aumento de faturamento, podem elevar os números e provocar dois grandes impactos: na carga de trabalho e no custo da plataforma. Este princípio tem como objetivo mostrar as melhores práticas de uso da infraestrutura da AWS combinadas com as mais efetivas estratégias de precificação e compra de pacotes.
