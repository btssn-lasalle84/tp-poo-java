import java.util.ArrayList;
import java.util.List;

public class ExempleFigures
{
    public static void main (String[] args)
    {
        Triangle triangle = new Triangle(5, 8);
        System.out.println(triangle.getDescription());
        System.out.println(triangle);
        System.out.println("Perimetre = " + triangle.perimetre());
        System.out.println("Aire = " + triangle.aire());
        System.out.println("Volume = " + triangle.volume());
        System.out.println("");

        Carre carre = new Carre(5);
        System.out.println(carre.getDescription());
        System.out.println(carre);
        System.out.println("Perimetre = " + carre.perimetre());
        System.out.println("Aire = " + carre.aire());
        System.out.println("Volume = " + carre.volume());
        System.out.println("");

        Rectangle rectangle = new Rectangle(5., 4.);
        System.out.println(rectangle.getDescription());
        System.out.println(rectangle);
        System.out.println("Perimetre = " + rectangle.perimetre());
        System.out.println("Aire = " + rectangle.aire());
        System.out.println("Volume = " + rectangle.volume());
        System.out.println("");

        Cercle cercle = new Cercle(2.);
        System.out.println(cercle.getDescription());
        System.out.println(cercle);
        System.out.println("Perimetre = " + cercle.perimetre());
        System.out.println("Aire = " + cercle.aire());
        System.out.println("Volume = " + cercle.volume());
        System.out.println("");

        Cube cube = new Cube(6.);
        System.out.println(cube.getDescription());
        System.out.println(cube);
        System.out.println("Perimetre = " + cube.perimetre());
        System.out.println("Aire = " + cube.aire());
        System.out.println("Volume = " + cube.volume());
        System.out.println("");
        
        Parallelepipede parallelepipede = new Parallelepipede(5., 4., 9.);
        System.out.println(parallelepipede.getDescription());
        System.out.println(parallelepipede);
        System.out.println("Perimetre = " + parallelepipede.perimetre());
        System.out.println("Aire = " + parallelepipede.aire());
        System.out.println("Volume = " + parallelepipede.volume());
        System.out.println("");
        
        Sphere sphere = new Sphere(3.);
        System.out.println(sphere.getDescription());
        System.out.println(sphere);
        System.out.println("Perimetre = " + sphere.perimetre());
        System.out.println("Aire = " + sphere.aire());
        System.out.println("Volume = " + sphere.volume());
        System.out.println("");

        // Conteneur
        List<Figure> figures = new ArrayList<Figure>();
        figures.add(triangle);
        figures.add(carre);
        figures.add(rectangle);
        figures.add(cercle);
        figures.add(cube);
        figures.add(parallelepipede);
        figures.add(sphere);
       
        afficherFigures(figures);
   }

   private static void afficherFigures(List<Figure> figures)
   {
        // Solution 1
        for (int i = 0; i < figures.size(); i++)
        {
            System.out.println(figures.get(i).getDescription());
            System.out.println(figures.get(i));
        }
        System.out.println("");

        // Solution 2
        for(Figure figure : figures)
        {
            System.out.println(figure.getDescription());
            System.out.println(figure);
        }
    }
}
