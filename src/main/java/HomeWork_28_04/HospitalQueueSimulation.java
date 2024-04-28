package HomeWork_28_04;

import java.util.TreeSet;

public class HospitalQueueSimulation {
    public static void main(String[] args) {
        TreeSet<Ticket> queue = new TreeSet<>();

        // Предположим, что у нас есть список талонов
        Ticket ticket1 = new Ticket("Иванов", 101, "Иванова");
        Ticket ticket2 = new Ticket("Петров", 102, "Петрова");
        Ticket ticket3 = new Ticket("Сидоров", 103, "Сидорова");


        queue.add(ticket2);
        queue.add(ticket1);
        queue.add(ticket3);


        for (Ticket ticket : queue) {
            System.out.println("ФИО: " + ticket.getFullName() + ", Номер талона: " + ticket.getTicketNumber() + ", Врач: " + ticket.getDoctorName());
        }
    }
}