package systems.vostok.algo.graph

class SubwayMatrix {
    int numOfStations
    List<List<Boolean>> matrix

    SubwayMatrix(int numOfStations) {
        this.numOfStations = numOfStations
        matrix = new Boolean[numOfStations+1][numOfStations+1]
    }

    void addLine(int[] stations) {
        stations.eachWithIndex { station, i ->
            matrix[stations[i]][stations[i+1]] = true
            matrix[stations[i+1]][stations[i]] = true
        }
    }
}
