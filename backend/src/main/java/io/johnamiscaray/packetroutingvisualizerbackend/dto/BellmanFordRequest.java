package io.johnamiscaray.packetroutingvisualizerbackend.dto;

import io.johnamiscaray.packetroutingvisualizerbackend.domain.Graph;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BellmanFordRequest {

    private Graph graph;
    private String start;

}
