/**
 * JasperReportes.java
 * Apr 15, 2023 12:32:15 AM
 */
package utilidades;
//importanciones

import Dominio.Reportes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class JasperReportes {

    /**
     *
     */
    public JasperReportes() {

    }

    public JasperPrint generarReporte(List<Reportes> reporte) throws JRException, FileNotFoundException {
        List<Reportes> listItems = new ArrayList<Reportes>();
        listItems.addAll(reporte);
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listItems);
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("CollectionBeanParam", itemsJRBean);
        InputStream input = new FileInputStream(new File("C:\\Users\\aroco\\JaspersoftWorkspace\\ReporteTramites\\ReporteTramites.jrxml\\"));
        JasperDesign jasperDesign = JRXmlLoader.load(input);
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
        JasperViewer viewer = new JasperViewer(jasperPrint, false);
        viewer.setVisible(true);
        return jasperPrint;
    }

    public void exportarReporte(JasperPrint jasperPrint) throws FileNotFoundException, JRException {
        String outputFile = "C:\\Users\\aroco\\OneDrive - potros.itson.edu.mx\\Escritorio\\Proyecto2_BDA\\BDA-Proyecto2-AgenciaTransito\\ProyectoBDA_AgenciaTransito\\Reportes\\" + "ReporteTramites.pdf";
    OutputStream outputStream = new FileOutputStream(new File(outputFile));
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
    }
}
