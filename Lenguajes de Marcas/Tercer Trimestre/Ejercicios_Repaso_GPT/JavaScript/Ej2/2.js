// Capturar elementos
const nombreInput = document.getElementById("nombreInput");
const agregarBtn = document.getElementById("agregarBtn");
const eliminarBtn = document.getElementById("eliminarBtn");
const lista = document.getElementById("lista");

// Función para agregar un elemento a la lista
agregarBtn.addEventListener("click", function () {
    const nombre = nombreInput.value;
    if (nombre) {  // Si el campo no está vacío
        const li = document.createElement("li");
        li.textContent = nombre;  // El texto del li será el nombre ingresado
        lista.appendChild(li);  // Agregar el li a la lista
        nombreInput.value = "";  // Limpiar el campo de texto
    } else {
        alert("Por favor, ingresa un nombre.");
    }
});

// Función para eliminar el último elemento de la lista
eliminarBtn.addEventListener("click", function () {
    if (lista.children.length > 0) {
        lista.removeChild(lista.lastElementChild);  // Elimina el último <li> de la lista
    } else {
        alert("La lista está vacía.");
    }
});