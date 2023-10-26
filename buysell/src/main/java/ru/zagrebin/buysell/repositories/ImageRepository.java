package ru.zagrebin.buysell.repositories;

import ru.zagrebin.buysell.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
