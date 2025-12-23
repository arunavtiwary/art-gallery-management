package com.artgallery.art_gallery.service.impl;

import com.artgallery.art_gallery.entity.Artist;
import com.artgallery.art_gallery.repository.ArtistRepository;
import com.artgallery.art_gallery.service.ArtistService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository repo;

    public Artist save(Artist artist) {
        return repo.save(artist);
    }

    public List<Artist> findAll() {
        return repo.findAll();
    }

    public Artist findById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
