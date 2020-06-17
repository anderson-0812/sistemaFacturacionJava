package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CCompra.class)
public abstract class CCompra_ {

	public static volatile SingularAttribute<CCompra, String> numero_factura;
	public static volatile SingularAttribute<CCompra, Double> total;
	public static volatile SingularAttribute<CCompra, Long> id_compra;
	public static volatile SingularAttribute<CCompra, Proveedor> proveedor;
	public static volatile SingularAttribute<CCompra, String> fecha_factura;

}

