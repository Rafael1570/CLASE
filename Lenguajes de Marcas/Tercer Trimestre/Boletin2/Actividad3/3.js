function agregar() {
    let texto = document.getElementById("texto").value;

    let nuevoParrafo = document.createElement("p"); // crea <p>
    nuevoParrafo.textContent = texto; // le mete el texto

    document.getElementById("contenedor").appendChild(nuevoParrafo); // lo añade

    document.getElementById("texto").value = ""; // limpia el textarea
}