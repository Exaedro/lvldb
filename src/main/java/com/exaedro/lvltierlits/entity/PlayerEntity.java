package com.exaedro.lvltierlits.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_player")
    private Integer id;

    @Column(name = "roblox_ign")
    private String robloxIgn;

    @Column(name = "roblox_nickname")
    private String robloxNickname;

    private String description;

    private Integer rank;

    @Column(name = "profile_path")
    private String profilePath;

    @Column(name = "body_path")
    private String bodyPath;

    @Column(name = "card_color")
    private String cardColor;

    @Column(name = "color_number")
    private String colorNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRobloxIgn() {
        return robloxIgn;
    }

    public void setRobloxIgn(String robloxIgn) {
        this.robloxIgn = robloxIgn;
    }

    public String getRobloxNickname() {
        return robloxNickname;
    }

    public void setRobloxNickname(String robloxNickname) {
        this.robloxNickname = robloxNickname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getProfilePath() {
        return profilePath;
    }

    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }

    public String getBodyPath() {
        return bodyPath;
    }

    public void setBodyPath(String bodyPath) {
        this.bodyPath = bodyPath;
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public String getColorNumber() {
        return colorNumber;
    }

    public void setColorNumber(String colorNumber) {
        this.colorNumber = colorNumber;
    }
}
