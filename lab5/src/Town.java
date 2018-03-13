public class Town implements Comparable<Town> {
    private String name;
    private String county;
    private int population;

    public Town(String name, String county, int population) {
        this.name = name;
        this.county = county;
        this.population = population;
    }

    public static Town[] sortPopulation(Town a[], int currentsize){
        int x=0;
        while(x<currentsize){
           int z=currentsize-1;
            while(z>=x){
            if(a[x].getPopulation()>a[z].getPopulation()){
               Town min=a[x];
               a[x]=a[z];
               a[z]=min;

            }
                z--;
            }

            x++;
        }
        return a;
    }

    public String getName() {
        return name;
    }

    public String getCounty() {
        return county;
    }

    public int getPopulation() {
        return population;
    }

    public int compareTo(Town other) {
        this.population.compareTo(other.population)


        //return name.compareTo(other.name);
    }



    public String toString() {
        return "Town[" + name + "," + county + "," + population + "]";
    }
}


