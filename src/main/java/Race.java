class Race {
    String leader = "";
    int distation;
     Car car = new Car(leader, distation);
    public int getDistation(String leader, int distation) {
        int time = 24;
      int dist = car.speed * time;
        if (distation < dist) {
            car.name = leader;
            car.speed = distation / time;
            System.out.println("Самая быстрая машина - " + leader);

        } return time;
    }
}


