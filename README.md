# jsf-with-spring-joinfaces

## Projeto com o intuito de aprender e testar a integração do JSF com Primefaces.


### Java 1.8
### JoinFaces 4.7.2
### Spring Boot 2.7.2
### Tomcat 9
### Primefaces 11
### Lombok 1.18.24
<BR/>
Isso pode ser feito de várias formas, mas aprendi uma bem legal e simples.

Bom, tenho experiências com várias tecnologias e pesquisando vi que dá para integrar algumas delas, nesse caso, o JSF com o Spring.

Essa integração permite que o Spring gerencie nossos ManagedBeans.

Utilizei a biblioteca JoinFaces, um projeto da comunidade que permite o uso de JSF com o Spring Boot configurando automaticamente todas as bibliotecas JSF. 
Também utilizei a biblioteca Primefaces também do JoinFaces para melhorar o JSF.

A ideia aqui é somente mostrar como essa integração é feita, então fiz um formulário bem simples apenas para testar.

Fiz programaticamente o view scoped, pois o Spring não possui esse escopo, mas permite criarmos. Também podemos utilizar o RequestScoped (@Scoped(“request”)), isso vai depender da finalidade de uso.

Resumindo, o ecossistema Spring permite criar projetos Java de forma simples, rápida, prática e flexível.

Benefícios para os Managed Beans seriam uma injeção de dependência mais flexível, perfis de deploy etc.

O Spring simplifica as configurações para o JSF que fazemos em arquivos xml, por exemplo.

Link do projeto no heroku: https://jsf-with-spring-joinfaces.herokuapp.com/index.xhtml

