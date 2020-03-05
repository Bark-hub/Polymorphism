package com.company;


class Electronic {

    public void start(){
        System.out.println("Electronic device is on.");
    }
}

class Camera extends Electronic{

    public void start(){
        System.out.println("The camera is on.");
    }

    public void takePic(){
        System.out.println("Photo taken.");
    }
}



public class Main {

    public static void main(String[] args) {

        Electronic electronic1 = new Electronic();
        Camera camera1 = new Camera();

        electronic1.start();
        camera1.start();
        camera1.takePic();

        Electronic electronic2 = new Camera();
        electronic2.start();

        Electronic electronic3 = camera1;
        electronic3.start();

        //Down casting down here
        Camera camera2 = (Camera) electronic3;
        camera2.start();
        camera2.takePic();

        Electronic electronic5 = new Electronic();
        Camera camera3 = (Camera) electronic5;
        camera3.start();

    }
}
