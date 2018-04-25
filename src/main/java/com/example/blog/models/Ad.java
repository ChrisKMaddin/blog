package com.example.blog.models;

import org.apache.catalina.User;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "ads")
public class Ad {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 100)
    @Size(min=1, max=15, message="Ad title must be between 1 and 15 characters long.")
    private String title;

    @Column(nullable = false)
    private String description;

    //Creates the relationship to the users table.
    @OneToOne
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ad")
    private List<AdImage> images;

    @OneToOne
    private AdDetails adDetails;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="ads_categories",
            joinColumns={@JoinColumn(name="ad_id")},
            inverseJoinColumns={@JoinColumn(name="category_id")}
    )
    private List<Categories> categories;

    public Ad() {
    }

    public Ad(String title, String description, long id, User user, AdDetails add, List<AdImage> images, List<Categories> categories) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.images = images;
        this.adDetails = add;
        this.categories = categories;

    }

    public Ad(String title, String description, User user,  AdDetails add, List<AdImage> images, List<Categories> categories) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.images = images;
        this.adDetails = add;
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<AdImage> getImages() {
        return images;
    }

    public void setImages(List<AdImage> images) {
        this.images = images;
    }

    public AdDetails getAdDetails() {
        return adDetails;
    }

    public void setAdDetails(AdDetails adDetails) {
        this.adDetails = adDetails;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }


}