package com.artgallery.art_gallery.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ArtworkDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dimensions;
    private int yearCreated;

    @OneToOne
    @JoinColumn(name = "artwork_id")
    private Artwork artwork;
}
