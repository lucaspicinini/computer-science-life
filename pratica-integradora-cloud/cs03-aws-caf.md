# Introdução ao framework

Dentro dos programas e soluções oferecidas pela AWS, que tem o objetivo de aprimorar a experiência do seu usuário, existe um framework, um conjunto de sistemas e ferramentas, destinado a permitir que seus clientes aproveitem o melhor dos recursos disponíveis. Este processo é feito de diversas formas, e inclui a ação constante de consultores capazes de expor ao cliente quais são as vantagens e desvantagens da arquitetura dentro dos projetos em desenvolvimento.

Este processo de acompanhamento é constante e, desta forma, novos insights são oferecidos de acordo com a evolução do desenvolvimento do sistema, pois a cada nova implementação, os consultores ganham novos detalhes que os permitem indicar a sequência de uso dos recursos que otimizem este desenvolvimento.

Esta instrução de acompanhamento gerou um sistema denominado AWS Well-Architected Framework, um pacote extensamente desenvolvido de melhores práticas dentro das suas arquiteturas e sistemas. O AWS Well-Architected Framework possui 5 pilares, sendo excelência operacional, segurança, confiabilidade, eficiência de performance e otimização de custos, descritos no quado a seguir:

| Pilar | Descrição |
| -------------- | --------------- |
| Excelência Operacional | A capacidade de apoiar o desenvolvimento e executar cargas de trabalho com eficácia, obter insights sobre as operações e melhorar continuamente processos e procedimentos de suporte para oferecer valor empresarial. |
| Segurança | O pilar Segurança refere-se à capacidade de proteger dados, sistemas e ativos para utilizar as tecnologias de nuvem para melhorar sua segurança. |
| Confiabilidade | O pilar Confiabilidade abrange a capacidade de uma carga de trabalho de executar a função pretendida correta e consistentemente quando esperado. Isso inclui a capacidade de operar e testar a carga de trabalho durante todo o ciclo de vida dela. Este documento fornece orientações detalhadas sobre as melhores práticas para a implementação de cargas de trabalho confiáveis na AWS. |
| Eficiência de performance | A capacidade de usar recursos de computação com eficiência para atender aos requisitos do sistema e manter essa eficiência a medida que a demanda muda as tecnologias evoluem. |
| Otimização de recursos | A Capacidade de executar sistemas para entregar o valor empresarial ao menor preço. |


A estrutura dos pilares não é fixa, pois cada empresa vai promover concessões entre o que define cada pilar, para que se adeque ao seu modelo de negócio e desta forma tendem a privilegiar algum aspecto do projeto, seja a engenharia do sistema em produção ou a redução de custos, e até mesmo a confiabilidade do sistema pode ser dinamicamente trabalhada.

A dinâmica da confiabilidade pode ser tratada de forma que apresente menor intensidade quando em um ambiente de desenvolvimento e passar a ser otimizada quando o sistema estiver em uso por seus clientes.

## A influência do framework para os projetos

Uma forma de compreender o impacto do uso do AWS Well-Architected Framework está no ponto de vista da estratégia de desenvolvimento das aplicações e a distribuição de atribuições e responsabilidades. Em uma estrutura de projeto comumente utilizada existem equipes, como a equipe técnica responsável pela infraestrutura, a equipe de soluções de software, uma equipe para banco de dados, uma para redes, por fim, uma para segurança.

Mas na AWS os recursos são distribuídos pelas equipes, e não as equipes atribuídas nos recursos, sem deixar de lado que cada equipe deve manter sua capacidade de tomada de decisão. Este processo é acompanhado por especialistas AWS destinados a levar as equipes de desenvolvimento aos padrões de qualidade das boas práticas.

Na arquitetura, isso significa que esperamos que todas as equipes tenham a capacidade de criar arquiteturas e seguir as melhores práticas. Para ajudar as novas equipes a chegar nessa capacidade ou as equipes existentes a elevarem seus padrões, viabilizamos o acesso a uma comunidade virtual de engenheiros principais que podem analisar os projetos delas e ajudá-las a entender quais são as melhores práticas da AWS. (AWS 2020,p.04)

Dentro do AWS Well-Architected Framework, uma equipe atua na promoção da visibilidade das melhores práticas, de forma que todos os envolvidos no processo as conheçam e as compreendam. Este processo é realizado de forma educativa com palestras onde tais práticas são transmitidas e gravadas, o que permite seu uso de forma assíncrona. Conforme melhores práticas vão se tornando disponíveis, são trabalhadas de forma que a comunidade tenha acesso e, assim, as equipes são capacitadas e se mantêm atualizadas e caminham para a formalização dos novos processos.

Desta forma, com o uso da abordagem das comunidades, o processo de oferta e instrução das melhores práticas ganha diversos contornos e pode gerar treinamentos e palestras a serem ministrados em momentos alternativos, entre jornadas, por exemplo, sem interromper as atividades normais das equipes.

