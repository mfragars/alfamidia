/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Conexao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Produto;

/**
 *
 * @author noite
 */
public class Controle extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controle</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controle at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
        //processRequest(request, response);
        String acao = request.getParameter("acao");
        PrintWriter out = response.getWriter();
        
        if(acao.equals("Cadastrar")){
            Produto p = new Produto();
            p.setId(Integer.parseInt(request.getParameter("id")));
            p.setNome(request.getParameter("nome"));
            p.setDescricao(request.getParameter("descricao"));
            p.setValor(Double.parseDouble(request.getParameter("valor")));
            
            try{
                Conexao conn = new Conexao();
                out.print(conn.insere(p));
                response.sendRedirect("http://localhost:8080/QuintoProjeto/resposta.html");
                
            }catch(Exception e){
                out.print(e.getMessage());
            }
            
        }
        if(acao.equals("consulta")){
            String id = request.getParameter("id");
            try{
                Conexao conn = new Conexao();
                Produto p = conn.getProduto(Integer.parseInt(id));
                out.print("<h1>Produto Selecionado</h1>");
                out.print("Id: "+ p.getId()+"<br>");
                out.print("Nome: "+ p.getNome()+"<br>");
                out.print("Descricao: "+ p.getDescricao()+"<br>");
                out.print("Valor: R$"+ p.getValor()+"<br>");
                out.print("<a href='http://localhost:8080/QuintoProjeto/menu.html'>Menu</a>");
                                
            }catch(Exception e){
                response.sendRedirect("http://localhost:8080/QuintoProjeto/erro.html");
            }
        }
        
        if(acao.equals("lista")){
            
            try{
                Conexao conn = new Conexao();
                
                out.print("<h1>Produto Selecionado</h1>");
                for(Produto p:conn.lista()){
                out.print("Id: "+ p.getId()+"<br>");
                out.print("Nome: "+ p.getNome()+"<br>");
                out.print("Descricao: "+ p.getDescricao()+"<br>");
                out.print("Valor: R$"+ p.getValor()+"<br>");
                
                }
             out.print("<a href='http://localhost:8080/QuintoProjeto/menu.html'>Menu</a>");
            }catch(Exception e){
                response.sendRedirect("http://localhost:8080/QuintoProjeto/erro.html");
            }
            
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
