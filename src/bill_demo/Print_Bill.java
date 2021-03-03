/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.read.biff.File;
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
import bill_demo.GoodsInOut;

/**
 *
 * @author KIM
 */
public class Print_Bill extends javax.swing.JFrame {

	/**
	 * Creates new form Print_Bill
	 */
	public Print_Bill() {
		initComponents();
	}

	public void action() throws JRException, FileNotFoundException {

		/* List to hold Items */
		// List<Employee> listItems = new ArrayList<Employee>();

		List<GoodsInOut> listItems = new ArrayList<GoodsInOut>();
		GoodsInOut gio1 = new GoodsInOut("123", "XB-21021", "1", "abc", "123", "abc", Float.valueOf(100),
				Float.valueOf(100), Float.valueOf(100), "unit");
		GoodsInOut gio2 = new GoodsInOut("123", "XB-21021", "1", "abc", "123", "abc", Float.valueOf(100),
				Float.valueOf(100), Float.valueOf(100), "unit");
		GoodsInOut gio3 = new GoodsInOut("123", "XB-21021", "1", "abc", "123", "abc", Float.valueOf(100),
				Float.valueOf(100), Float.valueOf(100), "unit");
		GoodsInOut gio4 = new GoodsInOut("123", "XB-21021", "1", "abc", "123", "abc", Float.valueOf(100),
				Float.valueOf(100), Float.valueOf(100), "unit");

		listItems.add(gio1);
		listItems.add(gio2);
		listItems.add(gio3);
		listItems.add(gio4);
		/* Convert List to JRBeanCollectionDataSource */
		JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listItems);

		/* Map to hold Jasper report Parameters */
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("goodsInOut", itemsJRBean.cloneDataSource());
		parameters.put("no", "XB2102");
		parameters.put("companyName", "Công ty ngọn lửa thần");
		parameters.put("customer", "Trn Quang Đức");
		parameters.put("truckLicensePlateNumber", "29-A1 01234");
		parameters.put("date", "20/2/2020");
		parameters.put("driverTruck", "Nguyễn Văn A");
		parameters.put("saleMan", "Nguyễn Văn A");
		parameters.put("note", "abc");

		JasperDesign jasperDesign = JRXmlLoader.load("D:\\ceti\\Bill_Demo\\src\\bill_demo\\test.jrxml");
		/* compiling jrxml with help of JasperReport class */
		JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

		/* Using jasperReport object to generate PDF */
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

		/* call jasper engine to display report in jasperviewer window */
		JasperViewer.viewReport(jasperPrint);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("Print Bill");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(151, 151, 151).addComponent(jButton1)
						.addContainerGap(170, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(125, 125, 125).addComponent(jButton1)
						.addContainerGap(150, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		try {
			// TODO add your handling code here:
			action();
		} catch (JRException ex) {
			Logger.getLogger(Print_Bill.class.getName()).log(Level.SEVERE, null, ex);
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Print_Bill.class.getName()).log(Level.SEVERE, null, ex);
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Print_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Print_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Print_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Print_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Print_Bill().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	// End of variables declaration//GEN-END:variables
}
