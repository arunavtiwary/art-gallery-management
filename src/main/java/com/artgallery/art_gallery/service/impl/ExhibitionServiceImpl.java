package com.artgallery.art_gallery.service.impl;

import com.artgallery.art_gallery.entity.Exhibition;
import com.artgallery.art_gallery.entity.Artwork;
import com.artgallery.art_gallery.repository.ExhibitionRepository;
import com.artgallery.art_gallery.service.ExhibitionService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Transactional
public class ExhibitionServiceImpl implements ExhibitionService {

    private final ExhibitionRepository exhibitionRepository;

    @Override
    public Exhibition save(Exhibition exhibition) {
        return exhibitionRepository.save(exhibition);
    }

    @Override
    public List<Exhibition> findAll() {
        return exhibitionRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        exhibitionRepository.deleteById(id);
    }

    @Override
    public Set<Artwork> getArtworksByExhibition(Long exhibitionId) {
        return exhibitionRepository.findArtworksByExhibitionId(exhibitionId);
    }

    @Override
    public List<Exhibition> findUpcoming() {
        return exhibitionRepository.findUpcoming();
    }

    @Override
    public List<Exhibition> findBetween(LocalDate start, LocalDate end) {
        return exhibitionRepository.findByStartDateBetween(start, end);
    }
}
