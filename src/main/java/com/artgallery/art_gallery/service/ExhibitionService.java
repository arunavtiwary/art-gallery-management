package com.artgallery.art_gallery.service;
import com.artgallery.art_gallery.entity.Exhibition;
import com.artgallery.art_gallery.entity.Artwork;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface ExhibitionService {

    Exhibition save(Exhibition exhibition);

    List<Exhibition> findAll();

    void delete(Long id);

    Set<Artwork> getArtworksByExhibition(Long exhibitionId);

    List<Exhibition> findUpcoming();

    List<Exhibition> findBetween(LocalDate start, LocalDate end);
}
