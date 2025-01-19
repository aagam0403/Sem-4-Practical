#include <iostream>
#include <string>
using namespace std;
class Student{
    
        int no;
        string name;
        string address;
    
    public :
    void SetDetails()
    {
        cout << "Enter Student No: ";
        cin >> no;
        cin.ignore(); 
        
        cout << "Enter Student Name: ";
        getline(cin, name);

        cout << "Enter Student Address: ";
        getline(cin, address);
    }
   
   void DisplayDetails()
   {
        cout << "Student No: " << no << endl;
        cout << "Student Name: " << name << endl;
        cout << "Student Address: " << address << endl;
    } 
};
int main() {
    Student students[3];
    for (int i=0;i<3;i++) 
    {
        cout << "\nEnter details for Student " << i + 1 << ":\n";
        students[i].SetDetails();
    }

    cout << "\nDetails of Students:\n";
    for (int i=0;i<3;i++) 
    {
        cout << "\nStudent " << i + 1 << ":\n";
        students[i].DisplayDetails();
    }
    return 0;
}