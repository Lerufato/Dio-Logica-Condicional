# Aprendendo sobre Lógica condicional

## Operadores Relacionais

São símbolos especiais capazes de realizar comparações entre determinados operandos e retornar um resultado

### Tipos:

- Similaridade: igual (==), diferente (!=)
- Tamanho: maior(>), maior  ou igual (>=), menor(<), menor ou igual (<=)

## Operadores Lógicos

São  símbolos especiais capazes de realizar comparações lógicas entre operandos lógicos ou expressões e, em seguida, retornar um resultado

### Tipos:

- Conjunção: ambos os operandos ou expressões são verdadeiras (&& - and)
- Disjunção: ambos os operandos ou expressões são falsos (|| - or)
- Disjunção exclusiva: operações que só são verdade quando ambos os operandos são opostos(^)
- Negação: operação que inverte o valor lógico de um operando ou expressão(!)

## Controle de Fluxo

São estruturas que tem a capacidade de direcionar o fluxo de execução do código.

### Tipos:

- Decisão: if, if-else, if-else-if, switch, e operador ternário
- Repetição: for, while, do while
- Interrupção: break, continue, return

### Boas Práticas:

- switch - usar para valores exatos
- if - usar para expressões booleanas
- evitar o uso de muitos if's aninhados e em flecha
- usar o default do switch para apontar um valor errado, não usar para casos genéricos

## Blocos

São grupos de 0 ou mais códigos que trabalham em conjunto para executar uma operação. 
É representado com uso de chaves {}

### Tipos:

- Locais: dentro de métodos
- Estáticos: dentro de classes
- Instância: dentro de classes
