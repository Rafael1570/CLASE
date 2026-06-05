# Guía rápida: proyectos Maven en Eclipse, `pom.xml`, JSON y mapas en Java

## 1. Qué es Maven

Maven es una herramienta que ayuda a organizar un proyecto Java y gestionar librerías externas.

En un proyecto Maven, el archivo principal de configuración es:

```text
pom.xml
```

Este archivo indica:

- El nombre del proyecto.
- La versión.
- La versión de Java.
- Las librerías externas necesarias.
- La configuración utilizada para compilar.

---

## 2. Cómo crear un proyecto Maven en Eclipse

### Paso 1. Crear el proyecto

En Eclipse:

```text
File
→ New
→ Maven Project
```

Marca:

```text
Create a simple project (skip archetype selection)
```

Pulsa:

```text
Next
```

Rellena los campos:

```text
Group Id: com.rafael
Artifact Id: nombre-del-proyecto
Version: 0.0.1-SNAPSHOT
Packaging: jar
```

Después pulsa:

```text
Finish
```

### Qué significa cada campo

| Campo | Significado | Ejemplo |
|---|---|---|
| `groupId` | Identifica al autor, empresa o grupo | `com.rafael` |
| `artifactId` | Nombre del proyecto | `ejercicio2-proyectos-json` |
| `version` | Versión del proyecto | `0.0.1-SNAPSHOT` |
| `packaging` | Tipo de archivo generado | `jar` |

---

## 3. Estructura básica de un proyecto Maven

La estructura habitual es:

```text
nombre-del-proyecto
├── src/main/java
├── src/main/resources
├── src/test/java
├── src/test/resources
└── pom.xml
```

### Dónde colocar cada archivo

| Tipo de archivo | Carpeta |
|---|---|
| Clases `.java` | `src/main/java` |
| Archivos `.json` | `src/main/resources` |
| Archivos `.txt` | `src/main/resources` |
| Archivos `.xml` | `src/main/resources` |
| Pruebas | `src/test/java` |
| Configuración Maven | `pom.xml` |

Ejemplo:

```text
src/main/java
└── com.rafael.ejercicio2
    ├── Proyecto.java
    └── Main.java

src/main/resources
└── proyectos.json
```

---

## 4. Crear un paquete y una clase

### Crear un paquete

Haz clic derecho sobre:

```text
src/main/java
```

Después:

```text
New
→ Package
```

Ejemplo de nombre:

```text
com.rafael.ejercicio1
```

### Crear una clase

Haz clic derecho sobre el paquete:

```text
New
→ Class
```

Para crear la clase principal, escribe:

```text
Main
```

Marca:

```text
public static void main(String[] args)
```

---

## 5. Qué debes saber del archivo `pom.xml`

### `pom.xml` mínimo para Java 8

Si en Eclipse aparece:

```text
JRE System Library [JavaSE-1.8]
```

puedes utilizar:

```xml
<project>
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.rafael</groupId>
    <artifactId>nombre-del-proyecto</artifactId>
    <version>0.0.1-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
</project>
```

### `pom.xml` mínimo para Java 17

Si el equipo utiliza Java 17:

```xml
<project>
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.rafael</groupId>
    <artifactId>nombre-del-proyecto</artifactId>
    <version>0.0.1-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
</project>
```

### Importante

La versión declarada en el `pom.xml` debe coincidir con la versión de Java configurada en Eclipse.

Si Eclipse utiliza Java 8 y el `pom.xml` intenta compilar con Java 17, pueden aparecer errores.

---

## 6. Añadir librerías con Maven

Las librerías externas se colocan dentro de:

```xml
<dependencies>
    ...
</dependencies>
```

### Dependencias Jackson incluidas en los apuntes

Para trabajar con JSON y XML, los apuntes incluyen:

```xml
<dependencies>

    <!-- Jackson Core -->
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-core</artifactId>
        <version>2.15.1</version>
    </dependency>

    <!-- Jackson Databind -->
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.15.1</version>
    </dependency>

    <!-- Jackson XML Dataformat -->
    <dependency>
        <groupId>com.fasterxml.jackson.dataformat</groupId>
        <artifactId>jackson-dataformat-xml</artifactId>
        <version>2.15.1</version>
    </dependency>

</dependencies>
```

### Qué hace cada dependencia

| Dependencia | Para qué sirve |
|---|---|
| `jackson-core` | Funciones básicas de lectura y escritura |
| `jackson-databind` | Convierte JSON en objetos Java y objetos Java en JSON |
| `jackson-dataformat-xml` | Permite trabajar con XML usando Jackson |

### Para ejercicios únicamente con JSON

En muchos ejercicios basta con:

```xml
<dependencies>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.15.1</version>
    </dependency>
</dependencies>
```

`jackson-databind` ya incorpora las piezas necesarias para trabajar con JSON mediante Maven.

