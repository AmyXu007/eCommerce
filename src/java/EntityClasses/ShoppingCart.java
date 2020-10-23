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
import javabean.DbConnect;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amy
 */
@Entity
@Table(name = "ShoppingCart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShoppingCart.findAll", query = "SELECT s FROM ShoppingCart s"),
    @NamedQuery(name = "ShoppingCart.findById", query = "SELECT s FROM ShoppingCart s WHERE s.id = :id"),
    @NamedQuery(name = "ShoppingCart.findByCustomerUsername", query = "SELECT s FROM ShoppingCart s WHERE s.customerUsername = :customerUsername"),
    @NamedQuery(name = "ShoppingCart.findByProductId", query = "SELECT s FROM ShoppingCart s WHERE s.productId = :productId"),
    @NamedQuery(name = "ShoppingCart.findByCount", query = "SELECT s FROM ShoppingCart s WHERE s.count = :count")})
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "customer_username")
    private String customerUsername;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "count")
    private int count;

    public ShoppingCart() {
    }

    public ShoppingCart(Integer id) {
        this.id = id;
    }

    public ShoppingCart(Integer id, String customerUsername, int productId, int count) {
        this.id = id;
        this.customerUsername = customerUsername;
        this.productId = productId;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public static List<ShoppingCart> getShoppingCart(String username) throws SQLException{
        List<ShoppingCart> shoppingcart = new ArrayList<ShoppingCart>();
        Connection conn = DbConnect.getDBconnection();
        String sql = "select * from ShoppingCart where customer_username = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,username);
        ResultSet rs = pstmt.executeQuery();
        try {
            while(rs.next()) {
                ShoppingCart cart = new ShoppingCart();
                cart.setId(rs.getInt("id"));
                cart.setCustomerUsername(rs.getString("customer_username"));
                cart.setProductId(rs.getInt("product_id"));
                cart.setCount(rs.getInt("count"));
                shoppingcart.add(cart);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DbConnect.close(rs);
            DbConnect.close(pstmt);
            DbConnect.close(conn);
        }
        return shoppingcart;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShoppingCart)) {
            return false;
        }
        ShoppingCart other = (ShoppingCart) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityClasses.ShoppingCart[ id=" + id + " ]";
    }
    
}
