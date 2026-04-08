function comprobar() {
    let num = parseInt(prompt("introduce un número:"));
    let esPrimo = true;

    if (num <= 1) {
        esPrimo = false;
    } else {
        for (let i = 2; i < num; i++) {
            if (num % i === 0) {
                esPrimo = false;
                break;
            }
        }
    }

    if (esPrimo) {
        document.getElementById("resultado").textContent =
            "el número es primo";
    } else {
        document.getElementById("resultado").textContent =
            "el número no es primo";
    }
}