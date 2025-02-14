document.addEventListener("DOMContentLoaded", function() {
    document.getElementById("cadastroForm").addEventListener("submit", function(event) {
        let nome = document.getElementById("nome").value.trim();
        let email = document.getElementById("email").value.trim();

        if (nome === "" || email === "") {
            alert("Todos os campos devem ser preenchidos!");
            event.preventDefault();
        } else {
            alert("Cadastro realizado com sucesso!");
        }
    });
});
