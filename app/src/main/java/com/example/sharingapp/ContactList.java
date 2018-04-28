package com.example.sharingapp;

import java.util.List;

public class ContactList {

    private List<Contact> contacts;

    private static String FILENAME = "";

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<String> getAllUsernames {

    }

    public void addContact(Contact contact) {
        getContacts().add(contact);
    }

    public void deleteContact(Contact contact) {
        getContacts().remove(contact);
    }

    public Contact getContact(int index) {
        return getContacts().get(index);
    }

    public int getSize() {
        return getContacts().size();
    }

    public int getIndex(Contact contact) {
        return getContacts().indexOf(contact);
    }

    public boolean hasContact(Contact contact) {
        return getContacts().contains(contact);
    }

    public Contact getContactByUsername(String username) {

    }

}
