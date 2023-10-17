# Uso do Singleton
Garante que a classe LojaOnlineFactory
tenha apenas uma instância durante todo o ciclo de vida da
aplicação. Isso é útil para garantir que todos os produtos
sejam criados a partir de uma única fonte/fábrica, mantendo
a consistência e evitando a criação desnecessária de múltiplas
instâncias da fábrica.

# Uso do Abstract Factory
Permite criar famílias de objetos
relacionados sem especificar suas classes concretas.
Neste caso, a "família" é composta por diferentes tipos
de produtos (Eletronico e Livro).
Usando este padrão, podemos facilmente adicionar mais tipos
de produtos no futuro sem alterar a classe LojaOnlineFactory.
Por exemplo, se quisermos adicionar um novo tipo de produto,
como Roupa, basta criar uma nova classe Roupa que implemente
a interface Produto e atualizar o método criarProduto para
lidar com esse novo tipo.