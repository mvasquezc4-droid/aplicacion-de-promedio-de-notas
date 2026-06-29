import java.util.Scanner;class NotaDefinitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CALCULADORA DE NOTA DEFINITIVA===");
        System.out.println("Nombre del estudiante: ");
        String estudiante = sc.nextLine();
        System.out.println("Nombre de la asignatura: ");
        String asignatura = sc.nextLine();

        double nota1, nota2, nota3, nota4;
        do {
            System.out.print("Ingrese la Nota I (0-5): ");
            nota1 = sc.nextDouble();
        } while (nota1 < 0 || nota1 > 5);

        do {
            System.out.print("Ingrese la Nota II (0-5):");
        } while (nota2 < 0 || nota2 > 5);

        do {
            System.out.print("Ingrese la Nota III (0-5)");
        } while (nota3 < 0 || nota3 > 5);

        do {
            System.out.print("Ingrese la Nota IV (0-5):");
        } while (nota4 < 0 || nota4 > 5);
        double corte1 = nota1 * 0.20;
        double corte2 = nota2 * 0.20;
        double corte3 = nota3 * 0.20;
        double corte4 = nota4 * 0.40;

        double definitiva = corte1 + corte2 + corte3 + corte4;

        System.out.println("\n==== RESULTADOS ====");
        System.out.println("Nombre del alumno: + estudiante");
        System.out.println("Asignatura:" + asignatura);

        System.out.printf("Nota I: %.1f (20%%) = %.2f%n", nota1, corte1);
        System.out.printf("Nota II: %.1f (20%%) = %.2f%n", nota2, corte2);
        System.out.printf("Nota III: %.1f (20%%) = %.2f%n", nota3, corte3);
        System.out.printf("Nota IV: %.1f (40%%) = %.2f%n", nota4, corte4);

        if (definitiva >= 3.0) {
            System.out.printf("NOTA DEFINITIVA: %.2f (Aprobada)%n", definitiva);
        } else {
            System.out.printf("NOTA DEFINITIVA: %.2f (Reprobada)%n", definitiva);
        }

        sc.close();
    }
}
