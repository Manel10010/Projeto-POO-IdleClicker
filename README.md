# Projeto POO - Idle Clicker

Nesse repositório se encontrará o jogo que será desenvolvido para o projeto proposto pelo professor Thiago da matéria de POO (Programação Orientada a Objetos), o estilo do jogo é um estilo popular conhecido como Idle Clicker. O estilo Idle Clicker é focado em como o nome indica clicar, então a evolução dentro do jogo é feita a partir do usuário clicando na tela com algum intuito seja adquirir certo recurso do jogo ou realizar alguma ação. Um grande exemplo de um jogo Idle Clicker é o jogo <a href="https://orteil.dashnet.org/cookieclicker/">Cookie Clicker</a>  jogo onde você é dono de uma confeitaria responsável por produzir cookies.

Esse estilo de jogo foi escolhido por ser do gosto pessoal dos desenvolvedores e por ter características que podem ser implementadas usando POO.

## Tema

⚔️ **Dungeon Grinder**

- **Foco do jogo** - O foco do jogo é ir evoluindo um personagem que está percorrendo inúmeras dungeons. Dungeons também chamadas de calabouços são locais com inúmeros monstros normalmente os jogadores entram com o intuito de upar de nível ou adquirir certos materiais.
- **Descrição** - O jogador vai controlar um personagem que vive em um mundo infestado de Dungeon’s esse player é do menor rank da guilda, seu objetivo é através da coleta de recursos e melhoramento de equipamento aumentar seu nível e alcançar rankings mais altos na guilda (A, B, C, D, E e S sendo S o maior rank) aumentando sua fama, riqueza e poder. O jogador ao alcançar certo nível poderá escolher dentre diversas classes cada uma com uma forma diferente de ataque e formas diferentes de melhora de equipamento, sendo essas classes “Magic Caster”, “Barbarian”, “Necromancer”, “Paladin”, “Aura Fighter”. A cada nível de profundidade de cada dungeon sua dificuldade aumenta e ao chegar no fim sempre terá um **Boss** (chefe final da dungeon, o monstro mais forte) único que dropa itens que podem ou não melhorar os equipamentos do jogador além de alguns **itens únicos**.

