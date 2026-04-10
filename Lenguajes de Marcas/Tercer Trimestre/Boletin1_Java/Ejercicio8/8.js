function calcular() {
    let a = parseFloat(prompt("introduce el lado a:"));
    let b = parseFloat(prompt("introduce el lado b:"));
    let c = parseFloat(prompt("introduce el lado c:"));

    let s = (a + b + c) / 2;

    let area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    alert("el área del triángulo es: " + area);
}