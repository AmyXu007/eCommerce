/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * @author amy
 */
@Entity
@Table(name = "Orders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByOrderId", query = "SELECT o FROM Orders o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "Orders.findByCustomerUsername", query = "SELECT o FROM Orders o WHERE o.customerUsername = :customerUsername"),
    @NamedQuery(name = "Orders.findByOrderPrice", query = "SELECT o FROM Orders o WHERE o.orderPrice = :orderPrice"),
    @NamedQuery(name = "Orders.findByOrderDate", query = "SELECT o FROM Orders o WHERE o.orderDate = :orderDate"),
    @NamedQuery(name = "Orders.findByOrderAddress1", query = "SELECT o FROM Orders o WHERE o.orderAddress1 = :orderAddress1"),
    @NamedQuery(name = "Orders.findByOrderAddress2", query = "SELECT o FROM Orders o WHERE o.orderAddress2 = :orderAddress2"),
    @NamedQuery(name = "Orders.findByOrderCity", query = "SELECT o FROM Orders o WHERE o.orderCity = :orderCity"),
    @NamedQuery(name = "Orders.findByOrderState", query = "SELECT o FROM Orders o WHERE o.orderState = :orderState"),
    @NamedQuery(name = "Orders.findByOrderZipcode", query = "SELECT o FROM Orders o WHERE o.orderZipcode = :orderZipcode"),
    @NamedQuery(name = "Orders.findByOrderEmail", query = "SELECT o FROM Orders o WHERE o.orderEmail = :orderEmail")})
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_id")
    private Integer orderId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "customer_username")
    private String customerUsername;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_price")
    private float orderPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_date")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "order_address1")
    private String orderAddress1;
    @Size(max = 128)
    @Column(name = "order_address2")
    private String orderAddress2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "order_city")
    private String orderCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "order_state")
    private String orderState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "order_zipcode")
    private String orderZipcode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "order_email")
    private String orderEmail;

    public Orders() {
    }

    public Orders(Integer orderId) {
        this.orderId = orderId;
    }

    public Orders(Integer orderId, String customerUsername, float orderPrice, Date orderDate, String orderAddress1, String orderCity, String orderState, String orderZipcode, String orderEmail) {
        this.orderId = orderId;
        this.customerUsername = customerUsername;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
        this.orderAddress1 = orderAddress1;
        this.orderCity = orderCity;
        this.orderState = orderState;
        this.orderZipcode = orderZipcode;
        this.orderEmail = orderEmail;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderAddress1() {
        return orderAddress1;
    }

    public void setOrderAddress1(String orderAddress1) {
        this.orderAddress1 = orderAddress1;
    }

    public String getOrderAddress2() {
        return orderAddress2;
    }

    public void setOrderAddress2(String orderAddress2) {
        this.orderAddress2 = orderAddress2;
    }

    public String getOrderCity() {
        return orderCity;
    }

    public void setOrderCity(String orderCity) {
        this.orderCity = orderCity;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getOrderZipcode() {
        return orderZipcode;
    }

    public void setOrderZipcode(String orderZipcode) {
        this.orderZipcode = orderZipcode;
    }

    public String getOrderEmail() {
        return orderEmail;
    }

    public void setOrderEmail(String orderEmail) {
        this.orderEmail = orderEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityClasses.Orders[ orderId=" + orderId + " ]";
    }
    
}
