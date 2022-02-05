package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.time.LocalDate;
import java.util.ArrayList;

public class ServicioPedidos {
	private ArrayList<PedidoExportacion> pedidosExportacion = new ArrayList<PedidoExportacion>();
	private ArrayList<Factura> facturas = new ArrayList<Factura>();
	
	

	public PedidoExportacion altaPedidoExportacion(String destino,LocalDate fecha,String nombreEmpresa) {
		PedidoExportacion pedido1 = new PedidoExportacion(destino,fecha,nombreEmpresa);
		pedidosExportacion.add(pedido1);
		return pedido1;
		
		}
	
	public void agregarBienaPedido(PedidoExportacion pedido,String descripcion,int unidades,double pesoEnKilosPorU,double valorU) {
		pedido.agregarBien(descripcion,unidades,pesoEnKilosPorU,valorU);	
	}
	
	public void agregarServicio(PedidoExportacion pedido, String descripcion,double costoMate,double costoMano){
		pedido.agregarServicio();
	}
	
	public Factura facturarPedidoExportacion(PedidoExportacion pedido,LocalDate fechaExportacion) {
		Factura factura1 = pedido.facturar(fechaExportacion);
		facturas.add(factura1);
		
		return factura1;
	}
	
	public Factura obtenerFacturamayorcostoentreDosFechas(LocalDate ini,LocalDate fin) {
		DateLapse periodo = new DateLapse(ini,fin);
		double mayor = 0;
		Factura factumayor;
		for (Factura factura : facturas) {
			if (periodo.includesDato(factura.getfechaExp()))
				if(factura.getcostofinal() > mayor)
					factumayor = factura;
					mayor = factura.getcostofinal();
		}
		
		return factumayor;
	}
	
	
}
