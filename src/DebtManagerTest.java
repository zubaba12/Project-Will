import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class DebtManagerTest {
    HashMap<String, Profile> clients = new HashMap<>();
    Profile client = new Profile("tia", 1200, "tia2009", "password123", 1234324234L);
    Profile client2 = new Profile("nina", 2200, "nina100", "nina123", 5873243413L);

    @org.junit.jupiter.api.Test
    void printDebt() {
        clients.put("tia2009", client);
        clients.put("nina100", client2);



    }

    @org.junit.jupiter.api.Test
    void create() {
        clients.put("tia2009", client);
        assertEquals("tia2009", client.username);
    }

    @org.junit.jupiter.api.Test
    void updateDebt() {
        clients.put("tia2009", client2);
        assertEquals("nina100", client2.username);
    }

    @org.junit.jupiter.api.Test
    void delete() {
        clients.remove("tia2009", client);
        assertNotEquals("tia2009 ", client);
    }
}