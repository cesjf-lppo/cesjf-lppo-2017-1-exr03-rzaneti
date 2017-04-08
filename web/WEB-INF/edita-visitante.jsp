<%-- 
    Document   : edita-visitante
    Created on : 31/03/2017, 22:09:07
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edita Visitante</title>
    </head>
    <body>
        <h1>Edita Visitante</h1>
        <form method="post">
            <div><input type="hidden" name="id" value="${visitante.id}"/> Id: ${visitante.id}</div>
            <div><label>Nome: <input type="text" name="nome" value="${visitante.nome}"/></label></div>
            <div><label>Idade: <input type="text" name="idade" value="${visitante.idade}"/> </label></div>
            <div><input type="submit" /></div>
        </body>
</html>
