function jugar() {
    let numeroSecreto = Math.round(Math.random() * 10);
    let intento;

    do {
        intento = parseInt(prompt("adivina el número (1-10):"));

        if (intento < numeroSecreto) {
            alert("el número es mayor");
        } else if (intento > numeroSecreto) {
            alert("el número es menor");
        } else {
            alert("¡correcto! has acertado 🎉");
        }

    } while (intento !== numeroSecreto);
}