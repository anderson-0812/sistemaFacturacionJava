package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Rol.class)
public abstract class Rol_ {

	public static volatile SingularAttribute<Rol, Long> id_rol;
	public static volatile ListAttribute<Rol, Cuenta> lista_cuentas;
	public static volatile SingularAttribute<Rol, String> nombre_rol;

}

