function crear() {
    let titulo = document.getElementById("titulo").value;
    let sec1 = document.getElementById("sec1").value;
    let p1 = document.getElementById("parrafos1").value;
    let sec2 = document.getElementById("sec2").value;
    let p2 = document.getElementById("parrafos2").value;

    let contenedor = document.getElementById("contenedor");
    contenedor.innerHTML = "";

    let h1 = document.createElement("h1");
    h1.textContent = titulo;

    let h2_1 = document.createElement("h2");
    h2_1.textContent = sec1;

    let parrafo1 = document.createElement("p");
    parrafo1.textContent = p1;

    let h2_2 = document.createElement("h2");
    h2_2.textContent = sec2;

    let parrafo2 = document.createElement("p");
    parrafo2.textContent = p2;

    contenedor.appendChild(h1);
    contenedor.appendChild(h2_1);
    contenedor.appendChild(parrafo1);
    contenedor.appendChild(h2_2);
    contenedor.appendChild(parrafo2);
}