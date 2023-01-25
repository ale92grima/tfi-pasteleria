function calcular (){
    var cant,calculo, total;
    var precio=150;
    cant=document.getElementById("cant-porciones").value;
    calculo = cant*precio;
    total = calculo;
    document.getElementById("resultado").value=total;

}