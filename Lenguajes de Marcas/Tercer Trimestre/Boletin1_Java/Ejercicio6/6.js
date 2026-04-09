function comprobar() {
    let num = parseInt(prompt("introduce un número:"));
    let resultado = "";

    if (num % 2 === 0) {
        resultado += "2 ";
    }
    if (num % 3 === 0) {
        resultado += "3 ";
    }
    if (num % 5 === 0) {
        resultado += "5 ";
    }
    if (num % 7 === 0) {
        resultado += "7 ";
    }

    if (resultado !== "") {
        alert("el número es divisible por: " + resultado);
    } else {
        alert("el número no es divisible por ninguno");
    }
}