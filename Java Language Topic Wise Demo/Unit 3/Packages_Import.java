import Demo.Packages;
class Packages_Import
{
    public static void main(String[] a) 
    {
        Packages d = new Packages();
        d.display();    
    }
}
//Compile karva mate = javac -d . Packages.java
//another file compile = javac Packages_Import.java
//Run karva mate = java Packages_Import