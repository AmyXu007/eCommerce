package EntityClasses;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-13T16:07:45")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, String> productDesc;
    public static volatile SingularAttribute<Products, Integer> productsId;
    public static volatile SingularAttribute<Products, byte[]> productImage;
    public static volatile SingularAttribute<Products, Integer> productCategoryID;
    public static volatile SingularAttribute<Products, Integer> productStock;
    public static volatile SingularAttribute<Products, String> productsName;
    public static volatile SingularAttribute<Products, Float> productPrice;
    public static volatile SingularAttribute<Products, Date> productUpdateDate;

}