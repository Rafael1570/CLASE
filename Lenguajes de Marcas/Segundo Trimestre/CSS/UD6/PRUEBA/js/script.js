/*console.log("Rafa");

let valorMaximo = 101;
for (let i = 0; i < valorMaximo; i++) {
    console.log(i);
};

let numeroNumero = prompt("Introduce un número: ");*/

// Numero par o impar

/*let numero = prompt("Introduce un número: ");

if (numero % 2 == 0) {
    console.log("El número es par");
} else {
    console.log("El número es impar");
}*/

// Numero Primo o no primo

/*let numeroM = prompt("Introduce un número: ");

if (numeroM < 2) {
    console.log("El número no es primo");
} else {
    let esPrimo = true;
    for (let i = 2; i <= numeroM; i++) {
        if (numeroM % i == 0) {
            esPrimo = false;
            break;
        }
    }
    if (esPrimo) {
        console.log("El número no es primo");
        alert("El número no es primo");
    } else {
        console.log("El número es primo");
        alert("El número es primo");
    }
}   */
document.addEventListener("DOMContentLoaded", () => {
    let btnrojo = document.querySelector("#btnrojo");
    btnrojo.addEventListener("click", cambia_rojo);
    function cambia_rojo(){
        let parrafos = document.querySelectorAll("p");
        parrafos.forEach(parrafo => {
            parrafo.classList.add("rojo");
        });
    } 
    let btnverde = document.querySelector("#btnverde");
    btnverde.addEventListener("click", cambia_verde);
    function cambia_verde(){
        let parrafos = document.querySelectorAll("p");
        parrafos.forEach(parrafo => {
            parrafo.classList.add("verde");
        });
    } 
    let btnazul = document.querySelector("#btnazul");
    btnazul.addEventListener("click", cambia_azul);
    function cambia_azul(){
        let parrafos = document.querySelectorAll("p");
        parrafos.forEach(parrafo => {
            parrafo.classList.add("azul");
        });
    }
});