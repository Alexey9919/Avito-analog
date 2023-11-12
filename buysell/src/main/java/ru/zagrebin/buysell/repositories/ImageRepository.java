package ru.zagrebin.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zagrebin.buysell.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
