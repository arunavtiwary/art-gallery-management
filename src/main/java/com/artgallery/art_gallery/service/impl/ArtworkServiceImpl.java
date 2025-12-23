package com.artgallery.art_gallery.service.impl;

import com.artgallery.art_gallery.entity.Artwork;
import com.artgallery.art_gallery.enumtype.ArtworkStatus;
import com.artgallery.art_gallery.repository.ArtworkRepository;
import com.artgallery.art_gallery.service.ArtworkService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.artgallery.art_gallery.enumtype.Medium;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ArtworkServiceImpl implements ArtworkService {

    private final ArtworkRepository artworkRepository;

    @Override
    public Artwork createArtwork(Artwork artwork) {
        return artworkRepository.save(artwork);
    }

    @Override
    public List<Artwork> getAllArtworks() {
        return artworkRepository.findAll();
    }

    @Override
    public List<Artwork> getArtworksByArtist(Long artistId) {
        return artworkRepository.findByArtistId(artistId);
    }

    @Override
    public List<Artwork> getArtworksByStatus(ArtworkStatus status) {
        return artworkRepository.findByStatus(status);
    }

    @Override
    public List<Artwork> getArtworksByMedium(Medium medium) {
        return artworkRepository.findByMedium(medium);
    }

    @Override
    public long countByArtist(Long artistId) {
        return artworkRepository.countByArtistId(artistId);
    }

    @Override
    public List<Artwork> getMostExhibited() {
        return artworkRepository.findMostExhibited();
    }

    @Override
    public List<Artwork> getHighestPricedArtworks() {
        return artworkRepository.findHighestPriced();
    }

    @Override
    public void deleteArtwork(Long id) {
        artworkRepository.deleteById(id);
    }
}


