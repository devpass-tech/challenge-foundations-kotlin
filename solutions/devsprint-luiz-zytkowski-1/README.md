## Calculando salário líquido - 2022

### Calculando INSS

#### Tabela INSS (2022)

| Piso        | Teto        | Alíquota | Valor Devido |
|-------------|-------------|----------|--------------|
| R$ 0.00     | R$ 1 212.00 | 7.5%     | R$ 90.90     |
| R$ 1 212.01 | R$ 2 427.35 | 9%       | R$ 109.38    |
| R$ 2 427.36 | R$ 3 641.03 | 12%      | R$ 145.64    |
| R$ 3 641.04 | R$ 7 087.22 | 14%      | R$ 482.47    |

Dado salário bruto, identifique a faixa na qual o salário se encontra, e subtraia do salário o piso daquela faixa.
Com o resultado, aplique o percentual da faixa, e terá o valor a ser pago referente àquela faixa.
Some o valor encontrado ao valor de todas as faixas anteriores, e então teremos o valor devido de INSS.

Ex.: Salário bruto de R$ 3.500,00. Terceira faixa do INSS.

1. Piso da terceira faixa: R$ 2.427,36
2. Valor referente ao cálculo da faixa: 3500.00 - 2427.36 = 1072.64
3. Valor devido da terceira faixa: 12% de 1072.64 = 128.7168 (Arredondamento pra cima 128.72)
4. Soma valor devido da faixa + valores devidos das faixas anteriores: 128.72 + 109.38 + 90.90 = 329.00
5. Valor devido de INSS: R$ 329.00

**Observações Importantes**
- Caso o valor do salário bruto **ultrapasse** o teto da maior faixa, deve-se considerar **somente para o cálculo do INSS** o próprio teto da maior faixa.
  Ex.: Salário de R$ 9.500,00, considerar R$ 7.087,22 para cálculo do INSS.

### Calculando IRRF

#### Tabela IRRF (2022)

| Piso        | Teto        | Alíquota | Parcela a Deduzir |
|-------------|-------------|----------|-------------------|
| R$ 0.0      | R$ 1 903.98 | 0%       | R$ 0.0            |
| R$ 1 903.99 | R$ 2 826.65 | 7.5%     | R$ 142.80         |
| R$ 2 826.66 | R$ 3 751.05 | 15%      | R$ 354.80         |
| R$ 3 751.06 | R$ 4 664.68 | 22.50%   | R$ 636.13         |
| R$ 4 664.68 | Sem Teto    | 27.50%   | R$ 869.36         |

Após calcular o salário com INSS deduzido, podemos dar sequência para calcular o IRRF devido.

Dado salário pós dedução de INSS, identifique a faixa a qual aquele valor se encaixa, e aplique o percentual da alíquota.
Com o resultado encontrado, subtraia dele a parcela a reduzir. Esse é o valor do IRRF.

Ex.: Salário bruto de R$ 3.500,00.

1. Salário após dedução do INSS: 3171
2. Terceira faixa do IRRF. 15% de 3171 = 475.65
3. Valor encontrado menos parcela a deduzir da faixa: 475.65 - 354.80 = 120.85
4. Valor devido de IRRF: R$ 120.85

### Calculando salário líquido

Após definir valor de INSS, e valor de IRRF, subtraia-os do salário bruto, e terás como resultado, o salário líquido.

Ex.: Salário bruto de R$ 3.500,00.

1. IINSS: 329.00
2. IRRF: 120.85
3. Salário Líquido: 3500 - 329.00 - 120.85 = 3050.15
4. Salário Líquido: R$ 3050.15

## Observações do código

- Sempre que for necessário "loggar" algo, lembre-se de utilizar a classe `Loggable`
- Se você precisa ler elementos da pasta `resources`, lembre que existe um objeto chamado `ResourceReader`
- 