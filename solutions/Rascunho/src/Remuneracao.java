public class Remuneracao: {
        def __init__(self, salario):
        self.salario = salario
        self.desconto_inss = 0

        # Função que calcula o inss
        def calcular_inss(self):

        if self.salario <= 1212:
        self.desconto_inss = 7.5/100

        else if self.salario < 2427.35:
        self.desconto_inss = 9/100

        elif self.salario < 3641.03:
        self.desconto_inss = 12/100

        else:
        self.desconto_inss = 14/100

        return self.salario * self.desconto_inss

        # Função que calcula o imposto de renda
        def calcular_imposto_de_renda(self):

        if self.salario <= 1903.98:
        self.imposto_de_renda = 0

        if self.salario < 2826.65:
        self.imposto_de_renda = 7.5/100

        else if self.salario < 3751.05:
        self.imposto_de_renda = 15/100

        else if self.salario < 4664.68:
        self.imposto_de_renda = 22/100

        else:
        self.imposto_de_renda = 27.5/100

        return self.salario * self.imposto_de_renda

        #Chamada da classe e métodos
        salario = float(input("Digite seu salário bruto: "))
        calculo = Remuneracao(salario)
        salario_liquido = salario - calculo.calcular_imposto_de_renda() - calculo.calcular_inss()

        #printando na tela
        print('O seu desconto do inss é de: R$ %.2f' %(calculo.calcular_inss()))
        print('O seu desconto do imposto de renda é de: R$ %.2f' %(calculo.calcular_imposto_de_renda()))
        print(f'O seu salário liquído é de é de: R$ %.2f' %(salario_liquido)){
}}
