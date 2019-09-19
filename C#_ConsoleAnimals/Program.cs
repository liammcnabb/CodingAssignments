using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/**Since some items were not discussed, I made some of my own decisions.
    (1) I have not included any Unit tests since this was not asked for, I have
    just provided a simple console output depicting one case in working order
    (2) It was not clear whether you did or did not want to pass the list in the
    method. I did so as it makes the code more clear
    (3) The document did not suggest  if it would like to give a new list or 
    override the original, therefore I chose to create a new list, allowing
    the original list to be used for multiple tests.

    **/
namespace Technical
{
    class Program
    {
        static List<Animal> Categorise( List<Animal> list, string Category )
        {
            List<Animal> matches = new List<Animal>();
            if (list == null || list.Count == 0)
                return matches;


            foreach (Animal item in list)
                if (item.Category.Equals(Category))
                    matches.Add(item);

            return matches;
        }

        static List<Animal> Categorise(List<Animal> list, string Category, bool HasTail)
        {
            List<Animal> matches = new List<Animal>();
            if (list == null || list.Count == 0)
                return matches;

            foreach (Animal item in list)
                if (item.Category.Equals(Category) && item.HasTail == HasTail)
                    matches.Add(item);

            return matches;
        }

        public static void Main(string[] args)
        {
            const string PRIMATE = "Primate", REPTILE = "Reptile", MAMMAL = "Mammal";
            List<Animal> completeList = new List<Animal>();

            completeList = new List<Animal>();
            completeList.Add(new Animal("Baboon", PRIMATE, true));
            completeList.Add(new Animal("Chimpanzee", PRIMATE, true));
            completeList.Add(new Animal("Crocofile", REPTILE, true));
            completeList.Add(new Animal("Hippopotamus", MAMMAL, true));
            completeList.Add(new Animal("Snake", REPTILE, false));
            completeList.Add(new Animal("Lion", MAMMAL, true));
            completeList.Add(new Animal("Zebra", MAMMAL, true));
            completeList.Add(new Animal("Cheetah", MAMMAL, true));
            completeList.Add(new Animal("Gorilla", PRIMATE, false));
            completeList.Add(new Animal("Giraffe", MAMMAL, true));
            completeList.Add(new Animal("Lizard", REPTILE, true));

            //Test 1 expects Baboon, Chimpanzee, Gorilla
            List<Animal> filteredPrimates = Categorise(completeList, PRIMATE);
            foreach (Animal item in filteredPrimates)
                Console.WriteLine(item.Name);

            //Test 2 expects Baboon, Chimpanzee
            filteredPrimates.Clear();
            filteredPrimates = Categorise(completeList, PRIMATE, true);
            foreach (Animal item in filteredPrimates)
                Console.WriteLine(item.Name);
        }
    }

    class Animal
    {
        string m_name = "";
        string m_category = "";
        bool m_hasTail = false;
        
        public Animal(string name, string category, bool hasTail)
        {
            this.Name = name;
            this.Category = category;
            this.HasTail = hasTail;
        }

        public string Name
        {
            get { return m_name; }
            set { m_name = value; }
        }
        public string Category
        {
            get { return m_category; }
            set { m_category = value; }
        }

        public bool HasTail
        {
            get { return m_hasTail; }
            set { m_hasTail = value; }
        }
    }
}
