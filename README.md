## Sistema de Notificações

### Descrição

Desenvolva uma simulação de um sistema de notificações que utilize o Princípio de Segregação de Interface (ISP) em seu desenvolvimento, criando interfaces separadas para diferentes tipos de notificações, como EmailNotification e SMSNotification.

### **Entrada**

O programa receberá dois parâmetros de entrada: o tipo de notificação (string) - email ou sms, e a mensagem (string) a ser enviada.

### **Saída** 

O programa deve imprimir uma confirmação da notificação enviada (string): `{tipo} enviado: {mensagem}`.

Se o tipo de notificação não for válido, a mensagem de retorno deve ser: `Tipo de notificação inválido.`

### **Exemplos:**

|Entrada|Saída|
|---|---|
|email, Ola Mundo!|Email enviado: Ola Mundo!|
|sms, Bem-vindo.|SMS enviado: Bem-vindo.|
|fax, Rua Dominick|Tipo de notificacao invalido.|

**5. Observações:**

- Aplique o Princípio de Segregação de Interface (ISP) criando interfaces específicas para cada tipo de notificação.
- Considere a possibilidade de criar exceções ou tratamentos adequados para casos em que ocorram tipos de notificação inválidos.