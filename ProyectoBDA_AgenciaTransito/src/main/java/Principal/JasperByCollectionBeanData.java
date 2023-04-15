package Principal;

import Dominio.Reportes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class JasperByCollectionBeanData {

    public static void main(String[] args) throws JRException, FileNotFoundException {

        /* Output file location to create report in pdf form */
        String outputFile = "\"C:\\Users\\aroco\\OneDrive - potros.itson.edu.mx\\Escritorio\\Proyecto2_BDA\\BDA-Proyecto2-AgenciaTransito\\ProyectoBDA_AgenciaTransito\\Reportes\"" + "ReporteTramites.pdf";

        /* List to hold Items */
        List<Reportes> listItems = new ArrayList<Reportes>();

        Reportes rep1 = new Reportes("Prueba", "Licencia", new Date(), 190);
        Reportes rep2 = new Reportes("Prueba1", "Placa", new Date(), 190);
        Reportes rep3 = new Reportes("Prueba2", "Licencia", new Date(), 190);
        Reportes rep4 = new Reportes("Prueba3", "Placa", new Date(), 190);

        listItems.add(rep4);
        listItems.add(rep3);
        listItems.add(rep1);
        listItems.add(rep2);
        /* Convert List to JRBeanCollectionDataSource */
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listItems);

        /* Map to hold Jasper report Parameters */
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("CollectionBeanParam", itemsJRBean);

        InputStream input = new FileInputStream(new File("C:\\Users\\aroco\\JaspersoftWorkspace\\ReporteTramites\\ReporteTramites.jrxml\\"));

        JasperDesign jasperDesign = JRXmlLoader.load(input);

        /*compiling jrxml with help of JasperReport class*/
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

        /* Using jasperReport object to generate PDF */
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

        /*call jasper engine to display report in jasperviewer window*/
        JasperViewer.viewReport(jasperPrint);

        /* outputStream to create PDF */
        //OutputStream outputStream = new FileOutputStream(new File(outputFile));
        /* Write content to PDF file */
        //JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
        System.out.println("File Generated");

    }

}
