 
 function validacaoForm(){
    
    let nome = document.getElementById("nome");
    let sNome = document.getElementById("sobrenome");
    let rua = document.getElementById("rua");
    let numero = document.getElementById("numero");
    let cidade = document.getElementById("cidade");
    let estado = document.getElementById("estado");
    let cep = document.getElementById("cep");
    let contato1 = document.getElementById("contato1");
    let contato = document.getElementById("contato2");
   

 

    if(nome.value == ""){
        alert("Digite o seu nome!");
        nome.focus();
    }else if(sNome.value == ""){
        alert("Digite o seu sobrenome!");
        sNome.focus();
    }else if(rua.value == ""){
        alert("Digite a rua em que você mora!");
        rua.focus();
    }
    else if(numero.value == ""){
        alert("Digite o número da sua residência!");
        numero.focus();
    }
    else if(cidade.value==""){
        alert("Digite o nome da sua cidade de residência!");
        cidade.focus();
    }else if (estado.value == "") {
        alert("Digite o nome do estado em que você mora!");
        estado.focus();
    }else if (cep.value == "") {
        alert("Digite o seu CEP!");
        cep.focus();
    }else if(contato1.value == ""){
        alert("Digite pelo menos um contato.");
        contato1.focus();
    }else{
        alert("Cadastro realizado com sucesso!");
        window.location ="cadastroOk.html";
    }

}