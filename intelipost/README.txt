Sobre o projeto Teste prático para Backend Developer:

Tentei seguir à risca a utilização dos itens obrigatórios: (Java 8 + Spring boot + Spring MVC).
Não tenho muita familiaridade com Spring Framework. Já tive oportunidade de realizar algumas manutenções pontuais em algumas aplicações, visando alguma melhoria/correção, porém apenas em situações de baixa complexidade.
Não tive experiência anterior na construção de um sistema por completo(tanto backend como frontend), do zero, utilizando o framework. Fiz apenas alguns  exemplos simples em casa, para efeito de estudo.

Pontos de dificuldade:
A princípio comecei a construção da aplicação, utilizando apenas Spring MVC, e fazendo deploy numa instalação do Tomcat(não embarcado);
Tive uma dificuldade inicial para entender a navegação entre páginas;
Tive uma dificuldade em entender a integração entre o Spring e o banco de dados em memória(H2) sem a necessidade de qualquer configuração;
Dado a falta de conhecimento sobre como configurar o framework, seja utilizando anotações seja utilizando arquivos de configuração, encontrei dificuldade para aplicar o Spring Boot para subir a aplicação com o Tomcat embedado e que suportasse Dynamic Web Module 3.1, pois o Spring sobe, por padrão, com Tomcat 7.0.

Passos para execução:
1. Fazer o clone do projeto do Github (https://github.com/AlexandreMagno2017/job-backend-developer.git);
2. Ter um TOMCAT versão 8 previamente instalado;
3. Importar o projeto no Eclipse;
4. Executar:
	mvn clean
	mvn package
	mvn install
5. Ter configurado no Eclipse, em Servers, a instalação do Tomcat8;
6. Ao executar a primeira vez será solicitado para escolher o servidor desejado, no caso Tomcat 8;

Api's disponibilizadas:
- Simular o cadastro previo do usuario.
http://localhost:8085/intelipost/cadastrar

- Simular o login do usuario no sistema.
http://localhost:8085/intelipost/login

- Listar os usuarios cadastrados.
http://localhost:8085/intelipost/users

Como proposta de escalabilidade, para atender às milhares de requisições a adoção pela Intelipost de Docker e Kubernetes me parece mesmo o caminho, visto que é possível escalar os micro-serviços de maneira fácil e flexível, conforme a demanda do site. Certamente o acesso ao banco também deve ser monitorado e dimensionado para suportar o volume de acessos.

O que o projeto não atende quanto às especificações dadas:
- Aplicação não sobe com Tomcat embarcado (necessário ter instalado o Tomcat 8);
- Não tem testes unitários;
- Não foi disponibilizado uma instância rodando live.