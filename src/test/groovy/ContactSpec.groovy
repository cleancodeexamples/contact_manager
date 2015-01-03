import io.github.cleancodeexamples.contact_manager.Contact
import spock.lang.Specification

class ContactSpec extends Specification{
    def "contact values"() {
        when: "A contact is created"

        Contact contact = new Contact(
                firstname: 'Frédéric',
                lastname: 'Bouquet')
        then: "its values are accessible"
        contact.firstname == "Frédéric"
        contact.lastname == "Bouquet"
    }


}
