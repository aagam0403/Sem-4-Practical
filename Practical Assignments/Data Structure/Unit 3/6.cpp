#include <iostream>
using namespace std;
int main() 
{
    int marks[5], totalMarks = 0, numSubjects = 5;
    float percentage;
    
    cout << "Enter marks of 5 subjects: " << endl;
    for (int i = 0; i < numSubjects; ++i) 
    {
        cout << "Enter marks for subject " << (i + 1) << ": ";
        cin >> marks[i];

        while (marks[i] < 0 || marks[i] > 100) 
        {
            cout << "Invalid marks. Please enter marks between 0 and 100: ";
            cin >> marks[i];
        }
        totalMarks += marks[i];
    }
    percentage = (static_cast<float>(totalMarks) / (numSubjects * 100)) * 100;
    cout << "\nMarks entered are: ";
    for (int i = 0; i < numSubjects; ++i) 
    {
        cout << marks[i] << " ";
    }
    cout << "\nTotal Marks: " << totalMarks << " out of " << numSubjects * 100;
    cout << "\nPercentage: " << percentage << "%" << endl;
    return 0;
}
