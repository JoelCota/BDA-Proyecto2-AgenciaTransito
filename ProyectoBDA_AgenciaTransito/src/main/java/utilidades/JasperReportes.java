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
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
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
 * Clase que permite gestionar los tramites con jasper reports
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class JasperReportes {

    /**
     * Metodo constructor por defecto
     */
    public JasperReportes() {

    }

    /**
     * Metodo para generar los reportes y mostrarlos.
     *
     * @param reporte es la lista de los tramites en el formato de tipo reporte.
     * @return el reporte listo para imprimir
     * @throws JRException se lanza cuando hay un error con el jasper reports.
     * @throws FileNotFoundException se lanza cuando la ruta de entrada no
     * existe.
     */
    public JasperPrint generarReporte(List<Reportes> reporte) throws JRException, FileNotFoundException {
        List<Reportes> listItems = new ArrayList<Reportes>();
        listItems.addAll(reporte);
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listItems);
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("CollectionBeanParam", itemsJRBean);
        String jasperFilePath = "src/ReporteTramites.jrxml";
        InputStream input = new FileInputStream(jasperFilePath);
        JasperDesign jasperDesign = JRXmlLoader.load(input);
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
        JasperViewer viewer = new JasperViewer(jasperPrint, false);
        viewer.setVisible(true);
        return jasperPrint;
    }

    /**
     * Metodo que permite exportar el reporte
     *
     * @param jasperPrint es el formato de jasper print generado en el metodo
     * generar reporte
     * @throws FileNotFoundException se lanza si no existe la ruta
     * @throws JRException se lanza en caso de que no se pueda exportar
     */
    public void exportarReporte(JasperPrint jasperPrint) throws FileNotFoundException, JRException {
        String outputFile = "src/ReporteTramites/" + "ReporteTramites.pdf";
        OutputStream outputStream = new FileOutputStream(new File(outputFile));
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
    }
}
