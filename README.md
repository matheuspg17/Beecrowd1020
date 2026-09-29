# Resolução exercício Beecrowd1020

## Descrição do problema
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

## Como Funciona
1. O usuário insere a quantidade total de dias, armazenada na variável `idadedias`.
2. O código calcula a idade em anos dividindo o total por 365: `ano = idadedias / 365;`.
3. O código calcula os meses restantes utilizando o resto da divisão por 365 e dividindo o saldo por 30: `mes = (idadedias % 365) / 30;`.
4. O código extrai os dias restantes através de sucessivas operações de resto da divisão (`%`): `dia = (idadedias % 365) % 30;`.
5. O programa exibe os valores finais formatados em linhas separadas acompanhados das respectivas nomenclaturas.
