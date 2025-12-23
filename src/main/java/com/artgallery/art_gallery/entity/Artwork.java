package com.artgallery.art_gallery.entity;

import com.artgallery.art_gallery.enumtype.ArtworkStatus;
import com.artgallery.art_gallery.enumtype.Medium;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@JsonIgnoreProperties({"artist", "exhibitions"})
public class Artwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private ArtworkStatus status;

    @Enumerated(EnumType.STRING)
    private Medium medium;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    @ManyToMany(mappedBy = "artworks")
    private Set<Exhibition> exhibitions;
}
