# apiCovid
API Rest que tem como objetivo trazer os dados mais detalhados, utilizando Kotlin, Spring, JPA e SQL Server

## Como utlizar?

**1. Baixar os dados em CSV**
``` Bash
https://brasil.io/dataset/covid19/caso_full/
```

**2. Criar banco de dados**

```SQL Server
create database BDCovid
```

**3. Criar tabelas**


```SQL Server

create table [dbo].[t_Covid_Buffer](
	[date]                        		[varchar](max)
	,[city_ok]                    		[varchar](max)
	,[state]                      		[varchar](max)
	,[city]                       		[varchar](max)
	,[place_type]                 		[varchar](max)
	,[confirmed]                  		[varchar](max)
	,[deaths]                     		[varchar](max)
	,[order_for_place]            		[varchar](max)
	,[is_last]                   		[varchar](max)
	,[estimated_population_2019] 	       	[varchar](max)
	,[estimated_population]              	[varchar](max)
	,[city_ibge_code]            	       	[varchar](max)
	,[confirmed_per_100k_inhabitants]    	[varchar](max)
	,[death_rate]                        	[varchar](max)
)
```


```SQL Server
CREATE TABLE [dbo].[t_Covid](
	[id]      [int] IDENTITY(1,1) NOT NULL,
	,[data]    [date] NULL,
	,[cidade]  [varchar](100) NULL,
	,[estado]  [varchar](100) NULL,
	,[tipo]    [int] NULL,
	,[casos]   [int] NULL,
	,[mortes]  [int] NULL
) 
```


**4. Fazer o bulk insert para transformar o CSV em um Dataset**


```SQL Server

declare
    -- Diretorio do seu arquivo baixado
    @diretorio     varchar(max) = 'C:\covid.csv',
    
    -- Nome da sua tabela buffer
    @tabelaBuffer  varchar(100) = 't_Covid_Buffer' 

      exec('
        bulk insert dbo.'+ @tabelaBuffer +' 
        from '''+ @diretorio +''' 
        with
        (  
          FIRSTROW = 1,
          CODEPAGE = ''ACP'',
          fieldterminator = '';'',  
          rowterminator = ''\n''    
        )    
      ')
```

## Explore Rest APIs

A aplicação será iniciada em <http://localhost:8090>.

Métodos de consulta.

    GET covid/api/date/{date}
    GET covid/api/uf/{uf}
    GET covid/api/uf/date/{uf}/{date}
    GET covid/api/city/{city}
    GET covid/api/city/date/{city}/{date}
  
Faça seus testes utilizando postman ou no Chrome.
