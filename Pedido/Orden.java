package Pedido;

import java.util.ArrayList;

public class Orden {
	private int identificador;
	ArrayList<LineaPedido> orden= new ArrayList<LineaPedido>();
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public ArrayList<LineaPedido> getOrden() {
		return orden;
	}
	public void setOrden(ArrayList<LineaPedido> orden) {
		this.orden = orden;
	}
	public double calcularTotalOrden() {
		double total=0;
		
		for (int i = 0; i < orden.size(); i++) {
			LineaPedido linea= (LineaPedido) orden.get(i);
			total+=linea.calcularSubtotalLineaPedido();
		}		
		return total;		
	}
	
	public Orden(int identificador) {		
		this.identificador = identificador;
		orden=new ArrayList<LineaPedido>();
	}	
	public void añadirItem(int identificador,int cantidad,Producto producto) {
		orden.add(new LineaPedido(identificador, cantidad, producto));
	}
	 @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Orden [id=").append(identificador).append("]\n");
	        sb.append("Ítems del pedido\n");
	        for (LineaPedido linea : orden) {
	            sb.append(" ").append(linea).append("\n");
	        }
	        sb.append("Total sin iva= ").append((calcularTotalOrden())).append(" €\n");
	        sb.append("IVA = ").append(((calcularTotalOrden()*0.21))).append(" €\n");      
	        sb.append("Total orden con iva= ").append((calcularTotalOrden()+(calcularTotalOrden()*0.21))).append(" €");
	        return sb.toString();
	    }
	
}
