package ar.edu.info.unlp.oo;

import java.util.ArrayList;
import java.util.List;

public class Farola {
    private List<Farola> neighbors;
    private boolean on=true;
    
    public Farola() {
        this.on = false;
        neighbors = new ArrayList<Farola>();
    }

    public Boolean isOn() {
          return this.on;
        }
    
        public Boolean isOff() {
            return !this.on;
            }

    List<Farola> getNeighbors() {
        return this.neighbors;
    }

    void pairWithNeighbor(Farola farolaDos) {
        this.neighbors.add(farolaDos);
        farolaDos.neighbors.add(this);

    }

    void turnOn() {
        this.on = true;
        for (Farola farola : this.neighbors) {
            farola.on = true;
        }
    }

  void turnOff() {
        this.on = false;
        for (Farola farola : this.neighbors) {
            farola.on =false;
        }
    }
}