## Melhores práticas para redes bem arquiteturas

Uma forma direta de compreender a interferência do AWS Well-Architected Framework está em observar seu funcionamento como um compasso, indicando a direção otimizada para as decisões de um projeto criado dentro da infraestrutura da AWS. Assim, este framework exibe os prós e contras destas decisões e com suas melhores práticas, permite criar sistemas eficientes, seguros e com custo reduzido.

Outro ponto positivo do uso deste framework está em permitir uma constante avaliação do processo de desenvolvimento de uma aplicação em relação às melhores práticas. Este processo está inserido dentro das melhores práticas para excelência operacional na nuvem, divididas em 4 áreas:

- **Organização**: Suas equipes precisam ter um entendimento compartilhado de toda a sua carga de trabalho, da função que desempenham em tudo isso e dos objetivos de negócios compartilhados a fim de definir as prioridades que permitirão o êxito dos negócios. (AWS 2020,p.07).

- **Preparar**: Para se preparar para a excelência operacional, você precisa entender suas cargas de trabalho e os comportamentos esperados. Você poderá projetá-las para fornecer insights sobre seu status e  criar os procedimentos para oferecer suporte a elas. (AWS 2020,p.10).

- **Operar**: A operação bem-sucedida de uma carga de trabalho é medida pela obtenção de resultados de negócios e de clientes. Defina os resultados esperados, determine como o sucesso será medido e identifique as métricas que serão usadas nesses cálculos para determinar se a carga de trabalho e as operações foram bem-sucedidas.

- **Evoluir**: Você deve aprender, compartilhar e melhorar continuamente para manter a excelência operacional. Dedique ciclos de trabalho para fazer melhorias incrementais contínuas. Execute uma análise pós incidente de todos os eventos que afetam o cliente. Identifique os fatores que contribuem e a ação preventiva para limitar ou evitar a recorrência. (AWS 2020,p.12).

Dentre as melhores práticas do aspecto da segurança, tem relação à capacidade do sistema em manter protegidos os dados e ativos digitais, e o faz através da aplicação de diversas tecnologias AWS e incluem, além do aspecto segurança, o uso do IAM, estratégias de detecção de ameaças e os sistemas destinados à proteção da infraestrutura e dos dados conforme apresenta o quadro a seguir:

| Tópico   | Descrição    |
|--------------- | --------------- |
| Segurança   | Para operar sua carga de trabalho com segurança, você deve aplicar as melhores práticas gerais em todas as áreas de segurança. Use os requisitos e os processos que você definiu em excelência operacional em nível de carga de trabalho e também organizacional e aplique-os as áreas.   |
| Identity and Access Management   | O Identity and Access Management é parte essencial do programa de segurança da informação, que garante que apenas os usuários autorizados e autenticados possam acessar seus recursos e somente da forma que você pretende.   |
| Detecção   | Você pode usar controles de detecção para identificar uma potencial ameaça ou incidente de segurança. Eles são uma parte essencial das estruturas de governança e podem ser usados para apoiar um processo de qualidade, uma obrigação legal ou de conformidade e para os esforços de identificação e resposta a ameaças. Existem diferentes tipos de controles de detecção.   |
| Proteção de Infraestrutura   | A proteção de infraestrutura abrange metodologias de controle, como defesa em profundidade, necessárias para atender às melhores práticas e obrigações organizacionais ou regulatórias. O uso dessas metodologias é fundamental para operações contínuas bem-sucedidas na nuvem ou no local.   |
| Proteção de Dados   | Antes de criar a arquitetura de qualquer sistema, devem ser adotadas práticas fundamentais que influenciam a segurança. Por exemplo, a classificação de dados fornece uma maneira de categorizar os dados organizacionais com base nos níveis de sensibilidade, e a criptografia protege os dados ao torná-los ininteligíveis ao acesso não autorizado.   |


**Resposta a incidentes**: Mesmo com controles preventivos e de detecção consolidados, sua organização ainda deve implementar processos para responder e mitigar o impacto potencial de incidentes de segurança. A arquitetura de sua carga de trabalho afeta fortemente a capacidade de suas equipes de operar efetivamente durante um incidente, de isolar ou conter sistemas e de restaurar operações para um bom estado conhecido. (AWS 2020, p.19).

As melhores práticas de confiabilidade estão fundamentadas nos diferentes escopos do projeto e em sua variada carga de trabalho, passando pela própria arquitetura desta carga de trabalho, que deve ser construída de forma a ser confiável desde seus momentos iniciais e primeiras decisões. Devido ao seu impacto na performance da aplicação desenvolvida e no custo do serviço da nuvem, a carga de trabalho deve ser acompanhada e suas alterações gerenciadas, o que tende a fornecer uma operação confiável ao aplicativo. E sobre o gerenciamento de falhas, temos que:

