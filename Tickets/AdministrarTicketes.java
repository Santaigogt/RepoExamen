/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Student
 */
public class AdministrarTicketes {

    private Queue<ticket> listTickets;

    public AdministrarTicketes(Queue<ticket> listTickets) {
        this.listTickets = listTickets;
    }

    public Queue<ticket> getListTickets() {
        return listTickets;
    }

    public AdministrarTicketes() {
        this(new LinkedList<>());
    }

    public void AgregarTiket( TipoTickete tipo) {
        ticket ticke = new ticket( tipo);
        listTickets.add(ticke);
    }
    
    public void elimnarTicketPorPsoscion(){
    listTickets.poll();
    }
        public void elimnarTicket(String numero, TipoTickete tipo){
    listTickets.remove();
     //listTickets.
    }
    public Queue<ticket> buscarTicketPorTipo(TipoTickete tipo){
          Queue<ticket> listaTipos;
         for (Iterator<ticket> it = this.listTickets.iterator(); it.hasNext();) {
            if (tipo.equals(it.next().getTipo())){
                  listaTipos = (Queue<ticket>) it;
                return listaTipos;
            }
        }
        return null;
            
        }
    }
