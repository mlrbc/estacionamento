package sistemadevagasdeestacionamento

class User {
    //#if($ParkingSpaceBooking)
    String username
    String firstName
    String lastName
    String preferredSector
    String preferenceType // tipo de vaga que o usuario prefere

    static constraints = {
        username nullable: false, blank: false, unique: true
        firstName nullable: false, blank: false
        lastName nullable: false, blank: false
        preferredSector inList: ["CIn", "CCEN", "Área II"]
        preferenceType inList: ["Normal", "Deficiente", "Idoso"]
    }

    static User acharUser (String username) {
        def usuario = findByUsername(username)
        return usuario
    }
    //#end
}