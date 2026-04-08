function anadir() {
    let nombre = document.getElementById("nombre").value;
    let nota = document.getElementById("nota").value;

    if (nombre !== "" && nota !== "") {
        let fila = document.createElement("tr");

        let celdaNombre = document.createElement("td");
        celdaNombre.textContent = nombre;

        let celdaNota = document.createElement("td");
        celdaNota.textContent = nota;

        fila.appendChild(celdaNombre);
        fila.appendChild(celdaNota);

        document.getElementById("tabla").appendChild(fila);

        document.getElementById("nombre").value = "";
        document.getElementById("nota").value = "";
    }
}