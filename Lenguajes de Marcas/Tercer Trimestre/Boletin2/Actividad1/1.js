function rellenar() {
    let titulo = document.getElementById("titulo").value;
    let sec1 = document.getElementById("seccion1").value;
    let sec2 = document.getElementById("seccion2").value;

    document.getElementById("tituloMostrado").textContent = "título: " + titulo;
    document.getElementById("seccion1Mostrada").textContent = "sección 1: " + sec1;
    document.getElementById("seccion2Mostrada").textContent = "sección 2: " + sec2;
}