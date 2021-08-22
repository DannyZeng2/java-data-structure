package graph;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Vertex {

    private String value;
    private boolean visited;

    public Vertex(String value) {
        this.value = value;
    }
}
