class Race {
   String leader = "";
   int leaderDistance = 0;
   int time = 24;
    public void getDistation(Car newCar) {
       int distance = time * newCar.speed;
        if (distance > leaderDistance) {
            leader = newCar.name;
            leaderDistance = distance;
        }
    }
}


