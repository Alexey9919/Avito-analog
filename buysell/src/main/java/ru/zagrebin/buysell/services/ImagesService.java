package ru.zagrebin.buysell.services;

import ru.zagrebin.buysell.models.Image;
import ru.zagrebin.buysell.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ImagesService {

    private final ImageRepository imageRepository;

    @Autowired
    public ImagesService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public List<Image> getImages() {
        return imageRepository.findAll();
    }
}
