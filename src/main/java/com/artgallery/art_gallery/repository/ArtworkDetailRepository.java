package com.artgallery.art_gallery.repository;

import com.artgallery.art_gallery.entity.ArtworkDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtworkDetailRepository extends JpaRepository<ArtworkDetail, Long> {
}

