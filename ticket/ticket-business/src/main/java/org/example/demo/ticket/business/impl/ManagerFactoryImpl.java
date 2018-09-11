package org.example.demo.ticket.business.impl;

import org.example.demo.ticket.business.ManagerFactory;
import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

import javax.inject.Inject;
import javax.inject.Named;

@Named("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory {
    // ...

    // Ajout d'un attribut projetManager
    @Inject
    private ProjetManager projetManager;

    // On renvoie désormais simplement l'attribut projetManager
    @Override
    public ProjetManager getProjetManager() {

        return this.projetManager;
    }

    // Ajout d'un setter pour l'attribut projetManager
    @Override
    public void setProjetManager(ProjetManager pProjetManager) {

        projetManager = pProjetManager;
    }

    @Inject
    private TicketManager ticketManager;

    @Override
    public TicketManager getTicketManager() {
        return this.ticketManager;
    }

    @Override
    public void setTicketManager(TicketManager pTicketManager) {
        ticketManager = pTicketManager;
    }
}



