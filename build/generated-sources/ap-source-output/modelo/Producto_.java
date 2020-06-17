package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Producto.class)
public abstract class Producto_ {

	public static volatile SingularAttribute<Producto, String> detalle_producto;
	public static volatile SingularAttribute<Producto, Double> precio_unitario;
	public static volatile SingularAttribute<Producto, Integer> stock_producto;
	public static volatile SingularAttribute<Producto, CategoriaProducto> categoria_producto_obj;
	public static volatile SingularAttribute<Producto, String> nombre_producto;
	public static volatile SingularAttribute<Producto, Long> id_producto;
	public static volatile SingularAttribute<Producto, Integer> codigo_producto;

}

