package systems.vostok.algo.graph

class SubwayMatrix {
    int numOfStations
    List<List<Boolean>> matrix

    SubwayMatrix(int numOfStations) {
        this.numOfStations = numOfStations
        matrix = new Boolean[numOfStations+1][numOfStations+1]
    }
}
