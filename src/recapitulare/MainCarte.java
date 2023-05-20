package recapitulare;

public class MainCarte {
    public static void main(String[] args) {

        Pagina pagina1 = new Pagina("acesta este textul de pe pagina", false);
        Pagina pagina2 = new Pagina("un alt text de pe pagina", false);
        Pagina pagina3 = new Pagina("Ana are mere", false);
        Pagina pagina4 = new Pagina("Ana nu mai are mere", true);
        Pagina pagina5 = new Pagina("Inca un text", true);
        Pagina pagina6 = new Pagina("vine pauza", false);
        Pagina pagina7 = new Pagina("Nu mai avem idei", false);
        Pagina pagina8 = new Pagina("Final", false);

        Pagina[] paginiCarte1 = new Pagina[]{pagina1, pagina2, pagina3};
        Carte carte1 = new Carte("titlu1", "proza", new String[]{"romana", "engleza"},
                new String[]{"un singur capitol"}, 2003, paginiCarte1);
        Carte carte2 = new Carte("titlu2", "poezie", new String[]{"romana"},
                new String[]{"capitol1", "capitol2"}, 2007, new Pagina[]{pagina4, pagina5, pagina6, pagina7});
        Carte carte3 = new Carte("titlu3", "proza", new String[]{"franceza", "engleza"});
        carte3.setLimbi(new String[]{"engleza", "franceza"});
        carte3.setAnPublicatie(1997);
        carte3.setPagini(new Pagina[]{pagina8});

        Autor autor1 = new Autor("nume1", 40, 'm', new Carte[]{carte1, carte2});
        Autor autor2 = new Autor("nume2");
        autor2.setVarsta(50);
        autor2.setGen('F');
        autor2.setCarti(new Carte[]{carte3});
        Autor[] autori = new Autor[]{autor1, autor2};
        Autor gasit = Autor.findAutor("nume1", autori);
        Carte[] cartiGasite=autor1.findCarti();
        String[] cuvinte=carte2.imparte(2);
        Carte[] cartiGasiteNrPagini=autor1.findCartiByNrPagini(3);
        Pagina[] paginiScriseByAutor= autor1.findPaginiByAutor();
        for(Pagina p : paginiScriseByAutor){
            System.out.println(p.gettext());
        }
        boolean[] decide = carte1.decide("pagina");
              for (int i=0;i<decide.length;i++){

                  System.out.println(decide [i]);
              }
        }


    }







