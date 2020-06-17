package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Venta.class)
public abstract class Venta_ {

	public static volatile SingularAttribute<Venta, Double> iva_venta;
	public static volatile SingularAttribute<Venta, Double> descuento_venta;
	public static volatile SingularAttribute<Venta, Double> total_venta;
	public static volatile SingularAttribute<Venta, String> fecha_venta;
	public static volatile SingularAttribute<Venta, Double> subtotal_venta;
	public static volatile SingularAttribute<Venta, Long> id_venta;
	public static volatile SingularAttribute<Venta, Integer> numero_venta;

}

