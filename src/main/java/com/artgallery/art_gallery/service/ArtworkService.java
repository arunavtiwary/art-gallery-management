package com.artgallery.art_gallery.service;
import com.artgallery.art_gallery.entity.Artwork;
import com.artgallery.art_gallery.enumtype.ArtworkStatus;
import com.artgallery.art_gallery.enumtype.Medium;

import java.util.List;

public interface ArtworkService {

    Artwork createArtwork(Artwork artwork);

    List<Artwork> getAllArtworks();

    List<Artwork> getArtworksByArtist(Long artistId);

    List<Artwork> getArtworksByStatus(ArtworkStatus status);

    List<Artwork> getArtworksByMedium(Medium medium);

    long countByArtist(Long artistId);

    List<Artwork> getMostExhibited();

    List<Artwork> getHighestPricedArtworks();

    void deleteArtwork(Long id);
}
