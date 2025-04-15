# Visão geral sobre a AWS

A humanidade já está devidamente integrada à computação, assim como está acostumada aos benefícios da internet, no campo do lazer, do entretenimento e do comércio, dos negócios e, nos últimos anos, estamos experimentando o nascimento frequente de mais produtos e serviços.

Um dos campos da tecnologia computacional, que vem superando as expectativas e revolucionando a vida em sociedade, é a computação em nuvem, que embora englobe diversos serviços que já são velhos conhecidos dos usuários de computadores, como os e-mails, oferece aplicações e acesso a dispositivos de hardware de forma remota.

Para compreender o que realmente representa a computação em nuvem é preciso ir além de serviços como e-mail e partir para armazenamento de dados e máquinas virtuais. Desta forma, temos que a computação em nuvem é a existência de serviços que podem ser contratados pelo usuário, como o armazenamento, poder computacional com as máquinas virtuais, além de uma infinidade de aplicações.

Atualmente, as grandes empresas desenvolvedoras das principais tecnologias computacionais possuem os denominados provedores de computação em nuvem, onde entram AWS, Microsoft, Red Hat, Google e muitas outras. Embora não tenha nascido como uma empresa do mercado de tecnologia computacional, a Amazon, gigante do comércio eletrônico, criou uma provedora de serviços em nuvem que hoje é uma das mais populares e inovadoras, a AWS, ou Amazon Web Services.

Lançada como provedor em 2006, a AWS foi desenvolvida para atender as necessidades de infraestrutura tecnológica da própria Amazon e seu e-commerce, e começou com sua oferta de excelentes serviços a preços baixos e um sistema inovador de pagamento onde o usuário somente pagaria pelo consumido.

A infraestrutura e a forma com que a AWS oferece seus serviços diz muito sobre o que é a nuvem, pois quando um cliente demanda um de seus serviços, armazenamento, por exemplo, ele não necessita fazer qualquer investimento inicial, e somente pagará pelo espaço em servidor que seus arquivos vão ocupar.

Desta forma, o cliente da computação em nuvem encontra na AWS uma imensa gama de serviços que pode começar a utilizar imediatamente, caso necessite, e somente pagará pela porção de uso consumida, pois, em geral, não são oferecidos pacotes pré-definidos.

Dizer que a AWS oferece serviços de computação em nuvem significa que qualquer um de seus serviços pode ser acessado pelo usuário em qualquer lugar do globo que tenha acesso a internet, mas a AWS cria servidores agrupados no que denominam Zonas de Disponibilidade, que por sua vez são agrupadas em regiões distribuídas nos 5 continentes, pois a Amazon Web Services oferece um amplo conjunto de produtos globais baseados na nuvem, incluindo computação, armazenamento, bancos de dados, análise, redes, dispositivos móveis, ferramentas do desenvolvedor, ferramentas de gerenciamento, IoT, segurança e aplicações empresariais: sob demanda, disponíveis em segundos e com pagamento conforme o uso. Mais de 200 serviços da AWS disponíveis, como data warehousing, ferramentas de implantação, diretórios e entrega de conteúdo. (AWS 2021, p. 01).

Dentre as diversas vantagens dos serviços AWS, é oferecida uma das principais características da computação em nuvem, a elasticidade, representada pela capacidade de se consumir um volume maior de recursos temporariamente para que as demandas dos sistemas hospedados sejam mantidas a níveis satisfatórios. Em geral, os serviços oferecidos pela AWS, assim como diversos outros provedores, podem ser consumidos por qualquer tipo ou tamanho de empresa, de micro a startups.

## Nível gratuito de uso dos serviços da AWS

Além do atrativo de cobrar apenas o que o consumidor usa, a AWS possui uma forma bastante popular de atrair clientes para seus serviços: o chamado free-tier, ou nível gratuito. De forma simples, este nível oferece ao novo usuário a possibilidade de utilizar praticamente qualquer serviço da AWS sem custo, dentro de algum limite estabelecido, seja tempo, espaço armazenado ou outro parâmetro específico do sistema utilizado.

