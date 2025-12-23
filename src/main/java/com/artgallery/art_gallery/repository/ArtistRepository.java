package com.artgallery.art_gallery.repository;

import com.artgallery.art_gallery.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
