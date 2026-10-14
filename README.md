## Ordens dos Cavaleiros Radiantes — Aplicação Console Java (JDK 25)

Atividade III — Desenvolvimento de Sistemas**  
Disciplina: Programação Orientada a Objetos (POO)  
Tema: *Os Relatos das Guerras das Tempestades* (Brandon Sanderson)

## Integrantes da Dupla

Integrante 1: [Augusto Leo]
Integrante 2: [Nome Completo do Aluno 2]

## Descrição do Projeto

Esta aplicação é um jogo interativo de terminal/console desenvolvido em **Java (JDK 25)**, inspirado na pentalogia fantástica *Os Relatos das Guerras das Tempestades* (*The Stormlight Archive*) de Brandon Sanderson.

O sistema simula a jornada de um guerreiro em Roshar que enfrenta os Parshedianos em combate, evolui seus atributos e recita os Ideais Sagrados para se vincular a uma das Ordens de Cavaleiros Radiantes, desbloqueando poderes e armas lendárias como a **Espada Fractal**.

O projeto foi construído para demonstrar a aplicação prática e rigorosa dos **5 Pilares da Programação Orientada a Objetos (POO)** e a utilização dos recursos modernos de E/S simplificada do **JDK 25** (`IO.readln` e `IO.println`), garantindo uma interface interativa resiliente e livre de falhas (sem *crashes* por entradas inválidas).


##  Arquitetura do Código e Pilares de POO

O sistema possui 8 arquivos/classes com responsabilidades bem definidas:

| Arquivo / Classe | Papel na Arquitetura | Conceito de POO Aplicado |
| Juravel.java | Interface: Contrato para validação e exibição dos juramentos. | Interface |
| Radiantes.java | Classe Abstrata: Classe base que implementa `Juravel` e valida dados básicos. | Abstração & Encapsulamento |
| WindRunners.java | Subclasse: Corredores dos Ventos (Adesão e Gravitação). | Herança & Polimorfismo |
| SkyBreakers.java | Subclasse: Rompe-Céus (Gravitação e Divisão). | Herança & Polimorfismo |
| LightWeavers.java | Subclasse: Teceluzes (Iluminação e Transmutação). | Herança & Polimorfismo |
| BondsMiths.java | Subclasse: Vinculadores (Adesão e Tensão). | Herança & Polimorfismo |
| Personagem.java | Domínio/Entidade: Controla Vida, Estamina, Vitórias e Estado do jogador. | Encapsulamento |
| Main.java | Controlador/UI: Loop principal do menu e interface via terminal no JDK 25. | Validação & UX |

---

## Regras de Negócio e Progressão

A progressão do personagem é atrelada ao número de combates vencidos:

1. 2 Vitórias: Libera a opção de recitar o 1º Ideal Universal ("Vida antes da Morte, Força antes da Fraqueza, Jornada antes do Destino").
2. 4 Vitórias + 1º Ideal: Libera a Escolha da Ordem Radiante e a recitação do 2º Ideal.
3. 6 Vitórias + 2º Ideal: Libera a recitação do 3º Ideal e desbloqueia a Espada Fractal (que substitui os ataques simples de Gravitação/Fixação).
4. 8 Vitórias:** Libera a recitação do 4º Ideal (Nível Máximo de Radiante).

### Mecânicas de Combate:
- Ataque Base: Golpe físico simples (sem custo de estamina).
- Gravitação & Fixação: Invocação de poderes no 1º e 2º Ideais (gastam 25 de Estamina).
- Espada Fractal: Unlocked no 3º Ideal (95% de chance de acerto, ataca a alma do inimigo).
- Defender: Reduz o dano recebido (gasta 15 de Estamina).
- Esquivar: 60% de chance de desvio total e recupera +15 de Estamina.

## Pré-requisitos

- **Java Development Kit (JDK 25)** ou superior instalado.
- Terminal / Prompt de Comando (Git Bash, PowerShell, Terminal do Linux/macOS).

Verifique se a versão do Java instalada é a 25 executando:
```bash
java -version
