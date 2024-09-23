package team7.BW5_team_7.entities;

import jakarta.persistence.*;
import lombok.*;
import team7.BW5_team_7.enums.TipoCliente;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "clienti")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    @Column(name = "ragione_sociale")
    private String ragioneSociale;

    @Column(name = "partita_iva")
    private String partitaIve;

    private String email;

    @Column(name = "data_inserimento")
    private LocalDate dataInserimento;

    @Column(name = "data_ultimo_contatto")
    private LocalDate dataUltimoContatto;

    @Column(name = "fatturato_annuale")
    private Long fatturatoAnnuale;

    private String pec;

    private int telefono;

    @Column(name = "email_contatto")
    private String emailContatto;

    @Column(name = "nome_contatto")
    private String nomeContatto;

    @Column(name = "cognome_contatto")
    private String cognomeContatto;

    @Column(name = "telefono_contatto")
    private int telefonoContatto;

    @Column(name = "logo_aziendale")
    private String logoAziendale;

    @Enumerated(EnumType.STRING)
    private TipoCliente tipo;

    public Cliente(String ragioneSociale, String partitaIve, String email, Long fatturatoAnnuale, String pec, int telefono, String emailContatto, String nomeContatto, String cognomeContatto, int telefonoContatto, String logoAziendale, TipoCliente tipo) {
        this.ragioneSociale = ragioneSociale;
        this.partitaIve = partitaIve;
        this.email = email;
        this.dataInserimento = LocalDate.now();
        this.dataUltimoContatto = LocalDate.now();
        this.fatturatoAnnuale = fatturatoAnnuale;
        this.pec = pec;
        this.telefono = telefono;
        this.emailContatto = emailContatto;
        this.nomeContatto = nomeContatto;
        this.cognomeContatto = cognomeContatto;
        this.telefonoContatto = telefonoContatto;
        this.logoAziendale = logoAziendale;
        this.tipo = tipo;
    }
}
