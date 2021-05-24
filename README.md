No método de criação do DataSource, estamos informando através da annotation
@ConfigurationProperties(prefix = "spring.sqlserver.datasource") 
o nome base da conexão com o banco que configuramos no arquivo application.properties.

Repare que na annotation @EnableJpaRepositories, 
utilizada para informamos detalhes sobre localização dos repositórios e também da conexão, 
informamos o nome de nosso EntityManager criado pelos métodos e que também informamos um basePackage apontando o pacote de repositórios 
que relacionados ao banco de dados do caso.

No método de criação do EntityManagerFactory, repare que na invocação do método 
packages("com.example.demo.entities.h2")
do EntityManagerFactoryBuilder estamos informando o pacote em que se localiza nossas entidades relacionadas ao banco específico.

no diretório principal do projeto temos o DATA que contem o script dos bancos de dados criado via h2

para colocar outro banco de dados (ex: oracle, sql, etc) trocar no properties a config

# Datasource
h2.datasource.jdbcUrl=colocar url do banco desejado
h2.datasource.username=user
h2.datasource.password=password


