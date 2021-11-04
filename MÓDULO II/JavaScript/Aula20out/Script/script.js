function calcula(){
    let a = document.getElementById('n1');
    let b = document.getElementById('n2');
    let c = document.getElementById ('result');

    let resultado = a.valueAsNumber + b.valueAsNumber;

    c.innerHTML = resultado;
}
function pIdeal(){
    let altura = document.getElementById('altura');
    let sexo = document.getElementsById('sexo')
    let r = document.getElementById('result');
    let inf = document.getElementById ('inf');
    let resultado = 0;
    
    if (sexo.value == Number(1)){
        resultado = (72.7 * (altura.valueAsNumber)) - 58; 
        r.innerHTML = resultado;
        inf.innerHTML = "O sexo informado foi: MASCULINO";      

    }else{
        resultado = (62.1 * (altura.valueAsNumber)) - 44.7; 
        r.innerHTML = resultado;
        inf.innerHTML = "O sexo informado foi: FEMININO";
    }
    

}
