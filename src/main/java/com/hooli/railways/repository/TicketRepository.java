package com.hooli.railways.repository;

import com.hooli.railways.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "ticket")
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}