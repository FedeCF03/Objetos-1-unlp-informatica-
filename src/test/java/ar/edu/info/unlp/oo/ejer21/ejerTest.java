package ar.edu.info.unlp.oo.ejer21;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ejerTest {
    private Map<String, Integer> map;

    @BeforeEach
    public void setUp() {
        map = new HashMap<>();
        map.put("Lionel messi", 2);
        map.put("Cristiano Ronaldo", 3);
        map.put("Neymar", 4);
    }

    @Test
    public void testAltura() {
        assertEquals(2, map.get("Lionel messi"));
        assertEquals(true, map.containsKey("Cristiano Ronaldo"));
        map.remove(map.get("Cristiano Ronaldo"));
        assertEquals(false, map.containsKey("Cristiano Ronaldo"));
        map.replace("Lionel messi", map.get("Lionel messi") + 1);
        assertEquals(3, map.get("Lionel messi"));
    }

}
