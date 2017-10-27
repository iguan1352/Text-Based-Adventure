package board;

import rooms.Room; //package.name of class

public class Board {


    private Room[][] schoolMap; //is a 2-D array



    public Board(Room[][] schoolMap)
    {
        this.schoolMap = schoolMap;
    }

    public void printMap()
    {

    	//for each row in room there are x amount of rooms under each row 
        for(Room[] row : schoolMap)
        {
            for (Room room : row)
            {
                room.print(); //the print method is in the Hallway class
            }
            System.out.println();
        }
    }
    
    //just takes the schoolmap with the double array and returns it
    public Room[][] getSchoolMap() {
        return schoolMap;
    }

    //WHAT DOES THIS DO???? WHAT IS THE DIFFERENCE BETWEEN THIS AND BOARD METHOD(in the same class)
    public void setSchoolMap(Room[][] schoolMap) {
        this.schoolMap = schoolMap;
    }


}
