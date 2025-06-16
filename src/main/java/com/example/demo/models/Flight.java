package com.example.demo.models;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long airline_id;
    private String flight_no;
    private String flight_type;
    private String flight_date;
    private String aircraft_type_icao;
    private String aircraft_type_iata;
    private String arrival_gate;
    private String departure_gate;
    private String arrival_terminal;
    private String departure_terminal;
    private String flight_from;
    private String flight_to;
    private LocalDateTime sta;
    private LocalDateTime std;
    private LocalDateTime eta;
    private LocalDateTime etd;
    private LocalDateTime ata;
    private LocalDateTime atd;
    private Integer checkin_count;
    private Integer sorting_count;
    private Integer BRS_count;
    private Integer status;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAirline_id() {
        return airline_id;
    }

    public void setAirline_id(Long airline_id) {
        this.airline_id = airline_id;
    }

    public String getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(String flight_no) {
        this.flight_no = flight_no;
    }

    public String getFlight_type() {
        return flight_type;
    }

    public void setFlight_type(String flight_type) {
        this.flight_type = flight_type;
    }

    public String getFlight_date() {
        return flight_date;
    }

    public void setFlight_date(String flight_date) {
        this.flight_date = flight_date;
    }

    public String getAircraft_type_icao() {
        return aircraft_type_icao;
    }

    public void setAircraft_type_icao(String aircraft_type_icao) {
        this.aircraft_type_icao = aircraft_type_icao;
    }

    public String getAircraft_type_iata() {
        return aircraft_type_iata;
    }

    public void setAircraft_type_iata(String aircraft_type_iata) {
        this.aircraft_type_iata = aircraft_type_iata;
    }

    public String getArrival_gate() {
        return arrival_gate;
    }

    public void setArrival_gate(String arrival_gate) {
        this.arrival_gate = arrival_gate;
    }

    public String getDeparture_gate() {
        return departure_gate;
    }

    public void setDeparture_gate(String departure_gate) {
        this.departure_gate = departure_gate;
    }

    public String getArrival_terminal() {
        return arrival_terminal;
    }

    public void setArrival_terminal(String arrival_terminal) {
        this.arrival_terminal = arrival_terminal;
    }

    public String getDeparture_terminal() {
        return departure_terminal;
    }

    public void setDeparture_terminal(String departure_terminal) {
        this.departure_terminal = departure_terminal;
    }

    public String getFlight_from() {
        return flight_from;
    }

    public void setFlight_from(String flight_from) {
        this.flight_from = flight_from;
    }

    public String getFlight_to() {
        return flight_to;
    }

    public void setFlight_to(String flight_to) {
        this.flight_to = flight_to;
    }

    public LocalDateTime getSta() {
        return sta;
    }

    public void setSta(LocalDateTime sta) {
        this.sta = sta;
    }

    public LocalDateTime getStd() {
        return std;
    }

    public void setStd(LocalDateTime std) {
        this.std = std;
    }

    public LocalDateTime getEta() {
        return eta;
    }

    public void setEta(LocalDateTime eta) {
        this.eta = eta;
    }

    public LocalDateTime getEtd() {
        return etd;
    }

    public void setEtd(LocalDateTime etd) {
        this.etd = etd;
    }

    public LocalDateTime getAta() {
        return ata;
    }

    public void setAta(LocalDateTime ata) {
        this.ata = ata;
    }

    public LocalDateTime getAtd() {
        return atd;
    }

    public void setAtd(LocalDateTime atd) {
        this.atd = atd;
    }

    public Integer getCheckin_count() {
        return checkin_count;
    }

    public void setCheckin_count(Integer checkin_count) {
        this.checkin_count = checkin_count;
    }

    public Integer getSorting_count() {
        return sorting_count;
    }

    public void setSorting_count(Integer sorting_count) {
        this.sorting_count = sorting_count;
    }

    public Integer getBRS_count() {
        return BRS_count;
    }

    public void setBRS_count(Integer BRS_count) {
        this.BRS_count = BRS_count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
