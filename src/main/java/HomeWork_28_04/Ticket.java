package HomeWork_28_04;

class Ticket implements Comparable<Ticket> {
    private String fullName;
    private int ticketNumber;
    private String doctorName;

    public Ticket(String иванов, int i, String иванова) {
    }



    @Override
    public int compareTo(Ticket other) {
        return Integer.compare(this.ticketNumber, other.ticketNumber);
    }

    public String getFullName() {
        return fullName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getDoctorName() {
        return doctorName;
    }
}


