function calcular() {
    let num = parseInt(prompt("introduce un número:"));
    let factorial = 1;

    if (num < 0) {
        document.getElementById("resultado").textContent =
            "no existe factorial para números negativos";
    } else {
        for (let i = 1; i <= num; i++) {
            factorial *= i;
        }

        document.getElementById("resultado").textContent =
            "el factorial de " + num + " es: " + factorial;
    }
}