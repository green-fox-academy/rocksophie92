using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FoodPrepApp
{
    class Program
    {

        Random r = new Random();

        static void Main(string[] args)
        {
            Protein();
            Carb();
            Greens();
            Console.WriteLine();
            String userInput;
            userInput = Console.ReadLine();
         


                if (userInput == "n")
                {
                    Protein();
                    Carb();
                    Greens();
                    Console.ReadLine();
                } if (userInput == "x")
            {
                Environment.Exit(0);
            }
            }


        public static void Protein()
        {

            Random r = new Random();
            
            ArrayList proteins = new ArrayList();
            int elementNumber; 
            int generatedElement;
            proteins.Add("chicken");
            proteins.Add("turkey");
            proteins.Add("duck");
            proteins.Add("fish filet");
            proteins.Add("tuna");
            proteins.Add("sardines");
            proteins.Add("beef");
            proteins.Add("pork");
            proteins.Add("beans");
            proteins.Add("tofu");
            proteins.Add("chickpeas");
            proteins.Add("ham");
            proteins.Add("hard cheese");
            proteins.Add("mozzarella");

            elementNumber = proteins.Count;
            generatedElement = r.Next(0, elementNumber);

            Console.WriteLine(""+proteins[generatedElement]);

        }

        public static void Carb()
        {

            Random r = new Random();

            ArrayList carbs = new ArrayList();
            int elementNumber;
            int generatedElement;
            carbs.Add("pasta");
            carbs.Add("rice");
            carbs.Add("tortilla");
            carbs.Add("fries");
            carbs.Add("baked potatoes");
            carbs.Add("millet");
            carbs.Add("buckwheat");
            carbs.Add("couscous");
            carbs.Add("bulgur");
            carbs.Add("mashed potatoes");
            carbs.Add("mashed pumpkin");
            carbs.Add("mashed sweet potato");
            carbs.Add("potato salad");
            carbs.Add("burger");

            elementNumber = carbs.Count;
            generatedElement = r.Next(0, elementNumber);

            Console.WriteLine("" + carbs[generatedElement]);

        }

        public static void Greens()
        {

            Random r = new Random();

            ArrayList greens = new ArrayList();
            int elementNumber;
            int generatedElement;
            greens.Add("rockets");
            greens.Add("iceberg lettuce");
            greens.Add("steamed lettuce");
            greens.Add("mixed salad");
            greens.Add("coleslaw");
            greens.Add("fried vegetables");
            greens.Add("green hummus");
            greens.Add("pickles");
            greens.Add("cucumber salad");
            greens.Add("tzatziki");
            greens.Add("mayo-corn salad");
            greens.Add("tomato salsa");

            elementNumber = greens.Count;
            generatedElement = r.Next(0, elementNumber);

            Console.WriteLine("" + greens[generatedElement]);

        }
    }
}
