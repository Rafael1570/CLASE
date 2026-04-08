function mostrar() {
    let salida = "";

    for (let i = 1; i <= 100; i++) {

        if (i % 4 === 0 && i % 7 === 0) {
            salida += i + " fullstack\n";
        } else if (i % 4 === 0) {
            salida += i + " frontend\n";
        } else if (i % 7 === 0) {
            salida += i + " backend\n";
        } else {
            salida += i + "\n";
        }
    }

    document.getElementById("resultado").textContent = salida;
}