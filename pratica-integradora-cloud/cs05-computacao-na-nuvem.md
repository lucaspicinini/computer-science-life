# Visão geral dos serviços de computação

A princípio, podemos considerar qualquer serviço web que pode ser acessado pelo navegador de um computador, independente de onde este computador está localizado no globo, como computação em nuvem. Dentre os serviços mais conhecidos da computação em nuvem, podemos elencar o armazenamento e as máquinas virtuais.

Para as empresas, a contratação dos serviços de computação em nuvem vem de encontro à sua necessidade latente por novas tecnologias e serviços cujo custo de aquisição de equipamentos seria muito elevado. Contratar serviços na nuvem evita que a empresa compre hardware que ficaria obsoleto em alguns anos, e ao assinar um serviço, como o de uma máquina virtual, permite que ela ganhe acesso à tecnologia de ponta com o pagamento mensal de uma fração do valor.

Os serviços em nuvem são oferecidos por provedores que mantém uma infraestrutura de grandes proporções capaz de oferecer diversos serviços, como armazenamento, hospedagem de sites e capacidade computacional com suas máquinas virtuais e containers. Neste mercado, temos empresas de grande porte como Google, Microsoft, Oracle, Red Hat, IBM e a Amazon Web Services, ou AWS.

De forma geral a AWS possui um portfólio de serviços em nuvem capaz de atender a toda e qualquer necessidade, independente do projeto de seus clientes, inclusive em ramos de atuação distantes do desenvolvimento de sistemas. E, nesta perspectiva de comutação em nuvem, um dos serviços mais aclamados e contratados é a capacidade computacional.

O upgrade de um computador ou servidor pode ter um custo elevado à empresa e, dentro da plataforma AWS, ela pode contratar o uso da capacidade computacional e acessar este hardware através de computadores que dificilmente teriam condições técnicas para permitir o funcionamento das aplicações da empresa. Outro ponto interessante está no fato de que, ao evitar comprar hardware, a empresa pode aplicar os seus recursos financeiros de forma ainda mais estratégica.

Dentro da gama de serviços de computação da AWS existem diversos modelos de máquinas virtuais para se adaptar às diversas necessidades de seus clientes e assim, otimizar seus uso. E até mesmo servidores podem ser contratados, e isso impede que a empresa promova gastos elevados com a implementação de uma infraestrutura que tende a ficar ociosa em alguns momentos e até mesmo insuficiente em outros.

Na nuvem, a capacidade computacional é dinâmica, elástica, o que significa que mesmo que a empresa contrate determinado pacote, seu desempenho sofre incrementos estratégicos em momentos de elevação da carga de trabalho, algo oneroso de se implementar em um servidos local. De acordo com a AWS (2022,p.01), o aumento do desempenho dos serviços de computação é denominado escalabilidade e significa:

A escalabilidade é incorporada aos nossos serviços de computação para que, conforme o aumento da demanda, você possa aumentar a escala facilmente. Quando a demanda diminuir, durante a noite ou nos fins de semana, você poderá diminuir a escala para economizar dinheiro e recursos. Você não precisa pagar pelo que não está usando (AWS,2022,p.01).

Na estrutura da AWS seu serviço de computação é nomeado EC@, ou Elastic Computer Cloud e o seu Elastic representa a possibilidade de aumentar e diminuir dinamicamente a sua oferta de recursos, quando propriamente configurado. O termo Compute se refere a capacidade computacional, e Cloud significa que tais recursos são oferecidos na nuvem.

## Tipos de instâncias Amazon EC2

As máquinas virtuais são divisões lógicas de um hardware transformando um único servidor em dezenas a centenas de computadores com frações de seus recursos computacionais e, para os provedores de computação em nuvem, estes computadores lógicos, ou máquinas virtuais, apresentam uma grande variedade de configurações.

