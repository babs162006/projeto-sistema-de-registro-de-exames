# Sistema de Registro de Exames Laboratoriais

O sistema simula o funcionamento de um laboratório de análises clínicas, permitindo o cadastro de pacientes, registro de exames, consulta de resultados e geração de arquivos de encerramento dos atendimentos.

---

## Funcionalidades

- Carregamento de exames a partir de arquivo `.txt`
- Cadastro de novos pacientes
- Associação de exames aos pacientes
- Cálculo automático da data de liberação dos resultados
- Consulta de pacientes por CPF
- Geração de arquivo de finalização dos atendimentos
- Exibição de estatísticas do dia

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Vetores Genéricos
- ArrayList
- Manipulação de Arquivos (`BufferedReader` e `BufferedWriter`)
- API de Datas (`LocalDate`)

---

## Estrutura do Projeto

```text
.
├── Laboratorio.java
├── Exame.java
├── PedidoExame.java
├── Vetor.java
├── exames.txt
└── README.md
```

---

## Classes do Sistema

### Exame

Representa um exame disponível no laboratório.

**Atributos:**

- abreviação
- nome
- quantidade de dias para resultado

---

### PedidoExame

Representa um pedido de exames realizado por um paciente.

**Atributos:**

- CPF
- Nome
- Data de realização
- Data de liberação
- Lista de exames solicitados

---

### Vetor<T>

Implementação própria de uma Lista Linear utilizando vetor genérico.

**Métodos principais:**

- `add()`
- `remove()`
- `get()`
- `set()`
- `size()`
- `isEmpty()`

---

### Laboratorio

Classe principal responsável pelo funcionamento da aplicação.

**Responsabilidades:**

- Exibir menu
- Ler arquivo de exames
- Cadastrar pacientes
- Consultar pacientes
- Gerar arquivo de encerramento
- Exibir estatísticas

---

## Arquivo de Entrada

O sistema utiliza o arquivo `exames.txt`, contendo os exames disponíveis.

Formato:

```csv
abreviatura,nome_exame,quantidade_dias
GLI,Glicose,2
TSH,Hormonio estimulante da tireoide,9
VITD,Vitamina D,12
```

---

## Como Executar

### Compilar

```bash
javac *.java
```

### Executar

```bash
java Laboratorio
```

Certifique-se de que o arquivo `exames.txt` esteja na mesma pasta do projeto.

---

## Menu Principal

```text
1. Carregar dados de exame
2. Novo paciente
3. Consultar paciente
4. Finalização dos atendimentos
5. Estatísticas
6. Sair
```

---

## Exemplo de Cadastro

```text
CPF: 12345678900
NOME: João Silva

EXAME 1: TSH
EXAME 2: GLI
EXAME 3: XXX
```

Resultado:

```text
Os exames estarão disponíveis no dia 19/06/2026 a partir das 17h
```

---

## Estatísticas Implementadas

O sistema apresenta:

- Total de pacientes atendidos
- Total de exames realizados

---

## Arquivo Gerado na Finalização

Ao finalizar os atendimentos, o sistema cria automaticamente um arquivo com o formato:

```text
AAAAMMDD.txt
```

Exemplo:

```text
20260610.txt
```

Conteúdo:

```text
11122233345;SOLANGE BARROS;13/03/2026;20/03/2026;TSH;URE;GLI
```

---

## Conceitos Aplicados

- Programação Orientada a Objetos
- Listas Lineares
- Vetores Genéricos
- Busca Sequencial
- Manipulação de Arquivos
- Tratamento de Exceções
- Estruturas de Dados
- Manipulação de Datas

---

## Disciplina

**Estrutura de Dados**  
Universidade Presbiteriana Mackenzie
