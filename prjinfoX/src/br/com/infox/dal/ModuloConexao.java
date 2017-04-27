/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;
import java.sql.*;
/**
 *
 * @author KEL-NOTEBOOK
 */
public class ModuloConexao {
    // modulo estabelecer conexao banco
    public static Connection conector(){
    java.sql.Connection  conexao = null;
    String driver="com.br.jdbc.driver";
    //  a linha abaixo chama o driver
   
    String url = "jdbc:mysql://localhost:3306/dbinfox";
    String user ="root";
    String password = "root";
    //estabelecendo conexao banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
        }
    
    
}
