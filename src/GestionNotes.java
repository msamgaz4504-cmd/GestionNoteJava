package formation.java.exercice.GestionNotes;
import java.util.Scanner;

public class GestionNotes{
    public static void main(String[] args){
        int[] notes = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notes.length; i++){
            System.out.print("donner la note de l'etudiant" + (i+1) + ": ");
            notes[i] = sc.nextInt();
        }
        afficher_resultats(notes);
        sc.close();
    }
    public static float moyenne(int[] notes){
        float somme = 0;
        for (int i = 0; i < notes.length; i++){
            somme +=notes[i];
        }
        return somme/notes.length;
    }
    public static int meilleurNote(int[] notes){
        int max = notes[0];
        for (int i = 0; i < notes.length; i++){
            if(max < notes[i]) {
                max = notes[i];
            }
        }
        return max;
    }
    public static int countAdmis(int[] notes){
        int count = 0;
        for (int i = 0; i < notes.length; i++){
            if(notes[i] >= 10){
                count ++;
            }
        }
        return count;
    }
    public static void afficher_resultats(int[] notes){
        System.out.println("\n--------Résultats de la classe--------\n");
        System.out.println("la moyenne de la classe est: " + moyenne(notes));
        System.out.println("la meilleure note est: " + meilleurNote(notes));
        System.out.println("le nombre d'étudiants admis (note ≥ 10): " + countAdmis(notes));

        System.out.println("\n--------Mentions des étudiants--------\n");
        for(int i = 0; i < notes.length; i++){
            String mention;
            if (notes[i] >= 16){
                mention = "Excellent";
            } else if (notes[i] >= 12){
                mention = "Bien";
            } else if (notes[i] >= 10){
                mention = "Passable";
            } else {
                mention = "Insuffisant";
            }
            System.out.println("L'etudiant " +(i+1)+ " a la note " + notes[i] + " avec mention " + mention);
        }


    }
}