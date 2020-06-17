package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Proveedor.class)
public abstract class Proveedor_ {

	public static volatile SingularAttribute<Proveedor, String> ruc;
	public static volatile SingularAttribute<Proveedor, Long> id_proveedor;
	public static volatile SingularAttribute<Proveedor, String> nombre_comercial;
	public static volatile SingularAttribute<Proveedor, String> correo;
	public static volatile SingularAttribute<Proveedor, String> numero_cuenta;
	public static volatile SingularAttribute<Proveedor, String> direccion;
	public static volatile SingularAttribute<Proveedor, Integer> cogigo_proveedor;
	public static volatile SingularAttribute<Proveedor, String> entidad_bancaria;
	public static volatile SingularAttribute<Proveedor, String> telefono;

}

