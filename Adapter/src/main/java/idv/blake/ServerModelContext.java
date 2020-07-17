package idv.blake;

import java.util.List;

public interface ServerModelContext {
    void addHost(Host host);
    Host getHost(String key);
    List<Host> getHosts();
    void addContact(Contact contact);
    Contact getContact(String key);
    List<Contact> getContacts();
}
