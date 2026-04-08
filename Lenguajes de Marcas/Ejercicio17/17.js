function reemplazar() {
    let frase = prompt("introduce una frase:");
    let palabra1 = prompt("introduce la palabra que quieres sustituir:");
    let palabra2 = prompt("introduce la nueva palabra:");

    let nuevaFrase = frase.replace(palabra1, palabra2);

    document.getElementById("resultado").innerHTML =
        "<h3>esta era la frase original:</h3>" +
        frase +
        "<h3>esta es la nueva frase:</h3>" +
        nuevaFrase;
}