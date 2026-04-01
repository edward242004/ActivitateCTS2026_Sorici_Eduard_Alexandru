package ro.ase.cts.clase;

public interface AbstractSearchingFilter {
    SearchingFilter build();

    AbstractSearchingFilter setActori(String actori);

    AbstractSearchingFilter setRating(double rating);

    AbstractSearchingFilter setTitlu(String titlu);

    AbstractSearchingFilter setRegizor(String regizor);

    AbstractSearchingFilter setAnAparitie(int anAparitie);

    AbstractSearchingFilter setGen(String gen);
}
