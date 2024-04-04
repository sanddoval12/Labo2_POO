public class ISBNGenerator
{
        //Atributos
        private static int counter = 0;
        //Metodos
        public static int newISBN()
        {
            counter++;
            return counter;
        }
}

