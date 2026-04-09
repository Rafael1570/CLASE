function calcular() {
    let num1 = parseInt(prompt("introduce el primer número:"));
    let num2 = parseInt(prompt("introduce el segundo número:"));

    let menor = Math.min(num1, num2);
    let mayor = Math.max(num1, num2);

    let salida = "";

    for (let i = mayor; i >= menor; i--) {
        if (i % 8 === 0) {
            salida += "múltiplo: " + i + "\n";
        }
    }

    document.getElementById("resultado").textContent = salida;
}