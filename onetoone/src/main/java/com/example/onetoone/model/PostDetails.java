package com.example.onetoone.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "PostDetails")
@Table(name = "post_details")
public class PostDetails {
 
    @Id
    @GeneratedValue
    private Long id;
 
    @Column(name = "created_on")
    private Date createdOn;
 
    @Column(name = "created_by")
    private String createdBy;
 
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")

    @JsonIgnoreProperties("details")
    private Post post;
 
    public PostDetails() {}
 
    public PostDetails(String createdBy) {
        createdOn = new Date();
        this.createdBy = createdBy;
    }

    public Long getId() {
        return this.id;
    }

    public Date getCreatedOn() {
        return this.createdOn;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public Post getPost() {
        return this.post;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof com.example.onetoone.model.PostDetails)) return false;
        final com.example.onetoone.model.PostDetails other = (com.example.onetoone.model.PostDetails) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$createdOn = this.getCreatedOn();
        final Object other$createdOn = other.getCreatedOn();
        if (this$createdOn == null ? other$createdOn != null : !this$createdOn.equals(other$createdOn)) return false;
        final Object this$createdBy = this.getCreatedBy();
        final Object other$createdBy = other.getCreatedBy();
        if (this$createdBy == null ? other$createdBy != null : !this$createdBy.equals(other$createdBy)) return false;
        final Object this$post = this.getPost();
        final Object other$post = other.getPost();
        if (this$post == null ? other$post != null : !this$post.equals(other$post)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof com.example.onetoone.model.PostDetails;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $createdOn = this.getCreatedOn();
        result = result * PRIME + ($createdOn == null ? 43 : $createdOn.hashCode());
        final Object $createdBy = this.getCreatedBy();
        result = result * PRIME + ($createdBy == null ? 43 : $createdBy.hashCode());
        final Object $post = this.getPost();
        result = result * PRIME + ($post == null ? 43 : $post.hashCode());
        return result;
    }

    public String toString() {
        return "PostDetails(id=" + this.getId() + ", createdOn=" + this.getCreatedOn() + ", createdBy=" + this.getCreatedBy() + ", post=" + this.getPost() + ")";
    }
}