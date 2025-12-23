package com.artgallery.art_gallery.repository;

import com.artgallery.art_gallery.entity.Artwork;
import com.artgallery.art_gallery.enumtype.ArtworkStatus;
import com.artgallery.art_gallery.enumtype.Medium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface ArtworkRepository extends JpaRepository<Artwork, Long> {

    List<Artwork> findByArtistId(Long artistId);

    List<Artwork> findByStatus(ArtworkStatus status);

    List<Artwork> findByMedium(Medium medium);

    long countByArtistId(Long artistId);

    @Query("""
    SELECT a FROM Artwork a
    JOIN a.exhibitions e
    GROUP BY a
    ORDER BY COUNT(e) DESC
    """)
    List<Artwork> findMostExhibited();

    @Query("""
    SELECT a FROM Artwork a
    WHERE a.price = (SELECT MAX(b.price) FROM Artwork b)
    """)
    List<Artwork> findHighestPriced();
}