> **Descrição de Algumas das Características do Jogo e das Classes**
>
> - **Skill Tree Central** - Arvore pra melhorar caracteristicas, HP, CD, Life Steal, etc…
>
> - Classes
>
>   - **Magic Caster** - O famoso mago, o jogador terá acesso a magias elementais Fogo, Água, Ar e Grama. Obs: O mago precisa de mana pra manter suas magias em ativação e suas magias possuem um tempo de recarga entre usos.
>
>     - Magias de Fogo são focadas inteiramente em dano em área.
>
>     - Magias de Água são focadas em imobilizar o inimigo.
>
>     - Magias de Ar são focadas em danos altas mas a inimigos únicos.
>
>     - Magias de Grama são focadas em curar o jogador.
>
>     - Combinação Mágica
>
>        \- Ao combinar dois tipos diferentes de mágia o jogador pegara o melhor atributo de cada uma e combinara tanto em ataque como em defesa
>
>       - Fogo + Água - Resultara em uma mágia que cria uma cortina de vapor enfraquecendo os inimigos (baixando sua defesa e capacidades de ataque)
>       - Fogo + Ar - Resultara em uma mágia que tem taxa de dano único e pode ser usada em varios alvos, que são as felchas de fogo o usuario utiliza o ar pra direcionar as chamas formando diversas flechas que podem acertar até x vezes o alvo (x sendo baseado no nivel da magia de fogo)
>       - Fogo + Grama - Criam chamas curativas que curam o usuario por certo periodo de tempo
>       - Agua + Ar - Criam bolhas de agua flutuantes que envolvem os monstros imobilizando e dando dano de afogamento
>       - Agua + Grama - Cria um liquido esverdeado com propriedades curativas curando de forma instantanea certa porcentagem da vida do úsuario
>       - Ar + Grama - Criam laminas de de grama que perfuram armadura dando dano a vida real do monstro
>
>   - **Barbarian** - Bárbaro, seu foco são ataques físicos e manter sempre sua fúria alta. Apesar da brutalidade e de sua forma de lidar com as batalhas os bárbaros tem uma conexão forte com seus espíritos ancestrais imbuindo suas armas tipicamente com a energia gélida vinda diretamente deles.
>
>     - **Fúria** a barra de fúria enche de acordo com a quantidade de inimigos que o bárbaro matou, caso o bárbaro passe muito tempo sem matar um monstro a barra de fúria começa a decair. De acordo com a porcentagem de fúria o dano do bárbaro será aumentado
>     - **Enrijecido** - O bárbaro contrai todos seus músculos ao mesmo tempo aumentando temporariamente sua defesa total mas perdendo um pouco de velocidade de deslocamente e de ataque
>     - **Artes marcias barbarás** - O bárbaro tem proeficiente em uso de armas como machados de duas mãos e seus próprios punhos.
>     - **Energia Gélida** - Caso o bárbaro esteja equipado com uma arma ele consegue imbuir energia gélida nela causando dano adicional de gelo. Depois de acertar acima de 5 hits em um monstro o monstro toma o status de “Congelando” que diminui sua movimentação e cria locais congelados em seu corpo aumentando a chance de critico do bárbaro.
>     - **Rugido Bestial** - Habilidade em que o bárbaro solta um rugido amedrontando os inimigos diminuindo precisão e defesa dos alvos (Max 5 alvos). Caso o inimigo seja de um nível superior ao do bárbaro ele não tomara o debuff.
>
>   - **Necromancer**
>
>      \- Necromancer é um mago focado em magia negra de invocação de mortos. O necromante não luta nas linhas de frente e sim comanda seu “exercito morto” nas linhas de fundo. A quantidade de monstros invocados e seu nível de força depende totalmente do nivel e mana do Necromancer.
>
>     - **Exercito morto** (Passiva)- Exercito morto é a habilidade passiva de controle do necromancer todos os monstros que ele mata tem uma chance de fazerem parte do seu exercito, o necromante pode escolher se quer integrar o morto em seu exercicito, existe um limite para seu exercicito de acordo com o nivel da magia e do Necromancer.
>     - **Invocação** - Essa magia é a responsavel por trazer dos mortos os soldados do exercicito morto, seu uso gasta mana e manter os soldados se regenerando também tem um curso de mana por segundo. Caso o guerreiro seja de um nível superior ao do Necromante ou possuia “habilidades de alma” o Necromante precisa utilizar a invocação emergente.
>     - **Invocação emergente** - Essa magia ao contrario da invocação é focada é um único soldado também chamado de General, os generais possuem habilidades de alma e são mais fortes que os soldados comum. Uma característica dos generais é que eles podem ser nomeados o que gasta uma quantidade de mana máxima e aumenta seus poderes no geral.
>     - **Habilidade de alma** - Após um monstro muito forte ser morto se suas habilidades tiverem certo nível de força eles morrem junto de uma habilidade essa habilidade pode ser manifestada de seus corpos mortos em sua invocação emergente tais monstros não necessariamente são Generais.
>     - **Toque da Morte** - O necromante ao usar tal magia causa dano em área e da o efeito de “necrosando” para os que sofrem a magia. O efeito necrosando causa dano de apodrecimento por segundo durante certo tempo, o tempo é totalmente escalado de acordo com o nivel da magia.
>     - **Correntes do Ceifeiro** - Essa magia prende certa quantidade de inimigos os deixando sem poder atacar, a quantidade de tempo preso e a quantidade de monstros que podem sofrer essa habilidade é totalmente escalada de acordo com o nivel da mesma.
>
>   - **Aura Fighter** - Um lutador de aura é alguém que foi especializado em artes márcias e luta totalmente sem o uso de armas brancas, após anos treinando e meditando o lutador de aura conseguiu despertar a energia vital de dentro do seu campo de alma (aura) um lutador de aura pode mudar a coloração do seu campo de alma para também mudar os efeitos que seus punhos podem infligir. O estilo de combate apesar de ser focado em seus punhos também podem variar dado a cor do seu campo de alma podendo transmitir o dano a distancias mais longas.
>
>   - **Campo de alma** - Campo de alma é o centro da vida de um ser, ele não tem um local fixo no corpo e nem tem um estado físico, a existência do campo de alma ainda não tem uma explicação mas muitos acreditam ser a energia que move as vidas no mundo. A coloração do campo de alma por muitos acreditava ser fixa do seu ser, por exemplo, um leão por natureza tem um campo de alma vermelho dado suas características predatórias, ja um tartaruga tem seu campo verde, mas após anos de treinamento os lutadores de aura conseguiram através de seus esforços mudar temporariamente o seu campo de aura para alcançar seus desejos.
>
>   - **Mudança de campo** - Habilidade que permite o lutador de aura mudar seu campo entre as cores Vermelha, Verde e Dourada. Dado o intenso treino os lutadores de aura perderam as cores de seus campos naturais deixando eles com uma cor nula, só ai foi possível para eles mudar a cor de seus campos a vontade.
>
>   - **Campo Nulo** - O campo nulo é algo inatural afinal todo ser tem seu campo de cor, sendo assim o campo nulo não trás benefícios nem malefícios. De acordo com os chefes dos templos onde os lutadores de aura treinam “após se fundirem com o nada que um lutador pode absorver o tudo”.
>
>   - **Campo Vermelho** - O campo vermelho aumenta a ferocidade do lutador fazendo com que seus ataques causem mais dano e feridas profundas quase como se seus punhos se tornassem espadas. Ao utilizar essa habilidade além do acréscimo em dano o lutador causa sangramento no seu alvo, sangramento causa dano por segundo de acordo com a quantidade de dano do lutador.
>
>   - **Campo Verde** - O campo verde trás propriedades tanto de cura quanto de defesa para o lutador, outro beneficio é que seus golpes ficam mais pesados e a cada hit o oponente se sente esmagado causando lentidão e diminuição na velocidade de ataque.
>
>   - **Campo Dourado** - O campo dourado é algo inatural é quase como uma cor resultada da compressão do funcionamento da aura, apenas os lutadores mais aplicados conseguem manejar o uso desse campo. Ao utiliza essa habilidade o lutador consegue lançar ondas que simulam o movimento de seus golpes ganhando assim alcance e aumentando também sua velocidade de ataque, como seus ataques não são mais físicos o lutador consegue ignorar certo nível de armadura do oponente.
>
>   - **Sequência Shin** - A sequencia Shin é uma habilidade que o lutador usa em combate para reproduzir os golpes do antigo Mestre Shin. Ao usar a habilidade o lutador aplica rapidamente uma sequencia de 7 socos.
>
>   - **Sequência AoShin** - A sequência Ao Shin é uma habilidade que o lutador usa em combate para reproduzir os golpes do antigo Mestre Ao Shin irmão de Shin. Ao usar a habilidade o lutador aplica rapidamente uma sequencia de 7 chutes.
>
>   - **Paladin** - Paladin é um guerreiro que usa da sua fé e acesso a magias de luz para seguir o seu caminho nas batalhas. O paladino usa armaduras pesadas e armas longas nas quais ele pode imbuir energia sagrada para causar mais dano, se ele fizer o mesmo em escudos aumenta sua defesa e em lanças aumenta seu alcance e possibilita dano em área. O paladino é um guerreiro da igreja suas habilidades também tem relação com sua fé ao Deus Apolo (Deus do Sol).
>
>   - Imbuir Luz
>
>      \- O paladino tem a capacidade de imbuir luz em suas armas e escudos.
>
>     - Efeito em Armas - Aumenta dano e muda as propriedades da arma. Se for uma espada seu tamanho aumenta e também sua afiação e se for uma lança ela ganha diversas pontas causando mais dano em área.
>     - Efeito em Escudos - O escudo aumenta de tamanho defendendo mais alvos e também ganha uma capa de luz que o envolve aumentando sua defesa
>
>   - **Oração Contínua** - Enquanto o paladino ora ele aumenta todos seus atributos e ganha um escudo de luz que envolve seu corpo. A habilidade dura até que a mana do paladino acabe ou ele tome dano a sua vida.
>
>   - **Canção Celestina** - Apesar de ser conhecido como Deus do Sol Apolo também é deus das canções e da medicina. Essa habilidade ao ser utiliza cura o usuário uma certa quantidade por segundo (baseado em nível e fé).
>
>   - **Fé** - Ao contrário das outras classes essa classe possui um atributo único que é a fé, ao melhorar esse atributo todas as habilidades que usam da fé são beneficias em suas características base. Além disso a fé aumenta o vínculo do paladino com seu deus.
>
>   - **Vínculo com Apolo** - Após usar varias habilidades que utilizam da sua fé e absorver dano com escudos de luz (resultado de outras habilidades) o paladino aumenta temporariamente seu vínculo com Apolo, ao chegar em 100% de vinculo ele tem acesso ao Ataque de Apolo.
>
>   - **Ataque de Apolo** - Um ataque que vem do céu como um feixe de luz causando dano em área (baseado em nível e fé) o ataque só pode ser utilizado se o vínculo com Apolo estiver em 100%. Ao utilizar essa habilidade o vínculo com Apolo é temporariamente bloqueado e o total da porcentagem é removido em 50%.
