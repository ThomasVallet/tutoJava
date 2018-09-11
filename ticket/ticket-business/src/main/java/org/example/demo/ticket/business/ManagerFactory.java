package org.example.demo.ticket.business;

import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

public interface ManagerFactory {
    // On renvoie désormais simplement l'attribut projetManager
    ProjetManager getProjetManager();

    // Ajout d'un setter pour l'attribut projetManager
    void setProjetManager(ProjetManager pProjetManager);

    TicketManager getTicketManager();

    void setTicketManager(TicketManager pTicketManager);
}
