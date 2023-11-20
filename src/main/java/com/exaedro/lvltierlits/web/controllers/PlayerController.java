package com.exaedro.lvltierlits.web.controllers;

import com.exaedro.lvltierlits.entity.PlayerEntity;
import com.exaedro.lvltierlits.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/players")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public ResponseEntity<Iterable<PlayerEntity>> getAll() {
        return ResponseEntity.ok(this.playerService.getAll());
    }


    @GetMapping("/{idPizza}")
    public ResponseEntity<Optional<PlayerEntity>> getById(@PathVariable int idPlayer){
        return ResponseEntity.ok(this.playerService.getById(idPlayer));
    }

    @PostMapping("/create")
    public ResponseEntity<PlayerEntity> add(@RequestBody PlayerEntity player){
        if (player.getId() == null || !this.playerService.exist(player.getId())){
            return ResponseEntity.ok(this.playerService.save(player));
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/edit")
    public ResponseEntity<PlayerEntity> update(@RequestBody PlayerEntity player){
        if (player.getId() != null && this.playerService.exist(player.getId())){
            return ResponseEntity.ok(this.playerService.save(player));
        }

        return ResponseEntity.badRequest().build();
    }


    @DeleteMapping("/player/{idPlayer}")
    public ResponseEntity<Void> delete(@PathVariable int idPlayer){
        if (this.playerService.exist(idPlayer)){
            this.playerService.delete(idPlayer);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