Para a AWS estas configurações diferentes são denominadas de instâncias e são fornecidas pelo seus sistema, o EC@. Se a empresa necessita de uma instância robusta para processamento bruto de big data, ou se necessita de uma VM para hospedagem de um portal web, basta escolher dentre as opções do EC2. O EC2 oferece capacidade computacional em ambiente seguro de alta disponibilidade e seu uso:

[...] reduz o tempo necessário para obter e inicializar novas instâncias do servidor (chamadas instâncias do Amazon EC2) em minutos, permitindo que você escale a capacidade rapidamente para mais ou para menos, de acordo com a alteração dos requisitos de computação. O Amazon EC2 altera o modelo econômico da computação ao possibilitar que você pague somente pela capacidade que realmente utilizar. O Amazon EC2 oferece aos desenvolvedores e administradores do sistema as ferramentas para construir aplicações resistentes a falhas e isolá-las de situações de falhas comuns. (AWS 2021,p.21)

Com relação ao custo de contratação dos serviços de instâncias do EC2, devemos ressaltar que os clientes AWS recebem grande economia de escala, mas podem aprimorar ainda mais sua economia se compreenderem as diversas formas de contratação. A otimização do consumo dos serviços computacionais da AWS vem da contratação de diferentes modalidades, como as instâncias sob demanda, instâncias spot, instâncias reservadas, os saving plans e os hosts dedicados, conforme descreveremos a seguir:

Começando pelas instâncias sob demanda, temos que representam a contratação da capacidade computacional por hora ou até por segundo, de acordo com o número de instâncias executadas. Nesta modalidade de contratação de capacidade computacional não são exigidos contratos de fidelidade tão pouco pagamentos adiantados. Instâncias sob demanda podem ter sua capacidade computacional elevada ou reduzida de acordo com a necessidade do cliente.

Já as instâncias spot são oferecidas com grandes descontos, quando comparado com as instâncias sob demanda, devido ao fato de que representam capacidade ociosa dos servidores da AWS.

Podemos compreender que cada modalidade de consumo implica em vantagens e desvantagens quando comparadas com as demais. Cabe ao administrador de TI e líder do projeto de migração para a nuvem, compreender qual plano oferecerá mais vantagens para a empresa. Na figura a seguir, podemos notar as vantagens da contratação das instâncias sob demanda em comparação com as instâncias spot:

| Modelo | Descrição |
| -------------- | --------------- |
| Sob demanda | Usuários que preferem o custo baixo e a flexibilidade do Amazon EC2 sem nenhum pagamento adiantado ou compromisso de longo prazo. Aplicações com workloads breves, com picos de utilização ou imprevisíveis e que não podem ser imterrompidas. Aplicações que estão sendo desenvolvidas ou testadas no Amazon EC2 pela primeira vez. |
| Spot | Aplicações que têm períodos de início e de término flexíveis. Aplicações que são viáveis somente por preços de computação muito baixos. Usuários com necessidades computacionais urgentes em que a quantidade de capacidade adicional é grande. |

Para descontos quase tão agressivos quanto o que é oferecido nas instâncias spot, o consumidos AWS tem à disposição as instâncias reservadas, que oferecem descontos, também se comparado com o valor de uma instância sob demanda, e oferece a possibilidade de o usuário modificar a família da instância contratada, o sistema operacional, conforme seu projeto demanda. Neste sentido, o modelo de contratação do tipo saving plans representa:

[...] um modelo de preço flexível que oferece preços baicos no uso do EC2 e Fargate, em troca de um compromisso com uma quantidade consistente de uso (medido em USD/hora) por um período de um ou três anos. (AWS 2021,p.22).

Por fim temos os hosts dedicados, servidores físicos EC2 de uso exclusivo do cliente, e apresentam como vantagem a possibilidade do cliente usar suas licenças que são atreladas a um hardware específico, são vinculadas ao servidor.

## Escalabilidade Amazon EC2

