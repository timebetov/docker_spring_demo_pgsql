package com.github.timebetov;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demo")
public class DemoController {

    private final DemoRepository demoRepository;

    @GetMapping
    public List<DemoEntity> findAll() {
        return demoRepository.findAll();
    }

    @PostMapping
    public DemoEntity save(@RequestBody DemoEntity demoEntity) {
        return demoRepository.save(demoEntity);
    }

    @GetMapping("/{id}")
    public DemoEntity findById(@PathVariable Long id) {
        return demoRepository.findById(id).orElseThrow(
                () -> {
                    throw new EntityNotFoundException("Demo not found!");
                }
        );
    }
}
