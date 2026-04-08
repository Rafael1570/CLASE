function convertir() {
    let texto = prompt("introduce un texto:");

    let mayusculas = texto.toUpperCase();

    document.getElementById("resultado").textContent =
        "este es el texto en mayúscula: " + mayusculas;
}