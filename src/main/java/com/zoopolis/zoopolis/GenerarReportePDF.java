/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zoopolis.zoopolis;

/**
 *
 * @author juni1
 */
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenerarReportePDF {

    public static void main(String[] args) throws IOException, DocumentException {

        String ruta = System.getProperty("user.home");

        FileOutputStream outputStream = new FileOutputStream(ruta + "/OneDrive/Escritorio/reporte2.pdf");
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, outputStream);

        // Encabezado con imagen
        Image header = Image.getInstance("C:/Users/juni1/OneDrive/Documentos/NetBeansProjects/GenerarPDF/src/main/img/header.png");
        header.scaleToFit(600, 1000);
        header.setAlignment(Chunk.ALIGN_CENTER);

        PdfPTable table = new PdfPTable(7);

        table.setWidthPercentage(100);

        PdfPCell cell1 = new PdfPCell(new Phrase("Descuentos"));
        cell1.setColspan(2); // establecer que la celda ocupa dos columnas


        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        
        Paragraph saltolinea = new Paragraph("\n\n\n");
        Paragraph paragraph = new Paragraph("Reporte ventas");
        
        // Contenido
        
        document.open();
        
        document.add(header);
        
//        document.add(paragraph);
        
        table.addCell("Plan");
        table.addCell("Valor");
        table.addCell("Cantidad");
        table.addCell("Valor venta");
        table.addCell(cell1);
        table.addCell("Total");
        
        for (int i = 1; i < 7; i++) {
            table.addCell("Plan");
            table.addCell("Valor");
            table.addCell("Cantidad");
            table.addCell("Valor venta");
            table.addCell("descuento1");
            table.addCell("descuento2");
            table.addCell("Total");
        }
        
        table.setHorizontalAlignment(Element.ALIGN_CENTER);
        document.add(table);
        
        // Pie de página con imagen
        Image footerImage = Image.getInstance("C:/Users/juni1/OneDrive/Documentos/NetBeansProjects/GenerarPDF/src/main/img/footer.png");
        footerImage.scaleToFit(600, 1000);
        footerImage.setAlignment(Image.ALIGN_CENTER);
        Footer event2 = new Footer(footerImage);
        writer.setPageEvent(event2);

        document.close();
        outputStream.close();
    }



    private static class Footer extends PdfPageEventHelper {

        private final Image footerImage;

        public Footer(Image footerImage) {
            this.footerImage = footerImage;
        }

        @Override
        public void onEndPage(PdfWriter writer, Document document) {
            PdfContentByte canvas = writer.getDirectContent();
            float x = (PageSize.A4.getWidth() - footerImage.getScaledWidth()) / 2;
            float y = -10;
            try {
                canvas.addImage(footerImage, footerImage.getScaledWidth(), 0, 0, footerImage.getScaledHeight(), x, y);
            } catch (DocumentException ex) {
                Logger.getLogger(GenerarReportePDF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
