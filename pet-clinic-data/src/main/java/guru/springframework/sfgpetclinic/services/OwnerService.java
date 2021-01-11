package guru.springframework.sfgpetclinic.services;

public interface OwnerService<Owner, Long> {

    Owner findByLastName(String lastname);

}