Em qualquer sistema de complexidade razoável, espera-se que ocorram falhas. A confiabilidade exige que sua carga de trabalho reconheça as falhas no momento em que elas ocorrem e tome medidas para evitar que elas prejudiquem a disponibilidade. As cargas de trabalho devem ser capazes de resistir a falhas e reparar problemas automaticamente. (AWS 2020,p.22).

Existem diversos fatores capazes de interferir na performance de uma aplicação e também são alvo das melhores práticas de Eficiência de Performance e, na maioria das situações, tem relação com carga de trabalho, portanto começam com a escolha da melhor abordagem dos serviços escolhidos, priorizando performance.

Outros elementos avaliados são a computação, o armazenamento, o banco de dados e a rede, sendo que a computação diz respeito a seleção dos recursos computacionais suficientes para o melhor desempenho da aplicação. Sobre o armazenamento, as melhores práticas indicam a necessidade de se manter uma boa estrutura de armazenamento em nuvem que priorize a disponibilidade dos arquivos.

Sobre os banco de dados, dentro da variada oferta de serviços AWS, as melhores práticas indicam que deve ser escolhido o serviço compatível com os requisitos do sistema de forma a oferecer a melhor performance, principalmente quando os requisitos são específicos. E sobre as redes, temos que, de acordo com a AWS (2020,p.29):

[...] ela pode ter grandes impactos positivos e negativos sobre a performance e o comportamento da carga de trabalho. Também há cargas de trabalho que são altamente dependentes da performance da rede, como Computação de Alta Performance (HPC), para a qual é importante ter um entendimento profundo da rede a fim de aumentar a performance do cluster. É necessário determinar os requisitos de largura de banda, latência, instabilidade e throughput da carga de trabalho. (AWS 2020,p.29).

As cincos áreas de melhores práticas alvo da otimização do custo na nuvem pode ser compreendidas na figura a seguir:

| Tópico   | Descrição    |
|--------------- | --------------- |
| Gerenciamento financeiro   | Uma nova abordagem para o gerenciamento financeiro na nuvem é necessária para obter valor empresarial e sucesso financeiro.   |
| Compreensão das despesas e usos   | A facilidade de uso e a capacidade sob demanda praticamente ilimitada exigem uma nova forma de pensar sobre as despesas.   |
| Recursos Econômicos   | Usar as instâncias e os recursos adequados para sua carga de trabalho é fundamental para economizar gastos.   |
| Gerenciar recursos de demanda e fornecimento   | Modificar a demanda usando um controle de utilização, buffer ou fila para suavizar a demanda e atendê-la com menos recursos o que resulta em um custo menor ou processá-la posteriormente com um serviço em lote.   |
| Otimização constante   | A medida que a AWS lança novos serviços e recursos, faz parte das melhores práticas analisar as decisões de arquitetura existentes para garantir que elas continuem sendo as mais econômicas.   |

Vale ressaltar que os recursos e demandas de uma aplicação mudam com o tempo, portanto uma boa prática está em desativar recursos que estão ativos desnecessariamente e incrementar quando as demandas pela aplicação forem elevadas.

## Princípios gerais para projetos em nuvem

Dentro do que a AWS define como sendo Well-Architected Framework são estabelecidos seus princípios gerais e começa pela busca por processos coerentes que eliminem a necessidade da gestão usar a intuição na definição de suas necessidades por capacidade de processamento de dados em sua carga de trabalho.

Outro princípio, diz respeito à escala de produção onde ambientes de teste podem ser criados de forma que sejam aplicados recursos suficientes e, ao término dos testes, tais recursos podem ser redirecionados e a empresa paga apenas pelo momento onde consumiu os recursos. A automatização é um princípio diferente dos demais, pois permite a criação e replicação da carga de trabalho mantendo o custo no seu mínimo possível.

Com as arquiteturas evolutivas, o AWS Well-Architected Framework oferece um processo contínuo de evolução das práticas e do processo de tomada de decisão, pois ambos os aspectos tendem a se modificar com o tempo e, uma vez que se busca a otimização do desenvolvimento, não se consegue obter melhor desempenho se as práticas e decisões são tomadas sob uma perspectiva ultrapassada.

A coleta de dados entra como um princípio relevante, pois na nuvem existe uma enorme facilidade em coletar dados, principalmente a respeito dos sistemas desenvolvidos e de como as decisões tomadas estão afetando sua performance e receptividade para com os usuários. Decisões tomadas com base em dados concretos tendem a oferecer resultados assertivos e aprimorados.

E por fim o projeto de um sistema desenvolvido dentro da AWS e seguindo os princípios do AWS Well-Architected Framework, pode incluir o que a AWS denomina como dias de jogo, onde a performance da aplicação pode ser avaliada com a aplicação em produção, oferecendo excelentes insights sobre melhorias e resoluções de dimensionamento de carga de trabalho.
