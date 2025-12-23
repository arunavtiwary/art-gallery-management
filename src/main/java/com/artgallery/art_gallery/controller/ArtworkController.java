package com.artgallery.art_gallery.controller;

import com.artgallery.art_gallery.entity.Artwork;
import com.artgallery.art_gallery.enumtype.ArtworkStatus;
import com.artgallery.art_gallery.service.ArtworkService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.artgallery.art_gallery.enumtype.Medium;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/artworks")
@RequiredArgsConstructor
public class ArtworkController {

    private final ArtworkService artworkService;

    // CREATE
    @PostMapping
    public Artwork create(@RequestBody Artwork artwork) {
        return artworkService.createArtwork(artwork);
    }

    // GET ALL
    @GetMapping
    public List<Artwork> getAll() {
        return artworkService.getAllArtworks();
    }

    // QUERY 1: Artworks by artist
    @GetMapping("/artist/{artistId}")
    public List<Artwork> byArtist(@PathVariable Long artistId) {
        return artworkService.getArtworksByArtist(artistId);
    }

    // QUERY 4: By status
    @GetMapping("/status/{status}")
    public List<Artwork> byStatus(@PathVariable ArtworkStatus status) {
        return artworkService.getArtworksByStatus(status);
    }

    // QUERY 5: By medium
    @GetMapping("/medium/{medium}")
    public List<Artwork> byMedium(@PathVariable Medium medium) {
        return artworkService.getArtworksByMedium(medium);
    }

    // QUERY 6: Count by artist
    @GetMapping("/count/artist/{artistId}")
    public long countByArtist(@PathVariable Long artistId) {
        return artworkService.countByArtist(artistId);
    }

    // QUERY 8: Most exhibited
    @GetMapping("/most-exhibited")
    public List<Artwork> mostExhibited() {
        return artworkService.getMostExhibited();
    }

    // QUERY 9: Highest price
    @GetMapping("/highest-price")
    public List<Artwork> highestPrice() {
        return artworkService.getHighestPricedArtworks();
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        artworkService.deleteArtwork(id);
    }
}


