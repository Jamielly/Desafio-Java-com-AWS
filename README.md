# Desafio 1: 

<div align="center"> 
<h2>
Validando a Força de Senhas no IAM 🔑
</h2>
</div>
<div align="justify">
A tarefa consiste em desenvolver um programa para validar a força das senhas dos usuários no AWS Identity and Access Management (IAM) com base em critérios predefinidos de segurança. Os requisitos de segurança para uma senha válida são os seguintes:

A senha deve ter no mínimo 8 caracteres.
A senha deve conter pelo menos uma letra maiúscula (A-Z).
A senha deve conter pelo menos uma letra minúscula (a-z).
A senha deve conter pelo menos um número (0-9).
A senha deve conter pelo menos um caractere especial, como !, @, #, $, %, etc.
A entrada do programa será uma única string representando a senha que precisa ser validada. A saída deve incluir uma mensagem indicando se a senha atende ou não aos requisitos de segurança, juntamente com um feedback explicativo sobre os critérios considerados.

🔻Exemplo de Entrada e Saída:

🔸Entrada:

Senha: "0101"

Saída: "Sua senha é muito curta. Recomenda-se no mínimo 8 caracteres."

🔸Entrada:

Senha: "030609saturno*"

Saída: "Sua senha atende aos requisitos de segurança. Parabéns!"

🔸Entrada:

Senha: "010203Jupiter"

Saída:"Sua senha não atende aos requisitos de segurança."

O programa avalia se a senha cumpre todos os requisitos de segurança e fornece feedback específico sobre quais critérios não estão sendo atendidos.

# Desafio 2: 

<div align="center"> 
<h2>
Velocidade de Download AWS 🏃🏃‍♂️🏃‍♀️💨
</h2>
</div>
<div align="justify">
  A tarefa consiste em criar uma calculadora de velocidade de download para a "DIOCloudTech Solutions", uma empresa especializada em serviços em nuvem baseados na AWS. O objetivo é estimar a velocidade de download com base na localização geográfica do servidor de origem e do dispositivo do usuário, considerando que quanto mais próximo o servidor, melhor será a velocidade de download. O cálculo da velocidade de download é feito usando a seguinte fórmula:

VD = VelocidadePlano / (1 + (DistanciaServidores / 100))

A velocidade de download estimada não pode exceder a velocidade do plano de internet contratado. A entrada do programa consiste em dois valores:

Distância física entre o servidor de origem e o dispositivo do usuário (em quilômetros).
Velocidade do plano de internet contratado pelo usuário (em Mbps).
A saída da calculadora deve fornecer a estimativa da velocidade de download (em Mbps) com base na fórmula de cálculo que leva em consideração a distância física e a velocidade do plano de internet.

🔻Exemplo de Entrada e Saída:

🔸Entrada:
Distância física entre o servidor e o dispositivo: 200 km
Velocidade do plano de internet: 50 Mbps

🔸Saída:
Velocidade de download estimada: 16.67 Mbps

🔸Entrada:
Distância física entre o servidor e o dispositivo: 600 km
Velocidade do plano de internet: 100 Mbps

🔸Saída:
Velocidade de download estimada: 14.29 Mbps

🔸Entrada:
Distância física entre o servidor e o dispositivo: 200 km
Velocidade do plano de internet: 100 Mbps

🔸Saída:
Velocidade de download estimada: 33.33 Mbps

# Desafio 3: 

<div align="center"> 
<h2>
Calculando Seus Custos na AWS 💸🤑
</h2>
</div>
<div align="justify">

Neste desafio, você deve desenvolver um programa Java para calcular os custos de execução de aplicativos na Amazon Web Services (AWS) com base na quantidade de servidores e bancos de dados necessários. A seguir, as etapas do desafio:

🔻Defina as taxas:

O custo por hora de um servidor é de R$ 0,15.
O custo por hora de um banco de dados é de R$ 0,05.

🔻Coletando informações:

Solicite ao usuário a quantidade de servidores necessários.
Solicite ao usuário a quantidade de bancos de dados necessários.

🔻Calcule os custos:

Multiplique a quantidade de servidores pelo custo por hora de um servidor.
Multiplique a quantidade de bancos de dados pelo custo por hora de um banco de dados.
Some esses valores para obter o custo total.

🔻Exiba o resultado:

Mostre ao usuário o custo total do uso da AWS por hora.

🔻Exemplo de Entrada e Saída:

🔸Entrada:

Quantidade de servidores: 3

Quantidade de bancos de dados: 2

🔸Saída:

"Custo total de uso da AWS por hora: R$ 0.55"

🔸Entrada:

Quantidade de servidores: 10

Quantidade de bancos de dados: 0

🔸Saída:

"Custo total de uso da AWS por hora: R$ 1.50"

🔸Entrada:

Quantidade de servidores: 2

Quantidade de bancos de dados: 3

🔸Saída:

"Custo total de uso da AWS por hora: R$ 0.45"

O programa calcula o custo total com base nas entradas do usuário e exibe o resultado formatado em reais (R$).

# Desafio 4: 

