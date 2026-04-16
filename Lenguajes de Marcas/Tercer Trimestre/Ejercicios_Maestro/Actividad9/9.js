let titulos = document.querySelectorAll('h1');
let botonRojo = document.getElementById('cambiarrojo');
let botonAmarillo = document.getElementById('cambiaramarillo');
let botonVerde = document.getElementById('cambiarverde');

botonRojo.addEventListener('click', function() {
    titulos.forEach(function(titulo) {
        titulo.style.color = 'red';
    });
});

botonAmarillo.addEventListener('click', function() {
    titulos.forEach(function(titulo) {
        titulo.style.color = 'yellow';
    });
});

botonVerde.addEventListener('click', function() {
    titulos.forEach(function(titulo) {
        titulo.style.color = 'green';
    });
});