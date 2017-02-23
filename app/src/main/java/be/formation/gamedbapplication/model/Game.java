package be.formation.gamedbapplication.model;

import java.util.Date;

/**
 * Created by Student on 23-02-17.
 */

public class Game {
    private long id;
    private String title;
    private String description;
    private String imageUrl;
    private String genre;
    private String editor;
    private Date pubDate;
    private float rating;
    private boolean owned;

    public Game() {
    }

    public Game(long id, String title, String description, String imageUrl, String genre, String editor, Date pubDate, float rating, boolean owned) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.genre = genre;
        this.editor = editor;
        this.pubDate = pubDate;
        this.rating = rating;
        this.owned = owned;
    }

    public Game(String title, String description, String imageUrl, String genre, String editor, Date pubDate, float rating, boolean owned) {

        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.genre = genre;
        this.editor = editor;
        this.pubDate = pubDate;
        this.rating = rating;
        this.owned = owned;
    }

    //region setters and getters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    //endregion


    // region equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        return id == game.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    // endregion

    // region toString
    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", genre='" + genre + '\'' +
                ", editor='" + editor + '\'' +
                ", pubDate=" + pubDate +
                ", rating=" + rating +
                ", owned=" + owned +
                '}';
    }
    // endregion
}
