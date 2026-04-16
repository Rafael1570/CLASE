let titulo = document.getElementById('titulo');
let botonRojo = document.getElementById('cambiarrojo');
let botonAmarillo = document.getElementById('cambiaramarillo');
let botonVerde = document.getElementById('cambiarverde');

botonRojo.addEventListener('click', function() {
    titulo.style.color = 'red';
});

botonAmarillo.addEventListener('click', function() {
    titulo.style.color = 'yellow';
});

botonVerde.addEventListener('click', function() {
    titulo.style.color = 'green';
});