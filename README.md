# 📗Lista de Exercícios 2 - POO
## 🤓 Questão 1
Usar getters e setters em vez de tornar os atributos públicos é considerado uma boa prática de programação orientada a objetos porque promove o princípio do encapsulamento. Esse princípio consiste em proteger os dados internos de um objeto contra acessos ou modificações indevidas.<br>
### <br>**Por que é melhor usar getters e setters?**<br>
* Controle de acesso: você pode permitir leitura e impedir escrita, ou vice-versa.
* Validação de dados: é possível verificar se o valor passado é válido antes de modificar o atributo.
* Facilidade de manutenção: se a lógica de acesso mudar, você altera o getter/setter, não o código que usa a classe.
* Ocultamento da implementação interna:


### **Vamos supor que temos uma classe Produto, com um atributo estoque. Queremos garantir que o estoque nunca seja negativo:**
```java
public class Produto {
    private int estoque;

    public Produto(int estoqueInicial) {
        setEstoque(estoqueInicial);
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int novoEstoque) {
        if (novoEstoque < 0) {
            System.out.println("Erro: o estoque não pode ser negativo.");
        } else {
            this.estoque = novoEstoque;
        }
    }

    public void vender(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Erro: estoque insuficiente.");
        } else {
            setEstoque(estoque - quantidade);
            System.out.println("Venda realizada. Estoque atual: " + estoque);
        }
    }
}
```
Neste exemplo, o uso do setter setEstoque impede que o estoque seja definido como negativo, protegendo a integridade dos dados do objeto.

## 🤓 Questão 2
**✅ Informações relevantes para representar um livro em um sistema de controle de biblioteca:**<br>
- Título<br>
- Autor(es)<br>
- ISBN (identificador único do livro)<br>
- Editora<br>
- Ano de publicação<br>
- Gênero ou categoria<br>
- Quantidade de exemplares disponíveis<br>
- Código de identificação interna (ID)<br>
- Status de disponibilidade (disponível, emprestado, reservado)
  **<br>Esses dados são importantes para identificar o livro, organizar o acervo, controlar empréstimos e facilitar buscas.**

<br>**📌 Por que podemos dizer que a classe Livro é uma abstração?<br>**

Porque ela representa um conceito do mundo real (livro físico ou digital) de forma simplificada e estruturada no código. A classe agrupa apenas os atributos e comportamentos essenciais para o funcionamento do sistema, ignorando detalhes irrelevantes como cor da capa ou número de páginas, a não ser que sejam úteis no contexto da aplicação.

**🔧 Métodos que fariam sentido na classe Livro:**

``emprestar()`` – reduz o número de exemplares disponíveis e muda o status, se necessário.

``devolver()`` – aumenta o número de exemplares disponíveis e atualiza o status.

``esta_disponivel()`` – retorna True ou False dependendo da disponibilidade do livro.

**Esses métodos ajudam a controlar a circulação dos livros e a garantir regras de negócio.**