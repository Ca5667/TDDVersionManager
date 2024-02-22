import org.junit.jupiter.api.Test; // On importe la biblioteque de test JUNIT
import static org.junit.jupiter.api.Assertions.*; // On importe la bibliotheque ASSERTIONS

class VersionManagerTest { // On crée une classe VersionManagerTest


     @Test // Assert de Test
    void majeur() { // On met en place la methode majeur
         VersionManager instance = new VersionManager(); // On instancie la class VersionManager
            assertEquals(100, instance.getVers()); // Test Majeur = 100
        }


    @Test // Assert de Test
    void mineur() {
        VersionManager instance = new VersionManager();
        assertEquals(10, instance.getVers());
    }

    @Test // Assert de Test
    void getVers() {
        VersionManager instance = new VersionManager();
        assertEquals(1, instance.getVers());
    }
}