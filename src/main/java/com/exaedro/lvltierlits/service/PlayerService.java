package com.exaedro.lvltierlits.service;

import com.exaedro.lvltierlits.entity.PlayerEntity;
import com.exaedro.lvltierlits.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Iterable<PlayerEntity> getAll() {
        return this.playerRepository.findAll();
    }

    public Optional<PlayerEntity> getById(int idPlayer) {
        return this.playerRepository.findById(idPlayer);
    }

    public PlayerEntity save(PlayerEntity player){return this.playerRepository.save(player);}

    public boolean exist (int idPlayer){
        return this.playerRepository.existsById(idPlayer);
    }

    public void delete (int idPlayer) {this.playerRepository.deleteById(idPlayer);}
}