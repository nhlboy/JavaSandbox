package com.example.onetoone.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity(name = "Post")
@Table(name = "post")
public class Post {
 
    @Id

    @GeneratedValue
    private Long id;
 
    private String title;
 
    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL,
              fetch = FetchType.LAZY, optional = false)

    @JsonIgnoreProperties("post")
    private PostDetails details;

    public Post() {
    }

    public void setDetails(PostDetails details) {
        if (details == null) {
            if (this.details != null) {
                this.details.setPost(null);
            }
        }
        else {
            details.setPost(this);
        }
        this.details = details;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public PostDetails getDetails() {
        return this.details;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof com.example.onetoone.model.Post)) return false;
        final com.example.onetoone.model.Post other = (com.example.onetoone.model.Post) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$details = this.getDetails();
        final Object other$details = other.getDetails();
        if (this$details == null ? other$details != null : !this$details.equals(other$details)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof com.example.onetoone.model.Post;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $details = this.getDetails();
        result = result * PRIME + ($details == null ? 43 : $details.hashCode());
        return result;
    }

    public String toString() {
        return "Post(id=" + this.getId() + ", title=" + this.getTitle() + ", details=" + this.getDetails() + ")";
    }
}