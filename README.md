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




# Design Patterns Utilizados
Command - O design pattern command foi utilizado na parte dos listeners de ações.
Builder - O design pattern Builder foi utilizado na parte das instancias de Entities, quando muitos inimigos ou coisas como Tiles podem ser diferentes esse metodo facilita essa construção de diferentes coisas.
Facade - O design pattern Facade fica bem aparente na classe Game pois nela que temos basicamente a junção e a instancia/execução de tudo.
Strategy - O design pttern Strategy é usado na criação dos tiles do mundo, tendo como interface Tile


# DIAGRAMA UML

<a href="https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Diagrama-IdleClicker#R7Z1tc%2BI4EoB%2FDVV3H5Ky5Rfwx4Qwmcwkc9kku9m5L1MOFuCNsVnbTGB%2B%2FUl%2Bw1gSGLAszqvU1ICNMaCn1Wp1t1o9bThf3Yb2YvYQONDrAcVZ9bSbHgBqXzPRAz6zTs9oYJCdmYauk121OfHs%2FoLZSSU7u3QdGG1dGAeBF7uL7ZPjwPfhON46Z4dh8LF92STwtj91YU8hceJ5bHvk2VfXiWfp2QHob85%2Fhu50ln%2ByalrpK2%2F2%2BH0aBks%2F%2B7we0CbJX%2Fry3M7vlf3QaGY7wUfplDbqacMwCOL02Xw1hB5u3LzZXu%2FWr979u3n75bfob%2Fv3668v3%2F64SG%2F26ZC3FL8whH589K1%2FvU8%2Bff5D%2F%2BvPxeOn3z6U26u3LxfZW5SftrfMmvPWnsPs98brvI2jD3fu2T46up4EfvycvYKa4Nr23KmPno%2FRd4MhOvEThrGL8FxlL8TBAp0dz1zPubfXwRL%2FgihGbZ8fXc%2BC0P2Fbmt76CUVnUAvh3EmacDcuuIZvxOdVtDZEEbomse8WdTi1L0dxdk148Dz7EXkviVfGF8yt8Op618HcRzM8xthIYBOdlRwTg7iMHgvBAu%2FvyaMDBpuDbgqSWoG5xYGcxiHa3RJ9qqmZnKZdcQLoGmD9MzHRq5VM0M2K8m0aWQX2llfmhZ3Lz7wCfU925%2BiZig%2BERj61ifmgr7v44C5%2FWm2h8j7dgyvcTtGZSlET0q%2FdXMqkc0D5FQl5PQCHb7MQmg7WOFkTypii1o%2BLomoBycxU0CjhT12%2Fel9cs2NvjnzlP1wfCpA7514iXDMXMeBfiI8sR3bqXxhiVkErh8nLWNco3%2Bo%2FYbKpdEz0BcaomN1c4z%2B4cvDeBj4SM5sNxEoiIT3A2IBpojazk68X9TW2wAPBV0Wqy3Ch%2BIEVJxvaNiAto%2FfHD0tfR81fueQ7lA1s3juZU95gTeAYPAaFfyXSZiMOspf2RMJvUHo%2FZqjSBPQv32ef%2B6PPlaLv8yX%2FvCXGb%2FETxTl3QPX%2BE3odwIlHVu7hpwXTFXRBdMkdXeZZmZqS5w1cWpH2lxHaeRl%2F%2FW%2F07vofjV4%2F6K7X0yoxJQZQIozSmZY3eRI8KmLls3RaNOkonFkKdnr5WQCQ%2BjczfE8Gt0kfZRc63EdtGkx0biy1O3Ij914nbQcOqlAfOjCSJKtSRYoLZpFVLI6kyycl8HCueR6AFetRQOJypWc49C4OtB2RrLTHgjXFG0umQy4z4vQjWE0gxBbwVH5SLKtx3Yg2oQyarFdePYahpLtIWw1VbQZ1a%2FFNhtsJdyD4NYNU%2FCb%2B%2BTxDwLvY9JZi14rmdZlaoq2olTDYjB9DULPwV8tfZRE6xG1RJtOxacRRJ9s3wnm6EmYPZFMazHVVdEmk2qy%2FE6%2F36H%2Flq5kWZel3qaJRPt%2BNH9EBZ7nJjkgWdAqTdWo5kfsITtHjPDtcpQvmPTNhUrg1kjcGgWtZ79B7zGI0EQ6wPcP02sryEX593Wzpm20I4HjJKisOQ1O8%2FnXvzvaOzlw7IvXtCxPsOu78aewyzyb17aGInpCqpos%2F6%2Bckp6OFwifkposN3CS3Ci7an2WhvCpqMny%2BkYIh0RZH%2BVA%2FByU5QhEaN4lytooTUW8QcRy%2BqEf5sBQwqwPUxM99yQV7Fe4vnejGJk%2FpNeWsRxB6cnlCL2mliMYoLocQa3r5y8uPGw5QpELl3ssjx0tWliPQPNNS18JtUs3viqBl6skX9BGjCfvcP2yXkCngyNKWX3qvMC2mpFDJctyUiOyT9BD7dFJuLx4Ck%2FCsViuE8TzEY25XcZ5jPVn7sTZat4NtXuSrhK8%2FCtpRWn6nYHpp1p1g8d95RjLT9NrWH7987D8VFpERZp%2B9A59lrYfdURhJZuES7%2BDQwnF7DtmXEk5n7HdRzr7hrb%2F0yYTruWwwn9YURXCo2DVDtMc5VEwjO1xRdXP16MAaPEiOa7Q%2B%2FNZjivUb0z6qKcwvhqP0SQFd1nUIHgs6eAQww2p%2BFGFtBW2mD4FXhdTMRotYnA49ladDlQFTboHN8yvXl9Sy0KCbxq8cPdEPhCXwI9DiI2BZGn1M2qzGE7XknzT5NVWVw1R0ZOOY6TqJXfO3FtdUETlTjqYlwsH4e4gbH4YW11DRMVI%2BuoWuAEkxQMoil83pJCWl%2B0434LYnXRR%2BzII1abLngyLXy6kkANqBOOkNK07jlCLTNzpEo2r2Jkgudbl2urSIWopE0qC7BD0rq5d7DOd2GOID69RE6ALNRU37It7XtE9XTlLN%2BwecWF7ZpluWN2oRvdUtaaKz8Ny3fDCUktAkHM9Qkg77oXdp6DY%2FZ%2B9eqqufHFSTwZrLUaWKZyPP%2BjM9J9qTxyDVfQiG8q6jOf39bmNLGca4Gt%2BZAHEyKIMak4BVdD5oYW68gQpJqJC48vd%2FejH89fvUhFVOvrJUT5%2BiogM8%2BG61mlJ3FXnQB7iH%2BSAu9Uq5tTvR0YAN7jXEnezuNusX06vHSYnBRyw1q5kzmtW0Ce9w2giEEXSfhRlP1oV%2B9HSKSIy%2BGeaj32Ki41tPt4%2BXT0%2Fd24gOl4XpX39IAOSJmf8hhhyciANSG64aQZku7h3zRekAdkwbpoB2S5uuVyYA1aqAUnjysuAzPeGKGF9CJYRlHULBBqRZN0CTa1btyBPWOlG3QJqAF6neSErYgp95wpvzIqO3rwAy8m1Y0ezhCxGh17%2F5Hq52kZHmYypYFuBbctDIvHZhRt1Dx1id9c9WiHtdSR%2FWmuH0LNj9%2Bf2J%2Byg%2BxjkFlcqO9X5QWWWEQXLcAyzN21gbe7DeB%2Fql1MYE%2B9rCvJALlE8ZrhhCdaZLFEc0CaAOIg5x2PO0HPH751c9n7EWsUj6ArfNcZiVWpN8Ha3qkE7eMWXrNjZeztchKQdvsL3jrFYdQUTviNs1Eu8R%2BNtdyUIlS%2Br2GDKd%2BXGEu%2FxeMXvIEMp%2FnXjhrGMBQmaxpt6rVyif2gwSKVWNGNGg27unl46p5qO10ZZZz%2FfaFAx3MlwUCPxgX3AhceDVEoJNBkQ4gdceERIVeVuOzzACo8JqZT6cEMvWDrSkhQVEBrIrKId4npQWtHw%2Fj%2B%2F33RuNDpFHZ15XpFKKYEnLUl%2BwM%2FAkpSpRW0CPwNLUiYX8QAr3pLUyZ48WsUwtwT2ZGyU0jLMXjVno3aSBly58Z%2BYs3KpKGZ24ju%2B%2BFLR9ez4ZpW9OzlYlw4eYeii1sD2a5YrgloG30%2B9VFD7Zyey%2BxlqfmJzw%2BRoXT6q3jJti51pJLvKl6YpHBmGHVtFpikbO67bU6OhKB%2FHIU1F7VcsXCSog8t8vWHtZJW8GLdW526MFJbN3fILg8kkglzSXFS9huY7m1ymQ2YuHGREJ2VEtS7BcSJC2RuIvBnnJCc1n2VJ%2BkfQV63%2BoCH25K24k6cFPyR5Ki4zdzSW42iX%2BQLWQ%2BFTonJ9vWX44Fzgb9lGgy3bSEttmaNtI0Xfto1wvE%2BwbbSr7NOWcXTIUlAeAg8Ige%2BfIPBkSYtqkjh3ga8RKWhJ4M9MQgUNnYqmHCdMumahhtv8qds3tnTt0ir9tT2q1sgab1nOtsTq%2B5ZUtacF9yo3pieBgzQazUqjqTOlUVUMBc36hIkjpcbGyI%2FdmHRhMoJooCeDaKdr1NwpoFRHVQNQPJ8WxT%2BmVSWng1G0Pm0uirNDq1G00bfRw%2Fcfo2%2BEEP%2B%2F%2B%2BFrCd6unn5QDI0mZ%2Fw87H3W9qFVuvd3n0Y%2FHq%2BGX7tImHukZY8c0EJrLcsBbeqJY%2BVOsHzLdJek3ix1WnytZeq0%2BdcWdRlVbZo6NfjWMnZWYkyBPf1uEn3D6DWKndcyetpMeAt99j0k%2B4bZG%2BJtPdY6vqqtFy1CNyYzOqUInCgCeVEVgSJAW%2BqHu3%2FqPpnb0Tuy84b4cZ09zrLHDykPTc%2F%2BFPEGoNyZlQtZWskFGlluCVYDltcm3d5v5MP5%2BiaYdnBZr%2FBeTduxpt1ePWA5dVL4j569hqFEz8GdJ1yhU%2Bq2pegjGD%2BgUVxSb566JXxCP2BtAoMQSuTNI9doGa8tI6e57jByNxoGnuc6iJAk3zx5Xfg0nloCr7Tjk4TeOPQ8OiIQOumyvXcn8BEH5au45crbNpIGqskqZt31cXlgv8M5AxZt9indCnv10ODwvaBaXbbFLOSY6yI5%2BDQOneZKancVJqX%2BX%2BI%2FkgOPiJIPZnXgqZ2tVrgnujzysGoZPsch0iPoiY8%2BpHNK6gT1Y%2B3ZgFv4fCffOYlAWoSsIdZGnx9xswFlvAzxT8aHHYPMfSTaIwrCs9SAQtqVF2VBiBYQtY%2Fk3ix34XlqQNlV6YUWtP7YBK%2BlMDQqDOLT14qwOVUaIjgma0hI6CdCF564BhTSCsDQ34LAg7aPnk1hHCNKV9jyl4NA8yIgPH8NKLSwtvQqnUy2bloaL7cSoFZ8luFLfsQt4eqcUpOeCF%2B%2BuvFM5qrwmterwvU5pRK4DGTyhS48Nw1QqoGnfZyALb3JLWxFse3avVANq6aEmAOdLSLdcCYDagHh62Kq%2BbcfOw9JTw%2BiB9TrAznxPFRhZergfL3PgFLzvCwDSGtMuxdOEI1dvKcZMNPrEuwe%2FAk9ib1h7OIdzYCVSFuEGLLw0mi1kPgbxn8GrmXAWiJZ8PcR5Hvc%2B6UEcJAA8X5mwLL5Np7m1IEHhkskAMOEMRiihvKlODQtDuJ9zmC3%2BZeIwg%2FHJWevkv2J7IUvlgaU7SbK7CV1DvM94UuiAWB5pmWWCV%2F0dddMc%2BzwrEyzzdg%2FR1Qk%2B%2BbdPOLtPpay37B3Hco2dxL9iehp29u3jH5%2Ft8eVgCX6htFreQBQHHpt72B%2F83ArwTcNXhNv5QEG%2BGotrHDp%2B67PCFFKQThREEzxNl%2Fdomh49E%2BSC5NlJFIQmhUE8RlJGsvxVxWEseeO36UkcJIEXXxeksaK%2FZWmgUtkIEj2TbMXn56k7VppMgntOYySpSWr4rmLmkzWxm5cFISX0gIaOS3ciEJCPRkE0lWHyfGwGBmkPDQtD8KLbAFt17IjpBHuUkVQSMPTUkYEm08MEm4n6iyXQdVOxD6jZ1lJmYsYCK%2FChexUhhgUnqPRt9HT7fdUISD1kB9KUWhWFITX5ip%2Bi1yX1ixZq6YJyG1dWj4dkevS2unLpiJerbMSQDdz%2F%2FEMjt%2BLRWpJJSQpC83LgiZcr%2BssP5Bcn8YLuiF81q%2BTCX%2BjVQzzJUZ7dowtbQtr9qp7xh6zSaxlWb2tzYgVbdA7YqPY8obeqtUrb%2BitGPlx%2FQ2907bgt%2Ft2UXNu%2Fw61rNqtPHaozTMFNsvlVOPSqMhi7f23B3XuxnkvWqCTYQ%2BR8m70DtgSmb8UGucohZpxqVnszY3RyHmpDgbHCaWhaJcDpbRTt1GVUQVcDvpm8emgZXGl1KIUJ66HCGuugbFOByUFjDWyeXYKuFj7el6ir%2B8RfXCK6KtI9Kt31C0%2B4o4OwyCIy5eH9mL2EDgQX%2FE%2F">Diagrama</a>