La dependencia `jackson-dataformat-xml` solo es necesaria cuando el ejercicio pide trabajar con XML.

---

## 7. Actualizar Maven después de modificar el `pom.xml`

Después de guardar el `pom.xml`:

```text
Clic derecho sobre el proyecto
→ Maven
→ Update Project...
```

También puedes utilizar:

```text
Alt + F5
```

Si has añadido o modificado dependencias, marca:

```text
Force Update of Snapshots/Releases
```

Después pulsa:

```text
OK
```

Dentro del proyecto debería aparecer:

```text
Maven Dependencies
```

---

## 8. Comprobar que Maven funciona

Haz clic derecho sobre el proyecto:

```text
Run As
→ Maven Build...
```

En el apartado `Goals`, escribe:

```text
clean package
```

Pulsa:

```text
Run
```

Si todo funciona correctamente, al final de la consola aparecerá:

```text
BUILD SUCCESS
```

---

## 9. Maven sin Internet

Maven puede funcionar sin Internet si las librerías ya se han descargado anteriormente.

Las dependencias se guardan normalmente en:

```text
C:\Users\TU_USUARIO\.m2\repository
```

Antes del examen:

1. Abre el proyecto con Internet.
2. Actualiza Maven.
3. Ejecuta `clean package`.
4. Desconecta el Wi-Fi.
5. Vuelve a abrir Eclipse.
6. Ejecuta nuevamente el proyecto.

Si sigue funcionando, las dependencias ya están guardadas localmente.

---

## 10. Error del validador XML del `pom.xml`

A veces Eclipse muestra:

```text
cvc-elt.1.a: Cannot find the declaration of element 'project'
```

Puede ocurrir porque el validador XML intenta leer un esquema externo y no lo consigue.

Para un ejercicio básico, puedes utilizar un `pom.xml` sencillo como este:

```xml
<project>
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.rafael</groupId>
    <artifactId>nombre-del-proyecto</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</project>
```

Después actualiza Maven:

```text
Clic derecho sobre el proyecto
→ Maven
→ Update Project...
```

---

## 11. Excepciones importantes

### `IOException`

Significa:

```text
Fallo de entrada o salida
```

Suele aparecer al trabajar con archivos.

Ejemplos:

- El archivo no existe.
- La ruta es incorrecta.
- No se puede leer el archivo.
- No se puede escribir el archivo.

Ejemplo de uso:

```java
try {
    // Código que trabaja con archivos
} catch (IOException e) {
    System.out.println("error al trabajar con el archivo");
}
```

### `ClassNotFoundException`

Significa que Java no encuentra la clase que se intenta utilizar.

Puede ocurrir cuando:

- La librería `.jar` no está incluida.
- La clase no aparece en el `classpath`.
- El nombre de la clase está mal escrito.
- Falta indicar el paquete.
- Se intenta cargar dinámicamente una clase inexistente.

Ejemplo habitual con archivos binarios:

```java
try {
    // Lectura del objeto
} catch (IOException e) {
    System.out.println("error de entrada o salida");
} catch (ClassNotFoundException e) {
    System.out.println("java no encuentra la clase");
}
```

### Otras excepciones frecuentes

| Excepción | Cuándo ocurre |
|---|---|
| `ArithmeticException` | División entre cero |
| `ArrayIndexOutOfBoundsException` | Posición incorrecta de un array |
| `NullPointerException` | Variable con valor `null` |
| `NumberFormatException` | Conversión incorrecta de texto a número |
| `InputMismatchException` | Entrada incorrecta mediante teclado |

---

## 12. Trabajar con mapas

### Declarar un mapa

Ejemplo:

```java
Map<String, Evento> mapaEventos = new HashMap<String, Evento>();
```

En este caso:

- La clave es un `String`, por ejemplo: `"E001"`.
- El valor es un objeto `Evento`.

### Añadir un elemento

```java
mapaEventos.put(evento.getId(), evento);
```

### Comprobar si existe una clave

```java
if (mapaEventos.containsKey(id)) {
    System.out.println("el evento ya existe");
}
```

### Eliminar un elemento directamente

```java
mapaEventos.remove(id);
```

---

## 13. Recorrer un mapa con `entrySet()`

Para obtener la clave y el objeto al mismo tiempo:

```java
for (Map.Entry<String, Evento> entrada : mapaEventos.entrySet()) {

    String id = entrada.getKey();
    Evento evento = entrada.getValue();

    System.out.println(
            "id: " + id +
            ", título: " + evento.getTitulo() +
            ", fecha: " + evento.getFecha() +
            ", completado: " + evento.isCompletado()
    );
}
```

### Conceptos importantes

| Método | Resultado |
|---|---|
| `entrySet()` | Obtiene las parejas clave-valor |
| `getKey()` | Devuelve la clave |
| `getValue()` | Devuelve el objeto almacenado |

---

## 14. Eliminar elementos con un iterador

Cuando recorres una colección y necesitas borrar elementos durante el recorrido, utiliza un iterador:

