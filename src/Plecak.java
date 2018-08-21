import java.util.ArrayList;
import java.util.List;

public class Plecak {


    public static void main(String[] args) {


        int maksymalnyUdzwigPlecaka = 35; //czyli pojemnosć plecaka

        int przedmiotA = 12;
        int przedmiotB = 38;
        int przedmiotC = 20;
        int przedmiotD = 8;
        int przedmiotE = 5;
        int przedmiotF = 3;
        int pudelko = 0;
        int indexElementuMax = 0;
        int aktualnaWagaPlecaka = 0;

        List<Integer> przedmioty = new ArrayList<>();
        List<Integer> zawartoscPlecaka = new ArrayList<>();
        przedmioty.add(przedmiotA);
        przedmioty.add(przedmiotB);
        przedmioty.add(przedmiotC);
        przedmioty.add(przedmiotD);
        przedmioty.add(przedmiotE);
        przedmioty.add(przedmiotF);


        //maksymalna ładowność plecaka to 35 kg, wypełniamy go teraz zachłannie
        // pierwszy element:

      for(int j = 0; j<przedmioty.size(); j++) {
          pudelko = 0;
          for (int i = 0; i < przedmioty.size(); i++) {


              System.out.println(pudelko);
              if (przedmioty.get(i) > pudelko && przedmioty.get(i) <= maksymalnyUdzwigPlecaka) {
                  pudelko = przedmioty.get(i);
                  indexElementuMax = i;
                  System.out.println(pudelko + " " + i);

              }
              if (i == przedmioty.size() - 1) {
                      zawartoscPlecaka.add(przedmioty.get(indexElementuMax));
                      aktualnaWagaPlecaka = aktualnaWagaPlecaka + przedmioty.get(indexElementuMax);
                      if(aktualnaWagaPlecaka>maksymalnyUdzwigPlecaka){
                          aktualnaWagaPlecaka = aktualnaWagaPlecaka-przedmioty.get(indexElementuMax);
                          zawartoscPlecaka.remove(przedmioty.get(indexElementuMax));
                          przedmioty.add(przedmioty.get(indexElementuMax));
                      }

                      przedmioty.remove(indexElementuMax);

                      System.out.println("W plecaku jest: " + aktualnaWagaPlecaka);
                      System.out.println("Obecna zawartosc plecaka: " + zawartoscPlecaka.toString());
                      System.out.println("Lista przedmiotów: " + przedmioty.toString());

              }

          }
      }

    }

    }


