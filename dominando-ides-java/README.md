# dominando-ides-dio
### Projeto criado para o curso introdutório sobre IDE's, ministrado por Camila Cavalcante.

Neste curso são abordados assuntos importantes para qualquer desenvolvedor iniciante, abordando desde a configuração do ambiente de desenvolvimento até a instalação das principais IDE's utilizadas no mercado, **Eclipse e Intellij** e dicas de produtividade com a utilização dos atalhos das IDE's.

Estou aprendendo a utilizar o sistema operacional linux, portanto as anotações abaixos contemplam este sistema operacional, além de serem bem simples e para uso próprio. Caso queira uma explicação **_muito mais completa e que também contempla a configuração no Windows_**, abaixo está o link do repositório da autora do curso:
https://github.com/cami-la/curso-dio-dominando-ides-java

**1. Configurando variáveis de ambiente**

**No Linux**, Após download e instalação da **JDK**, é necessário alterar o arquivo **.bashrc**, setando a variável _JAVA_HOME_, responsável por armazenar qual é o caminho de instalação da JDK. Para localizar o caminho é necessário utilizar o comando **update-alternatives --config java**. No meu computador, o caminho é _/usr/lib/jvm/java-11-openjdk-amd64/bin/java_.
Nas últimas linhas do arquivo, adicionar as seguintes linhas:

``` 
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/bin/java
export JAVA_HOME
export PATH=$PATH:$JAVA_HOME
```

**2. Atalhos úteis na IDE Eclipse**
- **CTRL + N** - Criação de projetos, classes, interfaces, arquivos, etc;
- **CTRL + M** - Oculta ou exibe as janelas abertas na perspectiva, deixando aberto apenas a área de trabalho;
- **CTRL + 3** - Facilita a busca por comandos, bastando digitar o comando que deseja utilizar;
- **CTRL + SHIFT + O** - Organiza os import's de classes necessárias;
- **CTRL + SHIFT + F** - Organiza o código (Identação);
- **CTRL + SHIFT + T** - Localiza um arquivo específico dentro do projeto;
- **ALT + SETINHA** - Move o trecho de código selecionado, para baixo ou para cima;
- **CTRL + ALT + SETINHA** - Copia e replica o código selecionado, para baixo ou para cima;

**2.1. Atalhos do DEBUG**

Existem também alguns atalhos úteis que são utilizados para debugar o código:
- **F5** - Entra dentro do comando que será executado;
- **F6** - Exeuta o comando da linha atual e pula para próxima linha;
- **F7** - Volta para o comando externo;
- **F8** - Resume a execução do código;

A IDE Eclipse também tem integração com GIT, permitindo que a interação com o repositório remoto seja feita totalmente dentro da IDE.
