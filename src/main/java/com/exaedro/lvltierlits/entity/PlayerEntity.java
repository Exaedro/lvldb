package com.exaedro.lvltierlits.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "players")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_player", nullable = false)
    private Integer id;

    @Column(name = "roblox_ign", nullable = false, unique = true)
    private String robloxIgn;

    @Column(name = "roblox_nickname", nullable = false)
    private String robloxNickname;

    @Column(name = "description")
    private String description;

    @Column(name = "rank")
    private Integer rank;

    @Column(name = "profile_path")
    private String profilePath;

    @Column(name = "body_path")
    private String bodyPath;

    @Column(name = "card_color")
    private String cardColor;

    @Column(name = "color_number")
    private String colorNumber;

}
