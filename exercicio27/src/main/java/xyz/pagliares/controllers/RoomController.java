package xyz.pagliares.controllers;

import xyz.pagliares.domain.Hostel;
import xyz.pagliares.domain.Room;
import xyz.Exceptions.RoomException;
public class RoomController {
    private Room room = new Room();
    private Hostel hostel;  // TODO change place after refactoring

    public RoomController() {
        this.hostel = new Hostel();
     }

    public void createRoom(int number, String type) throws RoomException{
        if ((number>100 && number<=105) || (number>200 && number<=205) || (number>300 && number<=305)){
            room.setNumber(number);
        }else
            throw new RoomException("Número de quarto não existe.");
        if(type == "single" || type == "duplo" || type == "suite executiva"){
            room.setType(type);
        }else{
            throw new RoomException("Tipo de quarto não existe.");
        }



    }

    public String persistRoomData(String name, Integer floor, String description, Double dimension) throws RoomException {
        if (name == null || floor == null || description == null || dimension == null){
            throw new RoomException("Dados não podem ser nulos. Preencha o formulário novamente!");
        }
        else if (floor < 1 || floor > 3){
            throw new RoomException("Andar inserido não existe.");
        }
        else if (room.getNumber() < (floor*100) || room.getNumber() > (floor*100+5)){
            throw new RoomException("Quarto inserido não existe.");
        }
        else {
            room.setName(name);
            room.setFloor(floor);
            room.setDescription(description);
            room.setDimension(dimension);
            hostel.addRoom(room);
            return "Room data created successfully !";
        }
    }

    public static void main(String[] args) {
        try {
            RoomController roomController = new RoomController();
            roomController.createRoom(305, "duplo");
            String result = roomController.persistRoomData("D. Leopoldina", 3, "", 20.0);
            System.out.println(result);
        }catch (RoomException e){
            System.out.println(e.getMessage());
        }

    }
}
