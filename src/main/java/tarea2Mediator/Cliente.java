package tarea2Mediator;

public class Cliente {
    public static void main (String []args){
        Skype skypeUPB= new Skype();

        Profesional sm1 = new Profesional(skypeUPB);
        sm1.setCertificaciones("5").setCi("123").setName("Julio1");
        Profesional sm2 = new Profesional(skypeUPB);
        sm2.setCertificaciones("5").setCi("1234").setName("Julio2");
        Profesional sm3 = new Profesional(skypeUPB);
        sm3.setCertificaciones("5").setCi("12345").setName("Julio3");

        Profesional dev1 = new Profesional(skypeUPB);
        dev1.setLenguaje("C++").setCi("456").setName("Carlos");
        Profesional dev2 = new Profesional(skypeUPB);
        dev2.setLenguaje("C++").setCi("4567").setName("Carlos2");
        Profesional dev3 = new Profesional(skypeUPB);
        dev3.setLenguaje("Java").setCi("45678").setName("Carlos3");

        Profesional qa1 = new Profesional(skypeUPB);
        qa1.setGrado("6").setCi("987").setName("Cris1");
        Profesional qa2 = new Profesional(skypeUPB);
        qa2.setGrado("6").setCi("9876").setName("Cris2");
        Profesional qa3 = new Profesional(skypeUPB);
        qa3.setGrado("6").setCi("98765").setName("Cris3");

        skypeUPB.addProfesionalChat(sm1)
                .addProfesionalChat(sm2)
                .addProfesionalChat(sm3)
                .addProfesionalChat(dev1)
                .addProfesionalChat(dev2)
                .addProfesionalChat(dev3)
                .addProfesionalChat(qa1)
                .addProfesionalChat(qa2)
                .addProfesionalChat(qa3);

        sm1.send("esto es para todos");
        dev2.send("esto es para el dev1 y dev3");
        qa3.send("error encontrado, verificar qa1,qa2");

    }

}
