package com.exaedro.lvltierlits.controllers;

import com.exaedro.lvltierlits.entity.PlayerEntity;
import com.exaedro.lvltierlits.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/players")
public class PlayerController {
    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    private final PlayerService playerService;

    @GetMapping("/all")
    public ResponseEntity<Iterable<PlayerEntity>> getAll() {
        return new ResponseEntity<>(playerService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/player/{id}")
    public ResponseEntity<Optional<PlayerEntity>> getById(@PathVariable("id") int playerId) {
        return new ResponseEntity<>(playerService.getById(playerId), HttpStatus.OK);
    }
}
