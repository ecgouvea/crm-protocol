crm-protocol
===================

Micro serviço responsável por prover número de protocolo para identificação única de atendimento.

----------

Requisitos
-------------

Todas os itens relacionados abaixo serão necessários para compilar e/ou executar o micro serviço. 

- java jdk-8u131-windows-x64.
- docker version 17.06.0-ce 
- maven 3.3.9

Artefatos

- spring-boot-starter-parent 1.5.1.RELEASE
- spring-cloud-netflix 1.3.1.RELEASE
- docker-maven-plugin 0.4.14

> **Nota:** A correta execução desse projeto será garantida caso seja utilizada as versões citadas anteriormente.

Compilar
-------------
No diretório raiz do projeto executar: **mvn clean install docker:build**

Executar
-------------

Executar: **docker run --name i1-crm-protocol -d -p 8181:8181 --add-host infra-eureka:$(docker inspect --format '{{.NetworkSettings.IPAddress}}' i1-infra-eureka) -it crm-protocol cat /etc/hosts**

Acessar: **http://localhost:8181/protocols/new**