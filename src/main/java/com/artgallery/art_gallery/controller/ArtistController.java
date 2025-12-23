package com.artgallery.art_gallery.controller;

import com.artgallery.art_gallery.entity.Artist;
import com.artgallery.art_gallery.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
@RequiredArgsConstructor
public class ArtistController {

    private final ArtistService service;

    @PostMapping
    public Artist create(@RequestBody Artist artist) {
        return service.save(artist);
    }

    @GetMapping
    public List<Artist> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Artist get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Artist update(@PathVariable Long id, @RequestBody Artist artist) {
        artist.setId(id);
        return service.save(artist);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
