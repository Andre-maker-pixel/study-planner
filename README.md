#  Study Planner

[![CI](https://github.com/Andre-maker-pixel/study-planner/actions/workflows/ci.yml/badge.svg)](https://github.com/Andre-maker-pixel/study-planner/actions/workflows/ci.yml)

## Problema Real

Muitos estudantes têm dificuldade em estruturar sua rotina de estudos de forma eficiente. Sem planejamento claro, é comum subestimar o tempo disponível, não contabilizar as pausas e chegar ao fim do dia sem saber quanto tempo foi realmente dedicado a cada matéria.

## Proposta da Solução

O **Study Planner** é uma aplicação CLI (linha de comando) em Java que permite ao estudante cadastrar sua sessão de estudos informando horário de início, término, pausas e disciplinas. A aplicação calcula automaticamente o tempo efetivo de estudo descontando as pausas e distribui o tempo por disciplina, dando ao estudante uma visão realista da sua rotina.

## Público-alvo

Estudantes do ensino médio, técnico ou superior que desejam organizar e planejar melhor suas sessões de estudo.

## Funcionalidades Principais

- Cadastro do modelo de estudo (ex: Pomodoro, linear, etc.)
- Definição de horário de início e término
- Configuração de pausas (quantidade e duração)
- Registro de múltiplas disciplinas
- Cálculo automático do tempo real de estudo
- Distribuição do tempo por disciplina
- Feedback motivacional ao final

## Tecnologias Utilizadas

- Java 17
- Maven 3.x
- JUnit Jupiter 5.10.2
- Checkstyle 3.3.1

## Estrutura do Projeto

study-planner/
├── src/
│   ├── main/java/br/com/andremarchi/
│   │   ├── menu/OrganizadorDeEstudos.java
│   │   └── service/TempoEstudos.java
│   └── test/java/br/com/andremarchi/service/
│       └── TempoEstudosTest.java
├── .github/
│   └── workflows/
│       └── ci.yml
├── checkstyle.xml
├── pom.xml
├── .gitignore
└── README.md

## Instalação

**Pré-requisitos:** Java 17+ e Maven 3.x instalados.

```bash
# Clone o repositório
git clone https://github.com/Andre-maker-pixel/study-planner.git
cd study-planner

# Instale as dependências
mvn dependency:resolve
```

## Execução

```bash
# Compile e rode a aplicação
mvn compile exec:java -Dexec.mainClass="br.com.andremarchi.menu.OrganizadorDeEstudos"

# Ou gere o JAR e execute
mvn package
java -jar target/study-planner-1.0.0.jar
```

## Testes

```bash
mvn test
```

## Linting (Checkstyle)

```bash
mvn checkstyle:check
```

## Exemplo de Uso

==============================
PLANEJADOR DE ESTUDOS
Modelo de estudo: Pomodoro
Hora de início dos estudos: 8
Hora de término dos estudos: 12
Quantidade de pausas: 2
Minutos de cada pausa: 15
Quantas disciplinas você vai estudar? 2
Digite a disciplina 1: Matemática
Digite a disciplina 2: Física
========== SUA ROTINA ==========
Modelo de estudo: Pomodoro
Horário: 8.0h até 12.0h
Pausas: 2 pausa(s) de 15 minuto(s)
Disciplinas de hoje:

Matemática
Física
Tempo total disponível: 240 minutos (4,00 horas)
Tempo total de pausas: 30 minutos
Tempo real de estudo: 210 minutos (3,50 horas)
Cada disciplina terá aproximadamente 105 minutos.
Parabéns! Você terá um ótimo tempo de estudo.

## Versão

`1.0.0`

## Autor

André Marchi  
Repositório: [github.com/Andre-maker-pixel/study-planner](https://github.com/Andre-maker-pixel/study-planner)