<div align="center"> 
<h2>
Regras Para Dimensionamento de Infraestrutura com EKS 🔂🌨️
</h2>
</div>
<div align="justify">

  Neste desafio, você deve desenvolver um programa Java para calcular o número mínimo de nodes e servidores necessários para suportar um aplicativo no cluster do EKS (Elastic Kubernetes Service). As regras básicas são:

Cada node pode suportar até 10 pods.

Cada servidor EC2 pode suportar até 4 pods.

Aqui estão as etapas do desafio:

🔻Inicialização:

Defina as regras básicas de dimensionamento, ou seja, a capacidade de pods por node e pods por servidor.

🔻Recebendo informações:

Solicite ao usuário que insira o número total de pods do aplicativo.

🔻Cálculo:

Calcule o número mínimo de nodes necessários, arredondando para cima o resultado da divisão do número total de pods pelo número de pods por node.

Calcule o número mínimo de servidores necessários, arredondando para cima o resultado da divisão do número total de pods pelo número de pods por servidor.

🔻Recomendações:

Se o número mínimo de nodes for menor ou igual a 1, exiba a recomendação de usar um único node.

Se o número mínimo de servidores for menor ou igual a 1, exiba a recomendação de usar um único servidor.

🔻Exemplo de Entrada e Saída:

🔸Entrada:

Número total de pods: 15

🔸Saída:

"Número mínimo de nodes necessário: 2"

"Número mínimo de servidores necessário: 4"

🔸Entrada:

Número total de pods: 7

🔸Saída:

"Recomendamos usar um único node"

"Número mínimo de servidores necessário: 2"

🔸Entrada:

Número total de pods: 10

🔸Saída:

"Recomendamos usar um único node"

"Número mínimo de servidores necessário: 3"

O programa calcula o número mínimo de nodes e servidores com base nas entradas do usuário e fornece recomendações conforme as regras de dimensionamento.

# Desafio 5: 

<div align="center"> 
<h2>
Monitoramento e Análise de Logs AWS 🫣🤔🕵️‍♀️
</h2>
</div>
<div align="justify">

Neste desafio, você deve desenvolver um programa em Java para monitorar e analisar logs gerados na infraestrutura da AWS (Amazon Web Services). O programa receberá informações de eventos de diferentes serviços da AWS e realizará uma análise dos logs.

🔸Entrada:

A primeira linha indica a quantidade de logs a serem analisados.

As linhas seguintes contêm informações de logs de serviços da AWS no formato:

yyyy-MM-dd HH:mm:ss,{Nome do Serviço AWS},{Log do Evento Registrado Neste Serviço AWS}

🔸Saída:

O programa exibe os seguintes resultados da análise:

A quantidade de eventos específicos para cada log de serviço AWS lido na entrada, em ordem de leitura.

"Eventos por serviço:"

"{Nome do 1º Serviço AWS}:{Quantidade de Logs do 1º Serviço AWS}"

"{Nome do 2º Serviço AWS}:{Quantidade de Logs do 2º Serviço AWS}"

"{Nome do Nº Serviço AWS}:{Quantidade de Logs do Nº Serviço AWS}"
#

🔻O serviço AWS que teve a maior quantidade de eventos registrados:

"Maior:{Nome do Serviço AWS}"
#

🔻O serviço AWS que teve a menor quantidade de eventos registrados:

"Menor:{Nome do Serviço AWS}"
#

🔻Exemplo de Entrada e Saída:

🔸Entrada:

Quantidade de logs: 1

Log 1: "2023-07-24 10:15:32,RDS,Database instance db-01a failed to start"

🔸Saída:

"Eventos por serviço:"

"RDS:1"

"Maior:RDS"

"Menor:RDS"

🔸Entrada:

Quantidade de logs: 3

Log 1: "2023-07-24 10:15:32,EC2,Instance i-12345 started"

Log 2: "2023-07-24 10:17:45,EC2,Instance i-67890 stopped"

Log 3: "2023-07-24 10:20:11,S3,Bucket example-bucket created"

🔸Saída:

"Eventos por serviço:"

"S3:1"

"EC2:2"

"Maior:EC2"

"Menor:S3"

🔸Entrada:

Quantidade de logs: 6

Log 1: "2023-07-24 10:15:32,EC2,Instance i-12345 started"

Log 2: "2023-07-24 10:17:45,S3,Bucket example-bucket created"

Log 3: "2023-07-24 10:20:11,EC2,Instance i-67890 stopped"

Log 4: "2023-07-24 10:23:05,Lambda,Function example-function executed successfully"

Log 5: "2023-07-24 10:25:39,S3,Object example.txt deleted from bucket example-bucket"

Log 6: "2023-07-24 10:28:02,EC2,Instance i-98765 started"

🔸Saída:

"Eventos por serviço:"

"S3:2"

"EC2:3"

"Lambda:1"

"Maior:EC2"

"Menor:Lambda"

O programa analisa os logs da AWS, conta os eventos específicos para cada serviço e identifica o serviço com o maior e o menor número de eventos registrados.

#
 <p>Feito com :heart: e 🤓</p>
