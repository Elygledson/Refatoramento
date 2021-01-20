## Sistema de Gestão de Produtividade Acadêmica

O sistema de gestão de produtividade acadêmica objetiva o gerenciamento da produção
acadêmica de um laboratório de pesquisa, incluindo informações sobre projetos de pesquisa e
colaboradores. O administrador do sistema é o usuário responsável pela manutenção de todas
as informações do sistema. 

Esse sistema permite as possibilidades abaixo:

1.  * - Cadastrar projeto.
2.  * - Cadastrar participante.
3.  * - Cadastrar produção academica
4.  * - Alocar participante a projeto.
5.  * - Alterar status de projeto
6.  * - Consultar projeto
7.  * - Consultar colaborador
8.  * - Listar projetos
9.  * - Relatório Acadêmico.
10. * - Sair

## Padrões utilizados Strategy e Factory method

O padrão Strategy foi implementado na pasta Status do projeto:
SistemadeProdutividadeAcademica\src\main\StatusdoProjeto sendo o Enum TipoStatus chamado  a
partir da função setStatus que é um dos metódos da classe SistemadeProdutividadeAcademica\src\main\Projetos.java.

O padrão Factory method foi utilizado na função  CadastrarProducao do arquivo SistemadeProdutividadeAcademica\src\Sistema.java 
sendo desenvolvido uma arquivo chamado Factory.java contido na pasta SistemadeProdutividadeAcademica\src\main além da interface
Formulário.java usada nos arquivos Orientações.java e Publicacao.java que estão na pasta SistemadeProdutividadeAcademica\src\Producao.

## Instruções:

1. * No terminal,clone o projeto: git clone https://github.com/Elygledson/SistemadeProdutividadeAcademica
2. * Usando o cmd execute o arquivo Admin.java que está contido na pasta main.

* Pacote de extensão utilizado no vscode "Java extension pack".

* Dica: https://refactoring.guru/design-patterns
