package com.artgallery.art_gallery.repository;

import com.artgallery.art_gallery.entity.Exhibition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Set;
import com.artgallery.art_gallery.entity.Artwork;
import java.time.LocalDate;
import java.util.List;

public interface ExhibitionRepository extends JpaRepository<Exhibition, Long> {

    @Query("SELECT e.artworks FROM Exhibition e WHERE e.id = :id")
    Set<Artwork> findArtworksByExhibitionId(Long id);

    @Query("SELECT e FROM Exhibition e WHERE e.startDate > CURRENT_DATE")
    List<Exhibition> findUpcoming();

    List<Exhibition> findByStartDateBetween(LocalDate start, LocalDate end);
}
