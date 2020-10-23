/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yuw
 */
@Entity
@Table(name = "Review")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Review.findAll", query = "SELECT r FROM Review r"),
    @NamedQuery(name = "Review.findByProductsId", query = "SELECT r FROM Review r WHERE r.productsId = :productsId"),
    @NamedQuery(name = "Review.findByReviewId", query = "SELECT r FROM Review r WHERE r.reviewId = :reviewId"),
    @NamedQuery(name = "Review.findByReviewcontent", query = "SELECT r FROM Review r WHERE r.reviewcontent = :reviewcontent"),
    @NamedQuery(name = "Review.findByCustomerId", query = "SELECT r FROM Review r WHERE r.customerId = :customerId")})
public class Review implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Products_Id")
    private Integer productsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Review_Id")
    private int reviewId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Review_content")
    private String reviewcontent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Customer_Id")
    private int customerId;

    public Review() {
    }

    public Review(Integer productsId) {
        this.productsId = productsId;
    }

    public Review(Integer productsId, int reviewId, String reviewcontent, int customerId) {
        this.productsId = productsId;
        this.reviewId = reviewId;
        this.reviewcontent = reviewcontent;
        this.customerId = customerId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewcontent() {
        return reviewcontent;
    }

    public void setReviewcontent(String reviewcontent) {
        this.reviewcontent = reviewcontent;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
        if (!(object instanceof Review)) {
            return false;
        }
        Review other = (Review) object;
        if ((this.productsId == null && other.productsId != null) || (this.productsId != null && !this.productsId.equals(other.productsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityClasses.Review[ productsId=" + productsId + " ]";
    }
    
}
