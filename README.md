## AREP-2021 LAB-2

Este proyecto cuenta de una calculadora de desviacion estandar y media usando una linkedlist
creada por los estudiantes mediante nodos. Ademas en el proyecto se usa maven y git para el desarrollo
de la calculadora y poder manejar de manera correcta el versionamiento de esta.
Ademas de esto lo que se busca en este proyecto es aprender a usar heroku y a hacer el despliegue en este de manera correcta.




### Prerequisitos

- Maven: Esta es la herramienta encargada de la creacion del proyecto y ayuda a manejar la despedencias del mismo
- Git: Software de control de versiones.
- JDK: Es la herramienta que sirve para desarrollar en java, versiones de este programa desde la 8 en adelante.
- Heroku: Debe tener instalado heroku cli en su computador si desea correr la aplicacion de manera local

### Instalacion

 Para poder instalar el programa debe clonar este repositorio en su computador, esto lo puede hacer con el sigueinte comando.
 >https://github.com/DavidAndresHerrera/AREP-LAB1.git

 antes de clonar el proyecto en su maquina local verifique la ubicacion donde quiere dejar el proyecto.
 
### Ejecucion y empaquetado

Para empaquetar y ejecutar el programa usando maven ingresa el siguiente comando dentro de la carpeta Media_DsvEstandar-app
> mvn package

Cuando ya el proyecto ha compilado, puede proceder a ejecutarlo, use el siguiente comando sobre el directorio SparkWebApp

> java -cp target/SparkWebApp-1.0-SNAPSHOT.jar edu.escuelaing.arep.SparkWeb



### Ejecucion de pruebas

Despues de empaquetado el programa y saber que esta corriendo de manera correcta ingresa el sigueitne comando
> mvn test

![](img/pruebas.png)

### Despliegue Heroku 

En este link podra ver el despliegue de la aplicacion en heroku.

> ![https://still-wave-10354.herokuapp.com/](https://miro.medium.com/max/3600/1*N6ojB_VgECHwVgpoG_c1Yw.png)

Al ingresar a la pagina, la pagina principal se debe ver asi :

![](img/heroku.png)

### Integracion continua

En este link puede encontrar la integracion continua en CircleCi

> ![https://app.circleci.com/pipelines/github/DavidAndresHerrera/AREP-LAB2](https://d3r49iyjzglexf.cloudfront.net/logo-wordmark-26f8eaea9b0f6e13b90d3f4a8fd8fda31490f5af41daab98bbede45037682576.svg)


### Licencia
GNU General Public License v3.0 

### Autor 

#### David Andres Herrera Moya 
