Unidad 3

MEMORIA DE LOS EJEMPLOS PRACTICOS CON GIT.

Primero instalamos git

```
sudo apt update
sudo apt install git
```

Una vez lo tenemos instalado hacemos la configuración inicial.
```
git config --global user.name "Ana Maria"
git config --global user.email anamaria1dam@gmail.com
git config --global core.editor nano
git config --global color.ui true
git config --global core.autocrlf true

```

Para consultar la lista de parametros y ver que todo era correcto usé el comando

```
git config --list
```

Creación de repositorio y subida de mis primeras pruevas:

``` 
mkdir pruevas
cd pruevas
git init
git status
```

Con el status veo que estoy en la rama master y que todavia no he hecho ningun commit, ni tengo ninguno pendiente asi que creo un fichero.
```
touch prueva.md
```

Si ahora hago un ''git status'' me dira que estoy en la rama master que no hay ningun commit pero si tengo el fichero que he creado para añadirlo si lo quiero.

Apartir de aqui me dispongo ha subir ficheros y hacer algunas pruevas.

```
git add prueva.md

git status

(me dice que ahora he añadido un nuevo fichero)7

git commit -a -m "Primer commit"
```

Finalmente usamos el comando 

```
git init
git status
git push
```

Una vez accedemos a github desde el buscador vemos que tengo ahi lo que he subido.