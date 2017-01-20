/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cdc.util.ProdutoDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;

/**
 *
 * @author JM7087-Notbook
 */
@WebServlet(name = "controladorCadastroDeProdutosParaVender", urlPatterns = {"/controladorCadastroDeProdutosParaVender"})
public class controladorCadastroDeProdutosParaVender extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException, Exception {
    
       String inputNome = request.getParameter("inputNome");
       String inputDescricao = request.getParameter("inputDescricao");
       String inputValor = request.getParameter("inputValor");
       String inputQuantidade = request.getParameter("inputQuantidade");
       String inputImagem = request.getParameter("inputImagem");
       String inputMarca = request.getParameter("inputMarca");
       String inputCategoria = request.getParameter("inputCategoria");
       
        ProdutoDAO produtoDAO = new ProdutoDAO();
       
        
        
       Produto Pro = new Produto(0, inputNome, inputDescricao, inputValor, inputQuantidade, inputImagem, inputMarca, inputCategoria);
       
       produtoDAO.salvar(Pro);
       
    
        
    }
  
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(controladorCadastroNovoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(controladorCadastroNovoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
