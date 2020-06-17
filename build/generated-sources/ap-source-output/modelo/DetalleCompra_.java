package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DetalleCompra.class)
public abstract class DetalleCompra_ {

	public static volatile SingularAttribute<DetalleCompra, Double> precio_unitario;
	public static volatile SingularAttribute<DetalleCompra, Long> id_detalle_compra;
	public static volatile SingularAttribute<DetalleCompra, Integer> cantidad;
	public static volatile SingularAttribute<DetalleCompra, Double> subtotal_parcial_compra;
	public static volatile SingularAttribute<DetalleCompra, String> detalle_compra;

}

