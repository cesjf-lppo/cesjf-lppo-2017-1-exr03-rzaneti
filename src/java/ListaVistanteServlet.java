/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RafaelaEmília
 */
@WebServlet(name = "ListaVisitanteServlet", urlPatterns = {"/lista.html"})
public class ListaVistanteServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Visitante> visitantes = new ArrayList<>();
        
        try {
            //Pegar os dados do banco
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conexao = DriverManager.getConnection("jdbc:derby://localhost:1527//lpto-2017-1", "usuario", "senha");
             
             Statement operacao = conexao.createStatement();
             ResultSet resultado = operacao.executeQuery("SELECT * FROM visitante ");
                while(resultado.next()){
                    Visitante visitanteAtual = new Visitante();
                    visitanteAtual.setId(resultado.getLong("id"));
                    visitanteAtual.setNome(resultado.getString("nome"));
                    visitanteAtual.setIdade(resultado.getInt("idade"));
                    visitanteAtual.setEntrada(resultado.getTimestamp("entrada"));
                    visitanteAtual.setSaida(resultado.getTimestamp("saida"));
                    visitantes.add(visitanteAtual);
                }        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListaVistanteServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListaVistanteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("visitantes", visitantes);
        request.getRequestDispatcher("WEB-INF/lista-visitante.jsp").forward(request, response);
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
   

}
