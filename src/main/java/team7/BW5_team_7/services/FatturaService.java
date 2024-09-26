package team7.BW5_team_7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team7.BW5_team_7.entities.Fattura;
import team7.BW5_team_7.repositories.FatturaRepository;

import java.util.List;
import java.util.UUID;

@Service
public class FatturaService {

    @Autowired
    private FatturaRepository fatturaRepository;

    public List<Fattura> getAllFatture() {
        return fatturaRepository.findAll();
    }

    public Fattura getFatturaById(UUID id) {
        return fatturaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fattura non trovata con id: " + id));
    }

    public Fattura createFattura(Fattura fattura) {
        return fatturaRepository.save(fattura);
    }

    public Fattura updateFattura(UUID id, Fattura dettagliFattura) {
        Fattura fattura = getFatturaById(id);

        fattura.setData(dettagliFattura.getData());
        fattura.setImporto(dettagliFattura.getImporto());
        fattura.setNumeroFattura(dettagliFattura.getNumeroFattura());
        fattura.setCliente(dettagliFattura.getCliente());
        fattura.setStatoFattura(dettagliFattura.getStatoFattura());
        return fatturaRepository.save(fattura);
    }

    public void deleteFattura(UUID id) {
        Fattura fattura = getFatturaById(id);
        fatturaRepository.delete(fattura);
    }
}