Vale ressaltar que o nível gratuito da AWS é oferecido por um período de 12 meses a partir da criação do usuário e está disponível mesmo que o cliente não queira utilizar. Portanto um usuário AWS estará qualificado para utilizar o nível gratuito se algumas condições forem atendidas, como:

Estar dentro dos primeiros 12 meses após a criação da conta da AWS.
Usar somente os serviços da AWS que oferecem benefícios do Nível gratuito da AWS. Seu uso permanece dentro dos limites do Nível gratuito da AWS nesses serviços.
Se usar os serviços da AWS além de uma ou mais dessas condições, esse uso está excedendo os limites do Nível Gratuito. O cliente é cobrado no padrão das taxas de cobrança da AWS para uso que exceda os limites do Nível Gratuito. (AWS 2022, p.24).
Embora existam outras formas, muitos utilizam o free-tier da AWS como um ambiente de testes, de estudos para seus cursos de programação e computação em nuvem, e nestes casos, principalmente, o usuário deve ter conhecimento dos limites de gratuidade de cada sistema e assim evitar despesas desnecessárias.

Para saber se custos não estão sendo gerados, o usuário raiz, aquele que tem poderes totais e que pode cancelar a conta, deve acessar o console e buscar o item relativo a cobranças, o “Billing and Cost Management Dashboard” ou (Painel de gerenciamento de custos e cobranças) e, em seguida, acessar os alertas e notificações.

Existem duas formas de se rastrear o uso do nível gratuito da AWS utilizando um sistema denominado AWS Budgets que em sua forma padrão já notifica se o usuário está passando de 85% da capacidade do seu nível gratuito para cada sistema que utiliza. O AWS Budgets pode ser elencado para monitorar o uso dos serviços da tabela de Principais serviços do Nível.

## Acesso ao console de gerenciamento AWS

Outra grande vantagem da AWS está na forma que coloca ao alcance do usuário todos os seus serviços dentro do que denomina AWS Management Console. Assim como qualquer outro serviço em nuvem, o console da AWS pode ser acessado via interface gráfica de qualquer navegador atual, mas também em modo texto com uso de um de seus protocolos, o SSH (Secure Socket Shell), cujos dados de autenticação, como usuário e senha, são oferecidos para novos usuários.

Conforme complementa AWS (2022), o console oferece grandes possibilidades de customização “[…] também permite que você personalize a experiência da Página inicial do Console adicionando, removendo e reorganizando widgets como Recently Visited (Visitados recentemente), AWS Health, Trusted Advisor e muito mais. (AWS 2022a, p.01).

## Forma de acesso aos serviços da AWS

Como o usuário raiz tem a incumbência de gerenciar os custos dos serviços AWS, recomenda-se como boa prática de segurança, que seja utilizado apenas para a gestão dos serviços utilizados. Desta forma o responsável pela conta deve utilizar a estratégia de acessar sua conta raiz apenas para propósitos de gestão e pagamento pelos serviços,

Para evitar acessar o usuário raiz, seu controlador deve fazer uso do IAM para a criação de usuários que receberão atribuições, acessos, específicos e coerentes ao projeto em mãos. Assim, o portal da AWS oferece o acesso ao Management Console através de seu portal WEB. De acordo com AWS (2022),

Para usar o AWS Management Console, é necessário fazer login na conta da AWS. O processo a ser usado para entrar na conta da AWS depende do tipo de usuário da AWS que você é. Há dois tipos diferentes de usuários na AWS. Ele é o proprietário da conta (usuário raiz) ou é um usuário do IAM. O usuário raiz é criado quando a conta da AWS é criada usando o endereço de e-mail e a senha que foram usados para criar a conta. Os usuários do IAM são criados pelo usuário raiz ou por um administrador do IAM na conta da AWS. (AWS, 2022)

Desta forma, cada perfil de usuário vai ser oferecido com restrições condizentes com as atividades que seu gestor o alocou, e tentativas de realizar alguma função não liberada, serão registradas em um log de sistema que podem ser ajustados para ser.
