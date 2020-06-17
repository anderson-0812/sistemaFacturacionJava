package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cuenta.class)
public abstract class Cuenta_ {

	public static volatile SingularAttribute<Cuenta, Boolean> estado_usuario;
	public static volatile SingularAttribute<Cuenta, String> password;
	public static volatile SingularAttribute<Cuenta, Long> id_cuenta;
	public static volatile SingularAttribute<Cuenta, Usuario> objeto_usuario;
	public static volatile SingularAttribute<Cuenta, Rol> objeto_rol;
	public static volatile SingularAttribute<Cuenta, String> username;

}