```java
Iterator<Map.Entry<String, Evento>> iterator =
        mapaEventos.entrySet().iterator();

while (iterator.hasNext()) {

    Map.Entry<String, Evento> entry = iterator.next();

    if (entry.getKey().equals(id)) {

        iterator.remove();

        System.out.println("evento con id " + id + " eliminado");

        break;
    }
}
```

### Métodos importantes del iterador

| Método | Función |
|---|---|
| `hasNext()` | Comprueba si quedan elementos |
| `next()` | Obtiene el siguiente elemento |
| `remove()` | Elimina de forma segura el elemento actual |

---

## 15. Archivos binarios

Para guardar objetos Java en un archivo binario, la clase debe implementar:

```java
Serializable
```

Ejemplo:

```java
public class Videojuego implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String titulo;
}
```

### Guardar un objeto o colección

```java
ObjectOutputStream salida =
        new ObjectOutputStream(new FileOutputStream("datos.dat"));

salida.writeObject(objeto);

salida.close();
```

### Leer un objeto o colección

```java
ObjectInputStream entrada =
        new ObjectInputStream(new FileInputStream("datos.dat"));

Object objeto = entrada.readObject();

entrada.close();
```

La lectura puede generar:

```text
IOException
ClassNotFoundException
```

---

## 16. Leer y escribir JSON con Jackson

### Crear el objeto `ObjectMapper`

```java
ObjectMapper mapper = new ObjectMapper();
```

### Leer una lista desde JSON

```java
List<Proyecto> proyectos = mapper.readValue(
        new File("src/main/resources/proyectos.json"),
        new TypeReference<List<Proyecto>>() {
        }
);
```

### Guardar una lista en JSON

```java
mapper.writerWithDefaultPrettyPrinter()
        .writeValue(
                new File("src/main/resources/proyectos.json"),
                proyectos
        );
```

### Leer un mapa desde JSON

```java
Map<String, Evento> eventos = mapper.readValue(
        new File("src/main/resources/eventos.json"),
        new TypeReference<Map<String, Evento>>() {
        }
);
```

### Guardar un mapa en JSON

```java
mapper.writerWithDefaultPrettyPrinter()
        .writeValue(
                new File("src/main/resources/eventos.json"),
                eventos
        );
```

---

## 17. Proyectos típicos que debes saber crear

### Proyecto con archivo binario

Estructura:

```text
ejercicio-binario
├── src/main/java
│   └── com.rafael.ejercicio
│       ├── Modelo.java
│       ├── Gestor.java
│       └── Main.java
└── pom.xml
```

Conceptos principales:

```text
Serializable
ObjectOutputStream
ObjectInputStream
Map
List
```

### Proyecto con lista y JSON

Estructura:

```text
ejercicio-lista-json
├── src/main/java
│   └── com.rafael.ejercicio
│       ├── Modelo.java
│       └── Main.java
├── src/main/resources
│   └── datos.json
└── pom.xml
```

Conceptos principales:

```text
List<Modelo>
ObjectMapper
TypeReference<List<Modelo>>
readValue()
writeValue()
```

### Proyecto con mapa y JSON

Estructura:

```text
ejercicio-mapa-json
├── src/main/java
│   └── com.rafael.ejercicio
│       ├── Modelo.java
│       ├── Gestor.java
│       └── Main.java
├── src/main/resources
│   └── datos.json
└── pom.xml
```

Conceptos principales:

```text
Map<String, Modelo>
ObjectMapper
TypeReference<Map<String, Modelo>>
entrySet()
Iterator
```

---

## 18. Rutina recomendada para el examen

1. Crea un proyecto Maven independiente para cada ejercicio.
2. Marca `Create a simple project`.
3. Configura el `groupId` y el `artifactId`.
4. Crea el paquete dentro de `src/main/java`.
5. Crea las clases necesarias.
6. Crea los JSON dentro de `src/main/resources`.
7. Añade Jackson al `pom.xml` si el ejercicio utiliza JSON o XML.
8. Actualiza Maven con `Alt + F5`.
9. Guarda todos los archivos.
10. Ejecuta `Main.java`.
11. Comprueba los archivos generados.
12. Refresca el proyecto con `F5`.
13. Comprime la carpeta completa del proyecto en `.zip`.

---

## 19. Chuleta final

```text
BINARIOS
Serializable
ObjectOutputStream
ObjectInputStream
writeObject()
readObject()

JSON
ObjectMapper
TypeReference
readValue()
writeValue()

MAPAS
put()
containsKey()
remove()
entrySet()
getKey()
getValue()

ITERADORES
iterator()
hasNext()
next()
remove()

EXCEPCIONES
IOException → error de entrada o salida
ClassNotFoundException → Java no encuentra la clase

MAVEN
pom.xml
dependencies
Maven → Update Project
Alt + F5
clean package
BUILD SUCCESS
```
