package com.artgallery.art_gallery.controller;
import java.util.Set;
import com.artgallery.art_gallery.entity.Artwork;
import com.artgallery.art_gallery.entity.Exhibition;
import com.artgallery.art_gallery.service.ExhibitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
@RestController
@RequestMapping("/api/exhibitions")
@RequiredArgsConstructor
public class ExhibitionController {

    private final ExhibitionService exhibitionService;

    // CREATE
    @PostMapping
    public Exhibition create(@RequestBody Exhibition exhibition) {
        return exhibitionService.save(exhibition);
    }

    // GET ALL
    @GetMapping
    public List<Exhibition> getAll() {
        return exhibitionService.findAll();
    }

    // QUERY 2: Artworks in exhibition
    @GetMapping("/{id}/artworks")
    public Set<Artwork> artworks(@PathVariable Long id) {
        return exhibitionService.getArtworksByExhibition(id);
    }

    // QUERY 7: Upcoming exhibitions
    @GetMapping("/upcoming")
    public List<Exhibition> upcoming() {
        return exhibitionService.findUpcoming();
    }

    // QUERY 10: Between dates
    @GetMapping("/between")
    public List<Exhibition> between(
            @RequestParam LocalDate start,
            @RequestParam LocalDate end) {
        return exhibitionService.findBetween(start, end);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        exhibitionService.delete(id);
    }
}
