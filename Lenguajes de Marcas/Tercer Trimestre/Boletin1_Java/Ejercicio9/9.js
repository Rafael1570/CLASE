function comprobar() {
    let a = parseInt(prompt("introduce el primer número:"));
    let b = parseInt(prompt("introduce el segundo número:"));
    let c = parseInt(prompt("introduce el tercer número:"));

    if (a === 0 || b === 0 || c === 0) {
        alert("el producto es 0");
    } else if ((a > 0 && b > 0 && c > 0) ||
        (a < 0 && b < 0 && c > 0) ||
        (a < 0 && b > 0 && c < 0) ||
        (a > 0 && b < 0 && c < 0)) {
        alert("el producto es positivo");
    } else {
        alert("el producto es negativo");
    }
}