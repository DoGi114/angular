package java;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Worker {
    private UUID id;
    private String name;
    private String surname;
    private String position;
    
    public Worker() {
        this.id = UUID.randomUUID();
    }

	public Worker(String name, String surname, String position) {
		super();
		this.id = UUID.randomUUID();
		this.name = name;
		this.surname = surname;
		this.position = position;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getposition() {
		return position;
	}

	public void setposition(String position) {
		this.position = position;
	}
}
