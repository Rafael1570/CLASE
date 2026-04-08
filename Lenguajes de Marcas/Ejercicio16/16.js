function contar() {
    let texto = prompt("introduce un texto:");
    texto = texto.toLowerCase();

    let contador = 0;

    for (let i = 0; i < texto.length; i++) {
        let letra = texto.charAt(i);

        if (letra === "a" || letra === "e" || letra === "i" || letra === "o" || letra === "u") {
            contador++;
        }
    }

    document.getElementById("resultado").textContent =
        "el número de vocales es: " + contador;
}