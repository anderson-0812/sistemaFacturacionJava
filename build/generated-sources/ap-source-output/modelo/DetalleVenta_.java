package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DetalleVenta.class)
public abstract class DetalleVenta_ {

	public static volatile SingularAttribute<DetalleVenta, String> detalle_producto;
	public static volatile SingularAttribute<DetalleVenta, Long> id_detalleVenta;
	public static volatile SingularAttribute<DetalleVenta, Double> subtotal_parcial;
	public static volatile SingularAttribute<DetalleVenta, Integer> cantidad_producto;
	public static volatile SingularAttribute<DetalleVenta, Venta> objetoVenta;
	public static volatile SingularAttribute<DetalleVenta, Producto> objetoProducto;
	public static volatile SingularAttribute<DetalleVenta, Double> valor_unitario;

}

