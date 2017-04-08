<%-- 
    Document   : lista-visitante
    Created on : 31/03/2017, 21:37:04
    Author     : aluno
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Lista de Visitante</h1>
        <table border="1">
            
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Idade</th>
                <th>Entrada</th>
                <th>Saida</th>
                <th>Excluir</th>
                
            </tr>
            <c:forEach var="visitante" items="${visitantes}">
                <tr>
                    <td><a href="edita.html?id=${visitante.id}"> ${visitante.id} </a></td> 
                <td>${visitante.nome}</td> 
                <td>${visitante.idade}</td> 
               <td>${visitante.entrada}</td> 
                  
                    
                    <td>
                        <c:if test="${visitante.saida==null}">
                            <a href="saida.html?id=${visitante.id}">Registra Saida</a>
                        </c:if>
                        <c:if test="${visitante.saida!=null}">
                            ${visitante.saida}
                        </c:if>
                    </td> 
                    <td><a href="exclui.html?id=${visitante.id}">X</a></td> 
                </tr>
            </c:forEach>
    </body>
</html>
