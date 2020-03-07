package reporte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Reporte {
    public static Connection conectar (){
        Connection con = null;
        Statement st;
        
        try {
            String url = "jdbc:mysql://localhost/tienda?user=root&password=mysqladmin";
            con = DriverManager.getConnection(url);
            if (con != null){
                System.out.println("Conexion Satisfactoria");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.err.println("con.--");
        return con;
    }

    public static void main(String[] args) {
        try {
            JasperReport jr = (JasperReport)
            JRLoader.loadObject
            (Reporte.class.getResource("./Reporte1.jasper"));
            Map parametros = new HashMap<String, Object>();
            parametros.put ("PARAMETRO_NOMBRE", "Hola Mundo");
            JasperPrint jp = JasperFillManager.fillReport
                (jr, parametros, conectar ());
            
            JasperViewer jv = new JasperViewer (jp);
            jv.show ();
            
        } catch (Exception e) {
            System.err.print(e);
        }
       
    }
    
}
