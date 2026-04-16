// Inicializar el contador en 0
let contador = 0;

// Capturar el botón y el span donde se mostrará el contador
const boton = document.getElementById("contadorBtn");
const contadorDisplay = document.getElementById("contador");

// Evento para incrementar el contador
boton.addEventListener("click", function () {
    contador++;  // Incrementar el contador
    contadorDisplay.textContent = contador;  // Mostrar el nuevo valor
});