Na maioria dos casos, as instâncias do EC2 são utilizadas em projetos de desenvolvimento de sistemas web, e isso significa que o volume de requisições da aplicação tendem a serem variados, tanto no decorrer dos dias quanto entre as aplicações. Esta variação na carga de trabalho dificulta a escolha da capacidade e até da família da instância que melhor atenderá o software nela abrigado.

Para tender melhor cargas de trabalho dinâmicas, a AWS oferece planos de escalabilidade. Os planos de escalabilidade são destinados a configurar a escalabilidade automática de todos os recursos AWS que são escaláveis e com este recurso:

[...] é possível pesquisar e configurar planos de escalabilidade para recursos escaláveis que pertencem a cada categoria. Ou, se sua infraestrutura de nuvem incluir o AWS CloudFormation, você pode definir modelos de pilha a serem usados para criar coleções de recursos. Então, crie um plano de escalabilidade para os recursos escaláveis que pertencem a cada pilha. (AWS 2020,p.01).

Para o tratamento do número de instâncias que determinada aplicação demanda e se processo dinâmico de variação de desempenho é utilizado o recurso denominado EC2 Auto Scaling que possui a capacidade de iniciar e terminar instâncias conforme a carga de trabalho.

Desta forma, o EC2 Auto Scaling interage com os planos de escalabilidade e com as etiquetas de escalabilidade do AWS CloudFormation de forma a coordenar o aumento ou redução dos recursos disponíveis nas instâncias EC2. Dentre os benefícios dos planos de escalabilidade podemos citar:

Podemos compreender que embora o consumo de recursos de instâncias do EC2 seja um processo extremamente intuitivo e facilitado, a obtenção de vantagens sólidas depende da sua configuração e da interação com os demais recursos como os planos de escalabilidade e o Auto Scaling.

## Direcionamento de tráfego para EC2

Consumir recursos em provedores como a AWS é um processo simplificado, mas para que o custo e a qualidade do serviço sejam otimizados, em casos como o do uso das instâncias do EC2, existe a necessidade de se complementar seu funcionamento com serviços como os planos de escalabilidade, Auto Scaling e promover o correto direcionamento de tráfego.

Podemos observar a importância do direcionamento de tráfego, pois é um elemento vital para que uma instância EC2, que abriga um sistema, seja acionada por um serviço externo através de um domínio web, ou seja, com a configuração apropriada do domínio o tráfego da aplicação pode ser direcionado a ela em sua instância EC2.

Outro uso intenso do processo de direcionamento se dá pelo próprio Auto Scaling, onde a configuração da capacidade mínima da instância faz com que o Auto Scaling direcione a carga de trabalho a outras instâncias quando tal configuração é detectada. A ideia por trás deste aspecto do direcionamento das instâncias está em permitir que a aplicação mantenha seu desempenho independente do seu cenário de consumo.

- **Detecção de recursos**: O AWS Auto Scaling fornece detecção automática de recursos para ajudar a encontrar recursos de sua aplicação que podem ser escalados.

- **Escalabilidade dinâmica**: Os planos de escalabilidade usam os serviços do Amazon EC2 Auto Scaling e do Application Auto Scaling para ajustar a capacidade de recursos escaláveis para lidar com alterações no tráfego ou na workload. As métricas de escalabilidade dinâmica podem ser métricas padrão de utilização ou de taxa de transferência ou métricas personalizadas.

- **Recomendações de escalabilidade integradas**: O AWS Auto Scaling fornece estratégias de escalabilidade com recomendações que você pode usar para otimizar a performance, os custos ou um equilíbrio entre os dois.

- **Escalabilidade preditiva**: Os planos de escalabilidade também são compatíveis com a escalabilidade preditiva para grupos do Auto Scaling. Isso ajuda a escalar sua capacidade do Amazon EC2 mais rapidamente quando há picos de ocorrência regular (AWS 2020,p.01).
