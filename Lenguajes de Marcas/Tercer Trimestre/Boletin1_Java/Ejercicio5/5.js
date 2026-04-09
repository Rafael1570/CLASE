function comprobar() {
    let num = parseInt(prompt("introduce un número:"));

    if (num % 2 === 0 || num % 3 === 0 || num % 5 === 0 || num % 7 === 0) {
        alert("el número es divisible por 2, 3, 5 o 7");
    } else {
        alert("el número no es divisible por ninguno de ellos");
    }
}