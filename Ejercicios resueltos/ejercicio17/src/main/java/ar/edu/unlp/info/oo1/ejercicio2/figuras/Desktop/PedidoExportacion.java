package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.time.LocalDate;
import java.util.ArrayList;

public class PedidoExportacion {
	private String destino;
	private LocalDate fecha;
	private String nombreEmpresa;
	private ArrayList<ProductoExportado> productosExportados = new ArrayList<ProductoExportado>();

	public PedidoExportacion(String destino, LocalDate fecha, String nombreEmpresa) {
		this.destino = destino;
		this.fecha = fecha;
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public void agregarBien(String descripcion,int unidades,double pesoEnKilosPorU,double valorU) {
		
		ProductoExportado bien1 = new Bien(descripcion, unidades, valorU, valorU);
		productosExportados.add(bien1);
		
	}


	//public void agregarServicio(String descripcion,int unidades,double pesoEnKilosPorU,double valorU)
	//
	//ProductoExportado bien1 = new Bien();
	//productosExportados.add(bien1);
	//
	//
	//}
	
	public Factura facturar(LocalDate fechaExportacion) {
		Factura factura1 = new factura(fechaExportacion);
		for (ProductoExportado productoExportado : productosExportados) {
			factura1.setBasico(factura1.getCostoBasico() + productoExportado.calcularCostoBasico());
		}
		return factura1;
	}

	
		
		
}

