function comparar() {
    let num1 = parseFloat(prompt("introduce el primer número:"));
    let num2 = parseFloat(prompt("introduce el segundo número:"));

    if (num1 > num2) {
        alert("el número mayor es: " + num1);
    } else if (num2 > num1) {
        alert("el número mayor es: " + num2);
    } else {
        alert("los dos números son iguales");
    }
}