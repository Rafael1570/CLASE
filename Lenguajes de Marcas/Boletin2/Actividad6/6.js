function anadirNombre() {
    let nombre = document.getElementById("nuevoNombre").value;

    if (nombre != "") {
        let nuevoLi = document.createElement("li");
        nuevoLi.textContent = nombre;

        document.getElementById("listaClase").appendChild(nuevoLi);

        document.getElementById("nuevoNombre").value = "";
    }
}