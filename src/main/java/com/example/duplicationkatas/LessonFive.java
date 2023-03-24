package com.example.duplicationkatas;

import com.example.duplicationkatas.helpers.Player;

public class LessonFive extends Song{

    public void singWalkingSong() {
        sing("Going for a walk and I went North");
        sing("Hmmm where am I");
        sing(walkNorth());
        sing("Wait let me go back!");
        sing("Going for a walk and I went West");
        sing("Hmmm where am I");
        sing(walkWest());
        sing("Wait let me go back!");
        sing("Going for a walk and I went South");
        sing("Hmmm where am I");
        sing(walkSouth());
        sing("Wait let me go back!");
        sing("Going for a walk and I went East");
        sing("Hmmm where am I");
        sing(walkEast());
        sing("Wait let me go back!");
    }


    private String walkNorth()
    {
        Player player = new Player();
        player.move("N");
        return player.getCurrentPosition();
    }

    private String walkSouth()
    {
        Player player = new Player();
        player.move("S");
        return player.getCurrentPosition();
    }

    private String walkEast()
    {
        Player player = new Player();
        player.move("E");
        return player.getCurrentPosition();
    }

    private String walkWest()
    {
        Player player = new Player();
        player.move("W");
        return player.getCurrentPosition();
    }


}

