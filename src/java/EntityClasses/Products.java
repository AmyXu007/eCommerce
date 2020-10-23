/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javabean.DbConnect;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yuw
 */
@Entity
@Table(name = "Products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByProductsId", query = "SELECT p FROM Products p WHERE p.productsId = :productsId"),
    @NamedQuery(name = "Products.findByProductsName", query = "SELECT p FROM Products p WHERE p.productsName = :productsName"),
    @NamedQuery(name = "Products.findByProductPrice", query = "SELECT p FROM Products p WHERE p.productPrice = :productPrice"),
    @NamedQuery(name = "Products.findByProductDesc", query = "SELECT p FROM Products p WHERE p.productDesc = :productDesc"),
    @NamedQuery(name = "Products.findByProductCategoryID", query = "SELECT p FROM Products p WHERE p.productCategoryID = :productCategoryID"),
    @NamedQuery(name = "Products.findByProductUpdateDate", query = "SELECT p FROM Products p WHERE p.productUpdateDate = :productUpdateDate"),
    @NamedQuery(name = "Products.findByProductStock", query = "SELECT p FROM Products p WHERE p.productStock = :productStock")})
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Products_Id")
    private Integer productsId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Products_Name")
    private String productsName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Product_Price")
    private float productPrice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Product_Desc")
    private String productDesc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Product_Image")
    private byte[] productImage;
    @Column(name = "Product_CategoryID")
    private Integer productCategoryID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Product_UpdateDate")
    @Temporal(TemporalType.DATE)
    private Date productUpdateDate;
    @Column(name = "Product_Stock")
    private Integer productStock;

    public Products() {
    }

    public Products(Integer productsId) {
        this.productsId = productsId;
    }

    public Products(Integer productsId, String productsName, float productPrice, String productDesc, byte[] productImage, Date productUpdateDate) {
        this.productsId = productsId;
        this.productsName = productsName;
        this.productPrice = productPrice;
        this.productDesc = productDesc;
        this.productImage = productImage;
        this.productUpdateDate = productUpdateDate;
    }
    public static Products getProduct(int id) throws SQLException{
        Products product = new Products();
        Connection conn = DbConnect.getDBconnection();
        String sql = "select * from Products where Products_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,id);
        ResultSet rs = pstmt.executeQuery();
        try {
            while(rs.next()) {
                product.setProductsId(rs.getInt("Products_Id"));
                product.setProductCategoryID(rs.getInt("Product_CategoryID"));
                product.setProductsName(rs.getString("Products_Name"));
                product.setProductImage(rs.getBytes("Product_Image"));
                product.setProductPrice(rs.getFloat("Product_Price"));
                product.setProductDesc(rs.getString("Product_Desc"));
                product.setProductStock(rs.getInt("Product_Stock"));
                product.setProductUpdateDate(rs.getDate("Product_UpdateDate"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DbConnect.close(rs);
            DbConnect.close(pstmt);
            DbConnect.close(conn);
        }
        return product;
    }
    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public byte[] getProductImage() {
        return productImage;
    }

    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
    }

    public Integer getProductCategoryID() {
        return productCategoryID;
    }

    public void setProductCategoryID(Integer productCategoryID) {
        this.productCategoryID = productCategoryID;
    }

    public Date getProductUpdateDate() {
        return productUpdateDate;
    }

    public void setProductUpdateDate(Date productUpdateDate) {
        this.productUpdateDate = productUpdateDate;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }
    
    public static List<Products> getProducts() throws SQLException{
        List<Products> products = new ArrayList<>();
        Connection conn = DbConnect.getDBconnection();
        String sql = "select * from Products";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        try {
            while(rs.next()) {
                Products product = new Products();
                product.setProductsId(rs.getInt("Products_id"));
                product.setProductsName(rs.getString("Products_name"));
                product.setProductImage(rs.getBytes("Product_Image"));
                product.setProductPrice(rs.getFloat("Product_price"));
                product.setProductCategoryID(rs.getInt("Product_categoryId"));
                product.setProductStock(rs.getInt("Product_stock"));
                product.setProductUpdateDate(rs.getDate("Product_UpdateDate"));
                products.add(product);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DbConnect.close(rs);
            DbConnect.close(pstmt);
            DbConnect.close(conn);
        }
        return products;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productsId != null ? productsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.productsId == null && other.productsId != null) || (this.productsId != null && !this.productsId.equals(other.productsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityClasses.Products[ productsId=" + productsId + " ]";
    }
    
}
